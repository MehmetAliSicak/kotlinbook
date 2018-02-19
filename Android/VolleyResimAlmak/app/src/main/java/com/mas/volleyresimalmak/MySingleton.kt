package com.mas.volleyresimalmak


import android.content.Context

import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

/*RequestQueue nesnemizi yapılandırmak için ayrı bir sınıf oluşturduk.
Bu sınıfı her yerde kullanabiliriz.*/
class MySingleton/*Kurucu metodumuz parametreleri alır ve atama işlemlerini yapar.*/
private constructor(context: Context) {
    /*RequestQueue nesnemizi oluşturduk.*/
    private val requestQueue: RequestQueue

    init {
        ctx = context
        /*getRequestQueue() metodundan, RequestQueue örneği alınır ve değişkene
                atanır.*/
        requestQueue = getRequestQueue()
    }

    private fun getRequestQueue(): RequestQueue {
        /*RequestQueue örneği alınır ve return edilir.*/
        return Volley.newRequestQueue(ctx)
    }

    fun <T> addToRequestQue(request: Request<T>) {
        /*İndirme işlemi bu kod ile yapılır. add() metodu ile istek işlenir.*/
        requestQueue.add(request)
    }

    companion object {
        /*Context örneği oluşturduk*/
        private var ctx: Context?=null
        /*MySingleton örneği oluşturduk.*/
        private val mInstance: MySingleton? = null

        /*synchronized: bu anahtar kelime ile senkronize işlemi aypılır.*/
        @Synchronized fun getIntstance(context: Context): MySingleton {
            /*MySingleton örneği oluşturulur ve return edilir.*/
            return MySingleton(context)
        }
    }
}

