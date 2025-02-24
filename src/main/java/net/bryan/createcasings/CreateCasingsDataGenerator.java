package net.bryan.createcasings;

import net.bryan.createcasings.datagen.ModItemTagProvider;
import net.bryan.createcasings.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CreateCasingsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();


		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
