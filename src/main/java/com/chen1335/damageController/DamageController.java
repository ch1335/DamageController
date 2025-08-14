package com.chen1335.damageController;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(DamageController.MODID)
public class DamageController {
    public static final String MODID = "damage_controller";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DamageController(IEventBus modEventBus, ModContainer modContainer) {

    }

}
