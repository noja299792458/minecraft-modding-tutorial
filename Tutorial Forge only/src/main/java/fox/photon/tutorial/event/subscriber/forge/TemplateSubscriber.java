package fox.photon.tutorial.event.subscriber.forge;

import fox.photon.tutorial.Constants;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TemplateSubscriber {
    @SubscribeEvent
    public void on(){
        Constants.LOGGER.info("--- Event ---");
    }
}
