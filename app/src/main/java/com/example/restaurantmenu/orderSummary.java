package com.example.restaurantmenu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class orderSummary extends Fragment {

    public orderSummary() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order_summary, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button homeBtn = view.findViewById(R.id.osf_back_home_button);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_orderSummary_to_home3);
            }
        });
    }

    @Override
    public void onActivityCreated (Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        // Load order values into textviews
        MainActivity activity = (MainActivity) getActivity();

        // Drink
        TextView drink = getView().findViewById(R.id.drink_order);
        drink.setText(activity.drinkOption);

        if(!activity.isDinner) {
            // Lunch
            TextView lunch = getView().findViewById(R.id.lunch_order);
            lunch.setText(activity.lunchOption);
        } else {
            // Dinner
            TextView starter = getView().findViewById(R.id.starter_order);
            starter.setText(activity.starterOption);

            TextView dinner = getView().findViewById(R.id.dinner_order);
            dinner.setText(activity.dinnerOption);

            TextView dessert = getView().findViewById(R.id.dessert_order);
            dessert.setText(activity.dessertOption);
        }
    }
}
