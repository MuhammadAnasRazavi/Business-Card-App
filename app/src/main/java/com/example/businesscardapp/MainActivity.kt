package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun IntroductionCard(
    image: Painter,
    name: String,
    designation: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .height(100.dp)
                .width(100.dp)
                .background(Color(7, 48, 66))
        )
        Text(
            text = name,
            fontSize = 30.sp,
            fontWeight = FontWeight.W400,
            modifier = modifier.padding(10.dp),
            color =  Color(42, 56, 45)
        )
        Text(
            text = designation,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(26, 123, 76)
        )
    }
}

@Composable
fun ContactInformationCard(
    mobileNumber: String,
    socialMedia: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Row(
            modifier = modifier
                .padding(bottom = 10.dp)
        ) {
            Icon(
                imageVector = Icons.Rounded.Call,
                contentDescription = "Mobile_Number",
                tint = Color(0, 109, 59)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = mobileNumber,
                color = Color(41,54,44)
            )
        }
        Row(modifier = modifier.padding(bottom = 10.dp)) {
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = "Social_Media",
                tint = Color(0, 109, 59)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = socialMedia,
                color = Color(41,54,44)
            )
        }
        Row {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "Gmail",
                tint = Color(0, 109, 59)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = email,
                color = Color(41,54,44)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        ContactInformationCard(
            mobileNumber = stringResource(R.string.mobile_number_text),
            socialMedia = stringResource(R.string.social_media_text),
            email = stringResource(R.string.email_text)
        )
    }
}