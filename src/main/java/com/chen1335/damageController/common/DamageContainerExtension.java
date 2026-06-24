package com.chen1335.damageController.common;

import net.neoforged.neoforge.common.damagesource.DamageContainer;

import java.util.ArrayList;
import java.util.List;

public class DamageContainerExtension {
    private final DamageContainer damageContainer;
    private float addValue = 0;

    private float multipliedBase = 1;

    private final List<Float> multipliedTotal = new ArrayList<>();

    private float finalDamageAdd = 0;

    public DamageContainerExtension(DamageContainer damageContainer) {
        this.damageContainer = damageContainer;
    }

    public void solveFinalDamage() {
        float damage = damageContainer.getNewDamage() + addValue;
        damage = damage * multipliedBase;
        for (Float v : multipliedTotal) {
            damage = damage * v;
        }
        damageContainer.setNewDamage(damage + finalDamageAdd);
        addValue = 0;
        multipliedBase = 1;
        multipliedTotal.clear();
        finalDamageAdd = 0;
    }

    public void addValue(float value) {
        addValue += value;
    }

    public void addMultipliedBase(float value) {
        multipliedBase += value;
    }

    public void addMultipliedTotal(float value) {
        multipliedTotal.add(value);
    }

    public void addFinalDamage(float value) {
        finalDamageAdd += value;
    }
}
