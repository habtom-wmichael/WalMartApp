package com.example.walmartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class ShoppingByCategory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_by_category)
        val intent = getIntent()
        val outPut = intent.getStringExtra("user")
        tv1.text = "welcome $outPut"

    }
    fun selectedProduct(view: View){
        val result=when(view.id){
            R.id.img1->"Electronics"
            R.id.img2->"Clothing"
            R.id.img3->"Beauty"
            else->"Food"
        }
        Toast.makeText(this, "You have chosen the $result category of shopping", Toast.LENGTH_LONG).show()
    }
}
