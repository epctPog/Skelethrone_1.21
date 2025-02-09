package net.epct.skelethrone.item;

import net.epct.skelethrone.Skelethrone;
import net.epct.skelethrone.item.custom.ChiselItem;
import net.epct.skelethrone.item.custom.ChiselSpecificItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_FOSSIL = registerItem("raw_fossil", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselSpecificItem(new Item.Settings().maxDamage(32)));
    public static final Item IRON_CHISEL = registerItem("iron_chisel", new ChiselItem(new Item.Settings().maxDamage(256)));
    public static final Item GOLD_CHISEL = registerItem("gold_chisel", new ChiselItem(new Item.Settings().maxDamage(128)));
    public static final Item DIAMOND_CHISEL = registerItem("diamond_chisel", new ChiselItem(new Item.Settings().maxDamage(512)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(Skelethrone.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        Skelethrone.LOGGER.info("Registering Mod Items for " + Skelethrone.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
            entries.add(RAW_FOSSIL);
        });
    }
}
