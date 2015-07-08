package com.example.dnkproject;

import android.util.Log;

/**
 * 
 * @author xiaoxun
 *
 */
public class JniMethod {
	public void callback(int id, int param) {
		Log.e("JNICallback", "id=" + id + ";param=" + param);
	}

	public native void setCallback();
	public native String getString();
	public native void setString(String str);
	public native void setBasicData(int i, boolean b, char c, double d); 

	static {
		System.loadLibrary("hello-jni");
	}
}
