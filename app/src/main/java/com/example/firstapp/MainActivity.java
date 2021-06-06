package com.example.firstapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button C, one, two, three, four, five, six, seven, eight, nine, zero, plus, devide, multiply, minus, equal, dot, modulus;
    EditText editText;
    String string;
    Boolean add, sub, mul, div, mod;
    float var1, var2, ans;

    void intialNum() {
        var1 = Float.parseFloat(editText.getText() + "");
    }

    void off() {
        add = sub = mod = mul = div = false;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C = findViewById(R.id.clear);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus = findViewById(R.id.plus);
        multiply = findViewById(R.id.multiply);
        minus = findViewById(R.id.minus);
        devide = findViewById(R.id.devide);
        modulus = findViewById(R.id.modulus);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);
        zero = findViewById(R.id.zero);
        editText = findViewById(R.id.input);
        editText.setShowSoftInputOnFocus(false);


        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + "9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    intialNum();
                    off();
                    add = true;
                    editText.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intialNum();
                off();
                sub = true;
                editText.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    intialNum();
                    off();
                    mul = true;
                    editText.setText(null);
                }
            }
        });

        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    intialNum();
                    off();
                    div = true;
                    editText.setText(null);
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = editText.getText().toString();
                editText.setText(string + ".");
            }
        });

        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    intialNum();
                    off();
                    mod = true;
                    editText.setText(null);
                }
            }
        });


        //This is where the operation takes place ********************************************
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2 = Float.parseFloat(editText.getText() + "");

                if (add) {
                    editText.setText(var1 + var2 + "");
                    add = false;
                }
                if (sub) {
                    editText.setText(var1 - var2 + "");
                    sub = false;
                }
                if (mul) {
                    editText.setText(var1 * var2 + "");
                    mul = false;
                }
                if (div) {
                    editText.setText(var1 / var2 + "");
                    div = false;
                }
                if (mod) {
                    ans = var1 % var2;
                    editText.setText(ans + "");
                    mod = false;
                }

            }
        });

    }

    public void backspaceBTN(View view) {
        int cursorPos = editText.getSelectionStart();
        int textLen = editText.getText().length();

        if(cursorPos!= 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) editText.getText();
            selection.replace(cursorPos - 1,cursorPos,"");
            editText.setText(selection);
            editText.setSelection(cursorPos - 1);
        }
    }
    // Updates the Edittext
       /* private void updateText(String strToAdd){
            String oldStr = input.getText().toString();
            int cursorPos = input.getSelectionStart();
            String leftStr = oldStr.substring(0,cursorPos);
            String rightStr = oldStr.substring(cursorPos);
            input.setText(String.format("%s%s%s",leftStr,strToAdd,rightStr));
            input.setSelection(cursorPos + 1);
        }

    public void dotBTN(View view) {
        updateText(".");
    }

    public void zeroBTN(View view) {
        updateText("0");
    }

    public void multiplyBTN(View view) {
        updateText("1");
    }

    public void equalBTN(View view) {

    }

    public void oneBTN(View view) {
        updateText("1");
    }

    public void twoBTN(View view) {
        updateText("2");
    }

    public void threeBTN(View view) {
        updateText("3");
    }

    public void plusBTN(View view) {
        updateText("+");
    }

    public void fourBTN(View view) {
        updateText("4");
    }

    public void fiveBTN(View view) {
        updateText("5");
    }

    public void sixBTN(View view) {
        updateText("6");
    }

    public void minusBTN(View view) {
        updateText("-");
    }

    public void sevenBTN(View view) {
        updateText("7");
    }

    public void eightBTN(View view) {
        updateText("8");
    }

    public void nineBTN(View view) {
        updateText("9");
    }

    public void divideBTN(View view) {
        updateText("/");
    }

    public void clearBTN(View view) {
        input.setText("");
    }

    public void backspaceBTN(View view) {
        int cursorPos = input.getSelectionStart();
        int textLen = input.getText().length();

        if(cursorPos!= 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) input.getText();
            selection.replace(cursorPos - 1,cursorPos,"");
            input.setText(selection);
            input.setSelection(cursorPos - 1);
        }
    }

    public void modulsBTN(View view) {
    }*/
}