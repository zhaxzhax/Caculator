package com.foy.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.leftpa).setOnClickListener(this);
        findViewById(R.id.rightpa).setOnClickListener(this);
        findViewById(R.id.back).setOnClickListener(this);
        findViewById(R.id.division).setOnClickListener(this);
        findViewById(R.id.sqrt).setOnClickListener(this);
        findViewById(R.id.multiply).setOnClickListener(this);
        findViewById(R.id.one).setOnClickListener(this);
        findViewById(R.id.two).setOnClickListener(this);
        findViewById(R.id.three).setOnClickListener(this);
        findViewById(R.id.four).setOnClickListener(this);
        findViewById(R.id.five).setOnClickListener(this);
        findViewById(R.id.six).setOnClickListener(this);
        findViewById(R.id.seven).setOnClickListener(this);
        findViewById(R.id.eight).setOnClickListener(this);
        findViewById(R.id.nine).setOnClickListener(this);
        findViewById(R.id.zero).setOnClickListener(this);
        findViewById(R.id.dot).setOnClickListener(this);
        findViewById(R.id.delete).setOnClickListener(this);
        findViewById(R.id.add).setOnClickListener(this);
        findViewById(R.id.substract).setOnClickListener(this);
        findViewById(R.id.equal).setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        TextView equation = findViewById(R.id.equation);
        TextView result = findViewById(R.id.result);
        String equation_s = equation.getText().toString();
        if (v.getId()==R.id.leftpa)
        {
            String newStr = String.format("%s%s",equation_s,"(");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.rightpa)
        {
            String newStr = String.format("%s%s",equation_s,")");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.back)
        {
            try
            {
                String newStr = equation_s.substring(0,equation_s.length()-1);
                equation.setText(newStr);
            }
            catch (Exception e){
                result.setText("无法回退！");
            }
        }
        else  if (v.getId()==R.id.division)
        {
            String newStr = String.format("%s%s",equation_s,"÷");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.sqrt)
        {
            String newStr = String.format("%s%s",equation_s,"√");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.multiply)
        {
            String newStr = String.format("%s%s",equation_s,"X");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.one)
        {
            String newStr = String.format("%s%s",equation_s,"1");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.two)
        {
            String newStr = String.format("%s%s",equation_s,"2");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.three)
        {
            String newStr = String.format("%s%s",equation_s,"3");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.four)
        {
            String newStr = String.format("%s%s",equation_s,"4");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.five)
        {
            String newStr = String.format("%s%s",equation_s,"5");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.six)
        {
            String newStr = String.format("%s%s",equation_s,"6");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.seven)
        {
            String newStr = String.format("%s%s",equation_s,"7");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.eight)
        {
            String newStr = String.format("%s%s",equation_s,"8");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.nine)
        {
            String newStr = String.format("%s%s",equation_s,"9");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.add)
        {
            String newStr = String.format("%s%s",equation_s,"+");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.substract)
        {
            String newStr = String.format("%s%s",equation_s,"-");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.delete)
        {
            String newStr = "";
            result.setText(newStr);
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.dot)
        {
            String newStr = String.format("%s%s",equation_s,".");
            equation.setText(newStr);
        }
        else  if (v.getId()==R.id.zero)
        {
            String newStr = String.format("%s%s",equation_s,"0");
            equation.setText(newStr);
        }
        else if (v.getId()==R.id.equal)
        {
           try{
               String newStr;
               if (equation_s.charAt(0)=='-'){ newStr = String.format("%s%s","0",equation_s);}
               else { newStr = equation_s;}
                String finres;
                double res = caculate.parse(newStr);
                if (String.valueOf(res)=="Infinity")finres="除数不能为0";
                else finres=String.valueOf(res);
                result.setText(finres);
            }
           catch (Exception e) {
               result.setText("输入有误无法计算！");
           }
        }
    }
}
