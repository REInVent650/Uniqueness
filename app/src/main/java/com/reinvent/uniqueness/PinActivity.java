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
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class PinActivity extends  AppCompatActivity  { 
	
	
	private String ft = "";
	private String error = "";
	private String fit = "";
	private String st = "";
	
	private LinearLayout toolbar_layout;
	private LinearLayout toolbar_sep;
	private LinearLayout linear1;
	private TextView textview3;
	private CheckBox checkbox1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private Button button1;
	private EditText four;
	private Button copy_four;
	private EditText five;
	private Button copy_five;
	private EditText six;
	private Button copy_six;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.pin);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		toolbar_layout = (LinearLayout) findViewById(R.id.toolbar_layout);
		toolbar_sep = (LinearLayout) findViewById(R.id.toolbar_sep);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview3 = (TextView) findViewById(R.id.textview3);
		checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button1 = (Button) findViewById(R.id.button1);
		four = (EditText) findViewById(R.id.four);
		copy_four = (Button) findViewById(R.id.copy_four);
		five = (EditText) findViewById(R.id.five);
		copy_five = (Button) findViewById(R.id.copy_five);
		six = (EditText) findViewById(R.id.six);
		copy_six = (Button) findViewById(R.id.copy_six);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_fourL();
				_fiveL();
				_sixL();
			}
		});
		
		copy_four.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), four.getText().toString());
			}
		});
		
		copy_five.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), five.getText().toString());
			}
		});
		
		copy_six.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), six.getText().toString());
			}
		});
	}
	
	private void initializeLogic() {
		_applyGradient(linear2, "#EEEEEE", "#EEEEEE", "#EEEEEE", 25, 2);
		_applyGradient(linear3, "#EEEEEE", "#EEEEEE", "#EEEEEE", 25, 2);
		_applyGradient(linear4, "#EEEEEE", "#EEEEEE", "#EEEEEE", 25, 2);
		four.setSelectAllOnFocus(true);
		five.setSelectAllOnFocus(true);
		six.setSelectAllOnFocus(true);
		button1.performClick();
		button1.setText("Regenerate");
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _applyGradient (final View _v, final String _colour1, final String _colour2, final String _borderColour, final double _cornerRadius, final double _borderThickness) {
		int[] colors = {Color.parseColor(_colour1),Color.parseColor(_colour2)};
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BR_TL, colors);
		gd.setCornerRadius((float)_cornerRadius); 
		gd.setStroke((int)_borderThickness, (Color.parseColor(_borderColour)));
		_v.setBackground(gd);
	}
	
	
	public void _fourL () {
		ft = String.valueOf((long)(SketchwareUtil.getRandom((int)(0000), (int)(9999))));
		if (ft.length() < 4) {
			ft = "0".concat(ft);
			if (ft.length() < 4) {
				ft = "0".concat(ft);
				if (ft.length() < 4) {
					ft = "0".concat(ft);
				}
			}
		}
		four.setText(ft);
		try {
			if (checkbox1.isChecked()) {
				if (ft.substring((int)(0), (int)(3)).contains(ft.substring((int)(3), (int)(4)))) {
					_fourL();
				}
				else {
					if (ft.substring((int)(1), (int)(4)).contains(ft.substring((int)(0), (int)(1)))) {
						_fourL();
					}
					else {
						if (ft.substring((int)(0), (int)(1)).concat(ft.substring((int)(2), (int)(4))).contains(ft.substring((int)(1), (int)(2)))) {
							_fourL();
						}
						else {
							if (ft.substring((int)(0), (int)(2)).concat(ft.substring((int)(3), (int)(4))).contains(ft.substring((int)(2), (int)(3)))) {
								_fourL();
							}
						}
					}
				}
			}
		} catch (Exception e) {
			error = e.toString();
			SketchwareUtil.showMessage(getApplicationContext(), error);
		}
	}
	
	
	public void _fiveL () {
		fit = String.valueOf((long)(SketchwareUtil.getRandom((int)(00000), (int)(99999))));
		if (fit.length() < 5) {
			fit = "0".concat(fit);
			if (fit.length() < 5) {
				fit = "0".concat(fit);
				if (fit.length() < 5) {
					fit = "0".concat(fit);
					if (fit.length() < 5) {
						fit = "0".concat(fit);
					}
				}
			}
		}
		five.setText(fit);
		try {
			if (checkbox1.isChecked()) {
				if (fit.substring((int)(0), (int)(4)).contains(fit.substring((int)(4), (int)(5)))) {
					_fiveL();
				}
				else {
					if (fit.substring((int)(1), (int)(5)).contains(fit.substring((int)(0), (int)(1)))) {
						_fiveL();
					}
					else {
						if (fit.substring((int)(0), (int)(1)).concat(fit.substring((int)(2), (int)(5))).contains(fit.substring((int)(1), (int)(2)))) {
							_fiveL();
						}
						else {
							if (fit.substring((int)(0), (int)(2)).concat(fit.substring((int)(3), (int)(5))).contains(fit.substring((int)(2), (int)(3)))) {
								_fiveL();
							}
							else {
								if (fit.substring((int)(0), (int)(3)).concat(fit.substring((int)(4), (int)(5))).contains(fit.substring((int)(3), (int)(4)))) {
									_fiveL();
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			error = e.toString();
			SketchwareUtil.showMessage(getApplicationContext(), error);
		}
	}
	
	
	public void _sixL () {
		st = String.valueOf((long)(SketchwareUtil.getRandom((int)(000000), (int)(999999))));
		if (st.length() < 6) {
			st = "0".concat(st);
			if (st.length() < 6) {
				st = "0".concat(st);
				if (st.length() < 6) {
					st = "0".concat(st);
					if (st.length() < 6) {
						st = "0".concat(st);
						if (st.length() < 6) {
							st = "0".concat(st);
						}
					}
				}
			}
		}
		six.setText(st);
		try {
			if (checkbox1.isChecked()) {
				if (st.substring((int)(0), (int)(5)).contains(st.substring((int)(5), (int)(6)))) {
					_sixL();
				}
				else {
					if (st.substring((int)(1), (int)(6)).contains(st.substring((int)(0), (int)(1)))) {
						_sixL();
					}
					else {
						if (st.substring((int)(0), (int)(1)).concat(st.substring((int)(2), (int)(6))).contains(st.substring((int)(1), (int)(2)))) {
							_sixL();
						}
						else {
							if (st.substring((int)(0), (int)(2)).concat(st.substring((int)(3), (int)(6))).contains(st.substring((int)(2), (int)(3)))) {
								_sixL();
							}
							else {
								if (st.substring((int)(0), (int)(3)).concat(st.substring((int)(4), (int)(6))).contains(st.substring((int)(3), (int)(4)))) {
									_sixL();
								}
								else {
									if (st.substring((int)(0), (int)(4)).concat(st.substring((int)(5), (int)(6))).contains(st.substring((int)(4), (int)(5)))) {
										_sixL();
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			error = e.toString();
			SketchwareUtil.showMessage(getApplicationContext(), error);
		}
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