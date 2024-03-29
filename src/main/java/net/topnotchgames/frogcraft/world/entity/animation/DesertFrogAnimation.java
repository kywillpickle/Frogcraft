package net.topnotchgames.frogcraft.world.entity.animation;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class DesertFrogAnimation {


public static final AnimationDefinition MODEL_CROAK = AnimationDefinition.Builder.withLength(0.5834334f)
	.addAnimation("base",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.125f, KeyframeAnimations.degreeVec(-5f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("body",
		new AnimationChannel(AnimationChannel.Targets.SCALE,
			new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125f, KeyframeAnimations.scaleVec(1.1f, 1.1f, 1.1f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5834334f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("eyes",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.041676664f, KeyframeAnimations.posVec(0f, 0.1f, -0.2f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0.5f, -1f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.5834334f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("eyes",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.125f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("throat",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0f, -1.4f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.5834334f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("throat",
		new AnimationChannel(AnimationChannel.Targets.SCALE,
			new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.125f, KeyframeAnimations.scaleVec(1.3f, 1.2f, 1.5f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5834334f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("skull",
		new AnimationChannel(AnimationChannel.Targets.SCALE,
			new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125f, KeyframeAnimations.scaleVec(1.1f, 1.1f, 1.1f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5834334f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
				AnimationChannel.Interpolations.LINEAR))).build();

	public static final AnimationDefinition MODEL_WALK = AnimationDefinition.Builder.withLength(1f).looping()
	.addAnimation("fl_leg",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -1f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 1f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.625f, KeyframeAnimations.posVec(0f, 0.75f, 0.5f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 1f, 0f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.875f, KeyframeAnimations.posVec(0f, 0.75f, -0.5f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, -1f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("fl_leg",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(-13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4167667f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5416766f, KeyframeAnimations.degreeVec(20f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.9583434f, KeyframeAnimations.degreeVec(-20f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1f, KeyframeAnimations.degreeVec(-13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("bl_leg",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 1f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0.75f, 0.5f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 1f, 0f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.375f, KeyframeAnimations.posVec(0f, 0.75f, -0.5f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, -1f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 1f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("bl_leg",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(20f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4583433f, KeyframeAnimations.degreeVec(-20f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(-13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.9167666f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1f, KeyframeAnimations.degreeVec(13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("br_leg",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -1f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 1f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.625f, KeyframeAnimations.posVec(0f, 0.75f, 0.5f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 1f, 0f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.875f, KeyframeAnimations.posVec(0f, 0.75f, -0.5f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, -1f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("br_leg",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(-13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4167667f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5416766f, KeyframeAnimations.degreeVec(20f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.9583434f, KeyframeAnimations.degreeVec(-20f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1f, KeyframeAnimations.degreeVec(-13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("fr_leg",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 1f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.125f, KeyframeAnimations.posVec(0f, 0.75f, 0.5f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 1f, 0f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.375f, KeyframeAnimations.posVec(0f, 0.75f, -0.5f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, -1f),
				AnimationChannel.Interpolations.CATMULLROM), 
			new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 1f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("fr_leg",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(20f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4583433f, KeyframeAnimations.degreeVec(-20f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(-13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5834334f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.9167666f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1f, KeyframeAnimations.degreeVec(13.33f, 0f, 0f),
				AnimationChannel.Interpolations.CATMULLROM)))
	.addAnimation("base",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0.2f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 0.2f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("eyes",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0.04f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.08343333f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.3433333f, KeyframeAnimations.posVec(0f, 0.1f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.5834334f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.8343334f, KeyframeAnimations.posVec(0f, 0.1f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(1f, KeyframeAnimations.posVec(0f, 0.04f, 0f),
				AnimationChannel.Interpolations.LINEAR))).build();
	
	public static final AnimationDefinition MODEL_TONGUE = AnimationDefinition.Builder.withLength(0.5f)
	.addAnimation("head",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-30f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("tongue",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-10f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.degreeVec(-12.5f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-10f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("tongue",
		new AnimationChannel(AnimationChannel.Targets.SCALE,
			new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.08343333f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.16766666f, KeyframeAnimations.scaleVec(0.7f, 1f, 4f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3433333f, KeyframeAnimations.scaleVec(0.7f, 1f, 3f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("throat",
		new AnimationChannel(AnimationChannel.Targets.SCALE,
			new Keyframe(0f, KeyframeAnimations.scaleVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR))).build();
	
	public static final AnimationDefinition MODEL_JUMP = AnimationDefinition.Builder.withLength(0.5416766f)
	.addAnimation("root",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("root",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.041676664f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(-5f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("base",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.041676664f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0.5f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("base",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.08343333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(-10f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("fl_leg",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(-74.5f, -14.48f, -3.97f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("bl_leg",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.125f, KeyframeAnimations.posVec(0f, -0.5f, 0.25f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("bl_leg",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("br_leg",
		new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR), 
			new Keyframe(0.125f, KeyframeAnimations.posVec(0f, -0.5f, 0.25f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("br_leg",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25f, KeyframeAnimations.degreeVec(30f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR)))
	.addAnimation("fr_leg",
		new AnimationChannel(AnimationChannel.Targets.ROTATION,
			new Keyframe(0.125f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
				AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5f, KeyframeAnimations.degreeVec(-74.5f, 14.48f, 3.97f),
				AnimationChannel.Interpolations.LINEAR))).build();
}
