package com.incava.movieinfoappwithcompose.ui.components.movie.buttons


import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.incava.movieinfoappwithcompose.ui.theme.Paddings
import com.incava.movieinfoappwithcompose.ui.theme.custumColorScheme

@Composable
fun UnderlinedTextButton(
    modifier: Modifier = Modifier,
    @StringRes id: Int? = null,
    text: String = "",
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.custumColorScheme.onSecondary,
            contentColor = MaterialTheme.custumColorScheme.onSurface,
            disabledContainerColor = MaterialTheme.colorScheme.background,
            disabledContentColor = MaterialTheme.custumColorScheme.onSurface,
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = id?.let { stringResource(id = id) } ?: text,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(Paddings.small))
        }

    }
}

@Preview
@Composable
fun UnderlinedTextButtonPreview() {
    UnderlinedTextButton(text = "SUBMIT") {

    }
}