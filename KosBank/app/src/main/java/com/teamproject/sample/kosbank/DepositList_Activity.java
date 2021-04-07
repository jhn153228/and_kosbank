package com.teamproject.sample.kosbank;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.sample.kosbank.R;
import com.teamproject.sample.kosbank.VO.Deposit_productVO;
import com.teamproject.sample.kosbank.VO.MemberVO;

import java.util.HashMap;
import java.util.Map;

public class DepositList_Activity extends AppCompatActivity {
    EditText edtId, edtPwd;
    Button btnSignIn, btnSignUpPage;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depositlist2);

        edtId = (EditText) findViewById(R.id.edt_id);
        edtPwd = (EditText) findViewById(R.id.edt_pwd);
        btnSignIn = (Button) findViewById(R.id.btn_SignIn);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                InnerTask task = new InnerTask();
                Map<String, String> map = new HashMap<>();
                map.put("id", edtId.getText().toString());
                map.put("pw", edtPwd.getText().toString());
                task.execute(map);
            }
        });
    }

    public class InnerTask extends AsyncTask<Map, Integer, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Map... maps) {
            //HTTP 요청 준비
            HttpClient.Builder http = new HttpClient.Builder("POST", Web.servletURL + "DepositList"); //스프링 url

            //HTTP 요청 전송
            HttpClient post = http.create();
            post.request();

            // 안드로이드에서 응답받음
            String body = post.getBody(); //Web의 Controller에서 리턴한 값
            Log.d("body------", body);
            return body;
        }

        @Override
        protected void onPostExecute(String s) {
            Log.d("JSON_RESULT", s);

            //JSON으로 받은 데이터를 VO Obejct로 바꿔준다.
            if (s.length() > 0) {
                Gson gson = new Gson();
                Deposit_productVO m = gson.fromJson(s, Deposit_productVO.class);
                if (m.getY_name() != null) {
                    // 페이지 이동 : new Intent(현재페이지, 이동페이지)
                    Intent intent = new Intent(DepositList_Activity.this, DepositList_Activity2.class);
                    intent.putExtra("y_name", m.getY_name());
                    intent.putExtra("y_summary", m.getY_name());
                    intent.putExtra("y_interest_rate", m.getY_name());
                    intent.putExtra("y_type", m.getY_name());
                    intent.putExtra("y_max_date", m.getY_name());
                    intent.putExtra("y_min_date", m.getY_name());
                    intent.putExtra("y_min_price", m.getY_name());
                    intent.putExtra("y_explanation", m.getY_name());
                    intent.putExtra("y_notice", m.getY_name());
                    startActivity(intent);
                } else if (m.getY_name() == null) {
                    Toast.makeText(getApplicationContext(), "조회실패.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "조회실패", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}


