package net.bryan.createcasings.entity.client;

import net.bryan.createcasings.entity.custom.WizardEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.AnimalEntity;

public class WizardModel<WizardEntity extends AnimalEntity> extends EntityModel<WizardEntity> {
    private final ModelPart root;
    private final ModelPart body;

    public WizardModel(ModelPart root) {
        this.root = root;
        this.body = root.getChild("body");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        modelPartData.addChild("body",
                ModelPartBuilder.create()
                        .uv(0, 0)
                        .cuboid(-6F, -12F, -6F, 12F, 24F, 12F),
                ModelTransform.pivot(0F, 12F, 0F));

        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(WizardEntity entity, float limbAngle, float limbDistance,
                          float animationProgress, float headYaw, float headPitch) {
        //yap
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices,
                       int light, int overlay, float red, float green, float blue, float alpha) {
        root.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
