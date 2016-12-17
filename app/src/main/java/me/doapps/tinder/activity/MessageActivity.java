package me.doapps.tinder.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import me.doapps.tinder.R;
import me.doapps.tinder.adapter.ChatAdapter;
import me.doapps.tinder.entity.User;
import me.doapps.tinder.listener.ConsumeService;
import me.doapps.tinder.listener.Mago;

/**
 * Created by jonathannolasco on 12/17/16.
 */

public class MessageActivity extends AppCompatActivity implements ConsumeService.ServiceInterface {
    private RecyclerView recycler_chat;
    private ProgressBar progress;

    private List<User> userList;
    private ChatAdapter chatAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        recycler_chat = (RecyclerView) findViewById(R.id.recycler_chat);
        progress = (ProgressBar) findViewById(R.id.progress);

        ConsumeService service = new ConsumeService();
        service.consumeService();
        service.setServiceInterface(this);
    }

    @Override
    public void setResponse(JSONArray response) {
        initData(response);
    }

    private void initData(JSONArray jsonArray) {
        userList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                userList.add(new User(
                        jsonObject.getString("name"),
                        jsonObject.getString("username"),
                        jsonObject.getString("website"),
                        jsonObject.getString("phone")));

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        progress.setVisibility(View.GONE);
        initList();
    }

    private void initList() {
        chatAdapter = new ChatAdapter(userList, this);
        recycler_chat.setLayoutManager(new LinearLayoutManager(this));
        recycler_chat.setAdapter(chatAdapter);
    }

}
