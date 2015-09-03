package android.in.teachcoder.app.bedtimestories;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {
    private Typeface tf_regular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        TextView heading = (TextView) findViewById(R.id.heading);

        tf_regular = Typeface.createFromAsset(this.getAssets(), "fonts/chik.otf");
        heading.setTypeface(tf_regular);
    }


}
