/*    */ package net.mcreator.supermod.init;
/*    */ 
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
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
/*    */ public class SupermodModSounds
/*    */ {
/* 17 */   public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "supermod");
/* 18 */   public static final RegistryObject<SoundEvent> SCARY_SOUND1 = REGISTRY.register("scary_sound1", () -> new SoundEvent(new ResourceLocation("supermod", "scary_sound1")));
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\init\SupermodModSounds.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */