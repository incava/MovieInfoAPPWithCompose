package com.incava.movieinfoappwithcompose.features.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.incava.movieinfoappwithcompose.ui.theme.MovieInfoAPPWithComposeTheme

class FeedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                MovieInfoAPPWithComposeTheme {
                    Text("FeedFragment")
                }
            }
        }
    }
}