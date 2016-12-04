package me.doapps.tinder.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import me.doapps.tinder.util.FontUtil;

/**
 * Created by jonathannolasco on 12/3/16.
 */

public class MediumText extends TextView {
    public MediumText(Context context) {
        super(context);
        init(context);
    }

    public MediumText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MediumText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        setTypeface(FontUtil.getMontserratMedium(context));
    }
}
