package com.incava.movieinfoappwithcompose.ui.components.dialog.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.incava.movieinfoappwithcompose.ui.components.movie.buttons.PrimaryButton
import com.incava.movieinfoappwithcompose.ui.components.movie.buttons.SecondaryButton
import com.incava.movieinfoappwithcompose.ui.components.movie.buttons.UnderlinedTextButton
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogButton
import com.incava.movieinfoappwithcompose.ui.theme.Paddings

/**
 * 다이얼로그 종류에 따른 버튼 컴포넌트
 */


@Composable
fun DialogButtonsColumn(
    buttons: List<DialogButton>?
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        buttons?.forEachIndexed { index, dialogButton ->
            if (index > 0) {
                Spacer(modifier = Modifier.height(Paddings.large))
            }
            when (dialogButton) {
                is DialogButton.Primary -> {
                    PrimaryButton(
                        text = dialogButton.title,
                        leadingIconData = dialogButton.leadingIconData
                    ) {
                        // invoke는 실행을 의미
                        dialogButton.action?.invoke()
                    }
                }

                is DialogButton.Secondary -> {
                    SecondaryButton(
                        text = dialogButton.title,
                    ) { dialogButton.action?.invoke() }
                }

                is DialogButton.SecondaryBorderless -> {
                    UnderlinedTextButton(
                        text = dialogButton.title,
                    ) { dialogButton.action?.invoke() }
                }

                is DialogButton.UnderlinedText -> {
                    UnderlinedTextButton(
                        text = dialogButton.title,
                    ) { dialogButton.action?.invoke() }
                }
            }
        }
    }
}