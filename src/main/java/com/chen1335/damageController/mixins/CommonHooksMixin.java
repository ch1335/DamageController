package com.chen1335.damageController.mixins;

import com.chen1335.damageController.API.IDamageContainerExtensionGetter;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.common.CommonHooks;
import net.neoforged.neoforge.common.damagesource.DamageContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CommonHooks.class)
public class CommonHooksMixin {

    @Inject(method = "onEntityIncomingDamage", at = @At("RETURN"))
    private static void onEntityIncomingDamage(LivingEntity entity, DamageContainer container, CallbackInfoReturnable<Boolean> cir) {
        IDamageContainerExtensionGetter.get(container).solveFinalDamage();
    }

    @Inject(method = "onLivingDamagePre", at = @At("RETURN"))
    private static void onLivingDamagePre(LivingEntity entity, DamageContainer container, CallbackInfoReturnable<Boolean> cir) {
        IDamageContainerExtensionGetter.get(container).solveFinalDamage();
    }
}
