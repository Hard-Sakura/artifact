package com.sakura.artifact.item.misc;

import com.sakura.artifact.util.EntityUtil;
import com.sakura.artifact.util.NBTStrDef.IDLNBTDef;
import com.sakura.artifact.util.NBTStrDef.IDLNBTUtil;
import com.sakura.artifact.item.ItemBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class ItemAttrMeasure extends ItemBase {
    public ItemAttrMeasure(String name) {
        super(name);
        useable = true;

    }

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {

        IDLNBTUtil.SetDouble(stack, IDLNBTDef.MARK_ATK, EntityUtil.getAttr(target, SharedMonsterAttributes.ATTACK_DAMAGE));
        IDLNBTUtil.SetDouble(stack, IDLNBTDef.MARK_HP, EntityUtil.getAttr(target, SharedMonsterAttributes.MAX_HEALTH));
        IDLNBTUtil.SetDouble(stack, IDLNBTDef.MARK_DEF, EntityUtil.getAttr(target, SharedMonsterAttributes.ARMOR));
        IDLNBTUtil.SetDouble(stack, IDLNBTDef.MARK_ARMOR_T, EntityUtil.getAttr(target, SharedMonsterAttributes.ARMOR_TOUGHNESS));
        IDLNBTUtil.SetDouble(stack, IDLNBTDef.MARK_RANGE, EntityUtil.getAttr(target, SharedMonsterAttributes.FOLLOW_RANGE));
        IDLNBTUtil.SetDouble(stack, IDLNBTDef.MARK_KB_R, EntityUtil.getAttr(target, SharedMonsterAttributes.KNOCKBACK_RESISTANCE));
        IDLNBTUtil.SetDouble(stack, IDLNBTDef.MARK_SPEED, EntityUtil.getAttr(target, SharedMonsterAttributes.MOVEMENT_SPEED));
        IDLNBTUtil.SetDouble(stack, IDLNBTDef.MARK_ATK_SPEED, EntityUtil.getAttr(target, SharedMonsterAttributes.ATTACK_SPEED));

        return true;
    }


}
