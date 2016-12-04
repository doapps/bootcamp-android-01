package me.doapps.tinder.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.skyfishjy.library.RippleBackground;

import me.doapps.tinder.R;

/**
 * Created by jonathannolasco on 12/3/16.
 */

public class SearchActivity extends AppCompatActivity {
    private RippleBackground ripple;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ripple = (RippleBackground) findViewById(R.id.ripple);
        ripple.startRippleAnimation();
    }
}
