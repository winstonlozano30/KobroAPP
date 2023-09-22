package com.example.kobrapp.ui.boxes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.ItemBoxBinding

class BoxAdapter(val boxList: List<Box>) : RecyclerView.Adapter<BoxAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemBoxBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoxAdapter.ViewHolder {
        val binding = ItemBoxBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BoxAdapter.ViewHolder, position: Int) {
        with(holder){
            with(boxList[position]){
                binding.cardboxTvName.text  = this.name
                binding.cardboxTvId.text  = this.id
            }
        }
    }

    override fun getItemCount(): Int = boxList.size

}