package com.sakura.artifact.init;

import com.sakura.artifact.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @desc: artifactMiscTab
 * @auther: SUNql
 * @date: 2021/11/3 16:54
 */
public class ModCreativeTab {
	public static final CreativeTabs IDL_MISC = new CreativeTabs(CreativeTabs.getNextID(), "artifactMiscTab")
	{
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModBlocks.ARTIFACT_K1);
        }
    };
}
