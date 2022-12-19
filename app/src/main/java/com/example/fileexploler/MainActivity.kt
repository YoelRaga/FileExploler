package com.example.fileexploler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MaterialButton storageBtn = findViewById(R.id.storage_btn);


    }

    private void requestPermission(){
        ActivityCompat.requestPermissions(activity: Main)
    }
}