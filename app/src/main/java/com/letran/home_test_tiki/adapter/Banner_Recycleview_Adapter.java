package com.letran.home_test_tiki.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.letran.home_test_tiki.R;
import com.letran.home_test_tiki.models.Banner;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Banner_Recycleview_Adapter extends RecyclerView.Adapter<Banner_Recycleview_Adapter.MyViewHolder> {

    private List<Banner> lstBanner;
    private Context context;

    public Banner_Recycleview_Adapter(List<Banner> lstBanner, Context context) {
        this.lstBanner = lstBanner;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_banner_home,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if(!lstBanner.get(position).getImage_url().isEmpty()) {
            Picasso.with(context).load(lstBanner.get(position).getImage_url()).into(holder.imageView);
        }else
            holder.imageView.setImageResource(R.drawable.notfoundimage);
    }

    @Override
    public int getItemCount() {
        return lstBanner.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.image);
        }
    }
}
