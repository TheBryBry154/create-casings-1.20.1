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

    public void spawnCat(ServerWorld world, BlockPos pos) {
        CatEntity cat = new CatEntity(EntityType.CAT, world);
        cat.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 0, 0);
        world.spawnEntity(cat);

        // Spawn cat particles
        world.spawnParticles(CreateCasings.CAT_PARTICLE_SPAWN, pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5,
                5, 0.3, 0.3, 0.3, 0.01);
    }
}