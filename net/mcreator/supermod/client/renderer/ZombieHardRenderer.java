/*    */ package net.mcreator.supermod.client.renderer;
/*    */ import net.mcreator.supermod.client.model.ModelzombieHard;
/*    */ import net.mcreator.supermod.entity.ZombieHardEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ZombieHardRenderer extends MobRenderer<ZombieHardEntity, ModelzombieHard<ZombieHardEntity>> {
/*    */   public ZombieHardRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new ModelzombieHard(context.m_174023_(ModelzombieHard.LAYER_LOCATION)), 1.0F);
/* 16 */     m_115326_((RenderLayer)new EyesLayer<ZombieHardEntity, ModelzombieHard<ZombieHardEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 19 */             return RenderType.m_110488_(new ResourceLocation("supermod:textures/entities/eyesforhardzombie.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ZombieHardEntity entity) {
/* 26 */     return new ResourceLocation("supermod:textures/entities/zombiehard.png");
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\client\renderer\ZombieHardRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */