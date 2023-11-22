package com.example.milkymo.features.authentication.forgetid

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learn_compose_1.R
import com.example.milkymo.ui.theme.BlackGrey
import com.example.milkymo.ui.theme.BlueOcean
import com.example.milkymo.ui.theme.MilkyMoTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShowForgetIdScreen() {
    var showIdPeternak = "22106122121"
    var nama = "Jajat Sudrajat"
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .navigationBarsPadding()
                .padding(top = 20.dp, start = 25.dp, end = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ){
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "back button",
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(vertical = 20.dp)
            )
            Spacer(modifier = Modifier.height(80.dp))
            Image(
                painter = painterResource(id = R.drawable.show_id_peternak),
                contentDescription = "show id logo",
                Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Hallo, $nama",
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                color = BlackGrey.copy(0.8f)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                horizontalAlignment = Alignment.End
            ) {
                OutlinedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .align(Alignment.CenterHorizontally),
                ) {
                    Text(
                        text = "$showIdPeternak",
                        style = MaterialTheme.typography.displayMedium,
                        color = BlackGrey,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(vertical = 10.dp)
                            .fillMaxWidth()
                    )
                }
                TextButton(onClick = {},Modifier.height(35.dp)) {
                    Text(
                        text = "Salin ID peternak",
                        style = TextStyle(
                            fontWeight = FontWeight.Medium
                        ),
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline
                    )
                }
            }
            Spacer(modifier = Modifier.height(30.dp))
            ElevatedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.elevatedButtonColors(containerColor = BlueOcean)
            ) {
                Text(
                    text = "LANJUT",
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White
                )
            }
        }
    }
}

@Preview
@Composable
fun ShowForgetIdScreenPreview() {
    MilkyMoTheme {
        ShowForgetIdScreen()
    }
}