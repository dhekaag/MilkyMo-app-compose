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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learn_compose_1.R
import com.example.milkymo.ui.theme.BlackGrey
import com.example.milkymo.ui.theme.BlueOcean
import com.example.milkymo.ui.theme.MilkyMoTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ForgetIdScreen() {
    var nama by remember { mutableStateOf(TextFieldValue(""))}
    var nomorAnggota by remember { mutableStateOf(TextFieldValue(""))}
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
                painter = painterResource(id = R.drawable.id_card),
                contentDescription = "id card logo",
                Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "Nama",
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 20.dp),
                color = BlackGrey.copy(0.8f)
            )
            Spacer(modifier = Modifier.height(3.dp))
            OutlinedTextField(
                value = nama,
                onValueChange = {nama = it},
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default,
                shape = RoundedCornerShape(15.dp),
                placeholder = {
                    Text(
                        text = "Jajat Sudrajat",
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Nomor Anggota",
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 20.dp),
                color = BlackGrey.copy(0.8f)
            )
            Spacer(modifier = Modifier.height(3.dp))
            OutlinedTextField(
                value = nomorAnggota,
                onValueChange = {nomorAnggota = it},
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default,
                shape = RoundedCornerShape(15.dp),
                placeholder = {
                    Text(
                        text = "2115789323",
                        style = MaterialTheme.typography.labelSmall,
                    )
                }
            )
            Spacer(modifier = Modifier.height(50.dp))
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
fun ForgetIdScreenPreview() {
    MilkyMoTheme {
        ForgetIdScreen()
    }
}