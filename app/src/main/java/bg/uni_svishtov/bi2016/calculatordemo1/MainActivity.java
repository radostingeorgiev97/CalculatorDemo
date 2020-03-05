package bg.uni_svishtov.bi2016.calculatordemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int state;
    public static final int FIRST_ARGUMENT = 1;
    public static final int SECOND_ARGUMENT = 2;
    public static final int DISPLAY_RESULT = 3;

    private String firstArgument ;
    private String secondArgument ;
    private boolean dotPressed;

    private TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
        reinitialize();

    }
    public void reinitialize() {
        firstArgument = "";
        secondArgument = "";
        dotPressed = false;
        state = FIRST_ARGUMENT;
        screen.setText("0");
    }

    public void append(String string){
        if (state==FIRST_ARGUMENT){
            firstArgument = firstArgument+string;
            screen.setText(firstArgument);
        }
        else if(state==SECOND_ARGUMENT){
            secondArgument=secondArgument+string;
            screen.setText(secondArgument);
        }
        else {
            reinitialize();
        }

    }



    public void onClick(View view){
        switch (view.getId()){
            case R.id.one:
                append("1");
                break;
            case R.id.two:
                append("2");
                break;
            case R.id.three:
                append("3");
                break;
            case R.id.four:
                append("4");
                break;
            case R.id.five:
                append("5");
                break;
            case R.id.six:
                append("6");
                break;
            case R.id.seven:
                append("7");
                break;
            case R.id.eight:
                append("8");
                break;
            case R.id.nine:
                append("9");
                break;
            case R.id.zero:
                if (state==FIRST_ARGUMENT){
                    if (!firstArgument.equals("0")){
                        firstArgument+="0";
                    }
                    screen.setText(firstArgument);
                }
                else if(state==SECOND_ARGUMENT){
                    if (!secondArgument.equals("0")){
                        secondArgument+="0";
                    }
                    screen.setText(secondArgument);
                }
                else {
                    reinitialize();
                }
                break;
            case R.id.plus:
                break;
            case R.id.minus:
                break;
            case R.id.by:
                break;
            case R.id.divide:
                break;
            case R.id.equal:
                break;
            case R.id.dot:
                if (!dotPressed){
                    append(".");
                    dotPressed = true;
                }

                break;

        }

    }
}
