
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cmd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.cmd.item.TestItem;
import net.mcreator.cmd.CmdMod;

public class CmdModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CmdMod.MODID);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	// Start of user code block custom items
	// End of user code block custom items
}
