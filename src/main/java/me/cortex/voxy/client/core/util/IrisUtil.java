package me.cortex.voxy.client.core.util;

import net.irisshaders.iris.shadows.ShadowRenderer;
import net.minecraftforge.fml.loading.LoadingModList;

public class IrisUtil {
    private static final boolean IRIS_INSTALLED = LoadingModList.get().getModFileById("iris") != null || LoadingModList.get().getModFileById("oculus") != null;


    private static boolean irisShadowActive0() {
        return ShadowRenderer.ACTIVE;
    }

    public static boolean irisShadowActive() {
        return IRIS_INSTALLED && irisShadowActive0();
    }
}
