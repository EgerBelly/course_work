/*     */ package net.mcreator.supermod.procedures;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.supermod.entity.ZombieEasyNotLightEyesEntity;
/*     */ import net.mcreator.supermod.entity.ZombieHardEntity;
/*     */ import net.mcreator.supermod.entity.ZombieMiddleEntity;
/*     */ import net.mcreator.supermod.init.SupermodModEntities;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.eventbus.api.Event;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class TimerProcedure {
/*     */   @SubscribeEvent
/*     */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/*  37 */     if (event.phase == TickEvent.Phase.END) {
/*  38 */       execute((Event)event, (LevelAccessor)event.player.f_19853_, (Entity)event.player);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void execute(LevelAccessor world, Entity entity) {
/*  43 */     execute(null, world, entity);
/*     */   }
/*     */   
/*     */   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
/*  47 */     if (entity == null)
/*     */       return; 
/*  49 */     entity.getPersistentData().m_128347_("Timer", entity.getPersistentData().m_128459_("Timer") + 1.0D);
/*  50 */     if (entity.getPersistentData().m_128459_("Timer") == 200.0D && 
/*  51 */       entity instanceof Player) { Player _player = (Player)entity; if (!_player.f_19853_.m_5776_())
/*  52 */         _player.m_5661_((Component)Component.m_237113_("Волна придет через 5 минут!!!"), true);  }
/*     */     
/*  54 */     if (entity.getPersistentData().m_128459_("Timer") == 5800.0D && 
/*  55 */       entity instanceof Player) { Player _player = (Player)entity; if (!_player.f_19853_.m_5776_())
/*  56 */         _player.m_5661_((Component)Component.m_237113_("Волна близко!!!"), true);  }
/*     */     
/*  58 */     if (entity.getPersistentData().m_128459_("Timer") == 6045.0D) {
/*  59 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  60 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(entity
/*  61 */                 .m_20185_(), entity.m_20186_(), entity.m_20186_()), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "weather thunder"); }
/*  62 */        if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/*  63 */         StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("supermod", "spawn_2"));
/*  64 */         if (template != null) {
/*  65 */           template.m_230328_((ServerLevelAccessor)_serverworld, new BlockPos(entity.m_20185_() + 5.0D, entity.m_20186_(), entity.m_20189_() + 5.0D), new BlockPos(entity.m_20185_() + 5.0D, entity.m_20186_(), entity.m_20189_() + 5.0D), (new StructurePlaceSettings())
/*  66 */               .m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */         } }
/*     */       
/*  69 */       for (int index0 = 0; index0 < 5; index0++) {
/*  70 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  71 */           ZombieEasyNotLightEyesEntity zombieEasyNotLightEyesEntity = new ZombieEasyNotLightEyesEntity((EntityType)SupermodModEntities.ZOMBIE_EASY_NOT_LIGHT_EYES.get(), (Level)_level);
/*  72 */           zombieEasyNotLightEyesEntity.m_7678_(entity.m_20185_() + 8.0D, entity.m_20186_() + 1.0D, entity.m_20189_() + 8.0D, world.m_213780_().m_188501_() * 360.0F, 0.0F);
/*  73 */           if (zombieEasyNotLightEyesEntity instanceof Mob) { Mob _mobToSpawn = (Mob)zombieEasyNotLightEyesEntity;
/*  74 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(zombieEasyNotLightEyesEntity.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*  75 */            world.m_7967_((Entity)zombieEasyNotLightEyesEntity); }
/*     */       
/*     */       } 
/*  78 */       for (int index1 = 0; index1 < 2; index1++) {
/*  79 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  80 */           ZombieMiddleEntity zombieMiddleEntity = new ZombieMiddleEntity((EntityType)SupermodModEntities.ZOMBIE_MIDDLE.get(), (Level)_level);
/*  81 */           zombieMiddleEntity.m_7678_(entity.m_20185_() + 8.0D, entity.m_20186_() + 1.0D, entity.m_20189_() + 8.0D, world.m_213780_().m_188501_() * 360.0F, 0.0F);
/*  82 */           if (zombieMiddleEntity instanceof Mob) { Mob _mobToSpawn = (Mob)zombieMiddleEntity;
/*  83 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(zombieMiddleEntity.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*  84 */            world.m_7967_((Entity)zombieMiddleEntity); }
/*     */       
/*     */       } 
/*     */     } 
/*  88 */     if (entity.getPersistentData().m_128459_("Timer") == 6500.0D && 
/*  89 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  90 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(entity
/*  91 */               .m_20185_(), entity.m_20186_(), entity.m_20186_()), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "weather clear"); }
/*     */     
/*  93 */     if (entity.getPersistentData().m_128459_("Timer") == 7000.0D && 
/*  94 */       entity instanceof Player) { Player _player = (Player)entity; if (!_player.f_19853_.m_5776_())
/*  95 */         _player.m_5661_((Component)Component.m_237113_("Волна придет через 5 минут!!!"), true);  }
/*     */     
/*  97 */     if (entity.getPersistentData().m_128459_("Timer") == 12500.0D && 
/*  98 */       entity instanceof Player) { Player _player = (Player)entity; if (!_player.f_19853_.m_5776_())
/*  99 */         _player.m_5661_((Component)Component.m_237113_("Волна близко!!!"), true);  }
/*     */     
/* 101 */     if (entity.getPersistentData().m_128459_("Timer") == 12580.0D) {
/* 102 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 103 */         _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(entity
/* 104 */                 .m_20185_(), entity.m_20186_(), entity.m_20186_()), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "weather thunder"); }
/* 105 */        if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 106 */         StructureTemplate template = _serverworld.m_215082_().m_230359_(new ResourceLocation("supermod", "spawn_2"));
/* 107 */         if (template != null) {
/* 108 */           template.m_230328_((ServerLevelAccessor)_serverworld, new BlockPos(entity.m_20185_() + 5.0D, entity.m_20186_(), entity.m_20189_() + 5.0D), new BlockPos(entity.m_20185_() + 5.0D, entity.m_20186_(), entity.m_20189_() + 5.0D), (new StructurePlaceSettings())
/* 109 */               .m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*     */         } }
/*     */       
/* 112 */       for (int index2 = 0; index2 < 5; index2++) {
/* 113 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 114 */           ZombieEasyNotLightEyesEntity zombieEasyNotLightEyesEntity = new ZombieEasyNotLightEyesEntity((EntityType)SupermodModEntities.ZOMBIE_EASY_NOT_LIGHT_EYES.get(), (Level)_level);
/* 115 */           zombieEasyNotLightEyesEntity.m_7678_(entity.m_20185_() + 8.0D, entity.m_20186_() + 1.0D, entity.m_20189_() + 8.0D, world.m_213780_().m_188501_() * 360.0F, 0.0F);
/* 116 */           if (zombieEasyNotLightEyesEntity instanceof Mob) { Mob _mobToSpawn = (Mob)zombieEasyNotLightEyesEntity;
/* 117 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(zombieEasyNotLightEyesEntity.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 118 */            world.m_7967_((Entity)zombieEasyNotLightEyesEntity); }
/*     */       
/*     */       } 
/* 121 */       for (int index3 = 0; index3 < 2; index3++) {
/* 122 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 123 */           ZombieMiddleEntity zombieMiddleEntity = new ZombieMiddleEntity((EntityType)SupermodModEntities.ZOMBIE_MIDDLE.get(), (Level)_level);
/* 124 */           zombieMiddleEntity.m_7678_(entity.m_20185_() + 8.0D, entity.m_20186_() + 1.0D, entity.m_20189_() + 8.0D, world.m_213780_().m_188501_() * 360.0F, 0.0F);
/* 125 */           if (zombieMiddleEntity instanceof Mob) { Mob _mobToSpawn = (Mob)zombieMiddleEntity;
/* 126 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(zombieMiddleEntity.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 127 */            world.m_7967_((Entity)zombieMiddleEntity); }
/*     */       
/*     */       } 
/* 130 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 131 */         ZombieHardEntity zombieHardEntity = new ZombieHardEntity((EntityType)SupermodModEntities.ZOMBIE_HARD.get(), (Level)_level);
/* 132 */         zombieHardEntity.m_7678_(entity.m_20185_() + 8.0D, entity.m_20186_() + 1.0D, entity.m_20189_() + 8.0D, world.m_213780_().m_188501_() * 360.0F, 0.0F);
/* 133 */         if (zombieHardEntity instanceof Mob) { Mob _mobToSpawn = (Mob)zombieHardEntity;
/* 134 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(zombieHardEntity.m_20183_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 135 */          world.m_7967_((Entity)zombieHardEntity); }
/*     */     
/*     */     } 
/* 138 */     if (entity.getPersistentData().m_128459_("Timer") == 13000.0D && 
/* 139 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 140 */       _level.m_7654_().m_129892_().m_230957_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(entity
/* 141 */               .m_20185_(), entity.m_20186_(), entity.m_20186_()), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_(""), _level.m_7654_(), null)).m_81324_(), "weather clear"); }
/*     */   
/*     */   }
/*     */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\procedures\TimerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */