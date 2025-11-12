package com.example.linearlayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_click = findViewById(R.id.b_click);
        b_click.setOnClickListener(view -> {
           // Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this,LinearLayout.class);
            startActivity(intent);
        });
    }
}