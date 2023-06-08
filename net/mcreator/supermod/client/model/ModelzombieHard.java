/*    */ package net.mcreator.supermod.client.model;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.geom.ModelLayerLocation;
/*    */ import net.minecraft.client.model.geom.ModelPart;
/*    */ import net.minecraft.client.model.geom.PartPose;
/*    */ import net.minecraft.client.model.geom.builders.CubeDeformation;
/*    */ import net.minecraft.client.model.geom.builders.CubeListBuilder;
/*    */ import net.minecraft.client.model.geom.builders.LayerDefinition;
/*    */ import net.minecraft.client.model.geom.builders.MeshDefinition;
/*    */ import net.minecraft.client.model.geom.builders.PartDefinition;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.util.Mth;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ModelzombieHard<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("supermod", "modelzombie_hard"), "main");
/*    */   public final ModelPart head;
/*    */   public final ModelPart body;
/*    */   public final ModelPart rightArm;
/*    */   public final ModelPart leftArm;
/*    */   public final ModelPart rightLeg;
/*    */   public final ModelPart leftLeg;
/*    */   
/*    */   public ModelzombieHard(ModelPart root) {
/* 34 */     this.head = root.m_171324_("head");
/* 35 */     this.body = root.m_171324_("body");
/* 36 */     this.rightArm = root.m_171324_("rightArm");
/* 37 */     this.leftArm = root.m_171324_("leftArm");
/* 38 */     this.rightLeg = root.m_171324_("rightLeg");
/* 39 */     this.leftLeg = root.m_171324_("leftLeg");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 43 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 44 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/* 45 */     PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -19.0F, 3.0F));
/* 46 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(32, 16).m_171488_(-4.0F, -5.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -13.0F, 3.0F));
/* 47 */     PartDefinition rightArm = partdefinition.m_171599_("rightArm", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, -15.0F, 3.0F));
/* 48 */     PartDefinition leftArm = partdefinition.m_171599_("leftArm", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, -15.0F, 3.0F));
/* 49 */     PartDefinition rightLeg = partdefinition.m_171599_("rightLeg", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(-1.0F, -1.0F, -1.0F, 2.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, -5.0F, 3.0F));
/* 50 */     PartDefinition leftLeg = partdefinition.m_171599_("leftLeg", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(-1.0F, -2.0F, 0.0F, 2.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, -4.0F, 2.0F));
/* 51 */     return LayerDefinition.m_171565_(meshdefinition, 64, 32);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 56 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 57 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 58 */     this.rightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 59 */     this.leftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 60 */     this.rightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 61 */     this.leftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */   
/*    */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 65 */     this.head.f_104204_ = netHeadYaw / 57.295776F;
/* 66 */     this.head.f_104203_ = headPitch / 57.295776F;
/* 67 */     this.rightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 68 */     this.rightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 69 */     this.leftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 70 */     this.leftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\client\model\ModelzombieHard.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */