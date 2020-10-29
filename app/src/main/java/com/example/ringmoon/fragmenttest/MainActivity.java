package com.example.ringmoon.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private Fragment f1 ;
    private Fragment f2  ;
    private Fragment f3 ;
    private Fragment f4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
    }
}