package com.polu.polu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codebyashish.autoimageslider.Enums.ImageActionTypes
import com.codebyashish.autoimageslider.Enums.ImageAnimationTypes
import com.codebyashish.autoimageslider.Enums.ImageScaleType
import com.codebyashish.autoimageslider.Interfaces.ItemsListener
import com.codebyashish.autoimageslider.Models.ImageSlidesModel
import com.polu.polu.databinding.FragmentOnboardingScreenBinding


class OnboardingScreen : Fragment(), ItemsListener {
    private var listener: ItemsListener? = null
    private var _binding: FragmentOnboardingScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment7

        _binding = FragmentOnboardingScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        listener = this

        val autoImageList: ArrayList<ImageSlidesModel> = ArrayList()

        // find and initialize ImageSlider
        val autoImageSlider = binding.imageSlider

        // add some imagees or titles (text) inside the imagesArrayList
        autoImageList.add(ImageSlidesModel(R.drawable.imgone, ""))
        autoImageList.add(ImageSlidesModel(R.drawable.imagetwo, ""))
        autoImageList.add(ImageSlidesModel(R.drawable.imagethree, ""))

        // set the added images inside the AutoImageSlider
        autoImageSlider.setImageList(autoImageList, ImageScaleType.FIT)

        // set any default animation or custom animation (setSlideAnimation(ImageAnimationTypes.ZOOM_IN))
        autoImageSlider.setSlideAnimation(ImageAnimationTypes.DEPTH_SLIDE)

        // handle click event on item click
        autoImageSlider.onItemClickListener(listener)



        return view
    }

    override fun onItemChanged(position: Int) {


    }

    override fun onItemClicked(position: Int) {


    }

    override fun onTouched(actionTypes: ImageActionTypes?, position: Int) {


    }


}