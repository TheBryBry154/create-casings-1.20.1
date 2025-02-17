package net.bryan.createcasings.events;

import net.bryan.createcasings.CreateCasings;
import net.bryan.createcasings.block.ModBlocks;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class BenBlockEvents {
    public void onInitialize() {
        PlayerBlockBreakEvents.AFTER.register(((world, player, pos, state, blockEntity) -> {
            if (!world.isClient() && state.getBlock() == ModBlocks.BEN_BLOCK) {
                spawnCat((ServerWorld) world, pos);
            }
        }));
    }

    public <CatParticleSpawn> void spawnCat(ServerWorld world, BlockPos pos) {
        CatEntity cat = new CatEntity(EntityType.CAT, world);
        cat.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 0, 0);
        world.spawnEntity(cat);

        // spawn yap particles for cat :D
        CatParticleSpawn catParticleSpawn = (CatParticleSpawn) CreateCasings.CAT_PARTICLE_SPAWN;
    }
}