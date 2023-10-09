package com.incava.movieinfoappwithcompose.ui.models.dialog



/**
 *  다이얼로그에 들어갈 제목 컴포즈 sealed Class
 */

sealed class DialogTitle(
    open val text: String
) {
    data class Default(
        // 컨텐츠 크기 기본 값
        override val text: String
    ) : DialogTitle(text)

    data class Header(
        override val text: String
    ) : DialogTitle(text)

    data class Large(
        // 컨텐츠 크기를 크게 보여주도록
        override val text: String
    ) : DialogTitle(text)

}