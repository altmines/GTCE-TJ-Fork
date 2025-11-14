package gregtech.common.items;

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
