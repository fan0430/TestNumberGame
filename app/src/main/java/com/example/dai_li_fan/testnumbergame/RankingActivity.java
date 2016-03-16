package com.example.dai_li_fan.testnumbergame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import db.ThreeDBController;
import model.ModelSuccessInfo;

/**
 * Created by dai_li_fan on 2016/3/16.
 */
public class RankingActivity extends Activity{
    Button btn_3,btn_4,btn_5;
    ListView number_3_list, number_4_list, number_5_list;
    String user_name;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranking_activity);
        user_name = (getIntent().getSerializableExtra("name").toString());
        findViews();
        setViews();
        setListener();
        ModelSuccessInfo model = ThreeDBController.queryUserAccount();
        if(model != null){
            Log.w("ww1",String.valueOf(model.name));
            Log.w("ww2",String.valueOf(model.sec));
        }





    }

    private void findViews() {
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        number_3_list = (ListView) findViewById(R.id.number_3_list);
        number_4_list = (ListView) findViewById(R.id.number_4_list);
        number_5_list = (ListView) findViewById(R.id.number_5_list);

    }

    private void setViews(){


    }

    private void setListener(){
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RankingActivity.this, MainActivity.class);
                intent.putExtra("name",user_name);
                startActivity(intent);
            }
        });

    }




}
