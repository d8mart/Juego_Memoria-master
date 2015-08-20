package com.example.daniel.primeraprueba;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {


   private Button boton,botonant,boton2;
    //String[] arr_nums ={"1", "2","3","4","5","6","7","8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String[] arr_nums ={"1", "2","3","4","5","6","7","8"};
        PonO();

    }


    @Override
    protected void onSaveInstanceState(Bundle SavedInstancesState){
        super.onSaveInstanceState(SavedInstancesState);
         SavedInstancesState.putString("con1", conb1);
        SavedInstancesState.putString("con2", conb2);
        SavedInstancesState.putString("con3", conb3);
        SavedInstancesState.putString("con4",conb4);
        SavedInstancesState.putString("con5",conb5);
        SavedInstancesState.putString("con6",conb6);
        SavedInstancesState.putString("con7",conb7);
        SavedInstancesState.putString("con8",conb8);
        SavedInstancesState.putString("con9",conb9);
        SavedInstancesState.putString("con10",conb10);
        SavedInstancesState.putString("con11",conb11);
        SavedInstancesState.putString("con12",conb12);
        SavedInstancesState.putString("con13",conb13);
        SavedInstancesState.putString("con14",conb14);
        SavedInstancesState.putString("con15", conb15);
        SavedInstancesState.putString("con16", conb16);
        SavedInstancesState.putInt("start", start);
        SavedInstancesState.putInt("pareja", pareja);
        SavedInstancesState.putInt("bloqueo", bloqueo);
        SavedInstancesState.putInt("par", parencontrado);
        SavedInstancesState.putString("ant", ant);
        boton=(Button) findViewById(R.id.button);
        SavedInstancesState.putCharSequence("b1", boton.getText());
        boton=(Button) findViewById(R.id.button2);
        SavedInstancesState.putCharSequence("b2", boton.getText());
        boton=(Button) findViewById(R.id.button3);
        SavedInstancesState.putCharSequence("b3", boton.getText());
        boton=(Button) findViewById(R.id.button4);
        SavedInstancesState.putCharSequence("b4", boton.getText());
        boton=(Button) findViewById(R.id.button5);
        SavedInstancesState.putCharSequence("b5", boton.getText());
        boton=(Button) findViewById(R.id.button6);
        SavedInstancesState.putCharSequence("b6", boton.getText());
        boton=(Button) findViewById(R.id.button7);
        SavedInstancesState.putCharSequence("b7", boton.getText());
        boton=(Button) findViewById(R.id.button8);
        SavedInstancesState.putCharSequence("b8", boton.getText());
        boton=(Button) findViewById(R.id.button9);
        SavedInstancesState.putCharSequence("b9", boton.getText());
        boton=(Button) findViewById(R.id.button10);
        SavedInstancesState.putCharSequence("b10", boton.getText());
        boton=(Button) findViewById(R.id.button11);
        SavedInstancesState.putCharSequence("b11", boton.getText());
        boton=(Button) findViewById(R.id.button12);
        SavedInstancesState.putCharSequence("b12", boton.getText());
        boton=(Button) findViewById(R.id.button13);
        SavedInstancesState.putCharSequence("b13", boton.getText());
        boton=(Button) findViewById(R.id.button14);
        SavedInstancesState.putCharSequence("b14", boton.getText());
        boton=(Button) findViewById(R.id.button15);
        SavedInstancesState.putCharSequence("b15", boton.getText());
        boton=(Button) findViewById(R.id.button16);
        SavedInstancesState.putCharSequence("b16", boton.getText());

        try {
            SavedInstancesState.putInt("idant", botonant.getId());
        }catch (Exception e){}
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
       super.onRestoreInstanceState(savedInstanceState);
        conb1=savedInstanceState.getString("con1");
        conb2=savedInstanceState.getString("con2");
        conb3=savedInstanceState.getString("con3");
        conb4=savedInstanceState.getString("con4");
        conb5=savedInstanceState.getString("con5");
        conb6=savedInstanceState.getString("con6");
        conb7=savedInstanceState.getString("con7");
        conb8=savedInstanceState.getString("con8");
        conb9=savedInstanceState.getString("con9");
        conb10=savedInstanceState.getString("con10");
        conb11=savedInstanceState.getString("con11");
        conb12=savedInstanceState.getString("con12");
        conb13=savedInstanceState.getString("con13");
        conb14=savedInstanceState.getString("con14");
        conb15=savedInstanceState.getString("con15");
        conb16=savedInstanceState.getString("con16");
        start=savedInstanceState.getInt("start");
        pareja=savedInstanceState.getInt("pareja");
        bloqueo=savedInstanceState.getInt("bloqueo");
        parencontrado=savedInstanceState.getInt("par");
        ant=savedInstanceState.getString("ant");
        boton=(Button) findViewById(R.id.button);
        boton.setText(savedInstanceState.getCharSequence("b1"));
        boton=(Button) findViewById(R.id.button2);
        boton.setText(savedInstanceState.getCharSequence("b2"));
        boton=(Button) findViewById(R.id.button3);
        boton.setText(savedInstanceState.getCharSequence("b3"));
        boton=(Button) findViewById(R.id.button4);
        boton.setText(savedInstanceState.getCharSequence("b4"));
        boton=(Button) findViewById(R.id.button5);
        boton.setText(savedInstanceState.getCharSequence("b5"));
        boton=(Button) findViewById(R.id.button6);
        boton.setText(savedInstanceState.getCharSequence("b6"));
        boton=(Button) findViewById(R.id.button7);
        boton.setText(savedInstanceState.getCharSequence("b7"));
        boton=(Button) findViewById(R.id.button8);
        boton.setText(savedInstanceState.getCharSequence("b8"));
        boton=(Button) findViewById(R.id.button9);
        boton.setText(savedInstanceState.getCharSequence("b9"));
        boton=(Button) findViewById(R.id.button10);
        boton.setText(savedInstanceState.getCharSequence("b10"));
        boton=(Button) findViewById(R.id.button11);
        boton.setText(savedInstanceState.getCharSequence("b11"));
        boton=(Button) findViewById(R.id.button12);
        boton.setText(savedInstanceState.getCharSequence("b12"));
        boton=(Button) findViewById(R.id.button13);
        boton.setText(savedInstanceState.getCharSequence("b13"));
        boton=(Button) findViewById(R.id.button14);
        boton.setText(savedInstanceState.getCharSequence("b14"));
        boton=(Button) findViewById(R.id.button15);
        boton.setText(savedInstanceState.getCharSequence("b15"));
        boton=(Button) findViewById(R.id.button16);
        boton.setText(savedInstanceState.getCharSequence("b16"));

        botonant=(Button) findViewById(savedInstanceState.getInt("idant"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    public void PonO(){
        boton=(Button) findViewById(R.id.button);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button2);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button3);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button4);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button5);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button6);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button7);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button8);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button9);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button10);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button11);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button12);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button13);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button14);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button15);
        boton.setText("O");
        boton=(Button) findViewById(R.id.button16);
        boton.setText("O");
    }


    String conb1="",conb2="",conb3="",conb4="",conb5="",conb6="",conb7="",conb8="",conb9="",conb10="",conb11="",conb12="",conb13="",conb14="",conb15="",conb16="";
    int usoi0=0,usoi1=0,usoi2=0,usoi3=0,usoi4=0,usoi5=0,usoi6=0,usoi7=0;

    public void InitRand(ArrayList<String> arr, Random r){
        int anterior=0;
        while(conb1.equals("")||conb2.equals("")||conb3.equals("")||conb4.equals("")||conb5.equals("")||conb6.equals("")||conb7.equals("")||conb8.equals("")||conb9.equals("")||conb10.equals("")||conb11.equals("")||conb12.equals("")||conb13.equals("")||conb14.equals("")||conb15.equals("")||conb16.equals("")){
            if(conb1.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb1= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb1= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb1= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb1= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb1= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb1= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb1= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb1= arr.get(ra);usoi7++;}  }

        }
            if(conb2.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb2= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb2= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb2= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb2= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb2= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb2= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb2= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb2= arr.get(ra);usoi7++;}  }

            }

            if(conb3.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb3= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb3= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb3= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb3= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb3= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb3= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb3= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb3= arr.get(ra);usoi7++;}  }

            }
            if(conb4.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb4= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb4= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb4= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb4= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb4= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb4= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb4= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb4= arr.get(ra);usoi7++;}  }

            }
            if(conb5.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb5= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb5= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb5= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb5= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb5= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb5= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb5= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb5= arr.get(ra);usoi7++;}  }

            }
            if(conb6.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb6= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb6= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb6= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb6= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb6= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb6= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb6= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb6= arr.get(ra);usoi7++;}  }

            }
            if(conb7.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb7= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb7= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb7= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb7= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb7= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb7= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb7= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb7= arr.get(ra);usoi7++;}  }

            }
            if(conb8.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb8= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb8= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb8= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb8= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb8= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb8= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb8= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb8= arr.get(ra);usoi7++;}  }

            }
            if(conb9.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb9= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb9= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb9= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb9= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb9= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb9= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb9= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb9= arr.get(ra);usoi7++;}  }

            }
            if(conb10.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb10= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb10= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb10= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb10= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb10= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb10= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb10= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb10= arr.get(ra);usoi7++;}  }

            }
            if(conb11.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb11= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb11= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb11= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb11= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb11= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb11= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb11= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb11= arr.get(ra);usoi7++;}  }

            }
            if(conb12.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb12= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb12= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb12= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb12= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb12= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb12= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb12= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb12= arr.get(ra);usoi7++;}  }

            }
            if(conb13.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb13= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb13= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb13= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb13= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb13= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb13= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb13= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb13= arr.get(ra);usoi7++;}  }

            }
            if(conb14.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb14= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb14= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb14= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb14= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb14= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb14= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb14= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb14= arr.get(ra);usoi7++;}  }

            }
            if(conb15.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb15= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb15= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb15= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb15= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb15= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb15= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb15= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb15= arr.get(ra);usoi7++;}  }

            }
            if(conb16.equals("")){
                int ra=r.nextInt(arr.size());

                if(ra==0){  if(usoi0<=1){conb16= arr.get(ra);usoi0++;}  }
                if(ra==1){  if(usoi1<=1){conb16= arr.get(ra);usoi1++;}  }
                if(ra==2){  if(usoi2<=1){conb16= arr.get(ra);usoi2++;}  }
                if(ra==3){  if(usoi3<=1){conb16= arr.get(ra);usoi3++;}  }
                if(ra==4){  if(usoi4<=1){conb16= arr.get(ra);usoi4++;}  }
                if(ra==5){  if(usoi5<=1){conb16= arr.get(ra);usoi5++;}  }
                if(ra==6){  if(usoi6<=1){conb16= arr.get(ra);usoi6++;}  }
                if(ra==7){  if(usoi7<=1){conb16= arr.get(ra);usoi7++;}  }

            }
     }
    }



    int pareja=0,start=0,rand=0,posant=0,parencontrado=0,bloqueo=0;
    String x="",ant="";
    ArrayList<String> num_list = new ArrayList<String>();
    Random r = new Random();
    Thread t = new Thread();
    android.os.Handler h = new android.os.Handler();

    //botonaction

    public void BotonAction(final Button b , Button b2, String contenido){
        if (b.getText().equals("O")) {//la idea es ver si la carta esta volteada o no

            if (pareja == 0) {
                b.setText(contenido);
                pareja++;
                ant = contenido;
                botonant = b;
            } else {
                b.setText(contenido);

                if (ant.equals(contenido)) {//encontro pareja
                    if (parencontrado == 8) {
                        //victoria
                        b2 = (Button) findViewById(R.id.button17);
                        b2.setText("Victoria!");
                    } else {
                        //num_list.remove(rand);
                        parencontrado++;
                        pareja = 0;
                    }

                } else {//no encontro pareja
                    bloqueo = 1;
                    h.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            botonant.setText("O");
                            b.setText("O");

                        }
                    }, 1000);

                    h.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            bloqueo = 0;
                            pareja = 0;
                        }
                    }, 1500);


                }
            }
        }
    }

    //clicklisen

    public void ClickBoton(View view) throws InterruptedException {
        if(start==0){
        num_list.add("1");num_list.add("2");num_list.add("3");num_list.add("4");num_list.add("5");num_list.add("6");num_list.add("7");num_list.add("8");start=1;InitRand(num_list,r);}

       // rand=r.nextInt(num_list.size());

        switch (view.getId()) {
            case R.id.button:
              if(bloqueo==0) {
                  boton = (Button) findViewById(R.id.button);
                  BotonAction(boton,boton2,conb1);
              }

                break;

            case R.id.button2:
               // rand=r.nextInt(num_list.size()-1); x=Integer.toString(rand);
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button2);
                    BotonAction(boton,boton2,conb2);
                }
               // boton.setText(x);
                //num_list.remove(0);
                break;

            case R.id.button3:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button3);
                    BotonAction(boton,boton2,conb3);
                }
                break;

            case R.id.button4:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button4);
                    BotonAction(boton,boton2,conb4);
                }

                break;

            case R.id.button5:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button5);
                    BotonAction(boton,boton2,conb5);
                }

                break;

            case R.id.button6:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button6);
                    BotonAction(boton,boton2,conb6);
                }

                break;

            case R.id.button7:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button7);
                    BotonAction(boton,boton2,conb7);
                }

                break;

            case R.id.button8:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button8);
                    BotonAction(boton,boton2,conb8);
                }

                break;

            case R.id.button9:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button9);
                    BotonAction(boton,boton2,conb9);
                }

                break;

            case R.id.button10:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button10);
                    BotonAction(boton,boton2,conb10);
                }

                break;

            case R.id.button11:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button11);
                    BotonAction(boton,boton2,conb11);
                }

                break;

            case R.id.button12:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button12);
                    BotonAction(boton,boton2,conb12);
                }

                break;

            case R.id.button13:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button13);
                    BotonAction(boton,boton2,conb13);
                }

                break;

            case R.id.button14:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button14);
                    BotonAction(boton,boton2,conb14);
                }

                break;

            case R.id.button15:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button15);
                    BotonAction(boton,boton2,conb15);
                }

                break;

            case R.id.button16:
                if(bloqueo==0) {
                    boton = (Button) findViewById(R.id.button16);
                    BotonAction(boton,boton2,conb16);
                }

                break;

        }
        if (parencontrado==8) {
            //victoria
            boton = (Button) findViewById(R.id.button17);
            boton.setText("Victoria!");
        }
    }
}
