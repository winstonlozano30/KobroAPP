package com.example.kobrapp.ui.logout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kobrapp.R

class LogoutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_logout, container, false)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}