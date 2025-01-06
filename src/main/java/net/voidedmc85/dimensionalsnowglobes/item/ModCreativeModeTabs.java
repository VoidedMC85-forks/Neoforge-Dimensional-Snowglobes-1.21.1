package net.voidedmc85.dimensionalsnowglobes.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.voidedmc85.dimensionalsnowglobes.DimensionalSnowglobes;
import net.voidedmc85.dimensionalsnowglobes.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimensionalSnowglobes.MOD_ID);

    public static final Supplier<CreativeModeTab> DIMENSIONAL_SNOWGLOBES_TAB = CREATIVE_MODE_TAB.register("dimensional_snowglobes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ICED_QUARTZ.get()))
                    .title(Component.translatable("creativetab.dimensionalsnowglobes.dimensional_snowglobes"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ICED_QUARTZ);
                        output.accept(ModItems.FROSTED_FEATHER);
                    }).build());

    public static final Supplier<CreativeModeTab> FROZEN_BLOCKS_TAB = CREATIVE_MODE_TAB.register("frozen_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ICED_QUARTZ_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(DimensionalSnowglobes.MOD_ID, "dimensional_snowglobes_tab"))
                    .title(Component.translatable("creativetab.dimensionalsnowglobes.frozen_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ICED_QUARTZ_BLOCK);
                        output.accept(ModBlocks.ICED_CHISELED_QUARTZ);
                        output.accept(ModBlocks.ICED_QUARTZ_BRICK);
                        output.accept(ModBlocks.ICED_QUARTZ_PILLAR);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}