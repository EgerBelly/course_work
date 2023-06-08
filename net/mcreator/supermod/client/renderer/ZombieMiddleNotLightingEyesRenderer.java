/*    */ package net.mcreator.supermod.client.renderer;
/*    */ 
/*    */ import net.mcreator.supermod.client.model.ModelzombieMiddle;
/*    */ import net.mcreator.supermod.entity.ZombieMiddleNotLightingEyesEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ZombieMiddleNotLightingEyesRenderer extends MobRenderer<ZombieMiddleNotLightingEyesEntity, ModelzombieMiddle<ZombieMiddleNotLightingEyesEntity>> {
/*    */   public ZombieMiddleNotLightingEyesRenderer(EntityRendererProvider.Context context) {
/* 13 */     super(context, (EntityModel)new ModelzombieMiddle(context.m_174023_(ModelzombieMiddle.LAYER_LOCATION)), 0.6F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ZombieMiddleNotLightingEyesEntity entity) {
/* 18 */     return new ResourceLocation("supermod:textures/entities/zombiemiddle.png");
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\client\renderer\ZombieMiddleNotLightingEyesRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */