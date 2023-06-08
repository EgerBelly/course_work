/*     */ package net.mcreator.supermod.entity;
/*     */ import net.mcreator.supermod.init.SupermodModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnPlacements;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Pig;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.levelgen.Heightmap;
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class ZombieEasyNotLightEyesEntity extends Monster {
/*     */   public ZombieEasyNotLightEyesEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  41 */     this((EntityType<ZombieEasyNotLightEyesEntity>)SupermodModEntities.ZOMBIE_EASY_NOT_LIGHT_EYES.get(), world);
/*     */   }
/*     */   
/*     */   public ZombieEasyNotLightEyesEntity(EntityType<ZombieEasyNotLightEyesEntity> type, Level world) {
/*  45 */     super(type, world);
/*  46 */     this.f_21364_ = 4;
/*  47 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  52 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  57 */     super.m_8099_();
/*  58 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  61 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  64 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, true));
/*  65 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, ServerPlayer.class, true, true));
/*  66 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, Pig.class, true, true));
/*  67 */     this.f_21345_.m_25352_(5, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  68 */     this.f_21346_.m_25352_(6, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  69 */     this.f_21345_.m_25352_(7, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/*  70 */     this.f_21345_.m_25352_(8, (Goal)new RandomLookAroundGoal((Mob)this));
/*  71 */     this.f_21345_.m_25352_(9, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  76 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6048_() {
/*  81 */     return super.m_6048_() + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/*  86 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  91 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  96 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 101 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */   
/*     */   public static void init() {
/* 105 */     SpawnPlacements.m_21754_((EntityType)SupermodModEntities.ZOMBIE_EASY_NOT_LIGHT_EYES.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 106 */         (world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, (LevelAccessor)world, reason, pos, random)));
/* 107 */     DungeonHooks.addDungeonMob((EntityType)SupermodModEntities.ZOMBIE_EASY_NOT_LIGHT_EYES.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 111 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 112 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 113 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 114 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 115 */     builder = builder.m_22268_(Attributes.f_22281_, 4.0D);
/* 116 */     builder = builder.m_22268_(Attributes.f_22277_, 25.0D);
/* 117 */     return builder;
/*     */   }
/*     */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\entity\ZombieEasyNotLightEyesEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */