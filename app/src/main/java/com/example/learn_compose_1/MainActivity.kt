@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.learn_compose_1

import android.annotation.SuppressLint
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
import com.example.learn_compose_1.data.MainViewModel
import com.example.learn_compose_1.features.authentication.login.LoginScreen
import com.example.learn_compose_1.ui.theme.LearnCompose1Theme


class MainActivity : ComponentActivity() {

    private val viewModel:MainViewModel by viewModels()

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition{
                viewModel.isLoading.value
            }
        }
        setContent {
            LearnCompose1Theme {
                // A surface container using the 'background' color from the theme
               Surface(
                   modifier = Modifier.fillMaxSize(),
               ) {
                   FarmologiApp()
               }
            }
        }
    }

    @Composable
    fun FarmologiApp(modifier: Modifier = Modifier) {
        LoginScreen()
    }

    @Preview(showBackground = true)
    @Composable
    fun FarmologiAppPreview() {
        LearnCompose1Theme {
            FarmologiApp()
        }
    }
}