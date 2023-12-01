package net.project.project.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.project.project.Project;

public class ModItems {

    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, Project.MOD_ID);

    public static final RegistryObject<Item> Aluminum_ingot = Items.register("aluminum_ingot",
        () -> new Item(new Item.Properties().group(ModItemGroup.CARROT)));

    public static final RegistryObject<Item> Thallium = Items.register("thallium",
            () -> new Item(new Item.Properties().group(ModItemGroup.CARROT)));

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }

}
