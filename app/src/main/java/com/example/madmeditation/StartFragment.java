package com.example.madmeditation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class StartFragment extends Fragment {

    Button btn_enter;
    TextView link_reg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_start, container, false);
        btn_enter = view.findViewById(R.id.btn_enter_sa);
        link_reg = view.findViewById(R.id.link_reg_sa);
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().
                        beginTransaction().
                        addToBackStack(null).
                        replace(R.id.start_activity, new LogInFragment()).commit();
            }
        });
        link_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().
                        beginTransaction().
                        addToBackStack(null).
                        replace(R.id.start_activity, new RegistrationFragment()).commit();
            }
        });
        return view;
    }
}