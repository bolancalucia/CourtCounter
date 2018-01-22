package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0,scoreTeamB = 0;
    final int THREE_POINTS = 3, TWO_POINTS = 2, ONE_POINT = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView =(TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View  view)
    {
        scoreTeamA += THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA (View  view)
    {
        scoreTeamA += TWO_POINTS;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View  view)
    {
        scoreTeamA += ONE_POINT;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView =(TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View  view)
    {
        scoreTeamB += THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB(View  view)
    {
        scoreTeamB += TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View  view)
    {
        scoreTeamB += ONE_POINT;
        displayForTeamB(scoreTeamB);
    }

    public void resetScores(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
