package me.doapps.tinder.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import me.doapps.tinder.util.FontUtil;

/**
 * Created by jonathannolasco on 12/17/16.
 */

public class LigthEdit extends EditText {
    public LigthEdit(Context context) {
        super(context);
        init(context);
    }

    public LigthEdit(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public LigthEdit(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        setTypeface(FontUtil.getMontserratLight(context));
    }
}
