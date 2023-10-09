package com.incava.movieinfoappwithcompose.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.incava.movieinfoappwithcompose.ui.theme.color.ColorSet
import com.incava.movieinfoappwithcompose.ui.theme.color.MyColors

private val LocalColors = staticCompositionLocalOf { ColorSet.Red.LightColorScheme }

@Composable
fun MovieInfoAPPWithComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    myColors: ColorSet,
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        // Todo 동적 컬러 사용법에 대해 알고 난 후 사용하기.
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }

        darkTheme -> myColors.DarkColorScheme
        else -> myColors.LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }
    CompositionLocalProvider(LocalColors provides colorScheme ) {
        MaterialTheme(
            colorScheme = colorScheme.material,
            typography = Typography,
            content = content
        )
    }
}

val MaterialTheme.custumColorScheme : MyColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current