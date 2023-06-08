/*    */ package net.mcreator.supermod.init;
/*    */ 
/*    */ import net.mcreator.supermod.client.model.ModelzombieEasy;
/*    */ import net.mcreator.supermod.client.model.ModelzombieHard;
/*    */ import net.mcreator.supermod.client.model.ModelzombieMiddle;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.EntityRenderersEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class SupermodModModels
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
/* 20 */     event.registerLayerDefinition(ModelzombieEasy.LAYER_LOCATION, ModelzombieEasy::createBodyLayer);
/* 21 */     event.registerLayerDefinition(ModelzombieMiddle.LAYER_LOCATION, ModelzombieMiddle::createBodyLayer);
/* 22 */     event.registerLayerDefinition(ModelzombieHard.LAYER_LOCATION, ModelzombieHard::createBodyLayer);
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\init\SupermodModModels.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */