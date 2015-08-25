package android.in.teachcoder.app.controller;


import android.content.Context;
import android.content.Intent;
import android.in.teachcoder.app.bedtimestories.MainActivity;
import android.in.teachcoder.app.bedtimestories.R;
import android.in.teachcoder.app.bedtimestories.StoryActivity;
import android.in.teachcoder.app.model.Story;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private LayoutInflater inflater;
    private List<Story> passedData;
    public Context context;
    public static int clickedViewNumber;

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


    }

    @Override
    public int getItemCount() {
        return passedData.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        TextView subTitle;

        public CustomViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.title = (TextView) itemView.findViewById(R.id.storyTitle);
            this.subTitle = (TextView) itemView.findViewById(R.id.storySubTitle);



        }


        @Override
        public void onClick(View v) {
            adapterNumber(getAdapterPosition());
            MainActivity.toatsMessage(context, "Item Clicked " + getAdapterPosition());
            Intent storyIntent = new Intent(context,StoryActivity.class);
            context.startActivity(storyIntent);


        }
    }

    public interface  ClickListener{

        void onItemClick(View view, int position);

    }

    public void adapterNumber(int clikedNumber){
        clickedViewNumber = clikedNumber;
    }


}
