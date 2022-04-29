package com.example.counterandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.counterandroidapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //default counter value is 0;
        binding.counterId.setText("0"); 
        binding.increaseBtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = Integer.valueOf(binding.counterId.getText().toString()) + 1;
                binding.counterId.setText(String.valueOf(i));
            }
        });
    }
}