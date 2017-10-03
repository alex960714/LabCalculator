package com.example.user.labcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


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

    private Button sumBtn;
    private Button diffBtn;
    private Button multBtn;
    private Button divBtn;
    private Button percBtn;
    private Button gradeBtn;
    private Button sqrtBtn;
    private Button eqBtn;
    private String lastOp = "=";

    private Button backspaceBtn;
    private Button cancelBtn;
    private Button cancelLastBtn;
    private Button memoryBtn;
    private double memory;

    private TextView currNum;
    private TextView currRes;
    private TextView opChar;

    private Pattern ansPattern = Pattern.compile("^([-]?[0-9]+[.]0)$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViewsId();
        numberClickListener();
        operationListener();
    }

    private void getViewsId(){
        zeroBtn=(Button)findViewById(R.id.zeroBtn);
        oneBtn=(Button)findViewById(R.id.oneBtn);
        twoBtn=(Button)findViewById(R.id.twoBtn);
        threeBtn=(Button)findViewById(R.id.threeBtn);
        fourBtn=(Button)findViewById(R.id.fourBtn);
        fiveBtn=(Button)findViewById(R.id.fiveBtn);
        sixBtn=(Button)findViewById(R.id.sixBtn);
        sevenBtn=(Button)findViewById(R.id.sevenBtn);
        eightBtn=(Button)findViewById(R.id.eightBtn);
        nineBtn=(Button)findViewById(R.id.nineBtn);
        pointBtn=(Button)findViewById(R.id.pointBtn);
        minusBtn=(Button)findViewById(R.id.minusBtn);

        sumBtn=(Button)findViewById(R.id.sumBtn);
        diffBtn=(Button)findViewById(R.id.diffBtn);
        multBtn=(Button)findViewById(R.id.multBtn);
        divBtn=(Button)findViewById(R.id.divBtn);
        percBtn=(Button)findViewById(R.id.percentageBtn);
        gradeBtn=(Button)findViewById(R.id.gradeBtn);
        sqrtBtn=(Button)findViewById(R.id.sqrtBtn);
        eqBtn=(Button)findViewById(R.id.equalBtn);

        backspaceBtn=(Button)findViewById(R.id.backspaceBtn);
        cancelBtn=(Button)findViewById(R.id.cancelBtn);
        cancelLastBtn=(Button)findViewById(R.id.cancelLastBtn);
        memoryBtn=(Button)findViewById(R.id.prevBtn);

        currNum=(TextView)findViewById(R.id.currNumTextView);
        currRes=(TextView)findViewById(R.id.currResTextView);
        opChar=(TextView)findViewById(R.id.operationCharView);
    }

    private void numberClickListener() {
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    if (!currNum.equals("0")) {
                        currNum.setText(currNum.getText() + "0");
                        lastOp="number";
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
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    currNum.setText(currNum.getText() + "1");
                    lastOp="number";
                }
                else{
                    currNumReload("1");
                }
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    currNum.setText(currNum.getText() + "2");
                    lastOp="number";
                }
                else{
                    currNumReload("2");
                }
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    currNum.setText(currNum.getText() + "3");
                    lastOp="number";
                }
                else{
                    currNumReload("3");
                }
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    currNum.setText(currNum.getText() + "4");
                    lastOp="number";
                }
                else{
                    currNumReload("4");
                }
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    currNum.setText(currNum.getText() + "5");
                    lastOp="number";
                }
                else{
                    currNumReload("5");
                }
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    currNum.setText(currNum.getText() + "6");
                    lastOp="number";
                }
                else{
                    currNumReload("6");
                }
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    currNum.setText(currNum.getText() + "7");
                    lastOp="number";
                }
                else{
                    currNumReload("7");
                }
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    currNum.setText(currNum.getText() + "8");
                    lastOp="number";
                }
                else{
                    currNumReload("8");
                }
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("number") || lastOp.equals("point") || currNum.equals("number")) {
                    currNum.setText(currNum.getText() + "9");
                    lastOp="number";
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
                if(lastOp.equals("=") || lastOp.equals("number")) {
                    prevOperationHandler("+");
                }
                else if (lastOp.equals("error") || lastOp.equals("minus") || lastOp.equals("point")) {}
                else {
                    opChar.setText("+");
                    lastOp = "+";
                }
            }
        });

        diffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("=") || lastOp.equals("number")) {
                    prevOperationHandler("-");
                }
                else if (lastOp.equals("error") || lastOp.equals("minus") || lastOp.equals("point")) {}
                else {
                    opChar.setText("-");
                    lastOp = "-";
                }
            }
        });

        multBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("=") || lastOp.equals("number")) {
                    prevOperationHandler("*");
                }
                else if (lastOp.equals("error") || lastOp.equals("minus") || lastOp.equals("point")) {}
                else {
                    opChar.setText("*");
                    lastOp = "*";
                }
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("=") || lastOp.equals("number")) {
                    prevOperationHandler("/");
                }
                else if (lastOp.equals("error") || lastOp.equals("minus") || lastOp.equals("point")) {}
                else {
                    opChar.setText("/");
                    lastOp = "/";
                }
            }
        });

        gradeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lastOp.equals("=") || lastOp.equals("number")) {
                    prevOperationHandler("^");
                }
                else if (lastOp.equals("error") || lastOp.equals("minus") || lastOp.equals("point")) {}
                else {
                    opChar.setText("^");
                    lastOp = "^";
                }
            }
        });

        percBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("=") && !lastOp.equals("error") && !lastOp.equals("minus")
                        && !lastOp.equals("point")) {
                    currNum.setText(String.valueOf(Double.parseDouble(currRes.getText().toString())
                            *Double.parseDouble(currNum.getText().toString())/100));
                }
            }
        });

        sqrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!lastOp.equals("minus") && !lastOp.equals("error")) {
                    Double operand = Double.parseDouble(currNum.getText().toString());
                    if (operand >= 0) {
                        currNum.setText(String.valueOf(Math.sqrt(operand)));
                    }
                    else {
                        currRes.setText("");
                        currNum.setText("error: negative operand");
                        opChar.setText("=");
                        lastOp = "error";
                    }
                    pointFlag = false;
                }
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("number") && !lastOp.equals("point")) {
                    currNum.setText("-");
                    lastOp="minus";
                }
            }
        });

        pointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!pointFlag) {
                    if(lastOp.equals("number")) {
                        currNum.setText(currNum.getText() + ".");
                    }
                    else if(lastOp.equals("minus")){
                        currNum.setText("-0.");
                    }
                    else {
                        currNum.setText("0.");
                    }
                    pointFlag=true;
                    lastOp="point";
                }
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currRes.setText("");
                currNum.setText("0");
                opChar.setText("=");
                lastOp="=";
            }
        });

        cancelLastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currNum.setText("0");
                lastOp=opChar.getText().toString();
            }
        });

        backspaceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!currNum.equals("0")) {
                    String tmpCurrNum=currNum.getText().toString();
                    if(tmpCurrNum.length() == 1 || lastOp.equals("error")){
                        currNum.setText("0");
                        lastOp=opChar.getText().toString();
                    }
                    else {
                        if(lastOp=="point"){
                            pointFlag=false;
                            lastOp="number";
                        }
                        currNum.setText(tmpCurrNum.substring(0,tmpCurrNum.length() - 1));
                        char lastSymbol = tmpCurrNum.toCharArray()[tmpCurrNum.length() - 2];
                        if(lastSymbol == '.'){
                            lastOp="point";
                        }
                        else if (lastSymbol == '-'){
                            lastOp="minus";
                        }
                        else if (currNum.getText().equals("0")) {
                            lastOp=opChar.getText().toString();
                        }
                    }
                }
            }
        });

        memoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currNum.setText(String.valueOf(memory));
            }
        });

        eqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lastOp.equals("minus") && !lastOp.equals("point")) {
                    prevOperationHandler("=");
                    if (!lastOp.equals("error")) {
                        String tmpRes = currRes.getText().toString();
                        Matcher ansMatcher = ansPattern.matcher(tmpRes);
                        if (ansMatcher.matches()){
                            currNum.setText(tmpRes.substring(0, tmpRes.length() - 2));
                        }
                        else {
                            currNum.setText(currRes.getText().toString());
                        }
                        currRes.setText("");
                        memory = Double.parseDouble(currNum.getText().toString());
                    }
                }
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
                 String divRes = String.valueOf(Double.parseDouble(currRes.getText().toString())
                         /Double.parseDouble(currNum.getText().toString()));
                 if(!divRes.equals("Infinity")) {
                     currRes.setText(divRes);
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
         }
         if (!lastOp.equals("error")) {
             opChar.setText(oper);
         }
        pointFlag = false;
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("currNum",currNum.getText().toString());
        outState.putString("opChar",opChar.getText().toString());
        outState.putString("currRes",currRes.getText().toString());
        outState.putString("lastOp",lastOp);
        outState.putDouble("memory",memory);
        Log.d("recoveryLog", "onSaveInstanceState");
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        currRes.setText(savedInstanceState.getString("currRes"));
        opChar.setText(savedInstanceState.getString("opChar"));
        currNum.setText(savedInstanceState.getString("currNum"));
        lastOp=savedInstanceState.getString("lastOp");
        memory=savedInstanceState.getDouble("memory");
        Log.d("recoveryLog", "onRestoreInstanceState");
    }

}
