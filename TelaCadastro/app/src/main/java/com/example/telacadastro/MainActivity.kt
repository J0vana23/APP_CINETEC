package com.example.telacadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telacadastro.ui.theme.TelaCadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaCadastroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tela()
                }
            }
        }
    }
}

@Composable
fun Tela() {

    //VARIÁVEIS DE TEXFIELD
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }
    var data by remember { mutableStateOf("") }
    var pagamento by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column (
        Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally //ALINHAMENTO DOS ELEMENTOS NO CENTRO
    ){

        // ROW DO TÍTULO PRINCIPAL DO APP
        Row (
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
            Arrangement.Center

        ){
            Text(
                text = "CIN",
                style = TextStyle(
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    fontSize = 50.sp,
                    color = Color.Red,


                )
            )

                Text(
                    text = "ETEC",
                    style = TextStyle(
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        fontSize = 50.sp,
                        color = Color.Black,


                        )
                )


        }

        // LINHA DA CAIXA DE TEXTO (NOME)
        Row (
            Modifier.padding(10.dp)
        ) {
            OutlinedTextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("NOME:") }
            )
        }

        // LINHA DA CAIXA DE TEXTO (TELEFONE)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = telefone,
                onValueChange = { telefone = it },
                label = { Text("TELEFONE:") }
            )
        }

        // LINHA DA CAIXA DE TEXTO (CPF)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = cpf,
                onValueChange = { cpf = it },
                label = { Text("CPF:") }
            )
        }

        // LINHA DA CAIXA DE TEXTO (AGENDAR DATA)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = data,
                onValueChange = { data = it },
                label = { Text("AGENDAR DATA:") }
            )
        }

        // LINHA DA CAIXA DE TEXTO (FORMA DE PAGAMENTO)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = pagamento,
                onValueChange = { pagamento = it },
                label = { Text("FORMA DE PAGAMENTO:") }
            )
        }

        // LINHA DA CAIXA DE TEXTO (EMAIL)
        Row (
            Modifier.padding(10.dp)
        ){
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("EMAIL:") }
            )
        }




        // CRIAÇÃO DO BOTÃO
        Row (
            Modifier.padding(25.dp)

        ){
            Button (
                onClick = {},
                modifier = Modifier.padding(8.dp),
                colors = ButtonDefaults.buttonColors(Color.Red), ) // Define a cor de fundo do botão
            {
                Text(text = "Enviar")

            }
        }

    }
}


@Preview(showBackground = false)
@Composable
fun TelaPreview() {
    TelaCadastroTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.White
        ) {
            Tela()
        }
    }

}

