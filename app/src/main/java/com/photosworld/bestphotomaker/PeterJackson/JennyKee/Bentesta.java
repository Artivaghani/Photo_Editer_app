package com.photosworld.bestphotomaker.PeterJackson.JennyKee;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.photosworld.bestphotomaker.LocalBaseActivity;
import com.photosworld.bestphotomaker.PeterJackson.AnthonyPittorino.NevilleQuist;
import com.photosworld.bestphotomaker.R;

public class Bentesta extends LocalBaseActivity {


    public static AppCompatActivity activity;

    public static void startWithUri(Context context, Uri _uri) {
        Intent intent = new Intent(context, Bentesta.class);
        intent.setData(_uri);
        context.startActivity(intent);
//        activity.overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }

    @Override
    public void onBackPressed() {

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.MainContainer);
//        super.onBackPressed();
        if (fragment instanceof NevilleQuist) {
            NevilleQuist.ManageBackpraced();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        activity = Bentesta.this;

        FragmentManager fragmentManager = getSupportFragmentManager();
        NevilleQuist blankFragment = new NevilleQuist();
        fragmentManager.beginTransaction().replace(R.id.MainContainer, blankFragment).addToBackStack(null).commit();

    }
}
