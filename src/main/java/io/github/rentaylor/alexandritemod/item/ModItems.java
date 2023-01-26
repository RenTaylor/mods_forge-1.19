package io.github.rentaylor.alexandritemod.item;

import io.github.rentaylor.alexandritemod.AlexandriteMod;
import io.github.rentaylor.alexandritemod.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AlexandriteMod.MODID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<BlockItem> ALEXANDRITE_ORE = ITEMS.register("alexandrite_ore",
            () -> new BlockItem(ModBlocks.ALEXANDRITE_ORE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> DEEPSLATE_ALEXANDRITE_ORE = ITEMS.register("deepslate_alexandrite_ore",
            () -> new BlockItem(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> ALEXANDRITE_BLOCK = ITEMS.register("alexandrite_block",
            () -> new BlockItem(ModBlocks.ALEXANDRITE_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);


    }
}
