package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposablePresentation()
                }
            }
        }
    }
}

@Composable
fun ComposablePresentation() {
    PresentationCard(
        name = stringResource(id = R.string.name),
        job = stringResource(id = R.string.job),
        phone = stringResource(id = R.string.phone),
        share = stringResource(id = R.string.share),
        mail = stringResource(id = R.string.mail),
        backgroundcolor = Color(0xFFD6F5E1),
        textcolor = Color(0xFF054F20),
        image = painterResource(id = R.drawable.android_logo),

    )
}
@Composable
fun PresentationCard(name:String,
                     job:String,
                     phone:String,
                     share:String,
                     mail:String,
                     image:Painter,
                     backgroundcolor:Color,
                     textcolor:Color,
                     modifier: Modifier = Modifier
                     ) {
Column(modifier = modifier
    .fillMaxSize()
    .background(backgroundcolor).padding(top = 150.dp),
    verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally,
    ) {
    ImageCard(image)
    Text(
        text = name,
        fontSize = 30.sp,
    )
    Text(
        text = job,
        fontWeight = FontWeight.Bold,
        color = textcolor
    )
}
    Column(modifier = modifier
        .fillMaxSize()
        .padding(bottom = 50.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,) {
        Row(
            modifier = modifier
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                Icons.Rounded.Phone,
                tint = textcolor,
                contentDescription = null,
                modifier = Modifier.weight(1f)
                
            )
            Text(
                text = phone,
                modifier = Modifier.weight(3f)
            )
        }
        Row(
            modifier = modifier
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                Icons.Rounded.Share,
                tint = textcolor,
                contentDescription = null,
                modifier = Modifier.weight(1f)

            )
            Text(
                text = share,
                modifier = Modifier.weight(3f)

            )
        }
        Row(
            modifier = modifier
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                Icons.Rounded.Email,
                tint = textcolor,
                contentDescription = null,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = mail,
                modifier = Modifier.weight(3f)
            )
        }
    }
}

@Composable
private fun ImageCard(image: Painter){
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier= Modifier
            .size(100.dp)
            .clip(CircleShape)
            .background(Color(0xFF06234E)).padding(15.dp)
        )
}
@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    PresentationCardTheme {
        ComposablePresentation()
    }
}