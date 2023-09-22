package com.example.kobrapp.ui.clients

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.ItemClientBinding

class ClientAdapter(val clientList: List<Client>) : RecyclerView.Adapter<ClientAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemClientBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemClientBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(clientList[position]){
                binding.cardclientTvName.text  = this.name
                binding.cardclientTvAddress.text  = this.email
                binding.cardclientTvPhone.text = this.phone
            }
        }
    }

    override fun getItemCount(): Int = clientList.size
}