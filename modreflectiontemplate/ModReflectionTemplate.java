package modreflectiontemplate;

import modreflectiontemplate.intermod.NetherrocksContents;
import modreflectiontemplate.intermod.OnlySilverContents;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ModReflectionTemplate.MODID, name = ModReflectionTemplate.NAME, version = "0.0.0.0-1.6.4",
		dependencies = ModReflectionTemplate.DEPENDENCIES)

public class ModReflectionTemplate {

	public static final String MODID = "ModReflectionTemplate";
	public static final String NAME = "Mod Reflection Template";
	public static final String PACKAGE_NAME = "modreflectiontemplate";
	
	public static final String DEPENDENCIES =
			"after:netherrocks;" + "after:onlysilver;";
	public static final NetherrocksContents NR = new NetherrocksContents();
	public static final OnlySilverContents OS = new OnlySilverContents();
	

	@EventHandler public void init(FMLInitializationEvent event) {
		craftHoesIntoPicksTemplate();
		
	}
	
	public static void craftHoesIntoPicksTemplate() {
		if (NR.isModLoaded()) {
			GameRegistry.addShapedRecipe(
					new ItemStack(NR.malachitePick.get()),
					"X ", " O", 'X', NR.malachiteHoe.get(), 'O', NR.malachiteIngot.get());
			GameRegistry.addShapedRecipe(
					new ItemStack(NR.argonitePick.get()),
					"X ", " O", 'X', NR.argoniteHoe.get(), 'O', NR.argoniteIngot.get());
		}
		
		if (OS.isModLoaded())
			GameRegistry.addShapedRecipe(
					new ItemStack(OS.silverPick.get()),
					"X ", " O", 'X', OS.silverHoe.get(), 'O', OS.silverIngot.get());
		
	}
	
}
