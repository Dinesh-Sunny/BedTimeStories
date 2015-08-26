package android.in.teachcoder.app.bedtimestories;

import android.content.Intent;
import android.in.teachcoder.app.controller.CustomAdapter;
import android.in.teachcoder.app.model.Story;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class StoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        TextView storyDescription = (TextView) findViewById(R.id.storyTextView);
//
        MainActivity.toatsMessage(this,Integer.toString(CustomAdapter.clickedViewNumber));
        Story clickedStory =  MainActivity.str.get(CustomAdapter.clickedViewNumber);
        storyDescription.setText(clickedStory.storyDescription);

//        Spanned text = Html.fromHtml("<p style=\"text-align: left\">So they hastily rushed to the <strong>police. </strong> When they arrived they were sent to talk to the team which specialized in combating kidnapping. The team was made up of <strong>Little Red Riding Hood</strong>, the leader who had mental powers, <strong>Cinderella</strong>, who was responsible for team organization and computer systems and <strong>Pinocchio</strong>, who was a ninja expert in martial arts.</p>\n" +
//                "<p style=\"text-align: left\">During the investigation, Little Red Riding Hood used her mental powers to locate the place where Snow White was locked up.</p>\n" +
//                "<p style=\"text-align: left\">Cinderella immediately searched for the address of The Evil Witch on the internet, and located her by using a GPS system.</p>\n" +
//                "<p style=\"text-align: left\">Meanwhile, the <strong>Evil Witch</strong> was in her castle watching their steps using her magic mirror. When she realized they were on the way to her castle, she sent her loyal assistant,<strong> Peter Pan</strong> to ambush them with a weapon and some hand grenades.</p>\n" +
//                "<p style=\"text-align: left\">Luckily, Cinderella used her computer to introduce a virus and published a video showing a car exploding during an ambush. When the evil witch saw it she was very happy as she thought that her plan had worked and so went to relax by taking a bath, feeling very confident.</p>\n" +
//                "<p style=\"text-align: left\">Luckily, peter Pan failed during the ambush, because &#8220;<em>Mobilejustice&#8221;</em>; that was the name of their armoured <strong>Hummer,</strong> had no problem passing the ambush.</p>\n" +
//                "<p style=\"text-align: left\">When they arrived at the castle, the team couldn&#8217;t get inside, because it was closed. So, they asked Pinocchio to climb over a wall and open the door from the inside.</p>\n" +
//                "<p style=\"text-align: left\">A big battle then started inside. The Evil Witch and her gang were winning little by little. Peter Pan reached them and began a sword battle against the brave Pinocchio. They had built a special trap for him and suddenly he fell into a hole full of termites who wanted to eat him.</p>\n" +
//                "<p style=\"text-align: left\">Fortunately, Little Red Riding Hood stopped the termites using her mental powers, and when they were about to be defeated, a fast red <strong>Ferrari</strong>, skidding around the bends, with the music very loud, appeared. Everybody was shocked, because they couldn&#8217;t see anybody inside until the door opened and the <strong>Seven Dwarves</strong> appeared. They began to beat up those who were in the middle of the battle.</p>\n" +
//                "<p style=\"text-align: left\">Finally, they managed to stop Peter Pan and his henchmen. Pinocchio and Little Red Riding Hood went to catch the witch, who was inside her castle, making herself pretty in front of the mirror and it was a very unpleasant moment for the witch when they arrested her.</p>\n" +
//                "<p style=\"text-align: left\">Snow White was freed by the specialist team and thanks to the Seven Dwarves help. The team triumphed one more time and achieved their objective &#8211; to <strong>rescue</strong> <strong>Snow White.</strong></p>\n" +
//                "<p style=\"text-align: center\"><strong>THE END</strong></p>\n" +
//                "<div align=\"center\"><strong><a href=\"http://www.cuentosinfantilescortos.net/el-secuestro-de-blancanieves\" target=\"_blank\"><img style=\"vertical-align: middle;border-width: 0px\" alt=\"Cuento infantil en español\" src=\"http://www.shortstories.net/wp-content/uploads/2011/11/Cuentos-infantiles-espanol.png\" /></a> <a href=\"http://www.cuentosinfantilescortos.net/el-secuestro-de-blancanieves\" target=\"_blank\">Cuento en español</a></strong></div>\n" +
//                "<blockquote><p>Share this short story for kids with your friends on Facebook, Google +, or Twitter with the buttons you&#8217;ll find at the end of the story. Thank you! Story for kids written by: J.Eduardo Lopez.M (Mexicali)</p></blockquote>");
//            storyDescription.setText(text);

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);
    }
}
