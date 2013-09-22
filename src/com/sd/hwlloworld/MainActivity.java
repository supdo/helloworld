package com.sd.hwlloworld;

import java.lang.reflect.Field;

import android.net.Uri;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText etUserName, etPassWord;
	private Button btnLogin, btnPhone, btnSMS, btnTabs, btnLists;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//使ActionBar变得透明
		//requestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
		setContentView(R.layout.activity_main);
		
		this.etUserName = (EditText)findViewById(R.id.etUserName);
		this.etPassWord = (EditText)findViewById(R.id.etPassWord);
		this.btnLogin = (Button)findViewById(R.id.btnLogin);
		this.btnPhone = (Button)findViewById(R.id.btnPhone);
		this.btnSMS = (Button)findViewById(R.id.btnSMS);
		this.btnTabs = (Button)findViewById(R.id.btnTabs);
		this.btnLists = (Button)findViewById(R.id.btnLists);
		
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
		
		this.btnPhone.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Uri uri = Uri.parse("tel:10010");
				Intent intent = new Intent(Intent.ACTION_DIAL, uri);
				startActivity(intent);
			}
		});
		
		this.btnSMS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri uri = Uri.parse("smsto:10010");
				Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
				intent.putExtra("sms_body", "Hello");
				startActivity(intent);
			}
		});
		
		this.btnTabs.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, TabsActivity.class);
				startActivity(intent);
			}
		});
		
		this.btnLists.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, ListActivity.class);
				startActivity(intent);
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
