package com.example.work.messagingviewexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Message> array;
    private MessageListAdapter mMessageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mMessageRecycler = (RecyclerView) findViewById(R.id.reyclerview_message_list);
        mMessageAdapter = new MessageListAdapter(this, getDummyMessageList());
        mMessageRecycler.setLayoutManager(new LinearLayoutManager(this));
        mMessageRecycler.setAdapter(mMessageAdapter);
        mMessageRecycler.setHasFixedSize(true);

        final EditText editText = (EditText) findViewById(R.id.edittext_chatbox);

        Button button = (Button) findViewById(R.id.button_chatbox_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Message message = new Message(editText.getText().toString(), new User("Valod", ""), 14568547, true);
                array.add(message);
                mMessageAdapter.notifyDataSetChanged();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Message message1 = new Message("Hey hey hey heyy", new User("Esim ov", ""), 14568547, false);
                array.add(message1);
                mMessageAdapter.notifyDataSetChanged();
            }
        });

    }

    private ArrayList<Message> getDummyMessageList() {
        Message message1 = new Message("Hello World", new User("Valod", ""), 145878547, true);
        Message message2 = new Message("Hello", new User("Samvel", ""), 1458785457, false);
        Message message3 = new Message("Hello adddddd ffffhth hfhfhhf fhfhhfhf", new User("Gxecik", ""), 145878547, false);
        Message message4 = new Message("Hellodgdgdgdg  dhdhhdh rhrh hrhrh hrhhr hrhhr rh hrh ", new User("Valod", ""), 145878547, true);
        Message message5 = new Message("Hello World okokokokokoko", new User("Gexecik", ""), 145878547, false);
        array = new ArrayList<>();
        array.add(message1);
        array.add(message2);
        array.add(message3);
        array.add(message4);
        array.add(message5);
        return array;
    }
}
