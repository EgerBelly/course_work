/*    */ package net.mcreator.supermod.procedures;
/*    */ 
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SuperSwordProcProcedure
/*    */ {
/*    */   public static void execute(Entity entity) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     if (entity instanceof net.mcreator.supermod.entity.ZombieEasyEntity) {
/* 18 */       entity.m_6469_(DamageSource.f_19318_, 2.0F);
/* 19 */       entity.m_20254_(7);
/*    */     } 
/* 21 */     if (entity instanceof net.mcreator.supermod.entity.ZombieEasyNotLightEyesEntity) {
/* 22 */       entity.m_6469_(DamageSource.f_19318_, 2.0F);
/* 23 */       entity.m_20254_(7);
/*    */     } 
/* 25 */     if (entity instanceof net.mcreator.supermod.entity.ZombieHardEntity) {
/* 26 */       entity.m_6469_(DamageSource.f_19318_, 2.0F);
/* 27 */       entity.m_20254_(7);
/*    */     } 
/* 29 */     if (entity instanceof net.mcreator.supermod.entity.ZombieHardNotLightingEyesEntity) {
/* 30 */       entity.m_6469_(DamageSource.f_19318_, 2.0F);
/* 31 */       entity.m_20254_(7);
/*    */     } 
/* 33 */     if (entity instanceof net.mcreator.supermod.entity.ZombieMiddleEntity) {
/* 34 */       entity.m_6469_(DamageSource.f_19318_, 2.0F);
/* 35 */       entity.m_20254_(7);
/*    */     } 
/* 37 */     if (entity instanceof net.mcreator.supermod.entity.ZombieMiddleNotLightingEyesEntity) {
/* 38 */       entity.m_6469_(DamageSource.f_19318_, 2.0F);
/* 39 */       entity.m_20254_(7);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\procedures\SuperSwordProcProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */