package com.chen1335.damageController.mixins;

import com.chen1335.damageController.API.IDamageContainerExtensionGetter;
import com.chen1335.damageController.common.DamageContainerExtension;
import net.neoforged.neoforge.common.damagesource.DamageContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(DamageContainer.class)
public class DamageContainerMixin implements IDamageContainerExtensionGetter {
    @Unique
    DamageContainerExtension dc$extension = new DamageContainerExtension((DamageContainer) (Object) this);

    @Unique
    public DamageContainerExtension dc$getExtension(){
        return dc$extension;
    }
}
