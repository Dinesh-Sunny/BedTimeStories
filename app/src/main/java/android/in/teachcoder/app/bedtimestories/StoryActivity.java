package android.in.teachcoder.app.bedtimestories;

import android.content.Intent;
import android.graphics.Typeface;
import android.in.teachcoder.app.controller.CustomAdapter;
import android.in.teachcoder.app.model.Story;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.w3c.dom.Text;

import java.util.List;

public class StoryActivity extends AppCompatActivity {
    private Story clickedStory;
    private AdView mAdView;
    private Typeface tf_regular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        //Make sure that analytics tracking has started

        ((MyApplication)getApplication()).startTracking();





        //get the story object
        clickedStory =  MainActivity.str.get(CustomAdapter.clickedViewNumber);

        //Toolbar parallax effect support library
        Toolbar toolbar = (Toolbar) findViewById(R.id.storyActivityToolBar);

            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
            collapsingToolbarLayout.setTitle(clickedStory.title);



        collapsingToolbarLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        //Toolbar parallax effect support library ends

        TextView storyDescription = (TextView) findViewById(R.id.storyTextView);

        MainActivity.toatsMessage(this, Integer.toString(CustomAdapter.clickedViewNumber));

        ImageView iv = (ImageView) findViewById(R.id.storyImageView);

        iv.setImageResource(clickedStory.mainimageId);

        storyDescription.setText(clickedStory.storyDescription);

        tf_regular = Typeface.createFromAsset(this.getAssets(), "fonts/bask.ttf");
        storyDescription.setTypeface(tf_regular);


        //for ads display
        try {
            mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);
    }
}
