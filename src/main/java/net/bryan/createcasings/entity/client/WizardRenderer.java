package net.bryan.createcasings.entity.client;

import net.bryan.createcasings.CreateCasings;
import net.bryan.createcasings.entity.custom.WizardEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class WizardRenderer extends MobEntityRenderer<WizardEntity, WizardModel<WizardEntity>> {
    private static final Identifier TEXTURE = new Identifier(CreateCasings.MOD_ID, "textures/entity/wizard/wizard.png");

    public WizardRenderer(EntityRendererFactory.Context context) {
        super(context, new WizardModel<>(context.getPart(ModModelLayers.WIZARD)), 0.6f);
    }

    @Override
    public Identifier getTexture (WizardEntity entity){
        return TEXTURE;
    }

        @Override
        public void render (WizardEntity mobEntity,float f, float g, MatrixStack matrixStack,
                VertexConsumerProvider vertexConsumerProvider,int i){

            if (mobEntity.isBaby()) {
                matrixStack.scale(0.5f, 0.5f, 0.5f);
            } else {
                matrixStack.scale(5.5f, 5.5f, 5.5f);


            }


            super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
        }
        {
        }
    }

