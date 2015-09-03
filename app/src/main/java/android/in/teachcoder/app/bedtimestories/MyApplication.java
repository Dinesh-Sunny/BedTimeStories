package android.in.teachcoder.app.bedtimestories;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by Macbook on 02/09/15.
 */
public class MyApplication extends Application {
    //this is for analytics purpose

    public Tracker mTracker;

    public void startTracking(){
        //get the tracker associated with this app

        if(mTracker == null){  //make sure only one tracker is running per activity
            GoogleAnalytics ga = GoogleAnalytics.getInstance(this);
            mTracker = ga.newTracker(R.xml.track_app); //Get the config data for the tracker
            ga.enableAutoActivityReports(this); //Enable tracking of Activities
        }

    }

    public Tracker getTracker(){
        //make sure the tracking exists
        startTracking();
        return mTracker;
    }

}
