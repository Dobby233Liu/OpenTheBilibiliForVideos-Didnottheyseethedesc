package com.l.util.OpenBiliBili;
import android.app.*;
import android.content.*;
import android.net.*;

public class OpenBiliBili
{
    
    public static final String getVideoType() {
	return "av";
    }


    public static final String getSpaceType() {
	return "uid";
    }


    public static final String getBangumiType() {
	return "bangumi";
    }

    public static void launchPlayer(Activity activity, String type, String id) throws Exception {
	Uri url;
	Intent intent = new Intent("android.intent.action.VIEW");
	switch(type){
	case "av":
	url = Uri.parse("bilibili://video/" + id);
	break;
	case "uid":
	url = Uri.parse("https://space.bilibili.com/" + id);
	break;
	case "bangumi":
	url = Uri.parse("bilibili://bangumi/season/" + id);
	break;
	default:
	url = Uri.parse("bilibili://video/" + id);
	break;
	}
	intent.setData(url);
	activity.startActivity(intent);
	}
}
