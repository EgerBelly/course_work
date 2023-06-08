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
/*     */ public class ZombieMiddleNotLightingEyesEntity extends Monster {
/*     */   public ZombieMiddleNotLightingEyesEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  40 */     this((EntityType<ZombieMiddleNotLightingEyesEntity>)SupermodModEntities.ZOMBIE_MIDDLE_NOT_LIGHTING_EYES.get(), world);
/*     */   }
/*     */   
/*     */   public ZombieMiddleNotLightingEyesEntity(EntityType<ZombieMiddleNotLightingEyesEntity> type, Level world) {
/*  44 */     super(type, world);
/*  45 */     this.f_21364_ = 4;
/*  46 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  51 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  56 */     super.m_8099_();
/*  57 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, true));
/*  58 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, ServerPlayer.class, true, true));
/*  59 */     this.f_21345_.m_25352_(3, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  62 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  65 */     this.f_21345_.m_25352_(4, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  66 */     this.f_21346_.m_25352_(5, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  67 */     this.f_21345_.m_25352_(6, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/*  68 */     this.f_21345_.m_25352_(7, (Goal)new RandomLookAroundGoal((Mob)this));
/*  69 */     this.f_21345_.m_25352_(8, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  74 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6048_() {
/*  79 */     return super.m_6048_() + 0.5D;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/*  84 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  89 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  94 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  99 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */   
/*     */   public static void init() {
/* 103 */     SpawnPlacements.m_21754_((EntityType)SupermodModEntities.ZOMBIE_MIDDLE_NOT_LIGHTING_EYES.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/* 104 */         (world.m_46791_() != Difficulty.PEACEFUL && Monster.m_219009_(world, pos, random) && Mob.m_217057_(entityType, (LevelAccessor)world, reason, pos, random)));
/* 105 */     DungeonHooks.addDungeonMob((EntityType)SupermodModEntities.ZOMBIE_MIDDLE_NOT_LIGHTING_EYES.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 109 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 110 */     builder = builder.m_22268_(Attributes.f_22279_, 0.30000000000000004D);
/* 111 */     builder = builder.m_22268_(Attributes.f_22276_, 55.0D);
/* 112 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 113 */     builder = builder.m_22268_(Attributes.f_22281_, 8.0D);
/* 114 */     builder = builder.m_22268_(Attributes.f_22277_, 50.0D);
/* 115 */     builder = builder.m_22268_(Attributes.f_22278_, 1.0D);
/* 116 */     builder = builder.m_22268_(Attributes.f_22282_, 1.5D);
/* 117 */     return builder;
/*     */   }
/*     */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\entity\ZombieMiddleNotLightingEyesEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */