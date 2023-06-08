/*    */ package net.mcreator.supermod.init;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.supermod.item.SuperitemItem;
/*    */ import net.mcreator.supermod.item.SuperswordItem;
/*    */ import net.minecraft.world.item.CreativeModeTab;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraftforge.common.ForgeSpawnEggItem;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SupermodModItems
/*    */ {
/* 20 */   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "supermod");
/* 21 */   public static final RegistryObject<Item> ZOMBIE_MIDDLE_NOT_LIGHTING_EYES_SPAWN_EGG = REGISTRY.register("zombie_middle_not_lighting_eyes_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)SupermodModEntities.ZOMBIE_MIDDLE_NOT_LIGHTING_EYES, -16777216, -3407872, (new Item.Properties()).m_41491_(CreativeModeTab.f_40753_)));
/*    */   
/* 23 */   public static final RegistryObject<Item> ZOMBIE_EASY_NOT_LIGHT_EYES_SPAWN_EGG = REGISTRY.register("zombie_easy_not_light_eyes_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)SupermodModEntities.ZOMBIE_EASY_NOT_LIGHT_EYES, -16777216, -13421569, (new Item.Properties()).m_41491_(CreativeModeTab.f_40753_)));
/*    */   
/* 25 */   public static final RegistryObject<Item> ZOMBIE_HARD_NOT_LIGHTING_EYES_SPAWN_EGG = REGISTRY.register("zombie_hard_not_lighting_eyes_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)SupermodModEntities.ZOMBIE_HARD_NOT_LIGHTING_EYES, -16777216, -13369549, (new Item.Properties()).m_41491_(CreativeModeTab.f_40753_)));
/*    */   
/* 27 */   public static final RegistryObject<Item> ZOMBIE_EASY_SPAWN_EGG = REGISTRY.register("zombie_easy_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)SupermodModEntities.ZOMBIE_EASY, -256, -1, (new Item.Properties()).m_41491_(CreativeModeTab.f_40753_)));
/* 28 */   public static final RegistryObject<Item> ZOMBIE_MIDDLE_SPAWN_EGG = REGISTRY.register("zombie_middle_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)SupermodModEntities.ZOMBIE_MIDDLE, -205, -1, (new Item.Properties()).m_41491_(CreativeModeTab.f_40753_)));
/* 29 */   public static final RegistryObject<Item> ZOMBIE_HARD_SPAWN_EGG = REGISTRY.register("zombie_hard_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)SupermodModEntities.ZOMBIE_HARD, -16777216, -1, (new Item.Properties()).m_41491_(CreativeModeTab.f_40753_)));
/* 30 */   public static final RegistryObject<Item> SUPERSWORD = REGISTRY.register("supersword", () -> new SuperswordItem());
/* 31 */   public static final RegistryObject<Item> SUPERITEM = REGISTRY.register("superitem", () -> new SuperitemItem());
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\init\SupermodModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */