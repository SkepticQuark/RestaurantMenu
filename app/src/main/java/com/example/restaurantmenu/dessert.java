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


public class dessert extends Fragment {

    public dessert() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dessert, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        Button button1 = view.findViewById(R.id.dsf_menu_option1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDessertOption(v);
                Navigation.findNavController(v).navigate(R.id.action_dessert_to_drink);
            }
        });

        Button button2 = view.findViewById(R.id.dsf_menu_option2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDessertOption(v);
                Navigation.findNavController(v).navigate(R.id.action_dessert_to_drink);
            }
        });

        Button button3 = view.findViewById(R.id.dsf_menu_option3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDessertOption(v);
                Navigation.findNavController(v).navigate(R.id.action_dessert_to_drink);
            }
        });
    }

    private void setDessertOption(View v) {
        MainActivity ma = (MainActivity) getActivity();
        TextView tv = (TextView) v;
        ma.dessertOption = tv.getText().toString();
    }
}
