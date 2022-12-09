package net.jaden.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jaden.tutorialmod.TutorialMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.registry.entry.RegistryEntry;


public class ModItems {



    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier("example", "test_group"))
            .displayName(Text.literal("New Group!"))
            .icon(() -> new ItemStack(Items.DIAMOND))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(Items.DIAMOND);
                entries.add(Items.FEATHER);
                entries.add(ModItems.ELIXER);
            })
            .build();

    public static final Item ELIXER = registerItem("elixer" , new Item(new Item.Settings()));





    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
