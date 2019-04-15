package com.yesia.fisikaku.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yesia.fisikaku.Model.FisikaItem;
import com.yesia.fisikaku.R;

import java.util.List;

public class AdapterFisika extends RecyclerView.Adapter<AdapterFisika.ViewHolder> {
    int nomor;
    Context ctx;

    List<FisikaItem> ListFisikaItem;

    public AdapterFisika(Context ctx, List<FisikaItem> listDataMovie) {
        this.ctx = ctx;
        ListFisikaItem = listDataMovie;
    }

    @NonNull
    @Override
    public AdapterFisika.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(ctx).inflate(R.layout.activity_hukum_satu, viewGroup, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFisika.ViewHolder viewHolder, int i) {

        final String text = ListFisikaItem.get(i).getMateri();
        final String imageRumus = ListFisikaItem.get(i).getGambarRumus();


//        Picasso.get().load(imageRumus).into(viewHolder.imageView);
        viewHolder.tvText.setText(text);


    }

    @Override
    public int getItemCount() {
        if (ListFisikaItem == null)
            return 0;
        return ListFisikaItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvText;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_rumus_first);
            tvText = itemView.findViewById(R.id.tv_content_detail);
        }
    }
}
