/*    */ package net.mcreator.supermod.client.renderer;
/*    */ import net.mcreator.supermod.client.model.ModelzombieMiddle;
/*    */ import net.mcreator.supermod.entity.ZombieMiddleEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ZombieMiddleRenderer extends MobRenderer<ZombieMiddleEntity, ModelzombieMiddle<ZombieMiddleEntity>> {
/*    */   public ZombieMiddleRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new ModelzombieMiddle(context.m_174023_(ModelzombieMiddle.LAYER_LOCATION)), 0.6F);
/* 16 */     m_115326_((RenderLayer)new EyesLayer<ZombieMiddleEntity, ModelzombieMiddle<ZombieMiddleEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 19 */             return RenderType.m_110488_(new ResourceLocation("supermod:textures/entities/eyesformiddlezombie.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ZombieMiddleEntity entity) {
/* 26 */     return new ResourceLocation("supermod:textures/entities/zombiemiddle.png");
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\client\renderer\ZombieMiddleRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */