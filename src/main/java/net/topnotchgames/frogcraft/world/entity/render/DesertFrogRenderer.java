package net.topnotchgames.frogcraft.world.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.world.entity.DesertFrogEntity;
import net.topnotchgames.frogcraft.world.entity.model.DesertFrogModel;

public class DesertFrogRenderer extends MobRenderer<DesertFrogEntity, DesertFrogModel> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Frogcraft.MODID, "textures/entity/desert_frog.png");
	
	public DesertFrogRenderer(EntityRendererProvider.Context ctx) {
		super(ctx, new DesertFrogModel(ctx.bakeLayer(DesertFrogModel.LAYER_LOCATION)), 0.25F);
	}

	@Override
	public ResourceLocation getTextureLocation(DesertFrogEntity entity) {
		return TEXTURE;
	}

}