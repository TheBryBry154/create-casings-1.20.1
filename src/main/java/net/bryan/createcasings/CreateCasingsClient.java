package net.bryan.createcasings;

import net.bryan.createcasings.entity.ModEntities;
import net.bryan.createcasings.entity.client.ModModelLayers;
import net.bryan.createcasings.entity.client.WizardModel;
import net.bryan.createcasings.entity.client.WizardRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class CreateCasingsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.WIZARD, WizardModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.WIZARD, WizardRenderer::new);
    }
}
