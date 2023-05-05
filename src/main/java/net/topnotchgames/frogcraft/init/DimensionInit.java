package net.topnotchgames.frogcraft.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.dimension.DimensionType;
import net.topnotchgames.frogcraft.Frogcraft;

public abstract class DimensionInit {
	public static final ResourceKey<DimensionType> THE_IN_BETWEEN = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(Frogcraft.MODID, "the_in_between"));
	public static final ResourceLocation THE_IN_BETWEEN_EFFECTS = new ResourceLocation(Frogcraft.MODID, "the_in_between");
}
