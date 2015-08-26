package android.in.teachcoder.app.controller;


import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.in.teachcoder.app.bedtimestories.MainActivity;
import android.in.teachcoder.app.bedtimestories.R;
import android.in.teachcoder.app.bedtimestories.StoryActivity;
import android.in.teachcoder.app.model.Story;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private LayoutInflater inflater;
    private List<Story> passedData;
    public Context context;
    public static int clickedViewNumber;
    // Allows to remember the last item shown on screen(Animation)
    private int lastPosition = -1;

    public CustomAdapter(Context context,List<Story> data){
        this.passedData = data;
        this.context = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {


        inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.item_view, viewGroup, false);

        CustomViewHolder holder = new CustomViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int i) {
        Story s = passedData.get(i);
        holder.title.setText(s.title);
        holder.subTitle.setText(s.subTitle);

        setAnimation(holder.container, i);


    }

    private void setAnimation(View viewToAnimate, int position) {
        if(position > lastPosition){
            Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return passedData.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        CardView container;

        TextView title;
        TextView subTitle;

        public CustomViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.title = (TextView) itemView.findViewById(R.id.storyTitle);
            this.subTitle = (TextView) itemView.findViewById(R.id.storySubTitle);
            this.container = (CardView) itemView.findViewById(R.id.containerView);





        }


        @Override
        public void onClick(View v) {
            adapterNumber(getAdapterPosition());
            MainActivity.toatsMessage(context, "Item Clicked " + getAdapterPosition());
            Intent storyIntent = new Intent(context,StoryActivity.class);

            //Transtition between activities
            Bundle transitition = ActivityOptions.makeCustomAnimation(context,R.anim.slide_in_left,R.anim.slide_out_left).toBundle();

            context.startActivity(storyIntent, transitition);


        }
    }

    public interface  ClickListener{

        void onItemClick(View view, int position);

    }

    public void adapterNumber(int clikedNumber){
        clickedViewNumber = clikedNumber;
    }


}
