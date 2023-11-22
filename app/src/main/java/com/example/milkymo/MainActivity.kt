@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.milkymo

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.example.milkymo.data.MainViewModel
import com.example.milkymo.features.authentication.forgetid.ShowForgetIdScreen
import com.example.milkymo.ui.theme.MilkyMoTheme


class MainActivity : ComponentActivity() {

    private val viewModel:MainViewModel by viewModels()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "SourceLockedOrientationActivity")
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition{
                viewModel.isLoading.value
            }
        }
        setContent {
            MilkyMoTheme{
               Surface(
                   modifier = Modifier.fillMaxSize(),
               ) {
                   FarmologiApp()
               }
            }
        }
    }

    @Composable
    fun FarmologiApp() {
        ShowForgetIdScreen()
    }

    @Preview(showBackground = true)
    @Composable
    fun FarmologiAppPreview() {
        MilkyMoTheme{
            FarmologiApp()
        }
    }
}