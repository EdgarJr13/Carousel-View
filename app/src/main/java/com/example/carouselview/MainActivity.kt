package com.example.carouselview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://wallpaperaccess.com/full/87897.png", "Capitão América"))
        imageList.add(SlideModel("https://wonderfulengineering.com/wp-content/uploads/2016/02/iron-man-wallpaper-22.jpg", "Homem de Ferro"))
        imageList.add(SlideModel("https://wallpapercave.com/wp/wp4360615.jpg", "Thor"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}