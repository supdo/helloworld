package com.sd.hwlloworld;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText etUserName, etPassWord;
	private Button btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.etUserName = (EditText)findViewById(R.id.etUserName);
		this.etPassWord = (EditText)findViewById(R.id.etPassWord);
		this.btnLogin = (Button)findViewById(R.id.btnLogin);
		
		this.btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(etUserName.getText().toString().length()==0 || etPassWord.getText().toString().length()==0){
                    //Resources res = getResources();
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("提示")
                            .setMessage("不能为空！")
                            .setPositiveButton("确定", null)
                            .show();
                }else{
                    
                }
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
