@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.learn_compose_1.features.authentication.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learn_compose_1.R
import com.example.learn_compose_1.ui.theme.LearnCompose1Theme


@Composable
fun LoginScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ){
        Image(
            painter = painterResource(id = R.drawable.farmologi_image_logo),
            contentDescription = "Login top image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(top = 140.dp, start = 110.dp, end = 110.dp, bottom = 500.dp)
                .width(180.dp)
                .height(173.dp)

        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(
                    MaterialTheme.colorScheme.onPrimary,
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
                )
                .align(Alignment.BottomCenter)
        ) {
            Column(
                Modifier.padding(horizontal = 30.dp)
            ) {
                Text(
                    text = "Hallo, Peternak!",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top=40.dp)
                )
                Spacer(Modifier.height(15.dp))
                Text(
                    text = "Untuk menggunakan aplikasi Farmologi, silahkan masukkan ID peternak.",
                    style = TextStyle(
                        fontSize = 12.sp,
//                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(500),
                        color = Color(0x99000000),
                        textAlign = TextAlign.Justify,
                    ),
                )
                Spacer(modifier = Modifier.height(30.dp))
                OutlinedTextField()
                Spacer(modifier = Modifier.height(5.dp))
                Row{
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        ColouredCheckbox()
                        Text(text = "Ingat saya")
                    }
                    Spacer(modifier = Modifier.width(65.dp))
                    TextButton(onClick = {}) {
                        Text(text = "Lupa ID peternak?", maxLines = 1)
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                ElevatedButton(
                    onClick = {}, Modifier.width(340.dp),
                    colors = ButtonDefaults
                        .elevatedButtonColors(
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )
                ) {
                    Text(
                        text = "MASUK",
                        style = TextStyle(
                            fontSize = 17.sp,
//                            fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center,
                            letterSpacing = 0.85.sp,
                    ))
                }
            }
            }
    }
}
@Composable
fun ColouredCheckbox() {
    val isChecked = remember { mutableStateOf(false) }

    Checkbox(
        checked = isChecked.value,
        onCheckedChange = { isChecked.value = it },
        enabled = true,
        colors = CheckboxDefaults.colors(MaterialTheme.colorScheme.primary)
    )
}

@Composable
fun OutlinedTextField() {
    var text by remember{ mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        onValueChange ={text = it},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier.width(340.dp),
        leadingIcon = {
           Image(
               painter = painterResource(id = R.drawable.icon_profile),
               contentDescription = "login profile icon",
               Modifier.size(25.dp)
           )
        },
        placeholder = {
            Text(
                text = "Masukkan ID peternak",
                style = TextStyle(
                    fontSize = 14.sp,
//                  fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color.Black.copy(0.4f),
                )
            )
        },
    )

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPrev() {
    LearnCompose1Theme {
        LoginScreen()
    }
}