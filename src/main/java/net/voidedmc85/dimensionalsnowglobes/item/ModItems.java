package net.voidedmc85.dimensionalsnowglobes.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.voidedmc85.dimensionalsnowglobes.DimensionalSnowglobes;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DimensionalSnowglobes.MOD_ID);

    public static final DeferredItem<Item> ICED_QUARTZ = ITEMS.register("iced_quartz",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FROSTED_FEATHER = ITEMS.register("frosted_feather",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}