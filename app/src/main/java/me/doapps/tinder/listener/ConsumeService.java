package me.doapps.tinder.listener;

import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;

import cz.msebera.android.httpclient.Header;

/**
 * Created by jonathannolasco on 12/17/16.
 */

public class ConsumeService {
    private ServiceInterface serviceInterface;
    private String PATH = "http://jsonplaceholder.typicode.com/users";

    public void consumeService() {
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(PATH, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.e("SUCCESS", statusCode + ", " + new String(responseBody));
                try {
                    JSONArray responseArray = new JSONArray(new String(responseBody));
                    serviceInterface.setResponse(responseArray);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.e("FAIL", statusCode + ", " + error.toString());
            }
        });
    }

    /****/
    public interface ServiceInterface {
        void setResponse(JSONArray response);
    }
    public void setServiceInterface(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

}
