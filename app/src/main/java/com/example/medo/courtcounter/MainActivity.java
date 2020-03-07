package com.example.medo.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA,scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void oneA(View view){
        pointAdderA(1);
    }
    public void twoA(View view){
        pointAdderA(2);
    }
    public void threeA(View view){
        pointAdderA(3);
    }
    public void oneB(View view){
        pointAdderB(1);
    }
    public void twoB(View view){
        pointAdderB(2);
    }
    public void threeB(View view){
        pointAdderB(3);
    }


    public void pointAdderA(int x){
        scoreA = scoreA + x;
        TextView scoreATextView = (TextView) findViewById(R.id.score_A);
        scoreATextView.setText(""+scoreA);
    }
    public void pointAdderB(int x){
        scoreB = scoreB + x;
        TextView scoreBTextView = (TextView) findViewById(R.id.score_B);
        scoreBTextView.setText(""+scoreB);
    }
    public void pointReset(View view){
        TextView scoreATextView = (TextView) findViewById(R.id.score_A);
        TextView scoreBTextView = (TextView) findViewById(R.id.score_B);
        scoreATextView.setText(""+0);
        scoreBTextView.setText(""+0);
        scoreA=0;
        scoreB=0;
    }
}
