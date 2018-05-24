package e.pc.losowanko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    TextView losOne;
    TextView losTwo;
    TextView losThree;
    TextView losFour;
    TextView losFive;
    TextView losSix;

    TextView textWynik;
    TextView licznikText;

    Button buttonAction;
    Button clickRes;

    Random ran1;
    Random ran2;
    Random ran3;
    Random ran4;
    Random ran5;
    Random ran6;


    int res1;
    int res2;
    int res3;
    int res4;
    int res5;
    int res6;

    int licznik;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        losOne = findViewById(R.id.losOne);
        losTwo = findViewById(R.id.losTwo);
        losThree = findViewById(R.id.losThree);
        losFour = findViewById(R.id.losFour);
        losFive = findViewById(R.id.losFive);
        losSix = findViewById(R.id.losSix);

        textWynik = findViewById(R.id.textWynik);
        licznikText = findViewById(R.id.licznikText);

        buttonAction = findViewById(R.id.buttonAction);
        clickRes = findViewById(R.id.clickRes);



        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textWynik.setText(String.valueOf(""));

              //  buttonAction.setVisibility(View.INVISIBLE);


                ran1 = new Random();
                ran2 = new Random();
                ran3 = new Random();
                ran4 = new Random();
                ran5 = new Random();
                ran6 = new Random();

                res1 = ran1.nextInt(5)+1;
                res2 = ran2.nextInt(5)+1;
                res3 = ran3.nextInt(5)+1;
                res4 = ran4.nextInt(5)+1;
                res5 = ran5.nextInt(5)+1;
                res6 = ran6.nextInt(5)+1;

                licznik++;

                licznikText.setText(String.valueOf(licznik));


                Log.d("Hello","Click");


                losOne.setText(String.valueOf(res1));
                losTwo.setText(String.valueOf(res2));
                losThree.setText(String.valueOf(res3));
                losFour.setText(String.valueOf(res4));
                losFive.setText(String.valueOf(res5));
                losSix.setText(String.valueOf(res6));

                if((res1 == res5)&&(res1 == res3) || (res4 == res2) && (res4 == res6))
                {
                    if(res2==res5)
                    {
                        buttonAction.setVisibility(View.INVISIBLE);
                        textWynik.setText(String.valueOf("Przegrana :)"));
                        clickRes.setVisibility(View.VISIBLE);
                    }
                    else {
                        buttonAction.setVisibility(View.INVISIBLE);
                        textWynik.setText(String.valueOf("Wygrywasz Piwo!"));
                        clickRes.setVisibility(View.VISIBLE);
                    }
                }



            }
        });

        clickRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWynik.setText(String.valueOf(""));
                res1=0;
                res2=0;
                res3=0;
                res4=0;
                res5=0;
                res6=0;
                licznik=0;
                licznikText.setText(String.valueOf(licznik));

                losOne.setText(String.valueOf(res1));
                losTwo.setText(String.valueOf(res2));
                losThree.setText(String.valueOf(res3));
                losFour.setText(String.valueOf(res4));
                losFive.setText(String.valueOf(res5));
                losSix.setText(String.valueOf(res6));

                clickRes.setVisibility(View.INVISIBLE);
                buttonAction.setVisibility(View.VISIBLE);
            }
        });




    }

}
