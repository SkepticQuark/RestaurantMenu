package com.example.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to determine whether the user is ordering a lunch or dinner meal
    boolean isDinner = false;

    // Variables used to store the users meal selection
    String lunchOption = "",
        drinkOption = "",
        starterOption = "",
        dinnerOption = "",
        dessertOption = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void clearMenuSelection() {
        lunchOption = "";
        drinkOption = "";
        starterOption = "";
        dinnerOption = "";
        dessertOption = "";
    }

    public void setLunchOption(View view) {
        // Clear all menu selections made so far
        clearMenuSelection();

        isDinner = false;

        TextView tv = (TextView) view;
        lunchOption = tv.getText().toString();
        System.out.println("Updated lunchOption text to " + lunchOption);
    }

    public void setDrinkOption(View view) {
        TextView tv = (TextView) view;
        drinkOption = tv.getText().toString();
        System.out.println("Updated lunchOption text to " + drinkOption);
    }

    public void setStarterOption(View view) {
        // Clear all menu selections made so far
        clearMenuSelection();

        isDinner = true;

        TextView tv = (TextView) view;
        starterOption = tv.getText().toString();
        System.out.println("Updated lunchOption text to " + starterOption);
    }

    public void setDinnerOption(View view) {
        TextView tv = (TextView) view;
        dinnerOption = tv.getText().toString();
        System.out.println("Updated lunchOption text to " + dinnerOption);
    }

    public void setDessertOption(View view) {
        TextView tv = (TextView) view;
        dessertOption = tv.getText().toString();
        System.out.println("Updated lunchOption text to " + dessertOption);
    }
}
