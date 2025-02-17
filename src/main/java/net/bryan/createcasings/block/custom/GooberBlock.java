package net.bryan.createcasings.block.custom;

import net.bryan.createcasings.CreateCasings;
import net.bryan.createcasings.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GravelBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import net.minecraft.world.explosion.ExplosionBehavior;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GooberBlock extends Block
{public GooberBlock (Settings settings) {super(settings);}

@Override
public ActionResult  onUse (BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
    world.playSound(player, pos, ModSounds.LIFE_IS_A_MYSTERY_FULL, SoundCategory.BLOCKS, 10f, 1f  );

    return ActionResult.SUCCESS;



}

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.translatable("Its a block, and it goobs"));
        super.appendTooltip(stack, world, tooltip, options);
    }
}

