package com.example.numbersandshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;
        public boolean isPerfectSquare(int x)
        {
            if (x >= 0) {


                int sr = (int)Math.sqrt(x);


                return ((sr * sr) == x);
            }
            return false;
        }

        public boolean isTriangularNumber(int num)
        {

            int sum = 1;
            boolean flag = false;
            for(int i = 2; i<num; i++)
            {
                sum = sum + i;
                if(sum == num)
                {
                    flag = true;
                    break;
                }
            }
            return flag;
        }
    }

    public void testNumber(View view){

        EditText editText = (EditText) findViewById(R.id.editTextNumberSigned);
        if (editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter a number !!", Toast.LENGTH_SHORT).show();
        }
        else{

        //Log.i("info", "Button pressed!");

        Number myNumber = new Number();
        myNumber.number = Integer.parseInt(editText.getText().toString());
        String message = editText.getText().toString();
        boolean triResult = myNumber.isTriangularNumber(myNumber.number);
        if(triResult){
            message += " is a triangular number \n";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            //System.out.println(myNumber.number+" is a triangular number");
            }
        else{
            //System.out.println(myNumber.number+"
            message +=  " is not a triangular number \n";
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();}
        message = editText.getText().toString();

        boolean squResult = myNumber.isPerfectSquare(myNumber.number);
        if(squResult){
            //System.out.println(myNumber.number+" " +
            message +=" is a square number \n";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();}
        else{
            message += " is not a square number \n";
            //System.out.println(myNumber.number+" is not a square number");
             Toast.makeText(this, message, Toast.LENGTH_LONG).show();}



    }}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}