package net.leoni.indigosmod.item.custom;

import net.leoni.indigosmod.IndigosMod;
import net.leoni.indigosmod.item.ModItems;
import net.leoni.indigosmod.item.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier AMETHYST = TierSortingRegistry.registerTier(
            new ForgeTier(3, 350, 6.2f, 2.2F, 11,
                    ModTags.Blocks.NEEDS_AMETHYST_INGOT_TOOL, () -> Ingredient.of(ModItems.AMETHYST_INGOT.get())),
            new ResourceLocation(IndigosMod.MOD_ID, "amethyst_ingot"), List.of(Tiers.IRON), List.of());
}
