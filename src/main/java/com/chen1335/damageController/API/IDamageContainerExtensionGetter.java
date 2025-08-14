package com.chen1335.damageController.API;

import com.chen1335.damageController.common.DamageContainerExtension;
import net.neoforged.neoforge.common.damagesource.DamageContainer;

public interface IDamageContainerExtensionGetter {
    DamageContainerExtension dc$getExtension();

    static DamageContainerExtension get(DamageContainer damageContainer) {
        return ((IDamageContainerExtensionGetter) damageContainer).dc$getExtension();
    }
}
