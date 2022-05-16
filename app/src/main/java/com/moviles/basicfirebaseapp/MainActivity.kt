package com.moviles.basicfirebaseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.reference

        myRef.child("Cartas").child("1").setValue(Card("A", "Rojo", "Corazones"))
        myRef.child("Cartas").child("2").setValue(Card("2", "Rojo", "Corazones"))
        myRef.child("Cartas").child("3").setValue(Card("3", "Rojo", "Corazones"))
        myRef.child("Cartas").child("4").setValue(Card("4", "Rojo", "Corazones"))
        myRef.child("Cartas").child("5").setValue(Card("5", "Rojo", "Corazones"))
        myRef.child("Cartas").child("6").setValue(Card("6", "Rojo", "Corazones"))
        myRef.child("Cartas").child("7").setValue(Card("7", "Rojo", "Corazones"))
        myRef.child("Cartas").child("8").setValue(Card("8", "Rojo", "Corazones"))
        myRef.child("Cartas").child("9").setValue(Card("9", "Rojo", "Corazones"))
        myRef.child("Cartas").child("10").setValue(Card("10", "Rojo", "Corazones"))
        myRef.child("Cartas").child("11").setValue(Card("J", "Rojo", "Corazones"))
        myRef.child("Cartas").child("12").setValue(Card("Q", "Rojo", "Corazones"))
        myRef.child("Cartas").child("13").setValue(Card("R", "Rojo", "Corazones"))
        myRef.child("Cartas").child("14").setValue(Card("A", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("15").setValue(Card("2", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("16").setValue(Card("3", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("17").setValue(Card("4", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("18").setValue(Card("5", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("19").setValue(Card("6", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("20").setValue(Card("7", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("21").setValue(Card("8", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("22").setValue(Card("9", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("23").setValue(Card("10", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("24").setValue(Card("J", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("25").setValue(Card("Q", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("26").setValue(Card("R", "Rojo", "Diamantes"))
        myRef.child("Cartas").child("27").setValue(Card("A", "Negro", "Tréboles"))
        myRef.child("Cartas").child("28").setValue(Card("2", "Negro", "Tréboles"))
        myRef.child("Cartas").child("29").setValue(Card("3", "Negro", "Tréboles"))
        myRef.child("Cartas").child("30").setValue(Card("4", "Negro", "Tréboles"))
        myRef.child("Cartas").child("31").setValue(Card("5", "Negro", "Tréboles"))
        myRef.child("Cartas").child("32").setValue(Card("6", "Negro", "Tréboles"))
        myRef.child("Cartas").child("33").setValue(Card("7", "Negro", "Tréboles"))
        myRef.child("Cartas").child("34").setValue(Card("8", "Negro", "Tréboles"))
        myRef.child("Cartas").child("35").setValue(Card("9", "Negro", "Tréboles"))
        myRef.child("Cartas").child("36").setValue(Card("10", "Negro", "Tréboles"))
        myRef.child("Cartas").child("37").setValue(Card("J", "Negro", "Tréboles"))
        myRef.child("Cartas").child("38").setValue(Card("Q", "Negro", "Tréboles"))
        myRef.child("Cartas").child("39").setValue(Card("R", "Negro", "Tréboles"))
        myRef.child("Cartas").child("40").setValue(Card("A", "Negro", "Espadas"))
        myRef.child("Cartas").child("41").setValue(Card("2", "Negro", "Espadas"))
        myRef.child("Cartas").child("42").setValue(Card("3", "Negro", "Espadas"))
        myRef.child("Cartas").child("43").setValue(Card("4", "Negro", "Espadas"))
        myRef.child("Cartas").child("44").setValue(Card("5", "Negro", "Espadas"))
        myRef.child("Cartas").child("45").setValue(Card("6", "Negro", "Espadas"))
        myRef.child("Cartas").child("46").setValue(Card("7", "Negro", "Espadas"))
        myRef.child("Cartas").child("47").setValue(Card("8", "Negro", "Espadas"))
        myRef.child("Cartas").child("48").setValue(Card("9", "Negro", "Espadas"))
        myRef.child("Cartas").child("49").setValue(Card("10", "Negro", "Espadas"))
        myRef.child("Cartas").child("50").setValue(Card("J", "Negro", "Espadas"))
        myRef.child("Cartas").child("51").setValue(Card("Q", "Negro", "Espadas"))
        myRef.child("Cartas").child("52").setValue(Card("R", "Negro", "Espadas"))
        myRef.child("Cartas").child("53").setValue(Card("$", "Todos", "Todos"))
        myRef.child("Cartas").child("54").setValue(Card("$", "Todos", "Todos"))

        myRef.child("Cartas").get().addOnSuccessListener { response ->
            Log.d("firebaseResponse", response.value.toString())
        }.addOnFailureListener{
            Log.e("firebaseResponse", "Error getting data", it)
        }
    }
}

//.child("3")