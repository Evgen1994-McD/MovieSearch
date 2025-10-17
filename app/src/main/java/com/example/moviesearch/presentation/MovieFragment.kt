package com.example.moviesearch.presentation

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.compose.ui.platform.ComposeView
import com.example.moviesearch.R
import com.example.moviesearch.presentation.screens.MoviesScreen
import com.example.moviesearch.presentation.viewmodel.MoviesViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MovieFragment(

) : Fragment(

) {


    private val viewModel: MoviesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Используем setContent для установки состава Compose
        requireActivity().window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        return ComposeView(requireContext()).apply {
            setContent {
                MoviesScreen(
                    onMovieClick = onMovieClick,
                    viewModel
                )
            }
        }
    }
}