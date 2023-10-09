package com.incava.movieinfoappwithcompose.ui.components.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.incava.movieinfoappwithcompose.ui.components.dialog.components.button.DialogButtonsColumn
import com.incava.movieinfoappwithcompose.ui.components.dialog.components.content.DialogContentWrapper
import com.incava.movieinfoappwithcompose.ui.components.dialog.components.title.DialogTitleWrapper
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogButton
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogContent
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogText
import com.incava.movieinfoappwithcompose.ui.models.dialog.DialogTitle
import com.incava.movieinfoappwithcompose.ui.theme.MovieInfoAPPWithComposeTheme
import com.incava.movieinfoappwithcompose.ui.theme.Paddings
import com.incava.movieinfoappwithcompose.ui.theme.color.ColorSet
import com.incava.movieinfoappwithcompose.ui.theme.custumColorScheme

/**
 *  다이얼로그 컴포즈 컴포넌트
 */

@Composable
fun BaseDialogPopup(
    dialogTitle: DialogTitle? = null,
    dialogContent: DialogContent? = null,
    buttons: List<DialogButton>? = null
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = Paddings.none
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.custumColorScheme.background,
        ),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            dialogTitle?.let {
                DialogTitleWrapper(it)
            }
            Column(
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(
                        start = Paddings.xlarge,
                        end = Paddings.xlarge,
                        bottom = Paddings.xlarge
                    )
            ) {
                dialogContent?.let { DialogContentWrapper(it) }
                buttons?.let { DialogButtonsColumn(it) }
            }
        }
    }
}

@Preview
@Composable
fun BaseDialogPreview() {
    MovieInfoAPPWithComposeTheme(myColors = ColorSet.Red) {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("Title"),
            dialogContent = DialogContent.Default(
                DialogText.Default("abcd abcd abcd abcd abcd abcd abcd abcd abcd abcd ")
            ),
            buttons = listOf(
                DialogButton.Secondary("OKAY") {

                },
                DialogButton.UnderlinedText("CANCEL") {

                }
            )
        )
    }
}

@Preview
@Composable
fun BaseDialogPreview2() {
    MovieInfoAPPWithComposeTheme(myColors = ColorSet.Red) {
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
}