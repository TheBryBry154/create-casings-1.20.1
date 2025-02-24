package net.bryan.createcasings.particle;

import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.particle.DefaultParticleType;

public class CatParticle extends SpriteBillboardParticle {
    protected CatParticle(ClientWorld world, double x, double y, double z, SpriteProvider spriteProvider) {
        super(world, x, y, z);
        this.setSprite(spriteProvider);
        this.scale = 0.1F;
        this.maxAge = 90;
        this.alpha = 0.9F;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public CatParticle createParticle(DefaultParticleType type, ClientWorld world, double x, double y, double z, double dx, double dy, double dz) {
            return new CatParticle(world, x, y, z, spriteProvider);
        }
    }
}
