/*    */ package net.mcreator.supermod;
/*    */ 
/*    */ import java.util.AbstractMap;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.concurrent.ConcurrentLinkedQueue;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.supermod.init.SupermodModEntities;
/*    */ import net.mcreator.supermod.init.SupermodModFeatures;
/*    */ import net.mcreator.supermod.init.SupermodModItems;
/*    */ import net.mcreator.supermod.init.SupermodModSounds;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import net.minecraftforge.network.NetworkRegistry;
/*    */ import net.minecraftforge.network.simple.SimpleChannel;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mod("supermod")
/*    */ public class SupermodMod
/*    */ {
/* 48 */   public static final Logger LOGGER = LogManager.getLogger(SupermodMod.class);
/*    */   public static final String MODID = "supermod";
/*    */   
/*    */   public SupermodMod() {
/* 52 */     MinecraftForge.EVENT_BUS.register(this);
/*    */     
/* 54 */     IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
/* 55 */     SupermodModSounds.REGISTRY.register(bus);
/*    */     
/* 57 */     SupermodModItems.REGISTRY.register(bus);
/* 58 */     SupermodModEntities.REGISTRY.register(bus);
/*    */     
/* 60 */     SupermodModFeatures.REGISTRY.register(bus);
/*    */   }
/*    */ 
/*    */   
/*    */   private static final String PROTOCOL_VERSION = "1";
/* 65 */   public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("supermod", "supermod"), () -> "1", "1"::equals, "1"::equals);
/* 66 */   private static int messageID = 0;
/*    */   
/*    */   public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
/* 69 */     PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
/* 70 */     messageID++;
/*    */   }
/*    */   
/* 73 */   private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();
/*    */   
/*    */   public static void queueServerWork(int tick, Runnable action) {
/* 76 */     workQueue.add(new AbstractMap.SimpleEntry<>(action, Integer.valueOf(tick)));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 81 */     if (event.phase == TickEvent.Phase.END) {
/* 82 */       List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
/* 83 */       workQueue.forEach(work -> {
/*    */             work.setValue(Integer.valueOf(((Integer)work.getValue()).intValue() - 1));
/*    */             if (((Integer)work.getValue()).intValue() == 0)
/*    */               actions.add(work); 
/*    */           });
/* 88 */       actions.forEach(e -> ((Runnable)e.getKey()).run());
/* 89 */       workQueue.removeAll(actions);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\SupermodMod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */