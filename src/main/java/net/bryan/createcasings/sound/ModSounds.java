package net.bryan.createcasings.sound;

import net.bryan.createcasings.CreateCasings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent YOUR_MOTHER = registerSoundEvent("your_mother");
    public static final SoundEvent LIFE_IS_A_MYSTERY_FULL = registerSoundEvent("life_full");
    public static final SoundEvent LIFE_IS_A_MYSTERY_CLIP = registerSoundEvent("life");
    public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(CreateCasings.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }


    public static void initialize() {

        CreateCasings.LOGGER.info("Registering the gooberific yapper that is" + CreateCasings.MOD_ID + "Sounds, also, Wizard is a Goober");
        CreateCasings.LOGGER.debug("Registering the gooberific yapper that is" + CreateCasings.MOD_ID + "Sounds, also, Wizard is a Goober");
    }

}
