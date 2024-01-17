package com.example.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    unitConverter()
                }
            }
        }
    }
}

@Composable
fun unitConverter() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {})

        Spacer(modifier = Modifier.height(16.dp))
        Row {
//            val Context = LocalContext.current
//            Button(onClick = {
//                Toast.makeText(Context, "Thanks for Clicking...", Toast.LENGTH_LONG).show()
//            }) {
//                Text(text = "Click Me...")
//
//            }

            // using Box
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text( "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")

                }
            }

            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text( "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")

                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Result:" )
    }
}





@Preview(showBackground = true)
@Composable
fun unitConverterPreview() {
    unitConverter()
}