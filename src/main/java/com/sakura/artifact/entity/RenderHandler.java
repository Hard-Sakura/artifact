package com.sakura.artifact.entity;

import com.sakura.artifact.entity.creatures.moroon.EntityMoroonUnitBase;
import com.sakura.artifact.entity.creatures.render.RenderBullet;
import com.sakura.artifact.entity.creatures.render.RenderMoroonHumanoid;
import com.sakura.artifact.entity.projectiles.EntityIdlProjectile;
import com.sakura.artifact.ActFramework;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityMoroonUnitBase.class, RenderMoroonHumanoid::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityIdlProjectile.class, renderManager -> new RenderBullet<>(renderManager, new ResourceLocation(ActFramework.MODID,
                "textures/entity/projectiles/bullet_norm.png")));
    }
}
