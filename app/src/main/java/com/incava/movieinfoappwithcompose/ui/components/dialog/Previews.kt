package com.incava.movieinfoappwithcompose.ui.components.dialog

import android.app.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.incava.movieinfoappwithcompose.R
import com.incava.movieinfoappwithcompose.ui.models.button.LeadingIconData
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogButton
import com.incava.movieinfoappwithcompose.ui.theme.MovieInfoAPPWithComposeTheme
import com.incava.movieinfoappwithcompose.ui.theme.color.ColorSet

/**
 * 프리뷰를 모아 놓은 파일
 */

@Preview
@Composable
fun AlertPreview(){
    MovieInfoAPPWithComposeTheme(myColors = ColorSet.Red) {
        DialogPopup.Alert(
            title = "Title" ,
            bodyText = "abcddd abcddd abcddd ",
            buttons = listOf(
                DialogButton.Primary("Okay"){

                }
            )
        )
    }
}

@Preview
@Composable
fun DefaultPreview(){
    MovieInfoAPPWithComposeTheme(myColors = ColorSet.Red) {
        DialogPopup.Default(
            title = "Title" ,
            bodyText = "abcddd abcddd abcddd ",
            buttons = listOf(
                DialogButton.Primary("Okay"){

                }
            )
        )
    }
}

@Preview
@Composable
fun RatingPreview() {
    MovieInfoAPPWithComposeTheme(myColors = ColorSet.Red) {
        DialogPopup.Rating(
            movieName = "The Lord of the Rings: The Two Towers",
            rating = 7.5f,
            buttons = listOf(
                DialogButton.Primary(
                    title = "OPEN",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.ic_send,
                        iconContentDescription = null,

                    )
                ) {},
                DialogButton.SecondaryBorderless("CANCEL") {}
            )
        )
    }
}