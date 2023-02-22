package com.example.myhealthv0.ui.medoc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myhealthv0.databinding.FragmentMedocBinding
import com.example.myhealthv0.ui.donnee.NotificationsViewModel

class MedocFragment  : Fragment() {


    private var _binding: FragmentMedocBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentMedocBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMedoc
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}