package com.enaitzdam.explicacio_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enaitzdam.explicacio_fragments.databinding.FragmentFinalBinding
import com.enaitzdam.explicacio_fragments.databinding.FragmentPrimerBinding


class FinalFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFinalBinding.inflate(inflater)

        return binding.root
    }


}