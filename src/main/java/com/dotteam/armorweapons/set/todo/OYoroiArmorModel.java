package com.dotteam.armorweapons.set.todo;/*
package com.dotteam.armorweapons.model.todo;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class OYoroiArmorModel<T extends LivingEntity> extends CustomArmorModel<T> {

	//Helmet
	public ModelRenderer headLeftSide;
	public ModelRenderer headFront;
	public ModelRenderer headBack;
	public ModelRenderer headRightSide;
	public ModelRenderer headLeft;
	public ModelRenderer headRight;
	public ModelRenderer helmetHorn;
	public ModelRenderer helmetJewel;

	//Chest
	public ModelRenderer chestProtTop;
	public ModelRenderer chestProtBot;
	public ModelRenderer bodyBreast;
	public ModelRenderer bodyBreastProt;
	public ModelRenderer armLeftTop;
	public ModelRenderer armLeftMid;
	public ModelRenderer armLeftBot;
	public ModelRenderer armLeftShoulder;
	public ModelRenderer armRightBot;
	public ModelRenderer armRightMid;
	public ModelRenderer armRightTop;
	public ModelRenderer armRightShoulder;

	//Leggings
	public ModelRenderer thighFront;
	public ModelRenderer thighFrontSub;
	public ModelRenderer thighBack;
	public ModelRenderer thighBackSub;
	public ModelRenderer thighRightSub;
	public ModelRenderer thighLeft;
	public ModelRenderer thighLeftSub;

	//Boots
	public ModelRenderer legLeftProt;
	public ModelRenderer legRightProt;

	public OYoroiArmorModel(EquipmentSlotType slot, boolean isSteve, float scale) {
		super(slot,64, 64, scale);

		switch (slot) {
			case HEAD:
				this.head = new ModelRenderer(this, 28, 21);
				this.head.setPos(0.0F, 0.0F, 0.0F);
				this.head.addBox(-4.5F, -8.5F, -4.5F, 9, 4, 9, -0.1F);
				this.headFront = new ModelRenderer(this, 38, 17);
				this.headFront.setPos(0.0F, 0.0F, 0.0F);
				this.headFront.addBox(-4.5F, -7.3F, -2.0F, 9, 1, 3, -0.1F);
				setRotationAngle(headFront, 0.6981317007977318F, 0.0F, 0.0F);
				this.helmetHorn = new ModelRenderer(this, 46, 0);
				this.helmetHorn.setPos(0.0F, 0.0F, 0.0F);
				this.helmetHorn.addBox(2.2F, -6.0F, 2.2F, 6, 0, 6, 0.0F);
				setRotationAngle(helmetHorn, 1.4311699866353502F, -0.13962634015954636F, -0.7853981633974483F);
				this.helmetJewel = new ModelRenderer(this, 52, 6);
				this.helmetJewel.setPos(0.0F, 0.0F, 0.0F);
				this.helmetJewel.addBox(-1.0F, -5.0F, -6.8F, 2, 2, 1, 0.0F);
				setRotationAngle(helmetJewel, -0.2617993877991494F, 0.0F, 0.0F);
				this.headRight = new ModelRenderer(this, 11, 20);
				this.headRight.mirror = true;
				this.headRight.setPos(0.0F, 0.0F, 0.0F);
				this.headRight.addBox(0.0F, -6.5F, -4.5F, 4, 1, 9, -0.1F);
				setRotationAngle(headRight, 0.0F, 0.0F, 0.6981317007977318F);
				this.headRightSide = new ModelRenderer(this, 52, 9);
				this.headRightSide.mirror = true;
				this.headRightSide.setPos(0.0F, 0.0F, 0.0F);
				this.headRightSide.addBox(0.0F, -8.3F, -4.5F, 3, 2, 1, -0.1F);
				setRotationAngle(headRightSide, 0.0F, 0.0F, 0.6981317007977318F);
				this.headLeft = new ModelRenderer(this, 11, 20);
				this.headLeft.setPos(0.0F, 0.0F, 0.0F);
				this.headLeft.addBox(-4.0F, -6.5F, -4.5F, 4, 1, 9, -0.1F);
				setRotationAngle(headLeft, 0.0F, 0.0F, -0.6981317007977318F);
				this.headLeftSide = new ModelRenderer(this, 52, 9);
				this.headLeftSide.setPos(0.0F, 0.0F, 0.0F);
				this.headLeftSide.addBox(-3.0F, -8.3F, -4.5F, 3, 2, 1, -0.1F);
				setRotationAngle(headLeftSide, 0.0F, 0.0F, -0.6981317007977318F);
				this.headBack = new ModelRenderer(this, 36, 12);
				this.headBack.setPos(0.0F, 0.0F, 0.0F);
				this.headBack.addBox(-4.5F, -6.5F, 0.0F, 9, 1, 4, -0.1F);
				setRotationAngle(headBack, -0.6981317007977318F, 0.0F, 0.0F);

				this.head.addChild(headLeftSide);
				this.head.addChild(headFront);
				this.head.addChild(headBack);
				this.head.addChild(headRightSide);
				this.head.addChild(headLeft);
				this.head.addChild(headRight);
				this.head.addChild(helmetHorn);
				this.head.addChild(helmetJewel);
				break;

			case CHEST:
				this.body = new ModelRenderer(this, 0, 0);
				this.body.setPos(0.0F, 0.0F, 0.0F);
				this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.3F);
				this.chestProtBot = new ModelRenderer(this, 24, 0);
				this.chestProtBot.setPos(0.0F, 0.0F, -0.5F);
				this.chestProtBot.addBox(-4.5F, 4.0F, -2.0F, 9, 7, 5, 0.1F);
				if(isSteve){
					this.chestProtTop = new ModelRenderer(this, 19, 12);
					this.chestProtTop.setPos(0.0F, 0.0F, -0.5F);
					this.chestProtTop.addBox(-3.0F, 1.0F, -2.0F, 6, 2, 5, 0.1F);

					this.rightArm = new ModelRenderer(this, 0, 30);
					this.rightArm.setPos(-5.0F, 2.0F, 0.0F);
					this.rightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F);
					this.armRightBot = new ModelRenderer(this, 38, 34);
					this.armRightBot.setPos(0.0F, 0.0F, 0.0F);
					this.armRightBot.addBox(-3.5F, 8.5F, -2.5F, 2, 2, 5, 0.2F);
					this.armRightMid = new ModelRenderer(this, 27, 36);
					this.armRightMid.setPos(0.0F, 0.0F, 0.0F);
					this.armRightMid.addBox(-3.5F, 4.5F, -2.5F, 3, 3, 5, 0.1F);
					this.armRightTop = new ModelRenderer(this, 16, 30);
					this.armRightTop.setPos(0.0F, 0.0F, 0.0F);
					this.armRightTop.addBox(-3.5F, -2.5F, -2.5F, 3, 6, 5, 0.2F);
					this.armRightShoulder = new ModelRenderer(this, 46, 35);
					this.armRightShoulder.setPos(0.0F, 0.0F, 0.0F);
					this.armRightShoulder.addBox(-4.5F, -5.5F, -3.0F, 1, 8, 6, 0.0F);
					setRotationAngle(armRightShoulder, 0.0F, 0.0F, 0.3490658503988659F);

					this.leftArm = new ModelRenderer(this, 0, 30);
					this.leftArm.mirror = true;
					this.leftArm.setPos(5.0F, 2.0F, 0.0F);
					this.leftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.3F);
					this.armLeftBot = new ModelRenderer(this, 38, 34);
					this.armLeftBot.mirror = true;
					this.armLeftBot.setPos(0.0F, 0.0F, 0.0F);
					this.armLeftBot.addBox(1.5F, 8.5F, -2.5F, 2, 2, 5, 0.2F);
					this.armLeftMid = new ModelRenderer(this, 27, 36);
					this.armLeftMid.mirror = true;
					this.armLeftMid.setPos(0.0F, 0.0F, 0.0F);
					this.armLeftMid.addBox(0.5F, 4.5F, -2.5F, 3, 3, 5, 0.1F);
					this.armLeftTop = new ModelRenderer(this, 16, 30);
					this.armLeftTop.mirror = true;
					this.armLeftTop.setPos(0.0F, 0.0F, 0.0F);
					this.armLeftTop.addBox(0.5F, -2.5F, -2.5F, 3, 6, 5, 0.2F);
					this.armLeftShoulder = new ModelRenderer(this, 46, 35);
					this.armLeftShoulder.mirror = true;
					this.armLeftShoulder.setPos(0.0F, 0.0F, 0.0F);
					this.armLeftShoulder.addBox(3.5F, -5.5F, -3.0F, 1, 8, 6, 0.0F);
					setRotationAngle(armLeftShoulder, 0.0F, 0.0F, -0.3490658503988659F);
				}else{
					this.chestProtTop = new ModelRenderer(this, 24, 12);
					this.chestProtTop.setPos(0.0F, 0.0F, -0.5F);
					this.chestProtTop.addBox(-3.0F, 1.0F, 2.0F, 6, 2, 1, 0.1F);
					this.bodyBreast = new ModelRenderer(this, 27, 47);
					this.bodyBreast.setPos(0.0F, 0.9F, -2.1F);
					this.bodyBreast.addBox(-3.5F, 0.0F, -3.65F, 7, 2, 3, -0.1F);
					setRotationAngle(bodyBreast, 0.9948376736367678F, 0.0F, 0.0F);
					this.bodyBreastProt = new ModelRenderer(this, 24, 15);
					this.bodyBreastProt.setPos(0.0F, 0.9F, -2.1F);
					this.bodyBreastProt.addBox(-3.0F, 0.8F, -0.1F, 6, 2, 1, 0.1F);
					setRotationAngle(bodyBreastProt, -0.5759586531581287F, 0.0F, 0.0F);

					this.rightArm = new ModelRenderer(this, 0, 30);
					this.rightArm.setPos(-5.0F, 2.5F, 0.0F);
					this.rightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, 0.3F);
					this.armRightBot = new ModelRenderer(this, 38, 34);
					this.armRightBot.setPos(0.0F, 0.0F, 0.0F);
					this.armRightBot.addBox(-2.5F, 8.5F, -2.5F, 2, 2, 5, 0.2F);
					this.armRightMid = new ModelRenderer(this, 27, 36);
					this.armRightMid.setPos(0.0F, 0.0F, 0.0F);
					this.armRightMid.addBox(-2.5F, 4.5F, -2.5F, 3, 3, 5, 0.1F);
					this.armRightTop = new ModelRenderer(this, 16, 30);
					this.armRightTop.setPos(0.0F, 0.0F, 0.0F);
					this.armRightTop.addBox(-2.5F, -2.5F, -2.5F, 3, 6, 5, 0.2F);
					this.armRightShoulder = new ModelRenderer(this, 46, 35);
					this.armRightShoulder.setPos(0.0F, 0.0F, 0.0F);
					this.armRightShoulder.addBox(-3.5F, -5.5F, -3.0F, 1, 8, 6, 0.0F);
					setRotationAngle(armRightShoulder, 0.0F, 0.0F, 0.2617993877991494F);

					this.leftArm = new ModelRenderer(this, 0, 30);
					this.leftArm.mirror = true;
					this.leftArm.setPos(5.0F, 2.5F, 0.0F);
					this.leftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, 0.3F);
					this.armLeftBot = new ModelRenderer(this, 38, 34);
					this.armLeftBot.mirror = true;
					this.armLeftBot.setPos(0.0F, 0.0F, 0.0F);
					this.armLeftBot.addBox(0.5F, 8.5F, -2.5F, 2, 2, 5, 0.2F);
					this.armLeftMid = new ModelRenderer(this, 27, 36);
					this.armLeftMid.mirror = true;
					this.armLeftMid.setPos(0.0F, 0.0F, 0.0F);
					this.armLeftMid.addBox(-0.5F, 4.5F, -2.5F, 3, 3, 5, 0.1F);
					this.armLeftTop = new ModelRenderer(this, 16, 30);
					this.armLeftTop.mirror = true;
					this.armLeftTop.setPos(0.0F, 0.0F, 0.0F);
					this.armLeftTop.addBox(-0.5F, -2.5F, -2.5F, 3, 6, 5, 0.2F);
					this.armLeftShoulder = new ModelRenderer(this, 46, 35);
					this.armLeftShoulder.mirror = true;
					this.armLeftShoulder.setPos(0.0F, 0.0F, 0.0F);
					this.armLeftShoulder.addBox(2.5F, -5.5F, -3.0F, 1, 8, 6, 0.0F);
					setRotationAngle(armLeftShoulder, 0.0F, 0.0F, -0.2617993877991494F);
				}

				this.body.addChild(chestProtTop);
				this.body.addChild(chestProtBot);
				if(!isSteve){
					this.body.addChild(bodyBreast);
					this.body.addChild(bodyBreastProt);
				}

				this.leftArm.addChild(armLeftTop);
				this.leftArm.addChild(armLeftMid);
				this.leftArm.addChild(armLeftBot);
				this.leftArm.addChild(armLeftShoulder);

				this.rightArm.addChild(armRightBot);
				this.rightArm.addChild(armRightMid);
				this.rightArm.addChild(armRightTop);
				this.rightArm.addChild(armRightShoulder);
				break;

			case LEGS:
				this.thighFrontSub = new ModelRenderer(this, 4, 21);
				this.thighFrontSub.setPos(0.0F, 11.0F, -2.5F);
				this.thighFrontSub.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 0, 0.0F);
				this.thighFront = new ModelRenderer(this, 0, 16);
				this.thighFront.setPos(0.0F, 11.0F, -2.5F);
				this.thighFront.addBox(-4.0F, 1.0F, -0.5F, 8, 4, 1, 0.0F);
				this.thighBackSub = new ModelRenderer(this, 4, 21);
				this.thighBackSub.setPos(0.0F, 11.0F, 2.5F);
				this.thighBackSub.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 0, 0.0F);
				this.thighBack = new ModelRenderer(this, 0, 16);
				this.thighBack.setPos(0.0F, 11.0F, 2.5F);
				this.thighBack.addBox(-4.0F, 1.0F, -0.5F, 8, 4, 1, 0.0F);
				this.thighRightSub = new ModelRenderer(this, 12, 18);
				this.thighRightSub.setPos(0.0F, 0.0F, 0.0F);
				this.thighRightSub.addBox(-4.5F, 11.0F, -2.0F, 0, 1, 4, 0.0F);
				this.body = new ModelRenderer(this, 0, 22);
				this.body.setPos(0.0F, 0.0F, 0.0F);
				this.body.addBox(-5.0F, 12.0F, -2.0F, 1, 4, 4, 0.0F);
				this.thighLeftSub = new ModelRenderer(this, 12, 18);
				this.thighLeftSub.setPos(0.0F, 0.0F, 0.0F);
				this.thighLeftSub.addBox(4.5F, 11.0F, -2.0F, 0, 1, 4, 0.0F);
				this.thighLeft = new ModelRenderer(this, 0, 22);
				this.thighLeft.setPos(0.0F, 0.0F, 0.0F);
				this.thighLeft.addBox(4.0F, 12.0F, -2.0F, 1, 4, 4, 0.0F);

				this.rightLeg = new ModelRenderer(this);

				this.leftLeg = new ModelRenderer(this);

				this.body.addChild(thighRightSub);
				this.body.addChild(thighLeft);
				this.body.addChild(thighLeftSub);
				this.body.addChild(thighFront);
				this.body.addChild(thighFrontSub);
				this.body.addChild(thighBack);
				this.body.addChild(thighBackSub);
				break;

			case FEET:
				this.rightLeg = new ModelRenderer(this, 0, 46);
				this.rightLeg.setPos(-1.9F, 12.0F, 0.0F);
				this.rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.3F);
				this.legRightProt = new ModelRenderer(this, 12, 42);
				this.legRightProt.setPos(0.0F, 0.0F, 0.0F);
				this.legRightProt.addBox(-2.5F, 5.5F, -2.5F, 5, 4, 4, 0.1F);
				this.leftLeg = new ModelRenderer(this, 0, 46);
				this.leftLeg.mirror = true;
				this.leftLeg.setPos(1.9F, 12.0F, 0.0F);
				this.leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.3F);
				this.legLeftProt = new ModelRenderer(this, 12, 42);
				this.legLeftProt.mirror = true;
				this.legLeftProt.setPos(0.0F, 0.0F, 0.0F);
				this.legLeftProt.addBox(-2.5F, 5.5F, -2.5F, 5, 4, 4, 0.1F);

				this.leftLeg.addChild(legLeftProt);
				this.rightLeg.addChild(legRightProt);
				break;

			default:
				break;
		}
	}

	@Override
	public void setupArmorAnim(T entityIn, float ageInTicks) {

		if (this.slot == EquipmentSlotType.LEGS) {
			float f = Math.abs(this.rightLeg.xRot);
			this.thighBack.xRot = f;
			this.thighBackSub.xRot = f;
			this.thighFront.xRot = -f;
			this.thighFrontSub.xRot = -f;

			if (this.riding) {
				this.thighBack.xRot += 1.0F;
				this.thighBackSub.xRot += 1.0F;
                this.thighFront.xRot -= 1.0F;
                this.thighFrontSub.xRot -= 1.0F;
			}

			if (this.crouching) {
                this.thighBack.xRot -= 0.5F;
                this.thighBackSub.xRot -= 0.5F;
                this.thighFront.xRot -= 0.5F;
                this.thighFrontSub.xRot -= 0.5F;
				this.thighFront.y = 8.0F;
				this.thighFrontSub.y = 8.0F;
			} else {
				this.thighFront.y = 11.0F;
				this.thighFrontSub.y = 11.0F;
			}
		}
    }
}
*/