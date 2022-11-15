package fox.photon.tutorial.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class TutorialBlock extends Block {

    public static final String NAME = "tutorial_block";

    public TutorialBlock()
    {
        super(Block.Properties.copy(Blocks.STONE));
    }

    public BlockItem getBlockItem()
    {
        Item.Properties prop = new Item.Properties();
        prop.tab(CreativeModeTab.TAB_BUILDING_BLOCKS);
        return new BlockItem(this,prop);
    }

    public String getRegistryName(){
        return "tutorial_block";
    }

}
