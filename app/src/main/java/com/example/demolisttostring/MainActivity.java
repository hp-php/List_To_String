package com.example.demolisttostring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        String listString =   TextUtils.join(",",list);

      Log.e("listString",listString);



        Log.e("split", TextUtils.split(listString,",") +"");

//        StringBuilder sb = new StringBuilder();
//        for (String s : list) {
//                sb.append(s);
//                sb.append(",");
//        }
//        Log.e("String Array",sb.toString());
//
//        Log.d("", "list:");
//        for (String string : list)
//        {
//            Log.d("String Array is", sb.toString());
//        }

        // String charAt() method
        String s="Sachin";
        Log.e("String", s.charAt(0) +"");//S
        Log.e("String", s.charAt(3) +"");//h

        //String intern() method
        String s2=s.intern();
        Log.e("String",s2 + " ");//Sachin

        //String valueOf()
        int a=10;
        String s1=String.valueOf(a);
        Log.e("String",s1+10);

        //String replace()
        String s3="Java is a programming language.";
        String replaceString=s3.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"
        Log.e("String", replaceString);

        // Example of Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        Log.e("Int", myInt + "");      // Outputs 9
        Log.e("Double",myDouble + "");   // Outputs 9.0

        // // Example of Narrowing Casting
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1; // Manual casting: double to int
        Log.e("Double",myDouble1 + "");   // Outputs 9.78
        Log.e("Int",myInt1 + "");  // Outputs 9

        //Typecasting example to convert double to int
        double billAmt = 99.95;
        Log.e("billAmt :", billAmt + "");
        // Typecast billAmt
        // to convert double billAmt value to int
        // and assign it to int variable bill
        int bill = (int) billAmt;
        Log.e("Bill ", bill + "");

    }
}