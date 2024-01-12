package gtceubloom.api;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.FMLLaunchHandler;
import net.minecraftforge.oredict.OreDictionary;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

import static net.minecraft.util.text.TextFormatting.*;

/**
 * Made for static imports, this Class is just a Helper.
 */
public class GTValues {
    /**
     * ModID strings, since they are quite common parameters
     */
    public static final String MODID = "gtceubloom",
            MODID_FR = "forestry",
            MODID_CT = "crafttweaker",
            MODID_TOP = "theoneprobe",
            MODID_CTM = "ctm",
            MODID_CC = "cubicchunks",
            MODID_AR = "advancedrocketry",
            MODID_ECORE = "endercore",
            MODID_EIO = "enderio",
            MODID_BC = "buildcraftcore",
            MODID_COFH = "cofhcore",
            MODID_APPENG = "appliedenergistics2",
            MODID_JEI = "jei",
            MODID_GROOVYSCRIPT = "groovyscript",
            MODID_NC = "nuclearcraft",
            MODID_IE = "immersiveengineering",
            MODID_OC = "opencomputers",
            MODID_JOURNEYMAP = "journeymap",
            MODID_VOXELMAP = "voxelmap",
            MODID_XAERO_MINIMAP = "xaerominimap",
            MODID_HWYLA = "hwyla",
            MODID_BAUBLES = "baubles",
            MODID_TOP_ADDONS = "topaddons",
            MODID_IC2 = "ic2",
            MODID_GTFO = "gregtechfoodoption",
            MODID_BINNIE = "binniecore",
            MODID_XU2 = "extrautils2",
            MODID_TR = "techreborn",
            MODID_MB = "magicbees",
            MODID_EB = "extrabees",
            MODID_ET = "extratrees",
            MODID_GENETICS = "genetics",
            MODID_BOP = "biomesoplenty",
            MODID_TCON = "tconstruct",
            MODID_PROJRED_CORE = "projectred-core",
            MODID_RC = "railcraft",
            MODID_CHISEL = "chisel",
            MODID_LITTLETILES = "littletiles";

    private static Boolean isClient;

    public static boolean isClientSide() {
        if (isClient == null) isClient = FMLCommonHandler.instance().getSide().isClient();
        return isClient;
    }

    private static Boolean isDeobf;

    public static boolean isDeobfEnvironment() {
        if (isDeobf == null) isDeobf = FMLLaunchHandler.isDeobfuscatedEnvironment();
        return isDeobf;
    }

    /**
     * Default fallback value used for Map keys.
     * Currently only used in {@link gregtech.loaders.recipe.CraftingComponent}.
     */
    public static final int FALLBACK = -1;
}
