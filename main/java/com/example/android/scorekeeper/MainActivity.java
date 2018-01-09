package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA=0;
    private int shootsA=0;
    private int foulsA=0;
    private int yellowsA=0;
    private int redsA=0;

    private int scoreB=0;
    private int shootsB=0;
    private int foulsB=0;
    private int yellowsB=0;
    private int redsB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Button action methods

    //Team A

    public void addGoalTeamA(View view){
        scoreA++;
        shootsA++;
        displayScoreForTeamA(scoreA);
        displayShootsForTeamA(shootsA);
    }

    public void addShootTeamA(View view){
        shootsA++;
        displayShootsForTeamA(shootsA);
    }

    public void addFoulTeamA(View view){
        foulsA++;
        displayFoulsForTeamA(foulsA);
    }

    public void addYellowTeamA(View view){
        yellowsA++;
        displayYellowsForTeamA(yellowsA);
    }

    public void addRedTeamA(View view){
        redsA++;
        displayRedsForTeamA(redsA);
    }


    //Team B

    public void addGoalTeamB(View view){
        scoreB++;
        shootsB++;
        displayScoreForTeamB(scoreB);
        displayShootsForTeamB(shootsB);
    }

    public void addShootTeamB(View view){
        shootsB++;
        displayShootsForTeamB(shootsB);
    }

    public void addFoulTeamB(View view){
        foulsB++;
        displayFoulsForTeamB(foulsB);
    }

    public void addYellowTeamB(View view){
        yellowsB++;
        displayYellowsForTeamB(yellowsB);
    }

    public void addRedTeamB(View view){
        redsB++;
        displayRedsForTeamB(redsB);
    }


    //Reset Button
    public void resetButton(View view) {
        scoreA=0;
        shootsA=0;
        foulsA=0;
        yellowsA=0;
        redsA=0;

        scoreB=0;
        shootsB=0;
        foulsB=0;
        yellowsB=0;
        redsB=0;

        displayScoreForTeamA(scoreA);
        displayShootsForTeamA(shootsA);
        displayFoulsForTeamA(foulsA);
        displayYellowsForTeamA(yellowsA);
        displayRedsForTeamA(redsA);

        displayScoreForTeamB(scoreB);
        displayShootsForTeamB(shootsB);
        displayFoulsForTeamB(foulsB);
        displayYellowsForTeamB(yellowsB);
        displayRedsForTeamB(redsB);

    }

    //Display Methods

    //Display methods for A team
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayShootsForTeamA(int shoots) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_shoots);
        scoreView.setText(String.valueOf(shoots));
    }

    public void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayYellowsForTeamA(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellows);
        scoreView.setText(String.valueOf(cards));
    }

    public void displayRedsForTeamA(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_reds);
        scoreView.setText(String.valueOf(cards));
    }


    //Display methods for A team
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayShootsForTeamB(int shoots) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_shoots);
        scoreView.setText(String.valueOf(shoots));
    }

    public void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayYellowsForTeamB(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellows);
        scoreView.setText(String.valueOf(cards));
    }

    public void displayRedsForTeamB(int cards) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_reds);
        scoreView.setText(String.valueOf(cards));
    }



}
