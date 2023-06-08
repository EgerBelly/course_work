/*     */ package net.mcreator.supermod.entity;
/*     */ import net.mcreator.supermod.init.SupermodModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerBossEvent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.BossEvent;
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
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class ZombieHardEntity extends Monster {
/*  37 */   private final ServerBossEvent bossInfo = new ServerBossEvent(m_5446_(), BossEvent.BossBarColor.PINK, BossEvent.BossBarOverlay.PROGRESS);
/*     */   
/*     */   public ZombieHardEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  40 */     this((EntityType<ZombieHardEntity>)SupermodModEntities.ZOMBIE_HARD.get(), world);
/*     */   }
/*     */   
/*     */   public ZombieHardEntity(EntityType<ZombieHardEntity> type, Level world) {
/*  44 */     super(type, world);
/*  45 */     this.f_21364_ = 4;
/*  46 */     m_21557_(false);
/*  47 */     m_21530_();
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
/*  58 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, true));
/*  59 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, ServerPlayer.class, true, true));
/*  60 */     this.f_21345_.m_25352_(3, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  63 */             return (this.f_25540_.m_20205_() * this.f_25540_.m_20205_() + entity.m_20205_());
/*     */           }
/*     */         });
/*  66 */     this.f_21345_.m_25352_(4, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  67 */     this.f_21346_.m_25352_(5, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  68 */     this.f_21345_.m_25352_(6, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/*  69 */     this.f_21345_.m_25352_(7, (Goal)new RandomLookAroundGoal((Mob)this));
/*  70 */     this.f_21345_.m_25352_(8, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  75 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  80 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/*  85 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  90 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  95 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 100 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6072_() {
/* 105 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6457_(ServerPlayer player) {
/* 110 */     super.m_6457_(player);
/* 111 */     this.bossInfo.m_6543_(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6452_(ServerPlayer player) {
/* 116 */     super.m_6452_(player);
/* 117 */     this.bossInfo.m_6539_(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8024_() {
/* 122 */     super.m_8024_();
/* 123 */     this.bossInfo.m_142711_(m_21223_() / m_21233_());
/*     */   }
/*     */   
/*     */   public static void init() {
/* 127 */     DungeonHooks.addDungeonMob((EntityType)SupermodModEntities.ZOMBIE_HARD.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 131 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 132 */     builder = builder.m_22268_(Attributes.f_22279_, 0.4D);
/* 133 */     builder = builder.m_22268_(Attributes.f_22276_, 150.0D);
/* 134 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 135 */     builder = builder.m_22268_(Attributes.f_22281_, 15.0D);
/* 136 */     builder = builder.m_22268_(Attributes.f_22277_, 55.0D);
/* 137 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 138 */     return builder;
/*     */   }
/*     */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\entity\ZombieHardEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */