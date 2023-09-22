package com.example.kobrapp.ui.income

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.kobrapp.databinding.FragmentIncomeBinding

class IncomeFragment : Fragment() {

    private var _binding: FragmentIncomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val incomeViewModel =
            ViewModelProvider(this).get(IncomeViewModel::class.java)

        _binding = FragmentIncomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textIncome
        incomeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}