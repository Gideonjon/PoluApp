package com.polu.polu.fragment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.polu.polu.databinding.FragmentOngoingBinding


class OngoingFragment : Fragment() {
    private var _binding: FragmentOngoingBinding? = null
    private val binding get() = _binding!!

    private var progressStatus = 0
    private var handler = Handler()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentOngoingBinding.inflate(inflater, container, false)

        val view = binding.root


        progressKickstart()




        return view
    }

    private fun progressKickstart() {

        Thread(Runnable {
            while (progressStatus < 62) {
                // update progress status
                progressStatus += 1

                // sleep the thread for 100 milliseconds
                Thread.sleep(1000)

                // update the progress bar
                handler.post {
                    binding.progressBar.progress = progressStatus
                    binding.textView12.text = "$progressStatus min left"
                }
            }
        }).start()
    }
}

