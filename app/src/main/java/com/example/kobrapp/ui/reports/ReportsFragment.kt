package com.example.kobrapp.ui.reports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.FragmentReportsBinding

class ReportsFragment : Fragment() {

    private var _binding: FragmentReportsBinding? = null
    private val binding get() = _binding!!

    private lateinit var rvAdapter : ReportAdapter
    private lateinit var reportList: List<Report>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReportsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        loadReports()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        binding.framereportsRvReports.layoutManager = layoutManager
        rvAdapter = ReportAdapter(reportList)
        binding.framereportsRvReports.adapter = rvAdapter

        return root
    }

    private fun loadReports() {
        reportList = listOf(
            Report("Cierre de Caja"),
            Report("Reporte de Clientes")
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}