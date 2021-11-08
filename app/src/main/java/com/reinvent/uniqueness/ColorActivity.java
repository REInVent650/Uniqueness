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
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class ColorActivity extends  AppCompatActivity  { 
	
	
	private String colour = "";
	private double pos = 0;
	private double colourLength = 0;
	private double random = 0;
	private String errorLong = "";
	private String error = "";
	private  com.google.android.material.textfield.TextInputLayout textinput2;
	private  com.google.android.material.textfield.TextInputLayout textinput;
	
	private ArrayList<String> colours = new ArrayList<>();
	
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear3;
	private LinearLayout linear2;
	private Button button1;
	private CheckBox alpha;
	private LinearLayout textinputlayout1;
	private LinearLayout textinputlayout2;
	private CheckBox red_yes;
	private CheckBox green_yes;
	private CheckBox blue_yes;
	private LinearLayout red;
	private LinearLayout green;
	private LinearLayout blue;
	private TextView red_label;
	private TextView green_label;
	private TextView blue_label;
	private EditText edittext1;
	private EditText edittext2;
	
	private Intent intent = new Intent();
	private AlertDialog.Builder DE;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.color);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		button1 = (Button) findViewById(R.id.button1);
		alpha = (CheckBox) findViewById(R.id.alpha);
		textinputlayout1 = (LinearLayout) findViewById(R.id.textinputlayout1);
		textinputlayout2 = (LinearLayout) findViewById(R.id.textinputlayout2);
		red_yes = (CheckBox) findViewById(R.id.red_yes);
		green_yes = (CheckBox) findViewById(R.id.green_yes);
		blue_yes = (CheckBox) findViewById(R.id.blue_yes);
		red = (LinearLayout) findViewById(R.id.red);
		green = (LinearLayout) findViewById(R.id.green);
		blue = (LinearLayout) findViewById(R.id.blue);
		red_label = (TextView) findViewById(R.id.red_label);
		green_label = (TextView) findViewById(R.id.green_label);
		blue_label = (TextView) findViewById(R.id.blue_label);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		DE = new AlertDialog.Builder(this);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				colour = "#";
				pos = 0;
				for(int _repeat12 = 0; _repeat12 < (int)(colourLength); _repeat12++) {
					if ((pos == 0) || (pos == 1)) {
						if (alpha.isChecked()) {
							random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
							colour = colour.concat(colours.get((int)(random)));
						}
						else {
							colour = colour.concat("F");
						}
					}
					else {
						if ((pos == 2) || (pos == 3)) {
							if (red_yes.isChecked()) {
								random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
								colour = colour.concat(colours.get((int)(random)));
							}
							else {
								colour = colour.concat("0");
							}
						}
						else {
							if ((pos == 4) || (pos == 5)) {
								if (green_yes.isChecked()) {
									random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
									colour = colour.concat(colours.get((int)(random)));
								}
								else {
									colour = colour.concat("0");
								}
							}
							else {
								if ((pos == 6) || (pos == 7)) {
									if (blue_yes.isChecked()) {
										random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
										colour = colour.concat(colours.get((int)(random)));
									}
									else {
										colour = colour.concat("0");
									}
								}
							}
						}
					}
					pos++;
				}
				try {
					button1.setBackgroundColor(Color.parseColor(colour));
					edittext1.setText(colour);
				} catch (Exception e) {
					error = e.getMessage().toString();
					errorLong = e.toString();
					DE.setTitle(error);
					DE.setMessage(errorLong);
					DE.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					DE.create().show();
				}
				colour = "#";
				pos = 0;
				for(int _repeat111 = 0; _repeat111 < (int)(colourLength); _repeat111++) {
					if ((pos == 0) || (pos == 1)) {
						if (alpha.isChecked()) {
							random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
							colour = colour.concat(colours.get((int)(random)));
						}
						else {
							colour = colour.concat("F");
						}
					}
					else {
						if ((pos == 2) || (pos == 3)) {
							if (red_yes.isChecked()) {
								random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
								colour = colour.concat(colours.get((int)(random)));
							}
							else {
								colour = colour.concat("0");
							}
						}
						else {
							if ((pos == 4) || (pos == 5)) {
								if (green_yes.isChecked()) {
									random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
									colour = colour.concat(colours.get((int)(random)));
								}
								else {
									colour = colour.concat("0");
								}
							}
							else {
								if ((pos == 6) || (pos == 7)) {
									if (blue_yes.isChecked()) {
										random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
										colour = colour.concat(colours.get((int)(random)));
									}
									else {
										colour = colour.concat("0");
									}
								}
							}
						}
					}
					pos++;
				}
				try {
				} catch (Exception e) {
					error = e.getMessage().toString();
					errorLong = e.toString();
					DE.setTitle(error);
					DE.setMessage(errorLong);
					DE.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					DE.create().show();
				}
				linear1.setBackgroundColor(Color.parseColor(colour));
				edittext2.setText(colour);
				if (isDark(getBgColorInt(button1))) {
					button1.setTextColor(0xFFFFFFFF);
				} else {
					button1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.contains("#") && ((_charSeq.length() == 3) || ((_charSeq.length() == 5) || ((_charSeq.length() == 7) || (_charSeq.length() == 9))))) {
					try {
						textinput.setBoxStrokeColor(Color.parseColor(_charSeq));
						button1.setBackgroundColor(Color.parseColor(_charSeq));
					} catch (Exception e) {
						error = e.getMessage().toString();
						errorLong = e.toString();
						SketchwareUtil.showMessage(getApplicationContext(), error);
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.contains("#") && ((_charSeq.length() == 3) || ((_charSeq.length() == 5) || ((_charSeq.length() == 7) || (_charSeq.length() == 9))))) {
					try {
						linear1.setBackgroundColor(Color.parseColor(_charSeq));
						textinput2.setBoxStrokeColor(Color.parseColor(_charSeq));
					} catch (Exception e) {
						error = e.getMessage().toString();
						errorLong = e.toString();
						SketchwareUtil.showMessage(getApplicationContext(), error);
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			
			    getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
			                      WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
		}
		_init();
		colourLength = 8;
		button1.performClick();
		textinputlayout1.removeView(edittext1);
		 textinput = new com.google.android.material.textfield.TextInputLayout (this);
		 textinput.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)); 
		//textinput.setBoxBackgroundColor(0xFFFFFFFF);
		textinput.setBoxStrokeColor(0xFF0D47A1);
		textinput.setBoxCornerRadii(5, 5, 5, 5);
		textinput.setPadding((int)8, (int)0 , (int)0 , (int)0 );
		textinput.setBoxBackgroundMode(textinput.BOX_BACKGROUND_OUTLINE);
		textinput.addView(edittext1);
		textinputlayout1.addView(textinput);
		/*I Love My JoB */
		textinputlayout2.removeView(edittext2);
		 textinput2 = new com.google.android.material.textfield.TextInputLayout (this);
		 textinput2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)); 
		//textinput2.setBoxBackgroundColor(0xFFFFFFFF);
		textinput2.setBoxStrokeColor(0xFF0D47A1);
		textinput2.setBoxCornerRadii(5, 5, 5, 5);
		textinput2.setPadding((int)8, (int)0 , (int)0 , (int)0 );
		textinput2.setBoxBackgroundMode(textinput.BOX_BACKGROUND_OUTLINE);
		textinput2.addView(edittext2);
		textinputlayout2.addView(textinput2);
		/* End of TextInputLayout */
		button1.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)15, 0xFF2196F3));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _init () {
		colours.add("0");
		colours.add("1");
		colours.add("2");
		colours.add("3");
		colours.add("4");
		colours.add("5");
		colours.add("6");
		colours.add("7");
		colours.add("8");
		colours.add("9");
		colours.add("A");
		colours.add("B");
		colours.add("C");
		colours.add("D");
		colours.add("E");
		colours.add("F");
	}
	
	
	public void _luminance () {
	}
	public static boolean isDark(int color){
		return Color.luminance(color) < 0.5;
	}
	
	
	public void _bgView () {
	}
	public static int getBgColorInt(View v){
		
		android.graphics.drawable.ColorDrawable viewColor = (android.graphics.drawable.ColorDrawable) v.getBackground();
		return viewColor.getColor();
		
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