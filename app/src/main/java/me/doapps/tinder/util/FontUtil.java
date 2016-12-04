package me.doapps.tinder.util;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by jonathannolasco on 12/3/16.
 */

public class FontUtil {

    public static Typeface getMontserratLight(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "font/Montserrat-Light.otf");
    }

    public static Typeface getMontserratMedium(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "font/Montserrat-Medium.otf");
    }
}
