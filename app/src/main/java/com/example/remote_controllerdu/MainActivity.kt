package com.example.remote_controllerdu

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.remote_controllerdu.RV.DetectedTV
import com.example.remote_controllerdu.RV.DetectedTVAdapter

class MainActivity : AppCompatActivity() {
    private val adapter = DetectedTVAdapter(this);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        val btIK = findViewById<Button>(R.id.btIK);
        btIK.setOnClickListener {
            //btIK.setBackgroundColor(Color.parseColor("#FFFFFF"))
            //btIK.setTextColor(Color.parseColor("#EEC843"))
        }
    }

    private fun init(){
        val rcView = findViewById<RecyclerView>(R.id.rc_View);
        rcView.layoutManager = LinearLayoutManager(this@MainActivity)
        adapter.addDetectedTV(DetectedTV("Samsung UE50AU7002U"))
        adapter.addDetectedTV(DetectedTV("Xiaomi Mi TV P1 32"))
        adapter.addDetectedTV(DetectedTV("Sony KD-55X81J"))
        rcView.adapter = adapter
    }
}