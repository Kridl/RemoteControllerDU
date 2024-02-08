package com.example.remote_controllerdu.RV

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.remote_controllerdu.R

class DetectedTVAdapter(context: Context): RecyclerView.Adapter<DetectedTVAdapter.DetectedTVHolder>() {
    val listTV = ArrayList<DetectedTV>();
    val context = context
    class DetectedTVHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val titleTV = itemView.findViewById<TextView>(R.id.titleTV);
        fun bind(detectedTV: DetectedTV){
            titleTV.text = detectedTV.title;
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetectedTVHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detected_tv_item, parent, false);
        return DetectedTVHolder(view);
    }

    override fun getItemCount(): Int {
        return listTV.size;
    }

    override fun onBindViewHolder(holder: DetectedTVHolder, position: Int) {
        holder.bind(listTV[position]);
    }

    fun addDetectedTV(detectedTV: DetectedTV){
        listTV.add(detectedTV);
        notifyDataSetChanged();
    }
}