package com.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView goalsTeamA, goalsTeamB, foulsTeamA, foulsTeamB;
    int goalsA, goalsB, foulsA, foulsB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadViews();
    }

    private void loadViews() {
        goalsTeamA = (TextView) findViewById(R.id.goalsTeamA);
        goalsTeamB = (TextView) findViewById(R.id.goalsTeamB);
        foulsTeamA = (TextView) findViewById(R.id.foulsTeamA);
        foulsTeamB = (TextView) findViewById(R.id.foulsTeamB);
    }

    public void resetScores(View view) {
        setContentView(R.layout.activity_main);
        loadViews();
        setStartValues();
    }

    private void setStartValues() {
        goalsA = 0;
        goalsB = 0;
        foulsA = 0;
        foulsB = 0;
    }

    public void goalsTeamAButton(View view) {
        goalsA++;
        goalsTeamA.setText(String.valueOf(goalsA));
    }

    public void foulsTeamAButton(View view) {
        foulsA++;
        foulsTeamA.setText(String.valueOf(foulsA));
    }

    public void goalsTeamBButton(View view) {
        goalsB++;
        goalsTeamB.setText(String.valueOf(goalsB));

    }

    public void foulsTeamBButton(View view) {
        foulsB++;
        foulsTeamB.setText(String.valueOf(foulsB));
    }
}
