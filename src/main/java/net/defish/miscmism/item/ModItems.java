package net.defish.miscmism.item;

import net.defish.miscmism.MiscMism;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MiscMism.MOD_ID);

    public static final DeferredItem<Item> JADETRIANGLE = ITEMS.register("jade_triangle",
         () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
