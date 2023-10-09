package com.incava.movieinfoappwithcompose.ui.components.movie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 *  영화 아이템을 가지고 있는 컴포저블 파일
 */

private val CARD_WIDTH = 150.dp

@Composable
fun MovieItem() {
    // 영화 아이템을 그린 컴포저블 컴포넌트
    Column(
        modifier = Modifier
            .width(CARD_WIDTH)
            .padding(10.dp)
    ) {
        // 영화 포스터
        Poster(
            modifier = Modifier
                .width(CARD_WIDTH)
        )
        // 제목
        Text(
            text = "콘크리트 유토피아",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(
                top = 11.dp
            ),
        )
        // 평점
        Row(
            modifier = Modifier.padding(
                vertical = 10.dp
            ),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                modifier = Modifier
                    .size(24.dp)
                    .padding(4.dp),
                imageVector = Icons.Filled.Star,
                tint = Color.Black.copy(
                    alpha = 0.5f
                ),
                contentDescription = "평점",
            )
            Text(
                text = "5.0"
            )
        }

    }
}

@Composable
fun Poster(
    modifier: Modifier
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)

    ) {
        Box(
            modifier = Modifier.background(Color.Blue)
        )
    }
}

@Preview
@Composable
fun MovieItemPreview(){
    MovieItem()
}
