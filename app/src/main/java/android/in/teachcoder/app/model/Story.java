package android.in.teachcoder.app.model;

import android.text.Spanned;

/**
 * Created by Macbook on 24/08/15.
 */
public class Story {

    public String  title;
    public String  subTitle;
    public Spanned  storyDescription;

    public Story(String title, String subTitle, Spanned storyDescription){
        this.title = title;
        this.subTitle = subTitle;
        this.storyDescription=storyDescription;
    }

}
