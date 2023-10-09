package com.incava.movieinfoappwithcompose.ui.components.dialog

import androidx.compose.runtime.Composable
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogButton
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogContent
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogText
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogTitle

object DialogPopup


/**
 *  다이얼로그 팝업에서 평점을 가지고 있는 함수
 */

@Composable
fun DialogPopup.Default(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Header(title),
        dialogContent = DialogContent.Default(
            DialogText.Default(
                bodyText
            )
        ),
        buttons = buttons
    )
}