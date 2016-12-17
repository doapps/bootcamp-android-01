package me.doapps.tinder.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import me.doapps.tinder.R;

/**
 * Created by jonathannolasco on 12/3/16.
 */

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_search;
    private ImageView image_messages;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().hide();

        image_messages = (ImageView) findViewById(R.id.image_messages);
        image_messages.setOnClickListener(this);

        button_search = (Button) findViewById(R.id.button_search);
        button_search.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_messages:
                startActivity(new Intent(ProfileActivity.this, MessageActivity.class));
                break;
            case R.id.button_search:
                startActivity(new Intent(ProfileActivity.this, SearchActivity.class));
                break;
        }
    }
}
