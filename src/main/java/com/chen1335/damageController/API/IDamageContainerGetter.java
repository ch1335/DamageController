package com.chen1335.damageController.API;

import net.neoforged.neoforge.common.damagesource.DamageContainer;


public interface IDamageContainerGetter {
    DamageContainer getContainer();

    static IDamageContainerGetter of(DamageContainer damageContainer) {
        return () -> damageContainer;
    }
}
