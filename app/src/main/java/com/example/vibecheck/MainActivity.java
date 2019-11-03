package com.example.vibecheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Vibrator vibrator;
    TextView textResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView)findViewById(R.id.editText);
                CharSequence chars = textView.getText();
                String words = chars.toString();
                words = words.toLowerCase();
                ArrayList<Long> morseList = new ArrayList<Long>();
                morseList.add((long)0);
                for(int i = 0; i < words.length();i ++){
                    char current = words.charAt(i);

                    long[] morse;
                    long PAUSE = 100;
                    long DOT = 100;
                    long DASH = 500;

                    Log.e("Flag",Character.toString(current));
                    switch(current) {
                        case 'a':
                            morse = new long[]{DOT, PAUSE, DASH, PAUSE};
                            break;
                        case 'b':
                            morse = new long[]{DASH, PAUSE, DOT, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case 'c':
                            morse = new long[]{DASH, PAUSE, DOT, PAUSE, DASH, PAUSE, DOT, PAUSE};
                            break;
                        case 'd':
                            morse = new long[]{DASH, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case 'e':
                            morse = new long[]{DOT, PAUSE};
                            break;
                        case 'f':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE, DASH, PAUSE, DOT, PAUSE};
                            break;
                        case 'g':
                            morse = new long[]{DASH, PAUSE, DASH, PAUSE, DOT, PAUSE};
                            break;
                        case 'h':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case 'i':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE};
                            break;
                        case 'j':
                            morse = new long[]{DOT, PAUSE, DASH, PAUSE, DASH, PAUSE, DASH, PAUSE};
                            break;
                        case 'k':
                            morse = new long[]{DASH, PAUSE, DOT, PAUSE, DASH, PAUSE};
                            break;
                        case 'l':
                            morse = new long[]{DOT, PAUSE, DASH, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case 'm':
                            morse = new long[]{DASH, PAUSE, DASH, PAUSE};
                            break;
                        case 'n':
                            morse = new long[]{DASH, PAUSE, DOT, PAUSE};
                            break;
                        case 'o':
                            morse = new long[]{DASH, PAUSE, DASH, PAUSE, DASH, PAUSE};
                            break;
                        case 'p':
                            morse = new long[]{DOT, PAUSE, DASH, PAUSE, DASH, PAUSE, DOT, PAUSE};
                            break;
                        case 'q':
                            morse = new long[]{DASH, PAUSE, DASH, PAUSE, DOT, PAUSE, DASH, PAUSE};
                            break;
                        case 'r':
                            morse = new long[]{DOT, PAUSE, DASH, PAUSE, DOT, PAUSE};
                            break;
                        case 's':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case 't':
                            morse = new long[]{DASH, PAUSE};
                            break;
                        case 'u':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE, DASH, PAUSE};
                            break;
                        case 'v':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE, DOT, PAUSE, DASH, PAUSE};
                            break;
                        case 'w':
                            morse = new long[]{DOT, PAUSE, DASH, PAUSE, DASH, PAUSE};
                            break;
                        case 'x':
                            morse = new long[]{DASH, PAUSE, DOT, PAUSE, DOT, PAUSE, DASH, PAUSE};
                            break;
                        case 'y':
                            morse = new long[]{DASH, PAUSE, DOT, PAUSE, DASH, PAUSE, DASH, PAUSE};
                            break;
                        case 'z':
                            morse = new long[]{DASH, PAUSE, DASH, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case '1':
                            morse = new long[]{DOT, PAUSE, DASH, PAUSE, DASH, PAUSE, DASH, PAUSE, DASH, PAUSE};
                            break;
                        case '2':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE, DASH, PAUSE, DASH, PAUSE, DASH, PAUSE};
                            break;
                        case '3':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE, DOT, PAUSE, DASH, PAUSE, DASH, PAUSE};
                            break;
                        case '4':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE, DOT, PAUSE, DOT, PAUSE, DASH, PAUSE};
                            break;
                        case '5':
                            morse = new long[]{DOT, PAUSE, DOT, PAUSE, DOT, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case '6':
                            morse = new long[]{DASH, PAUSE, DOT, PAUSE, DOT, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case '7':
                            morse = new long[]{DASH, PAUSE, DASH, PAUSE, DOT, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case '8':
                            morse = new long[]{DASH, PAUSE, DASH, PAUSE, DASH, PAUSE, DOT, PAUSE, DOT, PAUSE};
                            break;
                        case '9':
                            morse = new long[]{DASH, PAUSE, DASH, PAUSE, DASH, PAUSE, DASH, PAUSE, DOT, PAUSE};
                            break;
                        case '0':
                            morse = new long[]{DASH, PAUSE, DASH, PAUSE, DASH, PAUSE, DASH, PAUSE, DASH, PAUSE};
                            break;
                        default:
                            morse = new long[]{DASH * 3};
                    }
                    for(int j=0;j<morse.length;j++){
                        morseList.add(morse[j]);
                    }
                    morseList.set(morseList.size()-1,(morseList.get(morseList.size()-1)+PAUSE*3));
                    //long sum = 0;
                    //for(int j = 0; j < morse.length; j++){
                    //    sum += morse[i];
                    //}
                    //long word = 2000 - sum;
                    //SystemClock.sleep(word);]['

                }

                long[] morse = new long[morseList.size()];
                for(int i = 0; i < morse.length;i++){
                    morse[i] = morseList.get(i);
                }
                vibrator.vibrate(morse,-1);
            }
        });

    }

//    public void getSpeechInput(View view){
//        Intent intent = new Intent();
//
//    }






}
