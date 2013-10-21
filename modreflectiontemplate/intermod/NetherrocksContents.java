package modreflectiontemplate.intermod;

import net.minecraft.item.Item;

public class NetherrocksContents extends ModContents {
	
	public Class
	items, tools, armor;

	public Content<Item>
	fyriteIngot, malachiteIngot, illumeniteIngot, argoniteIngot,
	
	fyritePick, fyriteSword,
	fyriteBoots, fyriteChest, fyriteHelm, fyriteLegs,
	
	malachiteAxe, malachiteHoe, malachitePick, malachiteShovel, malachiteSword,
	malachiteBoots, malachiteChest, malachiteHelm, malachiteLegs,
	
	illumeniteSword,
	illumeniteBoots, illumeniteChest, illumeniteHelm, illumeniteLegs,
	
	argoniteAxe, argoniteHoe, argonitePick, argoniteShovel, argoniteSword
	;
	
	
	public NetherrocksContents() {
		if (!isModLoaded())
			return;
		
		try {
			items = Class.forName("Netherrocks.core.Items");
			tools = Class.forName("Netherrocks.core.Tools");
			armor = Class.forName("Netherrocks.core.Armor");
		} catch (ClassNotFoundException e) {
			throw new ModReflectionFailException(e);
		}
		
		fyriteIngot = of(items, "fyriteIngot");
		malachiteIngot = of(items, "malachiteIngot");
		illumeniteIngot = of(items, "illumeniteIngot");
		argoniteIngot = of(items, "argoniteIngot");
		
		
		fyritePick = of(tools, "fyritePick");
		fyriteSword = of(tools, "fyriteSword");
		
		fyriteBoots = of(armor, "fyriteBoots");
		fyriteChest = of(armor, "fyriteChest");
		fyriteHelm = of(armor, "fyriteHelm");
		fyriteLegs = of(armor, "fyriteLegs");
		
		
		malachiteAxe = of(tools, "malachiteAxe");
		malachiteHoe = of(tools, "malachiteHoe");
		malachitePick = of(tools, "malachitePick");
		malachiteShovel = of(tools, "malachiteShovel");
		malachiteSword = of(tools, "malachiteSword");
		
		malachiteBoots = of(armor, "malachiteBoots");
		malachiteChest = of(armor, "malachiteChest");
		malachiteHelm = of(armor, "malachiteHelm");
		malachiteLegs = of(armor, "malachiteLegs");
		

		illumeniteSword = of(tools, "illumeniteSword");
		
		illumeniteBoots = of(armor, "illumeniteBoots");
		illumeniteChest = of(armor, "illumeniteChest");
		illumeniteHelm = of(armor, "illumeniteHelm");
		illumeniteLegs = of(armor, "illumeniteLegs");
		

		argoniteAxe = of(tools, "argoniteAxe");
		argoniteHoe = of(tools, "argoniteHoe");
		argonitePick = of(tools, "argonitePick");
		argoniteShovel = of(tools, "argoniteShovel");
		argoniteSword = of(tools, "argoniteSword");
		
	}
	
	@Override public String getModId() {
		return "netherrocks";
	}
	
}
