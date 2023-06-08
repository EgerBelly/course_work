/*    */ package net.mcreator.supermod.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.supermod.procedures.SuperSwordProcProcedure;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.CreativeModeTab;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.SwordItem;
/*    */ import net.minecraft.world.item.Tier;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.crafting.Ingredient;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ 
/*    */ public class SuperswordItem
/*    */   extends SwordItem
/*    */ {
/*    */   public SuperswordItem() {
/* 24 */     super(new Tier() {
/*    */           public int m_6609_() {
/* 26 */             return 1600;
/*    */           }
/*    */           
/*    */           public float m_6624_() {
/* 30 */             return 4.0F;
/*    */           }
/*    */           
/*    */           public float m_6631_() {
/* 34 */             return 6.0F;
/*    */           }
/*    */           
/*    */           public int m_6604_() {
/* 38 */             return 1;
/*    */           }
/*    */           
/*    */           public int m_6601_() {
/* 42 */             return 2;
/*    */           }
/*    */           
/*    */           public Ingredient m_6282_() {
/* 46 */             return Ingredient.f_43901_;
/*    */           }
/* 48 */         },  3, -3.0F, (new Item.Properties()).m_41491_(CreativeModeTab.f_40757_));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7579_(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 53 */     boolean retval = super.m_7579_(itemstack, entity, sourceentity);
/* 54 */     SuperSwordProcProcedure.execute((Entity)entity);
/* 55 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 60 */     super.m_7373_(itemstack, world, list, flag);
/* 61 */     list.add(Component.m_237113_("не предаём светлую сторону"));
/*    */   }
/*    */ 
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public boolean m_5812_(ItemStack itemstack) {
/* 67 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\item\SuperswordItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */