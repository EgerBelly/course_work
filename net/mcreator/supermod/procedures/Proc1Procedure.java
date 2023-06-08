/*    */ package net.mcreator.supermod.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class Proc1Procedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 16 */     if (event.phase == TickEvent.Phase.END) {
/* 17 */       execute((Event)event, (Entity)event.player);
/*    */     }
/*    */   }
/*    */   
/*    */   public static boolean execute(Entity entity) {
/* 22 */     return execute(null, entity);
/*    */   }
/*    */   
/*    */   private static boolean execute(@Nullable Event event, Entity entity) {
/* 26 */     if (entity == null)
/* 27 */       return false; 
/* 28 */     if ((entity.getPersistentData().m_128459_("Timer") > 400.0D && entity.getPersistentData().m_128459_("Timer") < 465.0D) || (entity.getPersistentData().m_128459_("Timer") > 6800.0D && entity.getPersistentData().m_128459_("Timer") < 7000.0D)) {
/* 29 */       return true;
/*    */     }
/* 31 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\procedures\Proc1Procedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */