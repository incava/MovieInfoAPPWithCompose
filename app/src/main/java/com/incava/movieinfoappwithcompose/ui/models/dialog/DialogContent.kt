package com.incava.movieinfoappwithcompose.ui.models.dialog



/**
 *  다이얼로그에 들어갈 컨텐츠 컴포즈 sealed Class
 */

sealed class DialogContent {
    data class Default(
        // 컨텐츠 크기 기본 값
        val dialogText: DialogText.Default
    ): DialogContent()

    data class Large(
        // 컨텐츠 크기를 크게 보여주도록
        val dialogText: DialogText.Default
    ): DialogContent()

    data class Rating(
        val dialogText: DialogText.Rating
    ): DialogContent()
}