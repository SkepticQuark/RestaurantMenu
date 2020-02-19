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


public class dinner extends Fragment {

    public dinner() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dinner, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        Button button1 = view.findViewById(R.id.df_button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDinnerOption(v);
                Navigation.findNavController(v).navigate(R.id.action_dinner_to_dessert);
            }
        });

        Button button2 = view.findViewById(R.id.df_button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDinnerOption(v);
                Navigation.findNavController(v).navigate(R.id.action_dinner_to_dessert);
            }
        });

        Button button3 = view.findViewById(R.id.df_button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDinnerOption(v);
                Navigation.findNavController(v).navigate(R.id.action_dinner_to_dessert);
            }
        });
    }

    private void setDinnerOption(View v) {
        MainActivity ma = (MainActivity) getActivity();
        TextView tv = (TextView) v;
        ma.dinnerOption = tv.getText().toString();
    }
}
