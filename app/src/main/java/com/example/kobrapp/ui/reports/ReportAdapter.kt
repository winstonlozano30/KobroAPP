package com.example.kobrapp.ui.reports

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.ItemReportBinding

class ReportAdapter(val reportList:List<Report>) : RecyclerView.Adapter<ReportAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemReportBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemReportBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(reportList[position]){
                binding.cardreportsTvName.text = this.name
            }
        }
    }

    override fun getItemCount(): Int = reportList.size

}