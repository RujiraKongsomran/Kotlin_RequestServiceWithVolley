package com.rujirakongsomran.kotlin_requestservicewithvolley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IVolley {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGet.setOnClickListener {
            MyVolleyRequest.getInstance(this, this)
                .getRequest("https://jsonplaceholder.typicode.com/todos/1")
        }

        btnPost.setOnClickListener {
            MyVolleyRequest.getInstance(this, this)
                .postRequest("https://jsonplaceholder.typicode.com/posts")
        }

        btnPUT.setOnClickListener {
            MyVolleyRequest.getInstance(this, this)
                .putRequest("https://jsonplaceholder.typicode.com/posts/1")
        }

        btnPatch.setOnClickListener {
            MyVolleyRequest.getInstance(this, this)
                .patchRequest("https://jsonplaceholder.typicode.com/posts/1")
        }

        btnDelete.setOnClickListener {
            MyVolleyRequest.getInstance(this, this)
                .deleteRequest("https://jsonplaceholder.typicode.com/posts/1")
        }

        btnImageLoader.setOnClickListener {
            ivPic.setImageUrl(
                "https://images.pexels.com/photos/1468379/pexels-photo-1468379.jpeg?cs=srgb&dl=pexels-1468379.jpg&fm=jpg",
                MyVolleyRequest.getInstance(this).imageLoader
            )
        }
    }

    override fun onResponse(response: String) {
        Toast.makeText(this, "" + response, Toast.LENGTH_SHORT).show()
    }
}