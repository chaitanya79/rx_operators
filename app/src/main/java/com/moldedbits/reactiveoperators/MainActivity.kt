package com.moldedbits.reactiveoperators

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

import com.moldedbits.reactiveoperators.creating.create.CreateJava
import com.moldedbits.reactiveoperators.creating.create.CreateKotlin
import com.moldedbits.reactiveoperators.creating.create.GenerateJava
import com.moldedbits.reactiveoperators.creating.create.UnsafeCreateSample
import com.moldedbits.reactiveoperators.creating.defer.DeferSample

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createSample()
    }

    private fun createSample() {
        val output = findViewById(R.id.textview) as TextView

        CreateJava.createSample(findViewById(R.id.btn_java), output)
        CreateKotlin.createSample(findViewById(R.id.btn_kotlin), output)

        GenerateJava.test()

        UnsafeCreateSample.unsafeCreate()

        DeferSample.deferSample();
    }
}
