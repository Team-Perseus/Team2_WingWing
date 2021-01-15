package com.example.realwing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ScrollActivity extends AppCompatActivity {

    private CprFragment cprFragment;
    private AedFragment aedFragment;
    private FragmentTransaction transaction;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        fragmentManager = getSupportFragmentManager();
        aedFragment = new AedFragment();
        cprFragment = new CprFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, aedFragment).commitAllowingStateLoss();
    }

    public void onClick(View v){
        transaction = fragmentManager.beginTransaction();

        switch (v.getId()){
            case R.id.btn_aed:
                Toast.makeText(this,"aed", Toast.LENGTH_SHORT).show();
                transaction.replace(R.id.frameLayout, aedFragment).commitAllowingStateLoss();
                break;
            case R.id.btn_cpr:
                Toast.makeText(this,"cpr", Toast.LENGTH_SHORT).show();
                transaction.replace(R.id.frameLayout, cprFragment).commitAllowingStateLoss();
                break;
        }
    }
}