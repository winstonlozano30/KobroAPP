package com.example.kobrapp.ui.payments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.FragmentPaymentsBinding

class PaymentsFragment : Fragment() {

    private var _binding: FragmentPaymentsBinding? = null
    private val binding get() = _binding!!

    private lateinit var rvAdapter: PaymentAdapter
    private lateinit var paymentList: List<Payment>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPaymentsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        loadPayments()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        binding.framepaymentsRvPayments.layoutManager = layoutManager
        rvAdapter = PaymentAdapter(paymentList)
        binding.framepaymentsRvPayments.adapter = rvAdapter

        return root
    }

    private fun loadPayments() {
        paymentList = listOf(
            Payment("Gasolina", "$50000", "Asesor 1"),
            Payment("Aceite Moto", "$60000", "Asesor 2"),
            Payment("Aceite Moto", "$70000", "Asesor 1")
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}