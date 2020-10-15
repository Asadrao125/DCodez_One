package com.example.vendorapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import de.hdodenhof.circleimageview.CircleImageView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class HomeFragment extends Fragment {
    View view;
    CircleImageView profile_pic;
    Button btn_e_wallet, btn_transaction_pin, btn_activity_log, btn_logout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        init();

        listeners();

        return view;

    }

    private void listeners() {
        btn_e_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "E-Wallet", Toast.LENGTH_SHORT).show();
            }
        });
        btn_activity_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Activity Log", Toast.LENGTH_SHORT).show();
            }
        });
        btn_transaction_pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Transaction Pin", Toast.LENGTH_SHORT).show();
            }
        });
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Logout", Toast.LENGTH_SHORT).show();
            }
        });
        profile_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Profile Picture", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void init() {
        btn_e_wallet = view.findViewById(R.id.btn_e_wallet);
        btn_transaction_pin = view.findViewById(R.id.btn_transaction_pin);
        btn_activity_log = view.findViewById(R.id.btn_activity_log);
        btn_logout = view.findViewById(R.id.btn_logout);
        profile_pic = view.findViewById(R.id.profile_pic);
    }
}