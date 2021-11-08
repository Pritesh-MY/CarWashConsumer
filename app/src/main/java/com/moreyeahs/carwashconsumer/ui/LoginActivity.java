package com.moreyeahs.carwashconsumer.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.moreyeahs.carwashconsumer.R;
import com.moreyeahs.carwashconsumer.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        initViews();
    }

    private void initViews() {

        binding.btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(this, DashboardActivity.class));
        });

        binding.tvForgotPassword.setOnClickListener(v -> {
            startActivity(new Intent(this, DashboardActivity.class));
        });
    }

}