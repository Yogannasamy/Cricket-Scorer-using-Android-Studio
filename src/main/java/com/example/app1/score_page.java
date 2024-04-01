package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class score_page extends AppCompatActivity {
    TextView totalScore, totalWicket, totalOver, totalBall, runRate, zero, one, two, three, four, five, six, fstline, inngsscore, reqruns, gover, sbatsman, nsbatsman, obow1, rn1, rn2, bl1, bl2, sr1, sr2, mdn, ors, wck;
    CheckBox wicketbtn, noballbtn, byesbtn, widebtn;
    Button restartbtn;
    int score = 0, boll = 0, over = 0, wcket = 0, chkover, target, inngsend = 0, rball, finw, finr, trget, scr = 0;
    float avg = 0, bolll, avgscore, avgover;
    String hname, vname, tover, openingStriker, openingNonStriker, openingBowler, opted, toss, currentBatsman, nonStriker;
    int runsScored1 = 0, runsScored2 = 0;
    int ballsFaced1 = 0, ballsFaced2 = 0;
    float strikeRate1 = 0, strikeRate2 = 0;
    int oversBowledCount = 0, maidensBowledCount = 0, wicketsTakenCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);
        totalScore = findViewById(R.id.totalScore);
        totalWicket = findViewById(R.id.totalWicket);
        totalOver = findViewById(R.id.totalOver);
        totalBall = findViewById(R.id.totalBall);
        runRate = findViewById(R.id.runRate);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        fstline = findViewById(R.id.fstline);
        wicketbtn = findViewById(R.id.wicketbtn);
        noballbtn = findViewById(R.id.noballbtn);
        byesbtn = findViewById(R.id.byesbtn);
        widebtn = findViewById(R.id.widebtn);
        inngsscore = findViewById(R.id.inngsscore);
        reqruns = findViewById(R.id.reqruns);
        gover = findViewById(R.id.gover);
        restartbtn = findViewById(R.id.restartbtn);
        sbatsman = findViewById(R.id.sbatsman);
        nsbatsman = findViewById(R.id.nsbatsman);
        obow1 = findViewById(R.id.obow1);
        rn1 = findViewById(R.id.rn1);
        rn2 = findViewById(R.id.rn2);
        bl1 = findViewById(R.id.bl1);
        bl2 = findViewById(R.id.bl2);
        sr1 = findViewById(R.id.sr1);
        sr2 = findViewById(R.id.sr2);
        mdn = findViewById(R.id.mdn1);
        ors = findViewById(R.id.ors1);
        wck = findViewById(R.id.wck1);


        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            hname = bundle.getString("hname");
            vname = bundle.getString("vname");
            tover = bundle.getString("over");
            toss = bundle.getString("toss");
            opted = bundle.getString("opted");
            openingStriker = bundle.getString("openingStriker");
            openingNonStriker = bundle.getString("openingNonStriker");
            openingBowler = bundle.getString("openingBowler");
            currentBatsman = openingStriker;
            nonStriker = openingNonStriker;
            sbatsman.setText(" " + openingStriker);
            nsbatsman.setText("" + openingNonStriker);
            obow1.setText(" " + openingBowler);

        }
        chkover = Integer.parseInt(tover);
        Toast.makeText(this, "" + toss + " has won the toss and elected to " + opted + " First " + tover + " over", Toast.LENGTH_SHORT).show();
        rball = Integer.parseInt(tover) * 6;
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = score + 0;
                wideCheck();
                noballCheck();
                boll = boll + 1;
                overCheck();
                totalScore.setText("" +toss+ "," + score + " -");
                totalBall.setText("" + boll + ")");
                avg();
                wicketCheck();
                endovercheck();
                checkIfOverCompleted();
                if (inngsend == 1) {
                    if (over == 0 && boll == 00) {
                        target = target;
                    } else {
                        target = target - 0;
                    }
                }
                updateScore(0);
                addScoreToBatsman(0);

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score = score + 1;
                boll = boll + 1;
                overCheck();
                totalScore.setText(""+toss+ "," + score + " -");
                totalBall.setText("" + boll + ")");
                avg();
                wicketCheck();
                endovercheck();
                checkIfOverCompleted();
                if (inngsend == 1) {
                    if (over == 0 && boll == 00) {
                        target = target;
                    } else {
                        target = target - 1;
                    }
                }
                updateScore(1);
                addScoreToBatsman(1);

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score = score + 2;
                boll = boll + 1;
                overCheck();
                totalScore.setText("" +toss+ "," + score + " -");
                totalBall.setText("" + boll + ")");
                avg();
                wicketCheck();
                endovercheck();
                checkIfOverCompleted();
                if (inngsend == 1) {
                    if (over == 0 && boll == 00) {
                        target = target;
                    } else {
                        target = target - 2;
                    }
                }
                updateScore(2);
                addScoreToBatsman(2);

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score = score + 3;
                boll = boll + 1;
                overCheck();
                totalScore.setText("" +toss + "," + score + " -");
                totalBall.setText("" + boll + ")");
                avg();
                wicketCheck();
                endovercheck();
                checkIfOverCompleted();
                if (inngsend == 1) {
                    if (over == 0 && boll == 00) {
                        target = target;
                    } else {
                        target = target - 3;
                    }
                }
                updateScore(3);
                addScoreToBatsman(3);

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score = score + 4;
                boll = boll + 1;
                overCheck();
                totalScore.setText(""+toss+ "," + score + " -");
                totalBall.setText("" + boll + ")");
                avg();
                wicketCheck();
                endovercheck();
                checkIfOverCompleted();
                if (inngsend == 1) {
                    if (over == 0 && boll == 00) {
                        target = target;
                    } else {
                        target = target - 4;
                    }
                }
                updateScore(4);
                addScoreToBatsman(4);

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score = score + 5;
                boll = boll + 1;
                overCheck();
                totalScore.setText(""+toss+ "," + score + " -");
                totalBall.setText("" + boll + ")");
                avg();
                wicketCheck();
                endovercheck();
                checkIfOverCompleted();
                if (inngsend == 1) {
                    if (over == 0 && boll == 00) {
                        target = target;
                    } else {
                        target = target - 5;
                    }
                }
                updateScore(5);
                addScoreToBatsman(5);

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wideCheck();
                noballCheck();
                score = score + 6;
                boll = boll + 1;
                overCheck();
                totalScore.setText(""+toss+"," + score + " -");
                totalBall.setText("" + boll + ")");
                avg();
                wicketCheck();
                endovercheck();
                checkIfOverCompleted();
                addScoreToBatsman(6);
                if (inngsend == 1) {
                    if (over == 0 && boll == 00) {
                        target = target;
                    } else {
                        target = target - 6;
                    }
                }
                updateScore(6);


            }
        });

    }


    public void avg() {
        avgscore = score;
        bolll = boll;
        if (over == 0) {
            avgover = bolll / 10;
        } else {
            avgover = over;
        }
        avg = avgscore / avgover;
        runRate.setText("Current runrate : " + avg);
    }


    public void overCheck() {
        if (boll == 6) {
            over = over + 1;
            totalOver.setText("(" + over + ".");
            boll = 0;
        }
    }

    private void checkIfOverCompleted() {
        if (boll == 0 && over != 0) {
            // Automatically ask for the new bowler
            swapBatsmen();
            askForNewBowler();
        }
    }


    public void wideCheck() {
        if (widebtn.isChecked() && boll != 0) {
            score = score + 1;
            boll = boll - 1;
            rball++;
        } else if (widebtn.isChecked() && boll == 0) {
            score = score + 1;
            boll = boll - 1;
            rball++;
        }
        widebtn.setChecked(false);
    }

    public void noballCheck() {
        if (noballbtn.isChecked() && boll != 0) {
            score = score + 1;
            boll = boll - 1;
        } else if (noballbtn.isChecked() && boll == 0) {
            score = score + 1;
            boll = boll - 1;
        }
        noballbtn.setChecked(false);
    }

    private void selectNewBatsman() {
        // Start NewBatsmanActivity to select new batsman
        Intent intent = new Intent(score_page.this, nbat_bowl.class);
        startActivityForResult(intent, 1001);
    }

    private void askForNewBowler() {
        Intent intent = new Intent(score_page.this, nbow.class);
        startActivityForResult(intent, 1002);
    }

    public void endovercheck() {
        if (over == chkover) {
            start2ndInngs();
        }
    }

    public void wicketCheck() {
        if (wicketbtn.isChecked()) {
            wcket++;
            totalWicket.setText(" " + wcket);
            runsScored1 = 0;
            ballsFaced1 = 0;
            strikeRate1 = 0;
            rn1.setText("0");
            bl1.setText("0");
            sr1.setText("0");

            wicketbtn.setChecked(false);

            if (wcket == 10) {
                start2ndInngs();
            } else {
                selectNewBatsman();
            }
            updateWicketsTaken();


        }
    }
    public void byesCheck() {
        if (wicketbtn.isChecked()) {

        }
        byesbtn.setChecked(false);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && data != null) {
            switch (requestCode) {
                case 1001: // Handling result for selecting new batsman
                    String newBatsman = data.getStringExtra("newBatsmanName");
                    if (currentBatsman.equals(openingStriker)) {
                        currentBatsman = newBatsman;
                        sbatsman.setText(" " + currentBatsman);
                    } else {
                        nonStriker = newBatsman;
                        sbatsman.setText("" + nonStriker);
                    }
                    break;

                case 1002: // Handling result for selecting new bowler
                    String newBowlerName = data.getStringExtra("newBowlerName");
                    obow1.setText(" " + newBowlerName);
                    break;

                case 1003: // Handling result for selecting new players after first innings
                    String selectedStriker = data.getStringExtra("selectedStriker");
                    String selectedNonStriker = data.getStringExtra("selectedNonStriker");
                    String selectedBowler = data.getStringExtra("selectedBowler");

                    currentBatsman = selectedStriker;
                    nonStriker = selectedNonStriker;
                    openingBowler = selectedBowler;

                    sbatsman.setText(" " + currentBatsman);
                    nsbatsman.setText("" + nonStriker);
                    obow1.setText(" " + openingBowler);
                    break;
            }
        }
    }

    public void start2ndInngs() {
        if (inngsend == 0) {
            inngsend = 1;
            target = score + 1;
            finw = wcket;
            finr = score;
            inngsscore.setText("1st innings score\n" + toss + " :- " + finr + "/" + finw + "");

            // Reset scores for second innings
            score = 0;
            over = 0;
            wcket = 0;
            avg = 0;
            boll = 0;
            runsScored1 = 0;
            runsScored2 = 0;
            ballsFaced1 = 0;
            ballsFaced2 = 0;
            strikeRate1 = 0;
            strikeRate2 = 0;
            rn1.setText("0");
            rn2.setText("0");
            bl1.setText("0");
            bl2.setText("0");
            sr1.setText("0");
            sr2.setText("0");

            // Reset batsmen to opening batsmen
            currentBatsman = openingStriker;
            nonStriker = openingNonStriker;
            sbatsman.setText(" " + openingStriker);
            nsbatsman.setText("" + openingNonStriker);

            // Reset bowler to opening bowler
            obow1.setText(" " + openingBowler);

            // Update UI elements
            fstline.setText("2nd innings                    Target ( " + target + " )");
            totalScore.setText("" + vname + " ," + score + " -");
            totalBall.setText("" + boll + ")");

            float a = target;
            float b = chkover;
            runRate.setText("Required runrate : " + a / b);
            totalOver.setText("(" + over + ".");
            totalWicket.setText(" " + wcket);
            totalBall.setText("" + boll + ")");
            trget = target;
            reqruns.setText("Need " + target + " runs from " + rball + " balls");

            // Start player selection for the second innings
            Intent playerSelectionIntent = new Intent(score_page.this, playerSelectionActivity.class);
            startActivityForResult(playerSelectionIntent, 1003);
        }
    }


    public void disableButtons() {
        zero.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
    }


    public void addScoreToBatsman(int runs) {
        // Update runs scored for the current batsman
        if (currentBatsman.equals(openingStriker)) {
            runsScored1 += runs;
            rn1.setText(String.valueOf(runsScored1));
        } else {
            runsScored2 += runs;
            rn2.setText(String.valueOf(runsScored2));
        }

        // Update balls faced for the current batsman
        if (currentBatsman.equals(openingStriker)) {
            ballsFaced1++;
            bl1.setText(String.valueOf(ballsFaced1));
        } else {
            ballsFaced2++;
            bl2.setText(String.valueOf(ballsFaced2));
        }

        // Update strike rate for the current batsman
        if (ballsFaced1 > 0) {
            strikeRate1 = (float) runsScored1 / ballsFaced1 * 100;
            sr1.setText(String.format("%.2f", strikeRate1));
        }
        if (ballsFaced2 > 0) {
            strikeRate2 = (float) runsScored2 / ballsFaced2 * 100;
            sr2.setText(String.format("%.2f", strikeRate2));
        }
    }

    public void updateBowlingStats() {
        // Calculate overs count based on the number of balls bowled
        int ballsInCurrentOver = boll % 6;
        float currentOversCount = oversBowledCount + (float) ballsInCurrentOver / 10;

        // If it's not the first over and the first ball, increment overs count by 1
        if (boll > 0 && ballsInCurrentOver == 0) {
            oversBowledCount++;
            currentOversCount = oversBowledCount;
        }

        // Update TextViews with new values
        ors.setText(String.format("%.1f", currentOversCount));
        mdn.setText(String.valueOf(maidensBowledCount));
    }


    public void updateWicketsTaken() {
        wicketsTakenCount++;
        wck.setText(String.valueOf(wicketsTakenCount));
    }

    private void swapBatsmen() {
        // Swap the current batsman with the non-striker
        String temp = currentBatsman;
        currentBatsman = nonStriker;
        nonStriker = temp;

        // Update TextViews with new batsmen's names
        sbatsman.setText(" " + currentBatsman);
        nsbatsman.setText("" + nonStriker);
    }
    public void updateScore(int runs) {
        // Update the score
        totalScore.setText("" + score + " -");

        // Swap batsman if runs are odd
        if (runs % 2 != 0) {
            String temp = currentBatsman;
            currentBatsman = nonStriker;
            nonStriker = temp;
            // Update TextViews with new batsmen's names
            sbatsman.setText(" " + currentBatsman);
            nsbatsman.setText("" + nonStriker);


        }
        Log.d("BatsmanSwitch", "Current batsman switched to: " + currentBatsman);


        inngsscndextra();
        updateBowlingStats();

    }
        public void inngsscndextra(){
            if (inngsend == 1) {
                if (over == 0 && boll == 0) {
                    rball = rball;
                } else {
                    rball--;
                }
                reqruns.setText("Need " + target + " runs from " + rball + " balls");
                if (rball == 0 || wcket == 10 || score >= trget) {
                    String winningteam = " ";
                    String result = " ";
                    int trgett = trget - 1;
                    if (score >= trget) {
                        // Batting second team wins by exceeding the target
                        winningteam = vname;
                        result = winningteam + " won by " + (10 - wcket) + " wickets";
                        gover.setText("Game Over: " + result);
                    } else if (score < trget && wcket == 10) {
                        // Batting first team wins by restricting the second team to less than the target
                        winningteam = toss;
                        result = winningteam + " won by " + (trget - score - 1) + " runs"; // Runs needed by the batting first team to win
                        gover.setText("Game Over: " + result);
                    } else if (score >= trget && wcket < 10) {
                        // Batting first team wins by taking all 10 wickets of the second team before they reach the target
                        winningteam = toss;
                        result = winningteam + " won by " + (10 - wcket) + " wickets";
                        gover.setText("Game Over: " + result);
                    } else {
                        // Match drawn
                        gover.setText("Game Over: Match Drawn");
                    }
                    disableButtons();
                }

                restartbtn.setVisibility(View.VISIBLE);
                restartbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(score_page.this, MainActivity.class);
                        startActivity(intent);
                    }
                });

            }
        }
    }
