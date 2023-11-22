package com.example.milkymo.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.milkymo.ui.theme.MilkyMoTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    hintText: String = "",
    leadingIconPainter: Int,
    leadingIconDescription: String = "",
    isPasswordField: Boolean = false,
    isPasswordVisible: Boolean = false,
    onVisibilityChange: (Boolean) -> Unit = {},
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    showError: Boolean = false,
    errorMessage: String = ""
    ) {
    Column {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            keyboardOptions = keyboardOptions,
            modifier = Modifier.width(340.dp),
            leadingIcon = {
                Image(
                    painter = painterResource(id = leadingIconPainter),
                    contentDescription = leadingIconDescription,
                    Modifier.size(25.dp)
                )
            },
            placeholder = {
                Text(
                    text = hintText,
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

}

@Preview(showBackground = true)
@Composable
fun CustomOutlinedTextFieldPrev() {
    MilkyMoTheme {
        CustomOutlinedTextFieldPrev()
    }
}