package gtceubloom;

import gtceubloom.api.GTValues;
import gtceubloom.client.utils.BloomEffectUtil;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = GTValues.MODID,
     version = "0.0.1",
     name = "GTCEu Bloom Unofficial",
     acceptedMinecraftVersions = "[1.12.2]",
     dependencies = "required:forge@[14.23.5.2847,);" + "required-after:codechickenlib@[3.2.3,);")
public class GTCEuBloom {
    public GTCEuBloom() {
	if (FMLCommonHandler.instance().getSide().isClient()) {
            BloomEffectUtil.init();
        }
    }

    @SubscribeEvent
    public void onConfigChanged(OnConfigChangedEvent event) {
	System.out.println("config");
	if (event.getModID().equals(GTValues.MODID)) {
	    ConfigManager.sync(GTValues.MODID, Config.Type.INSTANCE);
	}
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
	 MinecraftForge.EVENT_BUS.register(this);
    }
}
