package com.sakura.artifact.potion.buff;

import com.sakura.artifact.potion.EffectTuple;
import com.sakura.artifact.ActFramework;
import net.minecraft.entity.EntityLivingBase;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class PotionInsidiousDisease extends BasePotion {

    int baseCounter = 50;

    public List<EffectTuple> tuples = new ArrayList<>();
    public void AddTuple(EffectTuple tuple)
    {
        tuples.add(tuple);
    }

    public PotionInsidiousDisease(boolean isBadEffectIn, int liquidColorIn, String name, int icon) {
        super(isBadEffectIn, liquidColorIn, name, icon);

    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        int k = baseCounter >> amplifier;

        if (k > 0)
        {
            return duration % k == 0;
        }
        else
        {
            return true;
        }
    }

    @Override
    public void performEffect(@Nonnull EntityLivingBase living, int amplified) {
        ActFramework.Log("Perform");
        for (EffectTuple t:
                tuples
             ) {
            t.AttemptBuffWithLevel(living, amplified);
        }
    }


}
