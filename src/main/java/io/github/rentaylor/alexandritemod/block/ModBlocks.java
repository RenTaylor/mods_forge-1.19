package io.github.rentaylor.alexandritemod.block;

import io.github.rentaylor.alexandritemod.AlexandriteMod;
import io.github.rentaylor.alexandritemod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AlexandriteMod.MODID);
    public static final RegistryObject<Block> ALEXANDRITE_BLOCK = BLOCKS.register("alexandrite block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> ALEXANDRITE_ORE = BLOCKS.register("alexandrite ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE),
                    UniformInt.of(3,7)));

    public static final RegistryObject<Block> DEEPSLATE_ALEXANDRITE_ORE = BLOCKS.register("deepslate alexandrite ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE),
                    UniformInt.of(3,7)));


    //
//    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier){
//        RegistryObject<T> block = BLOCKS.register(name, supplier);
//        ModItems.ITEMS.register(name, () -> new BlockItem(block.get()));
//        return block;
//    }
//
    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }


}