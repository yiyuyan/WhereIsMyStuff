package cn.ksmcbrigade.wims;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(WhereIsMyStuff.MODID)
public class WhereIsMyStuff {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "wmis";

    public WhereIsMyStuff() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
