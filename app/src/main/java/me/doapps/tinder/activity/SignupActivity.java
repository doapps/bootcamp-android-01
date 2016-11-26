package me.doapps.tinder.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import me.doapps.tinder.R;

/**
 * Created by jonathannolasco on 11/26/16.
 */

public class SignupActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView text_name = (TextView) findViewById(R.id.text_name);

        //catch data
        String name = getIntent().getExtras().getString("NAME");
        text_name.setText(name);
    }
}
