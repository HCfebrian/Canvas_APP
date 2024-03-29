package com.example.canvasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CanvasView customCanvas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customCanvas = findViewById(R.id.signature_canvas);
    }

    public void clearCanvas(View view) {
        customCanvas.clearCanvas();
    }
}