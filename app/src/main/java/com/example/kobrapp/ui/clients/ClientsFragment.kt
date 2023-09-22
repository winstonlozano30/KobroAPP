package com.example.kobrapp.ui.clients

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kobrapp.databinding.FragmentClientsBinding

class ClientsFragment : Fragment() {

    private var _binding: FragmentClientsBinding? = null
    private val binding get() = _binding!!

    private lateinit var rvAdapter: ClientAdapter
    private lateinit var clientList : List<Client>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentClientsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        loadClients()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        binding.frameclientsRvClients.layoutManager = layoutManager
        rvAdapter = ClientAdapter(clientList)
        binding.frameclientsRvClients.adapter = rvAdapter

        return root
    }

    private fun loadClients() {
        clientList = listOf(
            Client("Rulo Estrada" , "restrada@gmail.com","3007865789"),
            Client("Anderson Benites" , "abenites@gmail.com","3205452218"),
            Client("Alan Barrios" , "abarrios@gmail.com","3007865789"),
            Client("Gato Blanco" , "gblanco@gmail.com","3205452218"),
            Client("Antena Kanson" , "akanson@gmail.com","3007865789"),
            Client("Winston Rodriguez" , "wrodriguez@gmail.com","3205452218"),
            Client("Gregorio Ruda" , "gruda@gmail.com","3007865789"),
            Client("Sobusa Lozano" , "slozano@gmail.com","3205452218")
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}