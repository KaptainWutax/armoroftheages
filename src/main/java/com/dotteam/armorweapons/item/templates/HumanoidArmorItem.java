package com.dotteam.armorweapons.item.templates;

import com.dotteam.armorweapons.client.model.armor.HumanoidArmorModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Vanishable;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.UUID;
import java.util.function.Consumer;

import static com.dotteam.armorweapons.DoTArmorWeapons.MOD_ID;

public abstract class HumanoidArmorItem extends ArmorItem implements Vanishable {
	private static final UUID[] ARMOR_MODIFIER_UUID_PER_SLOT = new UUID[] {
			UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
			UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
			UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
			UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150") };

	public final String setName;
	public final String pieceName;
	public HumanoidModel<LivingEntity> model = null;
	public HumanoidModel<LivingEntity> slimModel = null;

	public HumanoidArmorItem(String setNameIn, String pieceNameIn, ArmorMaterial materialIn, Type slotIn) {
		super(materialIn, slotIn, new Properties().stacksTo(1));
		this.setName = setNameIn;
		this.pieceName = pieceNameIn;
	}

	@Override
	public  @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
		if (entity instanceof AbstractClientPlayer playerEntity) {
			if ("slim".equals(playerEntity.getModelName())) {
				return MOD_ID + ":textures/models/armor/" + this.setName + "_slim.png";
			}
		}
		return MOD_ID + ":textures/models/armor/" + this.setName + ".png";
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		consumer.accept(new IClientItemExtensions() {
			public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel<?> defaultModel) {
				/*
				HumanoidModel<?> armorModele = new HumanoidModel<>(
						new ModelPart(Collections.emptyList(),
						Map.of(
								"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"head", new Balaclava_Model(Minecraft.getInstance().getEntityModels().bakeLayer(Balaclava_Model.LAYER_LOCATION)).Head,
								"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
								"left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
				*/
				HumanoidModel<?> armorModel = getModel(living, isSlimPlayerEntity(living));
				armorModel.young = living.isBaby();
				armorModel.crouching = living.isShiftKeyDown();
				armorModel.riding = defaultModel.riding;
				// armorModel.rightArmPose = _default.rightArmPose;
				// armorModel.leftArmPose = _default.leftArmPose;
				// armorModel.setupAnim(entityLiving, (float) entityLiving.tickCount);
				return armorModel;
			}
		});
	}

	/**
	 * Checks if the entity in parameter has Alex model or not.
	 * @param living is the entity to study.
	 * @return True if the entity has Alex model, False if it has Steve model.
	 */
	private boolean isSlimPlayerEntity(LivingEntity living){
		return living instanceof AbstractClientPlayer && "slim".equals(((AbstractClientPlayer) living).getModelName());
	}

	/**
	 * Returns the armor model depending on the type of player model.
	 * @param living entity with the equipped item.
	 * @param isSlim is True if the living entity has Alex model, False if it's Steve.
	 * @return the corresponding armor.
	 */
	private HumanoidModel<LivingEntity> getModel(LivingEntity living, boolean isSlim){
		if(isSlim){
			if(this.slimModel == null) {
				this.slimModel = createSlimModel(living);
			}
			return this.slimModel;
		}else{
			if(this.model == null) {
				this.model = createModel(living);
			}
			return this.model;
		}
	}

	@OnlyIn(Dist.CLIENT)
	public HumanoidModel<LivingEntity> createModel(LivingEntity entityLiving) {
		return this.getModelFactory().create(this.getType(), true, entityLiving.getScale());
	}

	@OnlyIn(Dist.CLIENT)
	public HumanoidModel<LivingEntity> createSlimModel(LivingEntity entityLiving) {
		return this.getModelFactory().create(this.getType(), false, entityLiving.getScale());
	}

	@OnlyIn(Dist.CLIENT)
	public abstract ArmorModelFactory getModelFactory();

	@FunctionalInterface
	public interface ArmorModelFactory {
		HumanoidArmorModel<LivingEntity> create(Type type, boolean isSteve, float scale);
	}

	@Override
	public EquipmentSlot getEquipmentSlot(ItemStack stackIn) {
		if (stackIn.getItem() instanceof HumanoidArmorItem) {
			return this.getType().getSlot();
		}
		return null;
	}

	@Override
	public int getMaxDamage(ItemStack stackIn) {
		return this.material.getDurabilityForType(this.type);
	}
}
