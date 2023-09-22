package com.example.kobrapp.ui.credits

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.FragmentCreditsBinding

class CreditsFragment : Fragment() {

    private var _binding: FragmentCreditsBinding? = null
    private val binding get() = _binding!!

    private lateinit var rvAdapter: CreditAdapter
    private lateinit var creditList : List<Credit>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCreditsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        loadCredits()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        binding.framecreditsRvCredits.layoutManager = layoutManager
        rvAdapter = CreditAdapter(creditList)
        binding.framecreditsRvCredits.adapter = rvAdapter

        return root
    }

    private fun loadCredits() {
        creditList = listOf(
            Credit("Camilo Cifuentes", "#0001","Cra 36 #35 - 20","3004245637", "01/02/2023","$10000","$250000"),
            Credit("Maria Perez", "#0002","Cll 36 #22 - 08","3160424563", "01/02/2023","$20000","$260000"),
            Credit("Pedro Flores", "#0003","Cra 16 #18 - 15","3044245456", "01/02/2023","$30000","$350000"),
            Credit("Mauricio Peralta", "#0004","Cra 06 #77 - 50","3104245123", "01/02/2023","$40000","$550000"),
            Credit("Carlos Lozano", "#0005","Cll 33 #11 - 20","3004245622", "01/02/2023","$5000","$650000"),
            Credit("Martha Bermudez", "#0006","Cra 10 #18 - 10","3144267644", "01/02/2023","$10000","$580000"),
            Credit("Sofia Camargo", "#0007","Cra 29 #22 - 67","3164248837", "01/02/2023","$120000","$9000000")
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}