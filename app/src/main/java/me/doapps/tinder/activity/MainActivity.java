package me.doapps.tinder.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.doapps.tinder.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("LIFE_CYCLE", "OnCreate");

        getSupportActionBar().hide();

        //reference components
        final EditText text_username = (EditText) findViewById(R.id.text_username);
        final EditText text_pass = (EditText) findViewById(R.id.text_pass);

        //action button
        Button button_signin = (Button) findViewById(R.id.button_signin);
        button_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text_username.getText().toString().length() > 0) {
                    if (text_pass.getText().toString().length() > 0) {

                        Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                        intent.putExtra("NAME", text_username.getText().toString());
                        startActivity(intent);

                    } else {
                        Toast.makeText(MainActivity.this, "Ingrese su contraseña", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Ingrese su correo", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LIFE_CYCLE", "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LIFE_CYCLE", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LIFE_CYCLE", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LIFE_CYCLE", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LIFE_CYCLE", "OnDestroy");
    }
}
