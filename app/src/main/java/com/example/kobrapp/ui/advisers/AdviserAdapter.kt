package com.example.kobrapp.ui.advisers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.ItemAdviserBinding

class AdviserAdapter(val adviserList: List<Adviser>) : RecyclerView.Adapter<AdviserAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemAdviserBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdviserAdapter.ViewHolder {
        val binding = ItemAdviserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdviserAdapter.ViewHolder, position: Int) {
        with(holder){
            with(adviserList[position]){
                binding.cardadviserTvName.text  = this.name
                binding.cardadviserTvEmail.text  = this.email
                binding.cardadviserTvUser.text = this.user
            }
        }
    }

    override fun getItemCount(): Int = adviserList.size

}