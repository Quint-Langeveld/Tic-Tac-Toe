package com.example.qlangeveld.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Integer visibilityButton10 = button10.getVisibility();
        Integer visibilityCross10 = cross10.getVisibility();
        Integer visibilityCirlce10 = circle10.getVisibility();
        outState.putInt("VisibilityButton10", visibilityButton10);
        outState.putInt("VisibilityCross10", visibilityCirlce10);
        outState.putInt("VisibilityCircle10", visibilityCross10);


        Integer visibilityButton11 = button11.getVisibility();
        Integer visibilityCross11 = cross11.getVisibility();
        Integer visibilityCirlce11 = circle11.getVisibility();
        outState.putInt("VisibilityButton11", visibilityButton11);
        outState.putInt("VisibilityCircle11", visibilityCirlce11);
        outState.putInt("VisibilityCross11", visibilityCross11);

        Integer visibilityButton12 = button12.getVisibility();
        Integer visibilityCross12 = cross12.getVisibility();
        Integer visibilityCirlce12 = circle12.getVisibility();
        outState.putInt("VisibilityButton12", visibilityButton12);
        outState.putInt("VisibilityCircle12", visibilityCirlce12);
        outState.putInt("VisibilityCross12", visibilityCross12);

        Integer visibilityButton13 = button13.getVisibility();
        Integer visibilityCross13 = cross13.getVisibility();
        Integer visibilityCirlce13 = circle13.getVisibility();
        outState.putInt("VisibilityButton13", visibilityButton13);
        outState.putInt("VisibilityCircle13", visibilityCirlce13);
        outState.putInt("VisibilityCross13", visibilityCross13);

        Integer visibilityButton14 = button14.getVisibility();
        Integer visibilityCross14 = cross14.getVisibility();
        Integer visibilityCirlce14 = circle14.getVisibility();
        outState.putInt("VisibilityButton14", visibilityButton14);
        outState.putInt("VisibilityCircle14", visibilityCirlce14);
        outState.putInt("VisibilityCross14", visibilityCross14);

        Integer visibilityButton15 = button15.getVisibility();
        Integer visibilityCross15 = cross15.getVisibility();
        Integer visibilityCirlce15 = circle15.getVisibility();
        outState.putInt("VisibilityButton15", visibilityButton15);
        outState.putInt("VisibilityCross15", visibilityCross15);
        outState.putInt("VisibilityCircle15", visibilityCirlce15);

        Integer visibilityButton16 = button16.getVisibility();
        Integer visibilityCross16 = cross16.getVisibility();
        Integer visibilityCirlce16 = circle16.getVisibility();
        outState.putInt("VisibilityButton16", visibilityButton16);
        outState.putInt("VisibilityCross16", visibilityCross16);
        outState.putInt("VisibilityCircle16", visibilityCirlce16);

        Integer visibilityButton17 = button17.getVisibility();
        Integer visibilityCross17 = cross17.getVisibility();
        Integer visibilityCirlce17 = circle17.getVisibility();
        outState.putInt("VisibilityButton17", visibilityButton17);
        outState.putInt("VisibilityCross17", visibilityCross17);
        outState.putInt("VisibilityCircle17", visibilityCirlce17);

        Integer visibilityButton18 = button18.getVisibility();
        Integer visibilityCross18 = cross18.getVisibility();
        Integer visibilityCirlce18 = circle18.getVisibility();
        outState.putInt("VisibilityButton18", visibilityButton18);
        outState.putInt("VisibilityCross18", visibilityCross18);
        outState.putInt("VisibilityCircle18", visibilityCirlce18);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        Integer RestroreValueButton10 = inState.getInt("VisibilityButton10");
        Integer RestoreValueCross10 = inState.getInt("VisibilityCross10");
        Integer RestoreValueCircle10 = inState.getInt("VisibilityCircle10");
        circle10.setVisibility(RestoreValueCircle10);
        cross10.setVisibility(RestoreValueCross10);
        button10.setVisibility(RestroreValueButton10);

        Integer RestroreValueButton11 = inState.getInt("VisibilityButton11");
        Integer RestoreValueCross11 = inState.getInt("VisibilityCross11");
        Integer RestoreValueCircle11 = inState.getInt("VisibilityCircle11");
        circle11.setVisibility(RestoreValueCircle11);
        cross11.setVisibility(RestoreValueCross11);
        button11.setVisibility(RestroreValueButton11);

        Integer RestroreValueButton12 = inState.getInt("VisibilityButton12");
        Integer RestoreValueCross12 = inState.getInt("VisibilityCross12");
        Integer RestoreValueCircle12 = inState.getInt("VisibilityCircle12");
        circle12.setVisibility(RestoreValueCircle12);
        cross12.setVisibility(RestoreValueCross12);
        button12.setVisibility(RestroreValueButton12);

        Integer RestroreValueButton13 = inState.getInt("VisibilityButton13");
        Integer RestoreValueCross13 = inState.getInt("VisibilityCross13");
        Integer RestoreValueCircle13 = inState.getInt("VisibilityCircle13");
        circle13.setVisibility(RestoreValueCircle13);
        cross13.setVisibility(RestoreValueCross13);
        button13.setVisibility(RestroreValueButton13);

        Integer RestroreValueButton14 = inState.getInt("VisibilityButton14");
        Integer RestoreValueCross14 = inState.getInt("VisibilityCross14");
        Integer RestoreValueCircle14 = inState.getInt("VisibilityCircle14");
        circle14.setVisibility(RestoreValueCircle14);
        cross14.setVisibility(RestoreValueCross14);
        button14.setVisibility(RestroreValueButton14);

        Integer RestroreValueButton15 = inState.getInt("VisibilityButton15");
        Integer RestoreValueCross15 = inState.getInt("VisibilityCross15");
        Integer RestoreValueCircle15 = inState.getInt("VisibilityCircle15");
        circle15.setVisibility(RestoreValueCircle15);
        cross15.setVisibility(RestoreValueCross15);
        button15.setVisibility(RestroreValueButton15);

        Integer RestroreValueButton16 = inState.getInt("VisibilityButton16");
        Integer RestoreValueCross16 = inState.getInt("VisibilityCross16");
        Integer RestoreValueCircle16 = inState.getInt("VisibilityCircle16");
        circle16.setVisibility(RestoreValueCircle16);
        cross16.setVisibility(RestoreValueCross16);
        button16.setVisibility(RestroreValueButton16);

        Integer RestroreValueButton17 = inState.getInt("VisibilityButton17");
        Integer RestoreValueCross17 = inState.getInt("VisibilityCross17");
        Integer RestoreValueCircle17 = inState.getInt("VisibilityCircle17");
        circle17.setVisibility(RestoreValueCircle17);
        cross17.setVisibility(RestoreValueCross17);
        button17.setVisibility(RestroreValueButton17);

        Integer RestroreValueButton18 = inState.getInt("VisibilityButton18");
        Integer RestoreValueCross18 = inState.getInt("VisibilityCross18");
        Integer RestoreValueCircle18 = inState.getInt("VisibilityCircle18");
        circle18.setVisibility(RestoreValueCircle18);
        cross18.setVisibility(RestoreValueCross18);
        button18.setVisibility(RestroreValueButton18);
    }

    private Boolean playerOneTurn = Boolean.TRUE;
    private Boolean playerTwoTurn = Boolean.FALSE;


    // create all the items in the layout
    Button button10 = findViewById(R.id.button10);
    ImageButton cross10 = findViewById(R.id.cross10);
    ImageButton circle10 = findViewById(R.id.circle10);

    Button button11 = findViewById(R.id.button11);
    ImageButton cross11 = findViewById(R.id.cross11);
    ImageButton circle11 = findViewById(R.id.circle11);

    Button button12 = findViewById(R.id.button12);
    ImageButton cross12 = findViewById(R.id.cross12);
    ImageButton circle12 = findViewById(R.id.circle12);

    Button button13 = findViewById(R.id.button13);
    ImageButton cross13 = findViewById(R.id.cross13);
    ImageButton circle13 = findViewById(R.id.circle13);

    Button button14 = findViewById(R.id.button14);
    ImageButton cross14 = findViewById(R.id.cross14);
    ImageButton circle14 = findViewById(R.id.circle14);

    Button button15 = findViewById(R.id.button15);
    ImageButton cross15 = findViewById(R.id.cross15);
    ImageButton circle15 = findViewById(R.id.circle15);

    Button button16 = findViewById(R.id.button16);
    ImageButton cross16 = findViewById(R.id.cross16);
    ImageButton circle16 = findViewById(R.id.circle16);

    Button button17 = findViewById(R.id.button17);
    ImageButton cross17 = findViewById(R.id.cross17);
    ImageButton circle17 = findViewById(R.id.circle17);

    Button button18 = findViewById(R.id.button18);
    ImageButton cross18 = findViewById(R.id.cross18);
    ImageButton circle18 = findViewById(R.id.circle18);


    public void tileClicked(View view) {
        if (inProgress()) {
            switch (view.getId()) {
                case R.id.button10:
                    if ((cross10.getVisibility() == View.INVISIBLE) && (circle10.getVisibility() == View.INVISIBLE)) {
                        if (playerOneTurn) {
                            cross10.setVisibility(View.VISIBLE);
                            button10.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerTwoTurn = Boolean.TRUE;
                        }
                        if (playerTwoTurn) {
                            circle10.setVisibility(View.VISIBLE);
                            button10.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerOneTurn = Boolean.TRUE;
                        }
                    }
                    break;

                case R.id.button11:
                    if (button11.getVisibility() == View.VISIBLE) {
                        if (playerOneTurn) {
                            cross11.setVisibility(View.VISIBLE);
                            button11.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerTwoTurn = Boolean.TRUE;
                        }
                        if (playerTwoTurn) {
                            circle11.setVisibility(View.VISIBLE);
                            button11.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerOneTurn = Boolean.TRUE;
                        }
                    }break;

                case R.id.button12:
                    if (button12.getVisibility() == View.VISIBLE) {
                        if (playerOneTurn) {
                            cross12.setVisibility(View.VISIBLE);
                            button12.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerTwoTurn = Boolean.TRUE;
                        }
                        if (playerTwoTurn) {
                            circle12.setVisibility(View.VISIBLE);
                            button12.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerOneTurn = Boolean.TRUE;
                        }
                    }break;

                case R.id.button13:
                    if (button13.getVisibility() == View.VISIBLE) {
                        if (playerOneTurn) {
                            cross13.setVisibility(View.VISIBLE);
                            button13.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerTwoTurn = Boolean.TRUE;
                        }
                        if (playerTwoTurn) {
                            circle13.setVisibility(View.VISIBLE);
                            button13.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerOneTurn = Boolean.TRUE;
                        }
                    }break;

                case R.id.button14:
                    if (button14.getVisibility() == View.VISIBLE) {
                        if (playerOneTurn) {
                            cross14.setVisibility(View.VISIBLE);
                            button14.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerTwoTurn = Boolean.TRUE;
                        }
                        if (playerTwoTurn) {
                            circle14.setVisibility(View.VISIBLE);
                            button14.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerOneTurn = Boolean.TRUE;
                        }
                    }break;

                case R.id.button15:
                    if (button15.getVisibility() == View.VISIBLE) {
                        if (playerOneTurn) {
                            cross15.setVisibility(View.VISIBLE);
                            button15.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerTwoTurn = Boolean.TRUE;
                        }
                        if (playerTwoTurn) {
                            circle15.setVisibility(View.VISIBLE);
                            button15.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerOneTurn = Boolean.TRUE;
                        }
                    }break;

                case R.id.button16:
                    if (button16.getVisibility() == View.VISIBLE) {
                        if (playerOneTurn) {
                            cross16.setVisibility(View.VISIBLE);
                            button16.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerTwoTurn = Boolean.TRUE;
                        }
                        if (playerTwoTurn) {
                            circle16.setVisibility(View.VISIBLE);
                            button16.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerOneTurn = Boolean.TRUE;
                        }
                    }break;

                    case R.id.button17:
                        if (button17.getVisibility() == View.VISIBLE) {
                            if (playerOneTurn) {
                                cross17.setVisibility(View.VISIBLE);
                                button17.setVisibility(View.INVISIBLE);
                                playerTwoTurn = Boolean.FALSE;
                                playerTwoTurn = Boolean.TRUE;
                            }
                            if (playerTwoTurn) {
                                circle17.setVisibility(View.VISIBLE);
                                button17.setVisibility(View.INVISIBLE);
                                playerTwoTurn = Boolean.FALSE;
                                playerOneTurn = Boolean.TRUE;
                            }
                        }break;

                case R.id.button18:
                    if (button18.getVisibility() == View.VISIBLE) {
                        if (playerOneTurn) {
                            cross18.setVisibility(View.VISIBLE);
                            button18.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerTwoTurn = Boolean.TRUE;
                        }
                        if (playerTwoTurn) {
                            circle18.setVisibility(View.VISIBLE);
                            button18.setVisibility(View.INVISIBLE);
                            playerTwoTurn = Boolean.FALSE;
                            playerOneTurn = Boolean.TRUE;
                        }
                    }break;
            }
        }
    }

    public void resetClicked(View view) {
        button10.setVisibility(View.VISIBLE);
        cross10.setVisibility(View.INVISIBLE);
        circle10.setVisibility(View.INVISIBLE);

        button11.setVisibility(View.VISIBLE);
        cross11.setVisibility(View.INVISIBLE);
        circle11.setVisibility(View.INVISIBLE);

        button12.setVisibility(View.VISIBLE);
        cross12.setVisibility(View.INVISIBLE);
        circle12.setVisibility(View.INVISIBLE);

        button13.setVisibility(View.VISIBLE);
        cross13.setVisibility(View.INVISIBLE);
        circle13.setVisibility(View.INVISIBLE);

        button14.setVisibility(View.VISIBLE);
        cross14.setVisibility(View.INVISIBLE);
        circle14.setVisibility(View.INVISIBLE);

        button15.setVisibility(View.VISIBLE);
        cross15.setVisibility(View.INVISIBLE);
        circle15.setVisibility(View.INVISIBLE);

        button16.setVisibility(View.VISIBLE);
        cross16.setVisibility(View.INVISIBLE);
        circle16.setVisibility(View.INVISIBLE);

        button17.setVisibility(View.VISIBLE);
        cross17.setVisibility(View.INVISIBLE);
        circle17.setVisibility(View.INVISIBLE);

        button18.setVisibility(View.VISIBLE);
        cross18.setVisibility(View.INVISIBLE);
        circle18.setVisibility(View.INVISIBLE);
    }

    private Boolean inProgress() {
        Boolean check = Boolean.TRUE;
        // cross won
        if ((cross10.getVisibility() == View.VISIBLE) && (cross11.getVisibility() == View.VISIBLE) && (cross12.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((cross13.getVisibility() == View.VISIBLE) && (cross14.getVisibility() == View.VISIBLE) && (cross15.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((cross16.getVisibility() == View.VISIBLE) && (cross17.getVisibility() == View.VISIBLE) && (cross18.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((cross10.getVisibility() == View.VISIBLE) && (cross13.getVisibility() == View.VISIBLE) && (cross16.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((cross11.getVisibility() == View.VISIBLE) && (cross14.getVisibility() == View.VISIBLE) && (cross17.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((cross12.getVisibility() == View.VISIBLE) && (cross15.getVisibility() == View.VISIBLE) && (cross18.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((cross10.getVisibility() == View.VISIBLE) && (cross14.getVisibility() == View.VISIBLE) && (cross18.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((cross12.getVisibility() == View.VISIBLE) && (cross14.getVisibility() == View.VISIBLE) && (cross16.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }

        // circle won
        if ((circle10.getVisibility() == View.VISIBLE) && (circle11.getVisibility() == View.VISIBLE) && (circle12.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((circle13.getVisibility() == View.VISIBLE) && (circle14.getVisibility() == View.VISIBLE) && (circle15.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((circle16.getVisibility() == View.VISIBLE) && (circle17.getVisibility() == View.VISIBLE) && (circle18.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((circle10.getVisibility() == View.VISIBLE) && (circle13.getVisibility() == View.VISIBLE) && (circle16.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((circle11.getVisibility() == View.VISIBLE) && (circle14.getVisibility() == View.VISIBLE) && (circle17.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((circle12.getVisibility() == View.VISIBLE) && (circle15.getVisibility() == View.VISIBLE) && (circle18.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((circle10.getVisibility() == View.VISIBLE) && (circle14.getVisibility() == View.VISIBLE) && (circle18.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }
        if ((circle12.getVisibility() == View.VISIBLE) && (circle14.getVisibility() == View.VISIBLE) && (circle16.getVisibility() == View.VISIBLE)) {
            check = Boolean.FALSE;
        }

        return check;
    }
}
