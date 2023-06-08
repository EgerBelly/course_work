/*    */ package net.mcreator.supermod.init;
/*    */ 
/*    */ import net.mcreator.supermod.world.features.Home1Feature;
/*    */ import net.mcreator.supermod.world.features.Home2Feature;
/*    */ import net.mcreator.supermod.world.features.Home3Feature;
/*    */ import net.minecraft.world.level.levelgen.feature.Feature;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class SupermodModFeatures
/*    */ {
/* 21 */   public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, "supermod");
/* 22 */   public static final RegistryObject<Feature<?>> HOME_2 = REGISTRY.register("home_2", Home2Feature::feature);
/* 23 */   public static final RegistryObject<Feature<?>> HOME_1 = REGISTRY.register("home_1", Home1Feature::feature);
/* 24 */   public static final RegistryObject<Feature<?>> HOME_3 = REGISTRY.register("home_3", Home3Feature::feature);
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\init\SupermodModFeatures.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */