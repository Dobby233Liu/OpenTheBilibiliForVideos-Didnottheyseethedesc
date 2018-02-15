package com.l.openbilibili;

import android.app.*;
import android.os.*;
import com.l.util.OpenBiliBili.OpenBiliBili;
import android.widget.*;
import android.view.*;
import android.view.View.*;

public class MainActivity extends Activity 
{
	public OpenBiliBili processB=new OpenBiliBili();
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		((Button)findViewById(R.id.avOpen)).setOnClickListener(openAv());
    	((Button)findViewById(R.id.authorOpen)).setOnClickListener(openSp());
    	((Button)findViewById(R.id.banOpen)).setOnClickListener(openBan());
    }
	public OnClickListener openAv(){
	return new OnClickListener(){
		public void onClick(View p1){
		try
		{
		processB.launchPlayer(MainActivity.this,processB.getVideoType(),((EditText)findViewById(R.id.mainEditText1)).getText().toString());
		}
		catch (Exception e) {fail();}

		}
	};
	}
	public OnClickListener openBan(){
	return new OnClickListener(){
		public void onClick(View p1){
		try
		{
		processB.launchPlayer(MainActivity.this,processB.getBangumiType(),((EditText)findViewById(R.id.mainEditText2)).getText().toString());
		}
		catch (Exception e) {fail();}

		}
	};
	}
	public OnClickListener openSp(){
	return new OnClickListener(){
		public void onClick(View p1){
		try
		{
		processB.launchPlayer(MainActivity.this,processB.getSpaceType(),((EditText)findViewById(R.id.mainEditText3)).getText().toString());
		}
		catch (Exception e) {fail();}

		}
	};
	}
	public void fail(){
		Toast.makeText(MainActivity.this,"Failed",Toast.LENGTH_LONG).show();
	}
}
