/*     */ package net.mcreator.supermod.entity;
/*     */ 
/*     */ import net.mcreator.supermod.init.SupermodModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
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
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class ZombieMiddleEntity extends Monster {
/*     */   public ZombieMiddleEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  36 */     this((EntityType<ZombieMiddleEntity>)SupermodModEntities.ZOMBIE_MIDDLE.get(), world);
/*     */   }
/*     */   
/*     */   public ZombieMiddleEntity(EntityType<ZombieMiddleEntity> type, Level world) {
/*  40 */     super(type, world);
/*  41 */     this.f_21364_ = 4;
/*  42 */     m_21557_(false);
/*  43 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  48 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  53 */     super.m_8099_();
/*  54 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, true));
/*  55 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, ServerPlayer.class, true, true));
/*  56 */     this.f_21345_.m_25352_(3, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  59 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  62 */     this.f_21345_.m_25352_(4, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  63 */     this.f_21346_.m_25352_(5, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  64 */     this.f_21345_.m_25352_(6, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/*  65 */     this.f_21345_.m_25352_(7, (Goal)new RandomLookAroundGoal((Mob)this));
/*  66 */     this.f_21345_.m_25352_(8, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  71 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  76 */     return false;
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
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 108 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 109 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 110 */     builder = builder.m_22268_(Attributes.f_22276_, 55.0D);
/* 111 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 112 */     builder = builder.m_22268_(Attributes.f_22281_, 10.0D);
/* 113 */     builder = builder.m_22268_(Attributes.f_22277_, 50.0D);
/* 114 */     builder = builder.m_22268_(Attributes.f_22282_, 2.0D);
/* 115 */     return builder;
/*     */   }
/*     */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\entity\ZombieMiddleEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */