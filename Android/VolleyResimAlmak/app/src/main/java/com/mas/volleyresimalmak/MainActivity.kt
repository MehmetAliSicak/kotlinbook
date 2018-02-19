package com.mas.volleyresimalmak

import android.graphics.Bitmap
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.ImageRequest

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var bn: Button?=null
    var img: ImageView?=null
    var urlImage = "http://www.levelkitap.com/wp-content/uploads/2016/12/python-kivy-3d.jpg"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bn = findViewById(R.id.btnGetImage) as Button
        img = findViewById(R.id.imageView) as ImageView
        bn!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btnGetImage) {
            /*ImageRequest: URL bilgisi verilen resmi istemek için bu sınıf kullanılır.*/
            val imageRequest = ImageRequest(urlImage,
                    Response.Listener<Bitmap> { response ->
                        /*İstek sonucunda gelen resim imageview kontrolüne set
                                                       edilir.*/
                        img!!.setImageBitmap(response)
                    }, 0, 0, ImageView.ScaleType.FIT_CENTER, null,
                    Response.ErrorListener { error ->
                        /*Herhangi bir hata meydana geldiğinde kullanıcıya mesaj
                                                       ile bilgi verilir.*/
                        Toast.makeText(applicationContext,
                                "Hata meydana geldi!", Toast.LENGTH_SHORT).show()
                        error.printStackTrace()
                    })
            /*MySingleton: Her defasında RequestQueue nesneleri oluşturmak yerine tek
                        bir istek oluşturmak daha mantıklıdır. Yani bu sınıfın temel amacı,
                        RequestQueue nesnemizi yapılandırmaktır. Singleton dememizin temel nedeni,
                        tek bir RequestQueue nesnesi içermesi ve yapılandırmasıdır. Bu aynı zamanda
                        kapsüllemedir. */
            MySingleton.getIntstance(this.applicationContext).addToRequestQue(imageRequest)
        }
    }
}


