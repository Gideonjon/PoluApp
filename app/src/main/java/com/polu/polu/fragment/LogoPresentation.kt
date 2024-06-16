package com.polu.polu.fragment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.polu.polu.R
import com.polu.polu.databinding.FragmentLogoPresentationBinding


class LogoPresentation : Fragment() {
    private var _binding: FragmentLogoPresentationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentLogoPresentationBinding.inflate(inflater, container, false)
        val view = binding.root

        Handler().postDelayed({
            Navigation.findNavController(view)
                .navigate(R.id.action_logoPresentation_to_onboardingScreen)
        }, 3000)


        return view
    }


}