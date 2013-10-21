package modreflectiontemplate.intermod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class OnlySilverContents extends ModContents {
	
	public Class
	onlySilverAPI;
	
	public Content<Item>
	silverHelm, silverChest, silverLegs, silverBoots,
	silverIngot, silverRod,
	silverPick, silverAxe, silverShovel, silverSword, silverHoe, silverBow;
	
	public Content<Block>
	silverOre, silverBlock;
	
	
	public OnlySilverContents() {
		if (!isModLoaded())
			return;

		try {
			onlySilverAPI = Class.forName("OnlySilver.code.api.OnlySilverAPI");
		} catch (ClassNotFoundException e) {
			throw new ModReflectionFailException(e);
		}
		
		silverHelm = of(onlySilverAPI, "silverHelm", optionalGet());
		silverChest = of(onlySilverAPI, "silverChest", optionalGet());
		silverLegs = of(onlySilverAPI, "silverLegs", optionalGet());
		silverBoots = of(onlySilverAPI, "silverBoots", optionalGet());

		silverIngot = of(onlySilverAPI, "silverIngot", optionalGet());
		silverRod = of(onlySilverAPI, "silverRod", optionalGet());

		silverPick = of(onlySilverAPI, "silverPick", optionalGet());
		silverAxe = of(onlySilverAPI, "silverAxe", optionalGet());
		silverShovel = of(onlySilverAPI, "silverShovel", optionalGet());
		silverSword = of(onlySilverAPI, "silverSword", optionalGet());
		silverHoe = of(onlySilverAPI, "silverHoe", optionalGet());
		silverBow = of(onlySilverAPI, "silverBow", optionalGet());
		
		silverOre = of(onlySilverAPI, "silverOre", optionalGet());
		silverBlock = of(onlySilverAPI, "silverBlock", optionalGet());
		
	}
	
	
	
	@Override public String getModId() {
		return "onlysilver";
	}
	
}
