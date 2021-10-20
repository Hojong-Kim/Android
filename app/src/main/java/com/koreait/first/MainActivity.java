package com.koreait.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ddd(View v) {
        /*
        TextView tv = (TextView)v;
        Toast.makeText(this, tv.getText(), Toast.LENGTH_SHORT).show();
         */

        // 누를 때 마다 1씩 증가하게끔

        if(v instanceof TextView){ //v에 담겨있는 객체주소값을 TextView 타입으로 저장할 수 있으면 true 없으면 false
            TextView tv = (TextView)v;
            String val = (String)tv.getText();
            int intVal = Integer.parseInt(val);
            intVal +=1;
            String parseStrVal = String.valueOf(intVal);
            tv.setText(parseStrVal);
        }
    }

    // 이벤트 연결(event binding) 버튼 클릭 시 실행될 메소드 연결
    public void clkBtn(View v) {
        Button btn = (Button)v;
        String btnText = (String)btn.getText();
        Toast.makeText(this, btnText + "을 클릭했어요.", Toast.LENGTH_LONG).show();
    }
}