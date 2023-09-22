package com.example.kobrapp.ui.advisers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.FragmentAdvisersBinding

class AdvisersFragment : Fragment() {

    private var _binding: FragmentAdvisersBinding? = null
    private val binding get() = _binding!!

    private lateinit var rvAdapter: AdviserAdapter
    private lateinit var adviserList : List<Adviser>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAdvisersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        loadAdvisers()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        binding.frameadvisersRvAdvisers.layoutManager = layoutManager
        rvAdapter = AdviserAdapter(adviserList)
        binding.frameadvisersRvAdvisers.adapter = rvAdapter

        return root
    }

    private fun loadAdvisers() {
        adviserList = listOf(
            Adviser("Asesor 1" , "asesor1@gmail.com", "asesor1"),
            Adviser("Asesor 2" , "asesor2@gmail.com", "asesor2"),
            Adviser("Asesor 3" , "asesor3@gmail.com", "asesor3"),
            Adviser("Asesor 4" , "asesor4@gmail.com", "asesor4"),
            Adviser("Asesor 5" , "asesor5@gmail.com", "asesor5"),
            Adviser("Asesor 6" , "asesor6@gmail.com", "asesor6"),
            Adviser("Asesor 7" , "asesor7@gmail.com", "asesor7"),
            Adviser("Asesor 8" , "asesor8@gmail.com", "asesor8")
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}