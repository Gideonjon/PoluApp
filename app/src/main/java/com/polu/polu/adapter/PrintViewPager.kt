package com.polu.polu.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.polu.polu.fragment.CompletedFragment
import com.polu.polu.fragment.OngoingFragment
import com.polu.polu.fragment.ToprintFagment

class PrintViewPager(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) :
    FragmentStateAdapter(fragmentManager, lifecycle) {


    override fun getItemCount(): Int {

        return 3

    }

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> ToprintFagment()
            1 -> OngoingFragment()
            else -> CompletedFragment()

        }
    }
}