package com.cerbon.agartha;

import com.cerbon.agartha.item.ModItemGroups;
import com.cerbon.agartha.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(AgarthaMod.MOD_ID)
public class AgarthaMod {
    public static final String MOD_ID = "agartha";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AgarthaMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItemGroups.register(modEventBus);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::addCreativeTab);
    }

    private void addCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModItemGroups.RUBY_GROUP.get())
            ModItems.ITEMS.getEntries().forEach(event::accept);
    }
}
