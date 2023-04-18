package rocks.lilt.baguette;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Baguette implements ModInitializer {

    public static final Item BAGUETTE = new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(16).saturationModifier(18f).build()));

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("baguette", "baguette"), BAGUETTE);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {content.addAfter(Items.BREAD, BAGUETTE);});
    }
}
