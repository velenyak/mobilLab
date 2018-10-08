package com.bme.janosvelenyak.mobillab.ui.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bme.janosvelenyak.mobillab.R;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002Data;
import com.bme.janosvelenyak.mobillab.model.orm.FavouriteGif;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by janosvelenyak on 2018. 05. 25..
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<InlineResponse2002Data> gifs;
    private Context context;

    private final ViewHolder.ClickHandler clickHandler;

    public RecyclerViewAdapter(Context context, List<InlineResponse2002Data> gifs, ViewHolder.ClickHandler clickHandler) {
        this.context = context;
        this.gifs = gifs;
        this.clickHandler = clickHandler;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View gifView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_layout, parent, false);
        return new ViewHolder(gifView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        InlineResponse2002Data data = gifs.get(position);
        holder.clickHandler = clickHandler;
        Glide.with(context).load(data.getImages().getOriginal().getUrl()).into(holder.gif);
    }

    @Override
    public int getItemCount() {
        return gifs.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView gif;
        public Button favBtn;

        private ClickHandler clickHandler;

        public ViewHolder(View itemView) {
            super(itemView);
            gif = (ImageView) itemView.findViewById(R.id.gif);
            favBtn = (Button) itemView.findViewById(R.id.fav);
            favBtn.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (clickHandler != null) {
                clickHandler.onBtnClicked(getAdapterPosition());
            }
        }

        protected interface ClickHandler {
            void onBtnClicked(final int position);
        }

    }
}
