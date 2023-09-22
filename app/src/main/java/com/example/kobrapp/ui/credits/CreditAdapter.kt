package com.example.kobrapp.ui.credits

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.ItemCreditBinding

class CreditAdapter(val creditList: List<Credit>) : RecyclerView.Adapter<CreditAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemCreditBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCreditBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(creditList[position]){
                binding.cardcreditTvName.text  = this.name
                binding.cardcreditTvCredit.text  = this.credit
                binding.cardcreditTvAddress.text  = this.address
                binding.cardcreditTvPhone.text  = this.phone
                binding.cardcreditTvDate.text  = this.date
                binding.cardcreditTvFee.text  = this.fee
                binding.cardcreditTvTotal.text = this.total
            }
        }
    }

    override fun getItemCount(): Int = creditList.size
}