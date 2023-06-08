/*    */ package net.mcreator.supermod.client.renderer;
/*    */ 
/*    */ import net.mcreator.supermod.client.model.ModelzombieEasy;
/*    */ import net.mcreator.supermod.entity.ZombieEasyNotLightEyesEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ZombieEasyNotLightEyesRenderer extends MobRenderer<ZombieEasyNotLightEyesEntity, ModelzombieEasy<ZombieEasyNotLightEyesEntity>> {
/*    */   public ZombieEasyNotLightEyesRenderer(EntityRendererProvider.Context context) {
/* 13 */     super(context, (EntityModel)new ModelzombieEasy(context.m_174023_(ModelzombieEasy.LAYER_LOCATION)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ZombieEasyNotLightEyesEntity entity) {
/* 18 */     return new ResourceLocation("supermod:textures/entities/zombieeasy.png");
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\client\renderer\ZombieEasyNotLightEyesRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */