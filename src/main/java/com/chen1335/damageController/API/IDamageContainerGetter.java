package com.chen1335.damageController.API;

import net.neoforged.neoforge.common.damagesource.DamageContainer;


public interface IDamageContainerGetter {
    public DamageContainer getContainer();

    static IDamageContainerGetter of(Object o) {
        return (IDamageContainerGetter) o;
    }
}
