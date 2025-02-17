package net.bryan.createcasings.Item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TYTAN = new FoodComponent.Builder().hunger(10).saturationModifier(2.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2000), 100)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000), 100)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2000), 100)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000), 100)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2000), 100)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000), 100)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2000), 100)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2000), 100).build();

    public static final FoodComponent WIZARD = new FoodComponent.Builder().hunger(1).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS , 10000), 100)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER , 10000), 100).build();
}
