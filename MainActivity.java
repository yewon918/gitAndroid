/* **********************************************
 * 프로그램명 : OSSProject_YewonKim
 * 작성자 : 2018038032 김예원
 * 작성일 : 2021.03.19
 *프로그램 설명 : 오픈소스 전문 프로젝트 과제3
 ************************************************/

package com.example.ossproject2_yewonkim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.BreakIterator;

import static android.net.Uri.*;


public class MainActivity extends AppCompatActivity {

    private RadioGroup rg;
    private ImageView img;

    EditText editText1;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup) findViewById(R.id.radioGroup);
        img = (ImageView) findViewById(R.id.imageView3);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton) {
                    img.setImageResource(R.drawable.potato);
                } else if (checkedId == R.id.radioButton2) {
                    img.setImageResource(R.drawable.fishbread);
                }
            }
        });
    }

    public void onButtonClicked(View view) {
        editText1 = (EditText)findViewById(R.id.editText1);
        result = editText1.getText().toString();
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();

    }

    public void onButton2Clicked(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(result));
        startActivity(intent);
    }

}