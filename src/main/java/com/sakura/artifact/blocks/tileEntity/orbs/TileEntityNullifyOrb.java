package com.sakura.artifact.blocks.tileEntity.orbs;

import com.sakura.artifact.ActFramework;
import net.minecraft.entity.monster.IMob;
import net.minecraft.init.Blocks;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class TileEntityNullifyOrb extends TileEntityOrbBase implements ITickable {

	@SubscribeEvent
	public void onSpawn(LivingSpawnEvent.CheckSpawn event) {
		if (world.isRemote)
		{
			return;
		}

		if (aabb == null)
		{
			world.setBlockState(pos, Blocks.AIR.getDefaultState());
			ActFramework.LogWarning("A Nullify Orb @%s is not working correctly. Removing it.", pos);
			invalidate();
			return;
		}

		if(event.getResult() != Event.Result.DENY && event.getEntityLiving() instanceof IMob) {
			if (aabb.contains(new Vec3d(event.getX(), event.getY(), event.getZ())))
			{
				event.setResult(Event.Result.DENY);
				//ActFramework.Log("Stopped spawning:"+event.getEntityLiving().getName());
				return;
			}
		}
	}
	
	static 
	{
		register("idlframewok:nullify_orb_basic", TileEntityNullifyOrb.class);
	}

}
