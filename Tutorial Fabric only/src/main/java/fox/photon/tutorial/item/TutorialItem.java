package fox.photon.tutorial.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class TutorialItem extends Item
{
    public TutorialItem()
    {
        super(new FabricItemSettings().group(ItemGroup.MISC));
    }
}
