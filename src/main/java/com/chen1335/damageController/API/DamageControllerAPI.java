package com.chen1335.damageController.API;

public class DamageControllerAPI {
    public static void addValue(IDamageContainerGetter damageContainerGetter, float value) {
        IDamageContainerExtensionGetter.get(damageContainerGetter.getContainer()).addValue(value);
    }

    public static void addMultipliedBase(IDamageContainerGetter damageContainerGetter, float value) {
        IDamageContainerExtensionGetter.get(damageContainerGetter.getContainer()).addMultipliedBase(value);
    }

    public static void addMultipliedTotal(IDamageContainerGetter damageContainerGetter, float value) {
        IDamageContainerExtensionGetter.get(damageContainerGetter.getContainer()).addMultipliedTotal(value);
    }

    public static void addFinalDamage(IDamageContainerGetter damageContainerGetter, float value) {
        IDamageContainerExtensionGetter.get(damageContainerGetter.getContainer()).addFinalDamage(value);
    }
}
