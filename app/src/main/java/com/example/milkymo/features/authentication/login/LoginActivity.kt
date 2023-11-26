@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.milkymo.features.authentication.login

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learn_compose_1.R
import com.example.milkymo.ui.theme.BlackGrey
import com.example.milkymo.ui.theme.BlueOcean


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoginScreen(
    onEvent: (LoginEvent) -> Unit
) {
    var idPeternak by remember {mutableStateOf(TextFieldValue("")) }
    var password by remember {mutableStateOf(TextFieldValue("")) }
    Scaffold(
        containerColor = MaterialTheme.colorScheme.primary,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .navigationBarsPadding()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,

        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_milkymo),
                contentDescription = "App Logo",
                Modifier.size(350.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 30.dp)
                ) {
                    Text(
                        text = "Hallo, Peternak!",
                        style = MaterialTheme.typography.titleSmall,
                        modifier = Modifier.padding(top = 40.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Untuk Menggunakan aplikasi MilkyMo, silahkan masukkan ID peternak",
                        style = MaterialTheme.typography.bodyLarge,
                        color = BlackGrey.copy(0.7f)
                    )
                    Spacer(modifier = Modifier.height(25.dp))
                    OutlinedTextField(
                        value = idPeternak,
                        onValueChange = {idPeternak = it},
                        singleLine = true,
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(15.dp),
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.icon_profile),
                                contentDescription = "profile icon",
                                Modifier.size(20.dp)
                            )
                        },
                        placeholder = {
                            Text(
                                text = "ID peternak",
                                style = MaterialTheme.typography.labelSmall
                            )
                        },
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier.padding(start = 15.dp, top = 3.dp)

                        ) {
                            ColouredCheckbox()
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Ingat saya",
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold
                                ),
                                color = BlackGrey.copy(0.6f)
                            )
                        }
                        TextButton(onClick = {},) {
                            Text(
                                text = "Lupa ID peternak?",
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    ElevatedButton(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.elevatedButtonColors(containerColor = BlueOcean)
                    ) {
                        Text(
                            text = "MASUK",
                            style = MaterialTheme.typography.titleMedium,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun ColouredCheckbox() {
    val isChecked = remember { mutableStateOf(false) }

    Checkbox(
        modifier = Modifier.size(15.dp),
        checked = isChecked.value,
        onCheckedChange = { isChecked.value = it },
        enabled = true,
        colors = CheckboxDefaults.colors(MaterialTheme.colorScheme.primary)
    )
}


//
//@Preview
//@Composable
//fun LoginScreenPrev() {
//    MilkyMoTheme {
//        loginScreen()
//    }
//}