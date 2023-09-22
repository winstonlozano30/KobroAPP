package com.example.kobrapp.ui.payments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.ItemPaymentBinding

class PaymentAdapter(val paymentList: List<Payment>) : RecyclerView.Adapter<PaymentAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemPaymentBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPaymentBinding.inflate(LayoutInflater.from(parent.context),parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(paymentList[position]){
                binding.cardpaymentsTvDescription.text = this.description
                binding.cardpaymentsTvTotal.text = this.total
                binding.cardpaymentsTvAuthorized.text = this.authorized
            }
        }
    }

    override fun getItemCount(): Int = paymentList.size

}