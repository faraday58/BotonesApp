package com.example.botonesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.botonesapp.ui.theme.BotonesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BotonesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content()
                }
            }
        }
    }
}

@Composable
fun Content(){
    //Before Themes
    //Changes
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotonNormal()
        Space()
        BotonNormal2()
        Space()
        BotonTexto()
        Space()
        BotonOutline()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()
        DarkMode()
    }
}

@Composable
fun BotonNormal(){
    Button(onClick = { /*TODO*/ }, enabled = false) {
        Text(text = "Mi Botón", fontSize = 30.sp)
    }
}
@Composable
fun BotonNormal2(){
    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
        containerColor = Color.Red
    )  ) {
        Text(text = "Mi Botón", fontSize = 30.sp)
    }
}
@Composable
fun BotonTexto(){
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Mi Botón", fontSize = 30.sp )
    }
}
@Composable
fun BotonOutline(){
    OutlinedButton(onClick = { /*TODO*/ }, border = BorderStroke(3.dp, Color.Green)) {
        Text(text = "Mi Botón", fontSize = 30.sp )


    }
}

@Composable
fun BotonIcono(){
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            Icons.Filled.AccountCircle,
            contentDescription = "Icono",
            tint = Color.DarkGray,
            modifier = Modifier.size(50.dp)
        )
    }
}
@Composable
fun BotonSwitch(){
    var switched by remember {
        mutableStateOf(false)
    }
    Switch(checked = switched, onCheckedChange = {
        switched = it
    },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Red,
             checkedTrackColor = Color.Green,
            uncheckedThumbColor = Color.Yellow,
            uncheckedTrackColor = Color.Magenta
        )
    )
}

@Composable
fun DarkMode(){
    Button(onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Outlined.Star, contentDescription ="DarkMode" )
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "Dark Mode", fontSize = 30.sp)
    }
}

@Composable
fun Space(){
    Spacer(modifier = Modifier.height(10.dp))
}
