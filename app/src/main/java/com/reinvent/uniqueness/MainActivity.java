package com.reinvent.uniqueness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MainActivity extends  AppCompatActivity  { 
	
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear25;
	private TextView textview1;
	private LinearLayout linear20;
	private LinearLayout linear22;
	private LinearLayout linear21;
	private LinearLayout linear23;
	private LinearLayout linear19;
	private LinearLayout linear24;
	private LinearLayout linear18;
	private ImageView imageview4;
	private TextView textview4;
	private ImageView imageview5;
	private TextView textview5;
	private ImageView imageview3;
	private TextView textview3;
	private ImageView imageview2;
	private TextView textview2;
	private TextView textview6;
	
	private Intent intent = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview6 = (TextView) findViewById(R.id.textview6);
		
		linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), PasswordActivity.class);
				startActivity(intent);
			}
		});
		
		linear21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), NewColorGenActivity.class);
				startActivity(intent);
			}
		});
		
		linear19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), PinActivity.class);
				startActivity(intent);
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ColorActivity.class);
				startActivity(intent);
			}
		});
	}
	
	private void initializeLogic() {
		_initTypeFace();
		_initImageFilters();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _initTypeFace () {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/man.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/man.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/man.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/man.ttf"), 0);
		
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/man.ttf"), 0);
	}
	
	
	public void _initImageFilters () {
		imageview2.setColorFilter(0xFF3E2723, PorterDuff.Mode.MULTIPLY);
		imageview3.setColorFilter(0xFF3E2723, PorterDuff.Mode.MULTIPLY);
		imageview4.setColorFilter(0xFF3E2723, PorterDuff.Mode.MULTIPLY);
		imageview5.setColorFilter(0xFF3E2723, PorterDuff.Mode.MULTIPLY);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}