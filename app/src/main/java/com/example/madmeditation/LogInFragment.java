package com.example.madmeditation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogInFragment extends Fragment {

    EditText etEmail, etPassword;
    Button btn_enter;
    TextView link_reg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_log_in, container, false);
        etEmail = view.findViewById(R.id.et_email);
        etPassword = view.findViewById(R.id.et_password);
        btn_enter = view.findViewById(R.id.btn_enter_li);
        link_reg = view.findViewById(R.id.link_reg_li);
        link_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().
                        beginTransaction().
                        addToBackStack(null).
                        replace(R.id.start_activity, new RegistrationFragment()).commit();
            }
        });
        btn_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etEmail.getText().toString().isEmpty()){
                    if (!etPassword.getText().toString().isEmpty()){
                        if (etPassword.getText().toString().contains("@")){

                        }
                        else {
                            Toast.makeText(getActivity(), "Email неправильного формата",Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        Toast.makeText(getActivity(), "Заполните пароль",Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getActivity(), "Заполните email",Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }
}