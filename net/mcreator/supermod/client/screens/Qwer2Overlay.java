/*    */ package net.mcreator.supermod.client.screens;
/*    */ 
/*    */ import com.mojang.blaze3d.platform.GlStateManager;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import net.mcreator.supermod.procedures.Proc3Procedure;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.Gui;
/*    */ import net.minecraft.client.player.LocalPlayer;
/*    */ import net.minecraft.client.renderer.GameRenderer;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.RenderGuiEvent;
/*    */ import net.minecraftforge.eventbus.api.EventPriority;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber({Dist.CLIENT})
/*    */ public class Qwer2Overlay
/*    */ {
/*    */   @SubscribeEvent(priority = EventPriority.NORMAL)
/*    */   public static void eventHandler(RenderGuiEvent.Pre event) {
/* 28 */     int w = event.getWindow().m_85445_();
/* 29 */     int h = event.getWindow().m_85446_();
/* 30 */     int posX = w / 2;
/* 31 */     int posY = h / 2;
/* 32 */     Level world = null;
/* 33 */     double x = 0.0D;
/* 34 */     double y = 0.0D;
/* 35 */     double z = 0.0D;
/* 36 */     LocalPlayer localPlayer = (Minecraft.m_91087_()).f_91074_;
/* 37 */     if (localPlayer != null) {
/* 38 */       world = ((Player)localPlayer).f_19853_;
/* 39 */       x = localPlayer.m_20185_();
/* 40 */       y = localPlayer.m_20186_();
/* 41 */       z = localPlayer.m_20189_();
/*    */     } 
/* 43 */     RenderSystem.m_69465_();
/* 44 */     RenderSystem.m_69458_(false);
/* 45 */     RenderSystem.m_69478_();
/* 46 */     RenderSystem.m_157427_(GameRenderer::m_172817_);
/* 47 */     RenderSystem.m_69416_(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
/* 48 */     RenderSystem.m_157429_(1.0F, 1.0F, 1.0F, 1.0F);
/* 49 */     if (Proc3Procedure.execute((Entity)localPlayer)) {
/* 50 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scull.png"));
/* 51 */       Gui.m_93133_(event.getPoseStack(), posX + -45, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 53 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 54 */       Gui.m_93133_(event.getPoseStack(), posX + -36, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 56 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 57 */       Gui.m_93133_(event.getPoseStack(), posX + -27, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 59 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 60 */       Gui.m_93133_(event.getPoseStack(), posX + -18, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 62 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 63 */       Gui.m_93133_(event.getPoseStack(), posX + -9, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 65 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 66 */       Gui.m_93133_(event.getPoseStack(), posX + 0, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 68 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 69 */       Gui.m_93133_(event.getPoseStack(), posX + 9, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 71 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 72 */       Gui.m_93133_(event.getPoseStack(), posX + 18, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 74 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 75 */       Gui.m_93133_(event.getPoseStack(), posX + 27, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 77 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 78 */       Gui.m_93133_(event.getPoseStack(), posX + 36, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 80 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scullblac.png"));
/* 81 */       Gui.m_93133_(event.getPoseStack(), posX + 45, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 83 */       RenderSystem.m_157456_(0, new ResourceLocation("supermod:textures/screens/scull.png"));
/* 84 */       Gui.m_93133_(event.getPoseStack(), posX + -54, posY + -112, 0.0F, 0.0F, 8, 8, 8, 8);
/*    */       
/* 86 */       (Minecraft.m_91087_()).f_91062_.m_92889_(event.getPoseStack(), (Component)Component.m_237115_("gui.supermod.qwer_2.label_empty"), (posX + -63), (posY + -121), -1);
/*    */     } 
/* 88 */     RenderSystem.m_69458_(true);
/* 89 */     RenderSystem.m_69453_();
/* 90 */     RenderSystem.m_69482_();
/* 91 */     RenderSystem.m_69461_();
/* 92 */     RenderSystem.m_157429_(1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\client\screens\Qwer2Overlay.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */