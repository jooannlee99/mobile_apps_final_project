package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    Home home = new Home();
    Hall hall = new Hall();
    Movie movie = new Movie();
    Me me = new Me();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.homebar:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, home).commit();
                        return true;
                    case R.id.hallbar:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, hall).commit();
                        return true;
                    case R.id.moviebar:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, movie).commit();
                        return true;
                    case R.id.mebar:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, me).commit();
                        return true;
                }
                return false;
            }
        });
    }
}