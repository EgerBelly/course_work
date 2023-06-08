/*    */ package net.mcreator.supermod.init;
/*    */ 
/*    */ import java.util.function.BiFunction;
/*    */ import net.mcreator.supermod.entity.ZombieEasyEntity;
/*    */ import net.mcreator.supermod.entity.ZombieEasyNotLightEyesEntity;
/*    */ import net.mcreator.supermod.entity.ZombieHardEntity;
/*    */ import net.mcreator.supermod.entity.ZombieHardNotLightingEyesEntity;
/*    */ import net.mcreator.supermod.entity.ZombieMiddleEntity;
/*    */ import net.mcreator.supermod.entity.ZombieMiddleNotLightingEyesEntity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobCategory;
/*    */ import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class SupermodModEntities
/*    */ {
/* 29 */   public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "supermod");
/* 30 */   public static final RegistryObject<EntityType<ZombieMiddleNotLightingEyesEntity>> ZOMBIE_MIDDLE_NOT_LIGHTING_EYES = register("zombie_middle_not_lighting_eyes", 
/* 31 */       EntityType.Builder.m_20704_(ZombieMiddleNotLightingEyesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 32 */       .setCustomClientFactory(ZombieMiddleNotLightingEyesEntity::new)
/*    */       
/* 34 */       .m_20699_(0.6F, 3.0F));
/* 35 */   public static final RegistryObject<EntityType<ZombieEasyNotLightEyesEntity>> ZOMBIE_EASY_NOT_LIGHT_EYES = register("zombie_easy_not_light_eyes", 
/* 36 */       EntityType.Builder.m_20704_(ZombieEasyNotLightEyesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 37 */       .setCustomClientFactory(ZombieEasyNotLightEyesEntity::new)
/*    */       
/* 39 */       .m_20699_(0.6F, 1.8F));
/* 40 */   public static final RegistryObject<EntityType<ZombieHardNotLightingEyesEntity>> ZOMBIE_HARD_NOT_LIGHTING_EYES = register("zombie_hard_not_lighting_eyes", 
/* 41 */       EntityType.Builder.m_20704_(ZombieHardNotLightingEyesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 42 */       .setCustomClientFactory(ZombieHardNotLightingEyesEntity::new)
/*    */       
/* 44 */       .m_20699_(1.0F, 3.0F));
/* 45 */   public static final RegistryObject<EntityType<ZombieEasyEntity>> ZOMBIE_EASY = register("zombie_easy", 
/* 46 */       EntityType.Builder.m_20704_(ZombieEasyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieEasyEntity::new)
/*    */       
/* 48 */       .m_20699_(0.6F, 1.8F));
/* 49 */   public static final RegistryObject<EntityType<ZombieMiddleEntity>> ZOMBIE_MIDDLE = register("zombie_middle", 
/* 50 */       EntityType.Builder.m_20704_(ZombieMiddleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieMiddleEntity::new)
/*    */       
/* 52 */       .m_20699_(0.6F, 3.0F));
/* 53 */   public static final RegistryObject<EntityType<ZombieHardEntity>> ZOMBIE_HARD = register("zombie_hard", 
/* 54 */       EntityType.Builder.m_20704_(ZombieHardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieHardEntity::new)
/*    */       
/* 56 */       .m_20699_(1.0F, 3.0F));
/*    */   
/*    */   private static <T extends net.minecraft.world.entity.Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
/* 59 */     return REGISTRY.register(registryname, () -> entityTypeBuilder.m_20712_(registryname));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void init(FMLCommonSetupEvent event) {
/* 64 */     event.enqueueWork(() -> {
/*    */           ZombieMiddleNotLightingEyesEntity.init();
/*    */           ZombieEasyNotLightEyesEntity.init();
/*    */           ZombieHardNotLightingEyesEntity.init();
/*    */           ZombieEasyEntity.init();
/*    */           ZombieMiddleEntity.init();
/*    */           ZombieHardEntity.init();
/*    */         });
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerAttributes(EntityAttributeCreationEvent event) {
/* 76 */     event.put((EntityType)ZOMBIE_MIDDLE_NOT_LIGHTING_EYES.get(), ZombieMiddleNotLightingEyesEntity.createAttributes().m_22265_());
/* 77 */     event.put((EntityType)ZOMBIE_EASY_NOT_LIGHT_EYES.get(), ZombieEasyNotLightEyesEntity.createAttributes().m_22265_());
/* 78 */     event.put((EntityType)ZOMBIE_HARD_NOT_LIGHTING_EYES.get(), ZombieHardNotLightingEyesEntity.createAttributes().m_22265_());
/* 79 */     event.put((EntityType)ZOMBIE_EASY.get(), ZombieEasyEntity.createAttributes().m_22265_());
/* 80 */     event.put((EntityType)ZOMBIE_MIDDLE.get(), ZombieMiddleEntity.createAttributes().m_22265_());
/* 81 */     event.put((EntityType)ZOMBIE_HARD.get(), ZombieHardEntity.createAttributes().m_22265_());
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\init\SupermodModEntities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */