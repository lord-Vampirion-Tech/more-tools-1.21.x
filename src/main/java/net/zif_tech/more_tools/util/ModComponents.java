package net.zif_tech.more_tools.util;

import com.mojang.serialization.Codec;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zif_tech.more_tools.MoreTools;

public class ModComponents {

    public static final ComponentType<Integer> SIZE = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(MoreTools.MOD_ID,"size"),
            ComponentType.<Integer>builder().codec(Codec.INT).build()
    );
    public static final ComponentType<Integer> DEEP = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            Identifier.of(MoreTools.MOD_ID,"deep"),
            ComponentType.<Integer>builder().codec(Codec.INT).build()
    );


    public static void initialize() {MoreTools.LOGGER.info("Registering {} item groups", MoreTools.MOD_ID);}
}
