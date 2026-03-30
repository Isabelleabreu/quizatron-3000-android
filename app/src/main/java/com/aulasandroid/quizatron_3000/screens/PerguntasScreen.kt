package com.aulasandroid.quizatron_3000.screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.aulasandroid.quizatron_3000.R

@Composable
fun PerguntasScreen(navController: NavController) {

    var respostaSelecionada by remember {
        mutableStateOf("") }

    val respostaCorreta = "Júpiter"

    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = Color(0xFFF87ADB)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        Image(
            modifier = Modifier
                .height(200.dp)
                .padding(top = 80.dp),
            contentDescription = "Quiz Icon",
            painter = painterResource(id = R.drawable.quiz),
            alignment = Alignment.Center
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Card(
                modifier = Modifier
                    .width(300.dp)
                    .height(70.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF5FDA86)
                ),
                border = BorderStroke(width = 2.dp, color = Color.Black)
            ) {

                Text(
                    modifier = Modifier.fillMaxWidth()
                        .offset(y = 20.dp),
                    text = "Pergunta 1 de 3",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp
                )
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .size(250.dp)
                .offset(y = (20).dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFFFFF)
            )
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    modifier = Modifier
                        .padding(top = 20.dp),
                    text = "\uD83E\uDDE0 Qual é o maior planeta do sistema solar?",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp
                )

                Spacer(modifier = Modifier.height(20.dp))

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {

                    OutlinedButton(
                        modifier = Modifier
                            .width(380.dp)
                            .height(60.dp),
                        onClick = { respostaSelecionada = "Terra"},
                        colors = ButtonDefaults.buttonColors(
                            containerColor =
                                if (respostaSelecionada == "Terra") {
                                    if (respostaSelecionada == respostaCorreta) Color.Green
                                    else Color.Red
                                } else Color.White),
                    ) {
                        Text(
                            text = " Terra",
                            color = Color.Black,
                            fontSize = 24.sp
                        )
                    }

                    OutlinedButton(
                        modifier = Modifier
                            .width(380.dp)
                            .height(60.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    ) {
                        Text(
                            text = "Marte",
                            color = Color.Black,
                            fontSize = 24.sp
                        )
                    }

                    OutlinedButton(
                        modifier = Modifier
                            .width(380.dp)
                            .height(60.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    ) {
                        Text(
                            text = "Júpiter",
                            color = Color.Black,
                            fontSize = 24.sp
                        )
                    }

                    OutlinedButton(
                        modifier = Modifier
                            .width(380.dp)
                            .height(60.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    ) {
                        Text(
                            text = "Saturno",
                            color = Color.Black,
                            fontSize = 24.sp
                        )
                    }
                }
            }
        }
    }
}
