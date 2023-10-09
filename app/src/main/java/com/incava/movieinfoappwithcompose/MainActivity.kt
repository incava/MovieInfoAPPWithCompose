package com.incava.movieinfoappwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.incava.movieinfoappwithcompose.ui.theme.MovieInfoAPPWithComposeTheme
import com.incava.movieinfoappwithcompose.ui.theme.color.ColorSet
import com.incava.movieinfoappwithcompose.ui.theme.color.MyColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieInfoAPPWithComposeTheme(myColors = ColorSet.Red){
                Surface(

                ) {

                }

            }
        }
    }
}