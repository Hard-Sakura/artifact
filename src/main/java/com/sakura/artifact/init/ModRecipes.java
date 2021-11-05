package com.sakura.artifact.init;

import com.sakura.artifact.blocks.ModBlocks;
import com.sakura.artifact.item.ModItems;
import com.sakura.artifact.util.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * @desc: 熔炉烧制
 * @auther: sakura
 * @date: 2021/11/5 16:11
 */
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModRecipes {
	

	public static void Init() {
		//Only smelting recipes
//		GameRegistry.addSmelting(ModItems.PURE_INGOT,
//				new ItemStack(ModItems.WEAPON_PEARL),
//				0.1f);

		/**参数：（*，*，*）：被烧的物品，数量(默认1，可填可不填)，mata类型(可填可不填);
		 * 		（*，*，*）：炼成的物品，数量(默认1，可填可不填)，mata类型(可填可不填);
		 * 	  	xp：经验(单位f)
		 */
		GameRegistry.addSmelting(ModBlocks.ARTIFACT_K1,
				new ItemStack(ModItems.ARTIFACT_W1,2),
				20f);
	}
	
	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> evt) {
		IForgeRegistry<IRecipe> r = evt.getRegistry();
		//Example
		//r.register(new GobletFill().setRegistryName(new ResourceLocation(Reference.MOD_ID, "goblet_fill")));
	}
}
