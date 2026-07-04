package net.defish.miscmism.block;

import net.defish.miscmism.MiscMism;
import net.defish.miscmism.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
        DeferredRegister.createBlocks(MiscMism.MOD_ID);

    public static final DeferredBlock<Block> STORMSLATE_BLOCK = registerblock("stormslate_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));




    private static <T extends Block> DeferredBlock<T> registerblock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
    ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));

    }


public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
}
}
