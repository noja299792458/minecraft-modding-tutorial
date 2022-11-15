package fox.photon.tutorial;

import fox.photon.tutorial.block.TutorialBlock;
import fox.photon.tutorial.item.TutorialItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TutorialMod implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        TutorialItem tutorialItem = new TutorialItem();
        TutorialBlock tutorialBlock = new TutorialBlock();
        BlockItem tutorialBlockItem = tutorialBlock.getBlockItem();
        Registry.register(Registry.ITEM,
                new Identifier(Constants.MOD_ID,"tutorial_item"),tutorialItem);
        Registry.register(Registry.BLOCK,
                new Identifier(Constants.MOD_ID,"tutorial_block"),tutorialBlock);
        Registry.register(Registry.ITEM,
                new Identifier(Constants.MOD_ID,"tutorial_block"),tutorialBlockItem);
    }
}
