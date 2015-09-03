package android.in.teachcoder.app.bedtimestories;

import android.content.Context;
import android.content.Intent;

import android.in.teachcoder.app.controller.CustomAdapter;
import android.in.teachcoder.app.model.Story;
import android.in.teachcoder.app.model.StoryArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    StoryArray storyArray;
    static List<Story> str;
    Toolbar tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Make sure that analytics tracking has started

        ((MyApplication) getApplication()).startTracking();

        tb = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(tb);

        storyArray = new StoryArray();
        str = storyArray.stories;
        if(str.size() >= 5){
            MainActivity.toatsMessage(this, "Stories Created");
        }

        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        rv.setAdapter(new CustomAdapter(this, str));
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rv.setLayoutManager(llm);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_about_us) {

            Intent intent = new Intent(this, AboutUs.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public static void toatsMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }


}
