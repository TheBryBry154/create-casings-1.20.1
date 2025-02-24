package net.bryan.createcasings.entity;

import net.bryan.createcasings.CreateCasings;
import net.bryan.createcasings.entity.custom.WizardEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<WizardEntity> WIZARD = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(CreateCasings.MOD_ID, "wizard"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WizardEntity::new).dimensions(EntityDimensions.fixed(1f, 5f)).build());

    public static void registerModEntities() {
        CreateCasings.LOGGER.info("Registering Entities for " + CreateCasings.MOD_ID);
    }
}
