package com.incava.movieinfoappwithcompose.ui.components.dialog

import androidx.compose.runtime.Composable
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogButton
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogContent
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogText
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogTitle

/**
 *  다이얼로그 팝업에서 알림 함수
 */

@Composable
fun DialogPopup.Alert(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Header(title),
        dialogContent = DialogContent.Large(
            DialogText.Default(
                bodyText
            )
        ),
        buttons = buttons
    )
}