/*    */ package net.mcreator.supermod.client.renderer;
/*    */ 
/*    */ import net.mcreator.supermod.client.model.ModelzombieHard;
/*    */ import net.mcreator.supermod.entity.ZombieHardNotLightingEyesEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ZombieHardNotLightingEyesRenderer extends MobRenderer<ZombieHardNotLightingEyesEntity, ModelzombieHard<ZombieHardNotLightingEyesEntity>> {
/*    */   public ZombieHardNotLightingEyesRenderer(EntityRendererProvider.Context context) {
/* 13 */     super(context, (EntityModel)new ModelzombieHard(context.m_174023_(ModelzombieHard.LAYER_LOCATION)), 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ZombieHardNotLightingEyesEntity entity) {
/* 18 */     return new ResourceLocation("supermod:textures/entities/zombiehard.png");
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\client\renderer\ZombieHardNotLightingEyesRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */