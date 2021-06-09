package com.photosworld.bestphotomaker.RuthTarvydas.EricaWarde;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.photosworld.bestphotomaker.DovCharney.DeanandDanCaten;
import com.photosworld.bestphotomaker.DovCharney.PatrickCox;
import com.photosworld.bestphotomaker.KayCohen.SusienChong;
import com.photosworld.bestphotomaker.R;
import com.photosworld.bestphotomaker.RuthTarvydas.AhedZanetti.VeroniqueBranquinho;

import java.util.ArrayList;

public class BowieWong extends RecyclerView.Adapter<BowieWong.MyViewHolder> {

    public ArrayList<SusienChong> dataSet;
    private Context mContext;

    DeanandDanCaten appPrefs;

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewIcon;

        FrameLayout LL_Progress;

        public MyViewHolder(final View itemView) {
            super(itemView);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imgPIPFramePreview);
        }
    }
    public BowieWong(ArrayList<SusienChong> data, Context mContext) {
        this.dataSet = data;
        this.mContext = mContext;
        appPrefs = new DeanandDanCaten(mContext);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        holder.imageViewIcon.setTag("" + listPosition);
        holder.imageViewIcon.setColorFilter(R.color.black);

        holder.imageViewIcon.setImageBitmap(PatrickCox.getBitmapFromAsset(dataSet.get(listPosition).getDirName(), mContext));

        holder.imageViewIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int pos = Integer.parseInt(v.getTag().toString());

                    Bitmap bitmap = PatrickCox.getBitmapFromAsset(dataSet.get(pos).getDirName(), mContext);
                    VeroniqueBranquinho.AddSticker(bitmap);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_filter_abc_card_row, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }


}

