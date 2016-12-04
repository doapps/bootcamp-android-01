package me.doapps.tinder.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import me.doapps.tinder.R;
import me.doapps.tinder.entity.User;
import me.doapps.tinder.util.FormUtil;

/**
 * Created by jonathannolasco on 11/26/16.
 */

public class SignupActivity extends AppCompatActivity{
    private EditText edit_email, edit_password;
    private Button button_signup;

    private List<User> data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        data = new ArrayList<>();

        edit_email = (EditText) findViewById(R.id.edit_email);
        edit_password = (EditText) findViewById(R.id.edit_password);

        button_signup = (Button) findViewById(R.id.button_signup);
        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.add(new User(edit_email.getText().toString(), "Vicente", edit_password.getText().toString()));
                Log.e("CANT", data.size() + "");

                for (int i = 0; i < data.size(); i++) {
                    Log.e("USER", data.get(i).getName() + ", " + data.get(i).getAge());
                }


            }
        });



//        if (FormUtil.isValidEmail(edit_email.getText().toString())) {
//            Log.e("EMAIL", "valido");
//        } else {
//            Log.e("EMAIL", "invalido");
//        }
//
//        if (FormUtil.isValidPass(edit_password.getText().toString())) {
//            Log.e("PASS", "valido");
//        } else {
//            Log.e("PASS", "invalid");
//        }
    }
}
