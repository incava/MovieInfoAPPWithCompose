package com.incava.movieinfoappwithcompose.ui.components.dialog

import androidx.compose.runtime.Composable
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogButton
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogContent
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogText
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogTitle

/**
 *  다이얼로그 팝업에서 평점을 가지고 있는 함수
 */

@Composable
fun DialogPopup.Rating(
    movieName: String,
    rating: Float,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Large("Title"),
        dialogContent = DialogContent.Rating(
            DialogText.Rating(
                text = "천사와 악마",
                rating = 8.5f
            )
        ),
        buttons = listOf(
            DialogButton.Secondary("OKAY") {

            },
            DialogButton.UnderlinedText("CANCEL") {

            }
        )
    )
}