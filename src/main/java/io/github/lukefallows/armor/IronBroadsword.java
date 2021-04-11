package io.github.lukefallows.armor;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class IronBroadsword extends SwordItem {

	public static final int MAX_STACK_SIZE = 1;
	public static final int ATTACK_DAMAGE = 7;
	public static final float ATTACK_SPEED = -1.9f;

	public IronBroadsword(ItemGroup group, String name) {
		super(ItemTier.IRON, ATTACK_DAMAGE, ATTACK_SPEED,
				new Item.Properties()
					.maxStackSize(MAX_STACK_SIZE)
					.group(group));
		setRegistryName(name);
	}


	public static class StartupCommon {

		public static ItemGroup ARMOR_GROUP = new ItemGroup("armor") {
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.IRON_HORSE_ARMOR);
			}
		};

		@SubscribeEvent
		public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
			itemRegisterEvent.getRegistry().register(new IronBroadsword(ARMOR_GROUP, "iron_broadsword"));
		}

	}
}
