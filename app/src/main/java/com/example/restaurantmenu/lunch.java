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


/**
 * A simple {@link Fragment} subclass.
 */
public class lunch extends Fragment {


    public lunch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lunch, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        Button button1 = view.findViewById(R.id.lunchMenu1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLunchOption(v);
                Navigation.findNavController(v).navigate(R.id.action_lunch4_to_drink);
            }
        });

        Button button2 = view.findViewById(R.id.lunchMenu2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLunchOption(v);
                Navigation.findNavController(v).navigate(R.id.action_lunch4_to_drink);
            }
        });

        Button button3 = view.findViewById(R.id.lunchMenu3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLunchOption(v);
                Navigation.findNavController(v).navigate(R.id.action_lunch4_to_drink);
            }
        });
    }

    private void setLunchOption(View v) {
        MainActivity ma = (MainActivity) getActivity();
        TextView tv = (TextView) v;
        ma.lunchOption = tv.getText().toString();
    }
}
