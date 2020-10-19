package com.example.vendorapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import de.hdodenhof.circleimageview.CircleImageView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    View view;
    CircleImageView profile_pic;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);

        init();

        listeners();

        return view;

    }

    private void listeners() {
        profile_pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ProfileActivity.class));
                //getActivity().finish();
            }
        });
    }

    private void init() {
        profile_pic = view.findViewById(R.id.profile_pic);
    }
}