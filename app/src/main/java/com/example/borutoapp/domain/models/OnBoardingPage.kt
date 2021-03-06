package com.example.borutoapp.domain.models

import androidx.annotation.DrawableRes
import com.example.borutoapp.R

// these are screen which will show after splash screen
// sealed classes are those which are restricted from being inherited.
sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First: OnBoardingPage(
        image = R.drawable.greetings,
        title = "Greetings",
        description = "Are you a Boruto fan? Because if you are then we have a good news for you!"
    )

    object Second: OnBoardingPage(
        image = R.drawable.explore,
        title = "Explore",
        description = "Find your favorite heroes and learn some of the things that you didn't know about."
    )

    object Third: OnBoardingPage(
        image = R.drawable.power,
        title = "Power",
        description = "Check out your hero's power and  see how much are they strong comparing to others."
    )

}
