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
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Modelzombie<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("supermod", "modelzombie"), "main");
/*    */   public final ModelPart head;
/*    */   public final ModelPart body;
/*    */   public final ModelPart left_hand;
/*    */   public final ModelPart right_leg;
/*    */   public final ModelPart right_hand;
/*    */   public final ModelPart left_leg;
/*    */   
/*    */   public Modelzombie(ModelPart root) {
/* 33 */     this.head = root.m_171324_("head");
/* 34 */     this.body = root.m_171324_("body");
/* 35 */     this.left_hand = root.m_171324_("left_hand");
/* 36 */     this.right_leg = root.m_171324_("right_leg");
/* 37 */     this.right_hand = root.m_171324_("right_hand");
/* 38 */     this.left_leg = root.m_171324_("left_leg");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 42 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 43 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/* 44 */     PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-5.0F, -31.7F, -5.0F, 7.9F, 7.9F, 7.9F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/* 45 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(16, 16).m_171488_(-4.9F, -23.7F, -3.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/* 46 */     PartDefinition left_hand = partdefinition.m_171599_("left_hand", CubeListBuilder.m_171558_().m_171514_(40, 16).m_171488_(3.1F, -23.7F, -3.1F, 3.9F, 11.8F, 4.1F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/* 47 */     PartDefinition right_leg = partdefinition.m_171599_("right_leg", CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(1.1F, -11.8F, -3.0F, 4.0F, 11.9F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-6.0F, 24.0F, 0.0F));
/* 48 */     PartDefinition right_hand = partdefinition.m_171599_("right_hand", CubeListBuilder.m_171558_().m_171514_(40, 16).m_171488_(15.2F, -23.7F, -3.1F, 3.9F, 11.8F, 4.1F, new CubeDeformation(0.0F)), PartPose.m_171419_(-24.0F, 24.0F, 0.0F));
/* 49 */     PartDefinition left_leg = partdefinition.m_171599_("left_leg", CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-9.0F, -11.8F, -3.0F, 4.0F, 11.9F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(8.1F, 24.0F, 0.0F));
/* 50 */     return LayerDefinition.m_171565_(meshdefinition, 64, 64);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ 
/*    */   
/*    */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 59 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 60 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 61 */     this.left_hand.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 62 */     this.right_leg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 63 */     this.right_hand.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 64 */     this.left_leg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */ }


/* Location:              D:\MODdelatbydy\superMod.jar!\net\mcreator\supermod\client\model\Modelzombie.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */