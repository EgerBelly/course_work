/*    */ package net.mcreator.supermod.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.item.CreativeModeTab;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class SuperitemItem
/*    */   extends Item
/*    */ {
/*    */   public SuperitemItem() {
/* 16 */     super((new Item.Properties()).m_41491_(CreativeModeTab.f_40759_).m_41487_(16).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 21 */     super.m_7373_(itemstack, world, list, flag);
/* 22 */     list.add(Component.m_237113_("редкий предмет"));
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\item\SuperitemItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */