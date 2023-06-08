/*    */ package net.mcreator.supermod.init;
/*    */ 
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.EntityRenderersEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class SupermodModEntityRenderers
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
/* 23 */     event.registerEntityRenderer((EntityType)SupermodModEntities.ZOMBIE_MIDDLE_NOT_LIGHTING_EYES.get(), net.mcreator.supermod.client.renderer.ZombieMiddleNotLightingEyesRenderer::new);
/* 24 */     event.registerEntityRenderer((EntityType)SupermodModEntities.ZOMBIE_EASY_NOT_LIGHT_EYES.get(), net.mcreator.supermod.client.renderer.ZombieEasyNotLightEyesRenderer::new);
/* 25 */     event.registerEntityRenderer((EntityType)SupermodModEntities.ZOMBIE_HARD_NOT_LIGHTING_EYES.get(), net.mcreator.supermod.client.renderer.ZombieHardNotLightingEyesRenderer::new);
/* 26 */     event.registerEntityRenderer((EntityType)SupermodModEntities.ZOMBIE_EASY.get(), net.mcreator.supermod.client.renderer.ZombieEasyRenderer::new);
/* 27 */     event.registerEntityRenderer((EntityType)SupermodModEntities.ZOMBIE_MIDDLE.get(), net.mcreator.supermod.client.renderer.ZombieMiddleRenderer::new);
/* 28 */     event.registerEntityRenderer((EntityType)SupermodModEntities.ZOMBIE_HARD.get(), net.mcreator.supermod.client.renderer.ZombieHardRenderer::new);
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\init\SupermodModEntityRenderers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */