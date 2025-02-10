package com.example.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilecard.ui.theme.ProfileCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    ProfileBio(
                        image = painterResource(id = R.drawable.rudolph_icon),
                        name = "Rudolph",
                        bio = "Has a red nose."
                    )
                }
            }
        }
    }
}
@Composable
fun ProfileCard(){
    //add for when I learn how to add a background color
    Box(modifier = Modifier.background(color = Color.Blue).fillMaxSize()){


    }
}
@Composable
fun ProfileBio(image: Painter, name: String, bio: String){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
    ){
        Image(
            painter = image,
            contentDescription = "A photo of Rudolph from the old stop-motion films.",
            modifier = Modifier.size(360.dp)
                .clip(CircleShape).fillMaxSize(0.3f)
        )
        Text(
            text = name,
            fontSize = 100.sp,
            lineHeight = 100.sp,
            modifier = Modifier.padding(3.dp)
                .align(alignment = Alignment.Start)
        )
        Text(
            text = bio,
            fontSize = 50.sp,
            lineHeight = 50.sp,
            modifier = Modifier.padding(3.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    ProfileCardTheme {
        ProfileCard()
        ProfileBio(
            image = painterResource(id = R.drawable.rudolph_icon),
            name = "Rudolph",
            bio = "Has a red nose."
        )
    }
}