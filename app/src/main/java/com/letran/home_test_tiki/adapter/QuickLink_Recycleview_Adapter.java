package com.letran.home_test_tiki.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.letran.home_test_tiki.R;
import com.letran.home_test_tiki.models.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

public class QuickLink_Recycleview_Adapter extends RecyclerView.Adapter<QuickLink_Recycleview_Adapter.MyViewHolder> {

    private List<Item> lstItem;
    private Context context;

    public QuickLink_Recycleview_Adapter(List<Item> lstItem, Context context) {
        this.lstItem = lstItem;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_quicklink_home,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if(!lstItem.get(position).getImage_url().isEmpty()) {
            Picasso.with(context).load(lstItem.get(position).getImage_url()).into(holder.imageView);
        }else
            holder.imageView.setImageResource(R.drawable.notfoundimage);

        holder.txtTitle.setText(lstItem.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return lstItem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView txtTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.image);
            txtTitle = (TextView)itemView.findViewById(R.id.txtTitle);
        }
    }
}
