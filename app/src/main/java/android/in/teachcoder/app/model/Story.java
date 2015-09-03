package android.in.teachcoder.app.model;

import android.text.Spanned;

/**
 * Created by Macbook on 24/08/15.
 */
public class Story {

    public String  title;

    public Spanned  storyDescription;
    public int thumbimageId;
    public int mainimageId;


    public Story(String title, Spanned storyDescription, int thumbimageId, int mainimageId){
        this.title = title;

        this.storyDescription=storyDescription;
        this.thumbimageId = thumbimageId;
        this.mainimageId = mainimageId;
    }

}
