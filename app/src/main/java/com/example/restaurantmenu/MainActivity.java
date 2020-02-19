package com.example.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to determine whether the user is ordering a lunch or dinner meal
    boolean isDinner = false;

    // Variables used to store the users meal selection
    String lunchOption, drinkOption, starterOption, dinnerOption, dessertOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearMenuSelection() {
        lunchOption = "No Order Placed";
        drinkOption = "No Order Placed";
        starterOption = "No Order Placed";
        dinnerOption = "No Order Placed";
        dessertOption = "No Order Placed";
        isDinner = false;
    }
}
