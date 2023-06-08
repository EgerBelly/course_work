/*    */ package net.mcreator.supermod.world.features;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.data.worldgen.features.FeatureUtils;
/*    */ import net.minecraft.data.worldgen.placement.PlacementUtils;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.levelgen.Heightmap;
/*    */ import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.Feature;
/*    */ import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.placement.PlacedFeature;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*    */ 
/*    */ public class Home3Feature extends Feature<NoneFeatureConfiguration> {
/* 28 */   public static Home3Feature FEATURE = null;
/* 29 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 30 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 33 */     FEATURE = new Home3Feature();
/* 34 */     CONFIGURED_FEATURE = FeatureUtils.m_206488_("supermod:home_3", FEATURE, (FeatureConfiguration)FeatureConfiguration.f_67737_);
/* 35 */     PLACED_FEATURE = PlacementUtils.m_206509_("supermod:home_3", CONFIGURED_FEATURE, List.of());
/* 36 */     return FEATURE;
/*    */   }
/*    */   
/* 39 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
/* 40 */   private StructureTemplate template = null;
/*    */   
/*    */   public Home3Feature() {
/* 43 */     super(NoneFeatureConfiguration.f_67815_);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 48 */     if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_()))
/* 49 */       return false; 
/* 50 */     if (this.template == null)
/* 51 */       this.template = context.m_159774_().m_6018_().m_215082_().m_230359_(new ResourceLocation("supermod", "loot3")); 
/* 52 */     if (this.template == null)
/* 53 */       return false; 
/* 54 */     boolean anyPlaced = false;
/* 55 */     if (context.m_225041_().m_188503_(1000000) + 1 <= 10000) {
/* 56 */       int count = context.m_225041_().m_188503_(1) + 1;
/* 57 */       for (int a = 0; a < count; a++) {
/* 58 */         int i = context.m_159777_().m_123341_() + context.m_225041_().m_188503_(16);
/* 59 */         int k = context.m_159777_().m_123343_() + context.m_225041_().m_188503_(16);
/* 60 */         int j = context.m_159774_().m_6924_(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 61 */         BlockPos spawnTo = new BlockPos(i + 0, j + 0, k + 0);
/* 62 */         if (this.template.m_230328_((ServerLevelAccessor)context.m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings()).m_74377_(Mirror.values()[context.m_225041_().m_188503_(2)]).m_74379_(Rotation.values()[context.m_225041_().m_188503_(3)]).m_230324_(context.m_225041_())
/* 63 */             .m_74383_((StructureProcessor)BlockIgnoreProcessor.f_74046_).m_74392_(false), context.m_225041_(), 2)) {
/* 64 */           anyPlaced = true;
/*    */         }
/*    */       } 
/*    */     } 
/* 68 */     return anyPlaced;
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\world\features\Home3Feature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */