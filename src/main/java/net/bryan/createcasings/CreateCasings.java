package net.bryan.createcasings;

import net.bryan.createcasings.Item.ModItemGroups;
import net.bryan.createcasings.Item.ModItems;
import net.bryan.createcasings.block.ModBlocks;
import net.bryan.createcasings.events.BenBlockEvents;
import net.bryan.createcasings.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateCasings implements ModInitializer {
	public static final String MOD_ID = "createcasings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final DefaultParticleType CAT_PARTICLE_SPAWN = FabricParticleTypes.simple();



	@Override
	public void onInitialize() {
		ModSounds.initialize();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


		FuelRegistry.INSTANCE.add(ModItems.WIZARD, 10);

		new BenBlockEvents().onInitialize();
		Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "cat_particle_spawn"), CAT_PARTICLE_SPAWN);


	}
}