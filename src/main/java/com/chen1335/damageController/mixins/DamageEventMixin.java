package com.chen1335.damageController.mixins;

import com.chen1335.damageController.API.IDamageContainerGetter;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import org.spongepowered.asm.mixin.Mixin;

@Mixin({LivingIncomingDamageEvent.class, LivingDamageEvent.class})
public abstract class DamageEventMixin implements IDamageContainerGetter {


}
