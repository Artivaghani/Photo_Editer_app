package com.photosworld.bestphotomaker.Cantista;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.photosworld.bestphotomaker.ClaudiaChanShaw.LindaBritten;
import com.photosworld.bestphotomaker.DovCharney.DeanandDanCaten;
import com.photosworld.bestphotomaker.DovCharney.PatrickCox;
import com.photosworld.bestphotomaker.DovCharney.SimonChang;
import com.photosworld.bestphotomaker.JuliGrbac.FrederickFox.AlannahHill;
import com.photosworld.bestphotomaker.R;


public class Lajavab extends Activity {

    AlannahHill cd;

    public static String name = "";
    DeanandDanCaten objPref;
    LindaBritten objDb;
    private boolean isFirstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        objPref = new DeanandDanCaten(Lajavab.this);
        PatrickCox.SDCardPath = objPref.getSaveDirURL();
        cd = new AlannahHill(this);
        objDb = new LindaBritten(Lajavab.this);


        new BASE_AGREEMENT_CIPHER().execute();
        try {
            if (cd.isConnectingToInternet()) {
                Log.e("Service", "Started from splash");
            } else {

            }
            callHome();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public class BASE_AGREEMENT_CIPHER extends AsyncTask<Void, Integer, String> {

        @Override
        protected String doInBackground(Void... params) {
            try {
                SimonChang.CIPHER_TO_DHKEY_AGREEMENT_256BIT_KEYGENERATOR("oauthentication_base64_hash64", "MODE_BASE_24_PRIVATE", getApplicationContext());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }


    public void callHome() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (isFirstTime) {
                    isFirstTime = false;
                    Intent localIntent = new Intent(Lajavab.this, Mantid.class);
                    Lajavab.this.startActivity(localIntent);
                    finish();
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
            }
        }, 500);
    }



}
