package com.cerbon.agartha.item;

import com.cerbon.agartha.AgarthaMod;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AgarthaMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = registerItem("ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBY = registerItem("raw_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON = registerItem("dragon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAIRY = registerItem("fairy", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK = registerItem("dark", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL = registerItem("steel", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GHOST = registerItem("ghost", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK = registerItem("rock", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUG = registerItem("bug", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PSYCHIC = registerItem("psychic", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLYING = registerItem("flying", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GROUND = registerItem("ground", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POISON = registerItem("poison", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIGHTING = registerItem("fighting", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICE = registerItem("ice", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRIC = registerItem("electric", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRASS = registerItem("grass", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATER = registerItem("water", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE = registerItem("fire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NORMAL = registerItem("normal", () -> new Item(new Item.Properties()));
    
    public static RegistryObject<Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
