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
                "https://scontent.fbkk9-2.fna.fbcdn.net/v/t1.0-9/83595496_157804675635011_2369255353775816704_n.jpg?_nc_cat=109&_nc_sid=85a577&_nc_eui2=AeHgtU6TjOjdLo7LnySHfGm7XItcV0UtFKtci1xXRS0Uq9HhCmVTq29f2-3NfD1QAXYD8JbTVapUPf5JcDZs-Isd&_nc_ohc=qMgv1h5njA0AX9GrtXD&_nc_ht=scontent.fbkk9-2.fna&oh=5904ad8d1c4ca3a50b4cc5114d332dce&oe=5F32639A",
                MyVolleyRequest.getInstance(this).imageLoader
            )
        }
    }

    override fun onResponse(response: String) {
        Toast.makeText(this, "" + response, Toast.LENGTH_SHORT).show()
    }
}