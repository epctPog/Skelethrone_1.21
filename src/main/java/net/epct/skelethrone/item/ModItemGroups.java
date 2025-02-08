package net.epct.skelethrone.item;

import net.epct.skelethrone.Skelethrone;
import net.epct.skelethrone.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SKELETHRONE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Skelethrone.MOD_ID, "skelethrone_items_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_FOSSIL))
                    .displayName(Text.translatable("itemgroup.skelethrone.skelethrone_items_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_FOSSIL);
                    }).build());

    public static final ItemGroup SKELETHRONE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Skelethrone.MOD_ID, "skelethrone_blocks_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.FOSSIL_ROCK_BLOCK))
                    .displayName(Text.translatable("itemgroup.skelethrone.skelethrone_blocks_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FOSSIL_ROCK_BLOCK);
                    }).build());

    public static void registerItemGroups()
    {
        Skelethrone.LOGGER.info("Registering Item Groups for " + Skelethrone.MOD_ID);
    }
}
