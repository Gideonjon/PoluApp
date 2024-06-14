package com.polu.polu

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.polu.polu.databinding.FragmentSplashScreenBinding


class SplashScreen : Fragment() {
    private var _binding: FragmentSplashScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        Handler().postDelayed({
            zoomOut()
            Navigation.findNavController(view)
                .navigate(R.id.action_splashScreen_to_logoPresentation)
        }, 3000)






        return view
    }

    private fun zoomOut() {
        val animationZoomOut = AnimationUtils.loadAnimation(requireContext(), R.anim.zoom_out)
        binding.imageView.startAnimation(animationZoomOut)
    }


}