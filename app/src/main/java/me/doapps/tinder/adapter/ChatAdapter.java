package me.doapps.tinder.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import me.doapps.tinder.R;
import me.doapps.tinder.entity.User;

/**
 * Created by jonathannolasco on 12/17/16.
 */

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatHolder>{
    private List<User> userList;
    private LayoutInflater inflater;
    private Context context;

    public ChatAdapter(List<User> userList, Context context) {
        this.userList = userList;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ChatHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_chat, parent, false);
        return new ChatHolder(view);
    }

    @Override
    public void onBindViewHolder(ChatHolder holder, int position) {
        User user = userList.get(position);
        holder.text_name.setText(user.getName());
        holder.text_message.setText(user.getMessage());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    /**Holder**/
    class ChatHolder extends RecyclerView.ViewHolder {
        private ImageView image_chat;
        private TextView text_name, text_message;

        public ChatHolder(View itemView) {
            super(itemView);
            image_chat = (ImageView) itemView.findViewById(R.id.image_chat);
            text_name = (TextView) itemView.findViewById(R.id.text_name);
            text_message = (TextView) itemView.findViewById(R.id.text_message);
        }
    }
}
