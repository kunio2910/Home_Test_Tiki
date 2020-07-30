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
import com.letran.home_test_tiki.models.FlashDeal;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Flashdeal_Recycleview_Adapter extends RecyclerView.Adapter<Flashdeal_Recycleview_Adapter.MyViewHolder> {

    private List<FlashDeal> lstFlashdeal;
    private Context context;

    public Flashdeal_Recycleview_Adapter(List<FlashDeal> lstFlashdeal, Context context) {
        this.lstFlashdeal = lstFlashdeal;
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
//        FlashDeal.Product product = lstFlashdeal.get(position).getProduct();
//        if(!product.getThumbnail_url().isEmpty()) {
//            Picasso.with(context).load(product.getThumbnail_url()).into(holder.imageView);
//        }else
//            holder.imageView.setImageResource(R.drawable.notfoundimage);
//
//        holder.txtPrice.setText(product.getPrice() + " đ");
    }

    @Override
    public int getItemCount() {
        return lstFlashdeal.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView txtPrice;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.image);
            txtPrice = (TextView)itemView.findViewById(R.id.txtPrice);
        }
    }
}
