package gregtech.common.items;

import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_LV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_MV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_HV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_EV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_IV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_LUV;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_ZPM;
import static gregtech.common.items.MetaItems.GEAR_ASSEMBLY_UV;
import static gregtech.common.items.MetaItems.VULCANISED_RUBBER;
import gregtech.api.items.materialitem.MaterialMetaItem;
public class MetaItemSTE extends MaterialMetaItem {
    @Override
    public void registerSubItems() {
        // put your stuff in here, Credits to Johny709
        GEAR_ASSEMBLY_LV = addItem(1, "electric.motor.lv");
        GEAR_ASSEMBLY_MV = addItem(2, "electric.motor.mv");
        GEAR_ASSEMBLY_HV = addItem(3, "electric.motor.hv");
        GEAR_ASSEMBLY_EV = addItem(4, "electric.motor.ev");
        GEAR_ASSEMBLY_IV = addItem(5, "electric.motor.iv");
        GEAR_ASSEMBLY_LUV = addItem(6, "electric.motor.luv");
        GEAR_ASSEMBLY_ZPM = addItem(7, "electric.motor.zpm");
        GEAR_ASSEMBLY_UV = addItem(8, "electric.motor.uv");
        VULCANISED_RUBBER = addItem(9, "vulcanised.rubber");
    }
}
