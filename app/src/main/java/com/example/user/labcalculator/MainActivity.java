package com.example.user.labcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button pointBtn;
    private boolean pointFlag;
    private Button minusBtn;
    private boolean isNegative;

    private Button sumBtn;
    private Button diffBtn;
    private Button multBtn;
    private Button divBtn;
    private Button percBtn;
    private Button gradeBtn;
    private Button sqrtBtn;
    private Button eqBtn;
    private String lastOp;

    private Button backspaceBtn;
    private Button cancelBtn;
    private Button cancelLastBtn;
    private Button memoryBtn;
    private List<Double> memory;

    private TextView currNum;
    private TextView currRes;
    private TextView opChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberClickListener();
        operationListener();
    }

    private void numberClickListener() {
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!lastOp.equals("=") && !lastOp.equals("error")) {
                    if (!currNum.equals("0")) {
                        currNum.setText(currNum.getText() + "0");
                    }
                }
                else {
                    currNumReload("0");
                }
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=")&& !lastOp.equals("error")) {
                    currNum.setText(currNum.getText() + "1");
                }
                else{
                    currNumReload("1");
                }
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=")&& !lastOp.equals("error")) {
                    currNum.setText(currNum.getText() + "2");
                }
                else{
                    currNumReload("2");
                }
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=")&& !lastOp.equals("error")) {
                    currNum.setText(currNum.getText() + "3");
                }
                else{
                    currNumReload("3");
                }
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=")&& !lastOp.equals("error")) {
                    currNum.setText(currNum.getText() + "4");
                }
                else{
                    currNumReload("4");
                }
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=")&& !lastOp.equals("error")) {
                    currNum.setText(currNum.getText() + "5");
                }
                else{
                    currNumReload("5");
                }
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=")&& !lastOp.equals("error")) {
                    currNum.setText(currNum.getText() + "6");
                }
                else{
                    currNumReload("6");
                }
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=")&& !lastOp.equals("error")) {
                    currNum.setText(currNum.getText() + "7");
                }
                else{
                    currNumReload("7");
                }
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=")&& !lastOp.equals("error")) {
                    currNum.setText(currNum.getText() + "8");
                }
                else{
                    currNumReload("8");
                }
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=")&& !lastOp.equals("error")) {
                    currNum.setText(currNum.getText() + "9");
                }
                else{
                    currNumReload("9");
                }
            }
        });
    }

    private void operationListener() {
        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opChar.setText("+");
                if(lastOp.equals("=")) {
                    currRes.setText(currNum.getText());
                    currNum.setText("0");
                    pointFlag = false;
                }
                else if (lastOp.equals("number")) {
                    prevOperationHandler("+");
                }
                lastOp = "+";
            }
        });

        diffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opChar.setText("-");
                if(lastOp.equals("=") || lastOp.equals("number")) {
                    currRes.setText(currNum.getText());
                    currNum.setText("0");
                    pointFlag = false;
                }
                lastOp = "-";
            }
        });

        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opChar.setText("*");
                if(lastOp.equals("=") || lastOp.equals("number")) {
                    currRes.setText(currNum.getText());
                    currNum.setText("0");
                    pointFlag = false;
                }
                lastOp = "*";
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opChar.setText("/");
                if(lastOp.equals("=") || lastOp.equals("number")) {
                    currRes.setText(currNum.getText());
                    currNum.setText("0");
                    pointFlag = false;
                }
                lastOp = "/";
            }
        });
        sqrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currNum.setText(String.valueOf(Math.sqrt(
                        Double.parseDouble(currRes.getText().toString()))));
                currRes.setText("");
                opChar.setText("=");
                lastOp="=";
                pointFlag=false;
            }
        });
    }

    private void currNumReload(String num) {
        pointFlag=false;
        currNum.setText(num);
        lastOp="number";
    }
    
    private void prevOperationHandler(String oper) {
         lastOp=oper;
         switch (opChar.getText().toString()) {
             case "=":
                 currRes.setText(currNum.getText());
                 currNum.setText("0");
                 break;
             case "+":
                 currRes.setText(String.valueOf(Double.parseDouble(currRes.getText().toString())
                         +Double.parseDouble(currNum.getText().toString())));
                 currNum.setText("0");
                 break;
             case "-":
                 currRes.setText(String.valueOf(Double.parseDouble(currRes.getText().toString())
                         -Double.parseDouble(currNum.getText().toString())));
                 currNum.setText("0");
                 break;
             case "*":
                 currRes.setText(String.valueOf(Double.parseDouble(currRes.getText().toString())
                         *Double.parseDouble(currNum.getText().toString())));
                 currNum.setText("0");
                 break;
             case "/":
                 if(!currNum.getText().equals("0")) {
                     currRes.setText(String.valueOf(Double.parseDouble(currRes.getText().toString())
                             /Double.parseDouble(currNum.getText().toString())));
                     currNum.setText("0");
                 }
                 else {
                     currRes.setText("");
                     currNum.setText("error: dividing by 0");
                     opChar.setText("=");
                     lastOp="error";
                 }
                 break;
             case "^":
                 currRes.setText(String.valueOf(Math.pow(Double.parseDouble(currRes.getText().toString()),
                         Double.parseDouble(currNum.getText().toString()))));
                 currNum.setText("0");
                 pointFlag=false;
                 break;
             case "%":
                 currRes.setText(String.valueOf(Double.parseDouble(currRes.getText().toString())
                         %Double.parseDouble(currNum.getText().toString())));
                 currNum.setText("0");
                 break;
         }
         opChar.setText(oper);
         pointFlag=false;
    }

}
