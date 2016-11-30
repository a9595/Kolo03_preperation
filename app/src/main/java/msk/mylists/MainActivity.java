package msk.mylists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView text;

    List<RecyclerData> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycler();
    }

    private void initRecycler() {
        data = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            data.add(new RecyclerData("Text " + i,
                                      "Description " + i,
                                      "https://media.licdn.com/mpr/mpr/shrinknp_200_200/p/3/000/085/2d7/03543d1.jpg"));

        recyclerView = (RecyclerView) findViewById(R.id.main_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new MyAdapter(data, getApplicationContext()));

        text = (TextView) findViewById(R.id.main_text);
    }
}
