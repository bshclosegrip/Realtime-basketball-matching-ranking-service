package com.example.basketmatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView;
    private MediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Bundle bundle = new Bundle();
//        bundle.putString("from Crud1", "홍드로이드 프레그먼트");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Crud1 curd2 = new Crud1();
        Crud1.setArguments(bundle);
        transaction.replace(R.id.frameLayout, Crud2);
        transaction.commit();

    }
}