package io.github.lukefallows.armor;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("armor")
public class ArmorMod {

	public ArmorMod() {

		final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.register(IronBroadsword.StartupCommon.class);
	}
}

