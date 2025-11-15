package gregtech.common.items;

import gregtech.api.GTValues;
import gregtech.api.items.OreDictNames;
import gregtech.api.items.materialitem.MaterialMetaItem;
import gregtech.api.items.metaitem.ElectricStats;
import gregtech.api.items.metaitem.FluidStats;
import gregtech.api.items.metaitem.FoodStats;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.Material;
import gregtech.api.unification.material.type.SolidMaterial;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.ItemMaterialInfo;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.api.util.RandomPotionEffect;
import gregtech.common.items.behaviors.*;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_LV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_MV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_HV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_EV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_IV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_LUV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_ZPM;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_UV;
import static gregtech.common.items.MetaItems.RAW_RUBBER;
import gregtech.api.items.materialitem.MaterialMetaItem;
public class MetaItemSTE extends MaterialMetaItem {
    @Override
    public void registerSubItems() {
        // put your stuff in here, Credits to Johny709
        GEAR_ASSEMBLY_LV = addItem(1, "gear.assembly.lv");
        GEAR_ASSEMBLY_MV = addItem(2, "gear.assembly.mv");
        GEAR_ASSEMBLY_HV = addItem(3, "gear.assembly.hv");
        GEAR_ASSEMBLY_EV = addItem(4, "gear.assembly.ev");
        GEAR_ASSEMBLY_IV = addItem(5, "gear.assembly.iv");
        GEAR_ASSEMBLY_LUV = addItem(6, "gear.assembly.luv");
        GEAR_ASSEMBLY_ZPM = addItem(7, "gear.assembly.zpm");
        GEAR_ASSEMBLY_UV = addItem(8, "gear.assembly.uv");
        RAW_RUBBER = addItem(9, "raw.rubber");
    }
}
