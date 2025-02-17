package net.bryan.createcasings;

import net.bryan.createcasings.Item.ModItemGroups;
import net.bryan.createcasings.Item.ModItems;
import net.bryan.createcasings.block.ModBlocks;
import net.bryan.createcasings.events.BenBlockEvents;
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
        CustomSounds.initialize();
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        FuelRegistry.INSTANCE.add(ModItems.WIZARD, 10);
        new BenBlockEvents().onInitialize();
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "cat_particle_spawn"), CAT_PARTICLE_SPAWN);


    }

    public class CustomSounds {

		public static final SoundEvent YOUR_MOTHER = registerSound("your_mother");
		public static final SoundEvent LIFE_IS_A_MYSTERY_FULL = registerSound("life_full");
		public static final SoundEvent LIFE_IS_A_MYSTERY_CLIP = registerSound("life");


		private static SoundEvent registerSound(String id) {
			Identifier identifier = new Identifier(CreateCasings.MOD_ID, id);
			return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
		}



			public static void initialize() {

				CreateCasings.LOGGER.info("Registering the gooberific yapper that is" + CreateCasings.MOD_ID + "Sounds, also, Wizard is a Goober");
				CreateCasings.LOGGER.debug("Registering the gooberific yapper that is" + CreateCasings.MOD_ID + "Sounds, also, Wizard is a Goober");
			}




		}
		public static void initialize() {

			CreateCasings.LOGGER.info("Registering the gooberific yapper that is" + CreateCasings.MOD_ID + "Sounds, also, Wizard is a Goober");
			CreateCasings.LOGGER.debug("Registering the gooberific yapper that is" + CreateCasings.MOD_ID + "Sounds, also, Wizard is a Goober");
		}
		public class CreateCasingsSounds implements ModInitializer {
			public static final String MOD_ID = CreateCasings.MOD_ID;
			public static final Logger LOGGER = CreateCasings.LOGGER;


			@Override
			public void onInitialize() {
				CustomSounds.initialize();

			}
		}
	}



