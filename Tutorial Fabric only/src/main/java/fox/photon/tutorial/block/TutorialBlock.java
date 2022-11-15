package fox.photon.tutorial.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class TutorialBlock extends Block
{
    public TutorialBlock()
    {
        super(Block.Settings.copy(Blocks.STONE));
    }

    public BlockItem getBlockItem()
    {
        FabricItemSettings prop = new FabricItemSettings();
        prop.group(ItemGroup.BUILDING_BLOCKS);
        return new BlockItem(this,prop);
    }
}
