package com.cerbon.agartha.item;

import com.cerbon.agartha.AgarthaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemGroups {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AgarthaMod.MOD_ID);

    public static RegistryObject<CreativeModeTab> RUBY_GROUP = CREATIVE_MODE_TABS.register("ruby", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.RUBY.get()))
            .title(Component.translatable("itemgroup.ruby"))
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
