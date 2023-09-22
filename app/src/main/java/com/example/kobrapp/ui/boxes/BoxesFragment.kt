package com.example.kobrapp.ui.boxes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.FragmentBoxesBinding

class BoxesFragment : Fragment() {

    private var _binding: FragmentBoxesBinding? = null
    private val binding get() = _binding!!

    private lateinit var rvAdapter: BoxAdapter
    private lateinit var boxList : List<Box>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBoxesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        loadBoxes()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        binding.frameboxesRvBoxes.layoutManager = layoutManager
        rvAdapter = BoxAdapter(boxList)
        binding.frameboxesRvBoxes.adapter = rvAdapter

        return root
    }

    private fun loadBoxes() {
        boxList = listOf(
            Box("Caja Barranquilla","#1001"),
            Box("Caja Soledad","#1002"),
            Box("Caja Puerto Colombia","#1003")
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}