package gtceubloom;

import gtceubloom.api.GTValues;
import gtceubloom.api.util.GTLog;
import gtceubloom.client.utils.BloomEffectUtil;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;

@Mod(modid = GTValues.MODID,
     version = "0.0.1",
     name = "GTCEu Bloom Unofficial",
     acceptedMinecraftVersions = "[1.12.2]",
     dependencies = "required:forge@[14.23.5.2847,);" + "required-after:codechickenlib@[3.2.3,);")
public class GTCEuBloom {
    public GTCEuBloom() {
	GTLog.logger.info("Does this even work?");
	if (FMLCommonHandler.instance().getSide().isClient()) {
            BloomEffectUtil.init();
        }
    }

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
	System.out.println("Please Construct");
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    public void loadComplete(FMLLoadCompleteEvent event) {
    }
}
