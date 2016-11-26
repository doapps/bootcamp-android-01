package me.doapps.tinder.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import me.doapps.tinder.R;

/**
 * Created by jonathannolasco on 11/26/16.
 */

public class CustomText extends TextView {
    public CustomText(Context context) {
        super(context);
        init();
    }

    public CustomText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setTextColor(getResources().getColor(R.color.black));
        setTextSize(25);
    }
}
