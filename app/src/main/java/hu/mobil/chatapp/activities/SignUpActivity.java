package hu.mobil.chatapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hu.mobil.chatapp.R;
import hu.mobil.chatapp.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.textLogin.setOnClickListener(v -> onBackPressed());
    }

}