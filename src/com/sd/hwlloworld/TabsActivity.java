package com.sd.hwlloworld;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.app.ActionBar.OnNavigationListener; 
import com.sd.helloworld.R;

public class TabsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//使ActionBar变得透明
		//requestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
		setContentView(R.layout.activity_tabs);
		
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayOptions(ActionBar.DISPLAY_HOME_AS_UP|ActionBar.DISPLAY_SHOW_HOME);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
       
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.addTab(actionBar.newTab().setText("Tab-A")
				.setTabListener(new ActionBar.TabListener() {

					@Override
					public void onTabUnselected(Tab arg0,
							FragmentTransaction arg1) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onTabReselected(Tab arg0,
							FragmentTransaction arg1) {
						// TODO Auto-generated method stub

					}
				}));
		
		actionBar.addTab(actionBar.newTab().setText("Tab-B")
				.setTabListener(new ActionBar.TabListener() {

					@Override
					public void onTabUnselected(Tab arg0,
							FragmentTransaction arg1) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onTabReselected(Tab arg0,
							FragmentTransaction arg1) {
						// TODO Auto-generated method stub

					}
				}));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
            default:
                break;
        }
        return true;
    }
}
