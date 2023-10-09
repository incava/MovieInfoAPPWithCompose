package com.incava.movieinfoappwithcompose.ui.components.movie

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.incava.movieinfoappwithcompose.ui.theme.Paddings


@Composable
fun CategoryRow() {
    // 영화의 카테고리 별 vertical RecyclerView구현
    Column() {
        CategoryTitle("Action")
        LazyRow(
            contentPadding = PaddingValues(
                horizontal = Paddings.large
            )
        ) {
            // Todo  itemsIndexed()사용 해야함.
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
        }
    }
}


@Composable
fun CategoryTitle(s: String) {
    Text(
        text = "Action",
        modifier = Modifier.padding(PaddingValues(Paddings.large))
    )
}

@Preview
@Composable
fun CategoryRowPreview() {
    CategoryRow()
}
