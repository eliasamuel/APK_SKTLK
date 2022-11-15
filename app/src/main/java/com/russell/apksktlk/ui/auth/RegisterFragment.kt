package com.russell.apksktlk.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.russell.apksktlk.R
import com.russell.apksktlk.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    // val TAG: String = "RegisterFragment"
    private lateinit var binding: FragmentRegisterBinding
    //val viewModel: AuthViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvToLogin.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }

    }


      //  viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)

}