package android.in.teachcoder.app.bedtimestories;

import android.content.Context;
import android.in.teachcoder.app.controller.CustomAdapter;
import android.in.teachcoder.app.model.Story;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CustomAdapter.ClickListener {

    static List<Story>  stories = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stories.add(new Story("A LOVELY SUNNY DAY", "It was a lovely sunny day in Oak Tree Farm.", "Hello yeah this is story 0"));
        stories.add(new Story("A LOVELY  DAY", "It was a lovely sunny day in Oak Tree Farm.","Hello yeah this is story 1"));
        stories.add(new Story("A LOVELY SUNNY ]", "It was a lovely sunny day in Oak Tree Farm.","Hello yeah this is story 2"));
        stories.add(new Story("A  SUNNY DAY", "It was a lovely sunny day in Oak Tree Farm.","Hello yeah this is story 3"));

        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        rv.setAdapter(new CustomAdapter(this, stories));
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rv.setLayoutManager(llm);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(View view, int position) {

    }

    public static void toatsMessage(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }



}
