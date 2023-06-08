/*    */ package net.mcreator.supermod.client.renderer;
/*    */ import net.mcreator.supermod.client.model.ModelzombieEasy;
/*    */ import net.mcreator.supermod.entity.ZombieEasyEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ZombieEasyRenderer extends MobRenderer<ZombieEasyEntity, ModelzombieEasy<ZombieEasyEntity>> {
/*    */   public ZombieEasyRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new ModelzombieEasy(context.m_174023_(ModelzombieEasy.LAYER_LOCATION)), 0.5F);
/* 16 */     m_115326_((RenderLayer)new EyesLayer<ZombieEasyEntity, ModelzombieEasy<ZombieEasyEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 19 */             return RenderType.m_110488_(new ResourceLocation("supermod:textures/entities/eyesforeasyzombie.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ZombieEasyEntity entity) {
/* 26 */     return new ResourceLocation("supermod:textures/entities/zombieeasy.png");
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\client\renderer\ZombieEasyRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */