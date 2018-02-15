package tv.danmaku.bili.example.av7;

import android.app.*;
import android.os.*;
import com.l.util.OpenBiliBili.*;
import android.widget.*;


public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		OpenBiliBili ob=new OpenBiliBili();
        super.onCreate(savedInstanceState);
	try
	{
	ob.launchPlayer(this,ob.getVideoType(),"7");
	finish();
	}
	catch (Exception e) {
		Toast.makeText(this,"Failed. You need to install the cilent",Toast.LENGTH_LONG).show();
	}
	finish();
    }
}
