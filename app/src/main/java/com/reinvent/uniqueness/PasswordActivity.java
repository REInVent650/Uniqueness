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
import android.widget.SeekBar;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.CompoundButton;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class PasswordActivity extends  AppCompatActivity  { 
	
	
	private double pos = 0;
	private String uppercase = "";
	private String lowercase = "";
	private String numbers = "";
	private String special = "";
	private String all = "";
	private String progress = "";
	private double positions = 0;
	
	private ArrayList<String> chars = new ArrayList<>();
	
	private LinearLayout linear7;
	private LinearLayout toolbar_layout;
	private LinearLayout toolbar_sep;
	private LinearLayout linear1;
	private TextView textview3;
	private LinearLayout linear2;
	private LinearLayout linear6;
	private SeekBar seekbar1;
	private LinearLayout textinputlayout1;
	private Button button1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private CheckBox checkbox2;
	private CheckBox checkbox1;
	private CheckBox checkbox3;
	private CheckBox checkbox4;
	private TextView textview1;
	private TextView textview2;
	private EditText edittext1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.password);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		toolbar_layout = (LinearLayout) findViewById(R.id.toolbar_layout);
		toolbar_sep = (LinearLayout) findViewById(R.id.toolbar_sep);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		seekbar1 = (SeekBar) findViewById(R.id.seekbar1);
		textinputlayout1 = (LinearLayout) findViewById(R.id.textinputlayout1);
		button1 = (Button) findViewById(R.id.button1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
		checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
		checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
		checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		
		seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged (SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				progress = String.valueOf((long)(_progressValue + 8));
				if (progress.length() < 2) {
					textview2.setText(" ".concat(progress));
				}
				else {
					textview2.setText(progress);
				}
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_GenerateList(all);
				edittext1.setText("");
				for(int _repeat13 = 0; _repeat13 < (int)(Double.parseDouble(textview2.getText().toString())); _repeat13++) {
					edittext1.setText(edittext1.getText().toString().concat(chars.get((int)(SketchwareUtil.getRandom((int)(0), (int)(chars.size() - 1))))));
				}
				edittext1.requestFocus();
			}
		});
		
		checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				all = "";
				if (_isChecked) {
					all = all.concat(uppercase);
				}
				if (checkbox1.isChecked()) {
					all = all.concat(lowercase);
				}
				if (checkbox3.isChecked()) {
					all = all.concat(numbers);
				}
				if (checkbox4.isChecked()) {
					all = all.concat(special);
				}
			}
		});
		
		checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				all = "";
				if (checkbox2.isChecked()) {
					all = all.concat(uppercase);
				}
				if (_isChecked) {
					all = all.concat(lowercase);
				}
				if (checkbox3.isChecked()) {
					all = all.concat(numbers);
				}
				if (checkbox4.isChecked()) {
					all = all.concat(special);
				}
			}
		});
		
		checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				all = "";
				if (checkbox2.isChecked()) {
					all = all.concat(uppercase);
				}
				if (checkbox1.isChecked()) {
					all = all.concat(lowercase);
				}
				if (_isChecked) {
					all = all.concat(numbers);
				}
				if (checkbox4.isChecked()) {
					all = all.concat(special);
				}
			}
		});
		
		checkbox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				all = "";
				if (checkbox2.isChecked()) {
					all = all.concat(uppercase);
				}
				if (checkbox1.isChecked()) {
					all = all.concat(lowercase);
				}
				if (checkbox3.isChecked()) {
					all = all.concat(numbers);
				}
				if (_isChecked) {
					all = all.concat(special);
				}
			}
		});
	}
	
	private void initializeLogic() {
		uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		lowercase = "abcdefghijklmnopqrstuvwxyz";
		numbers = "0123456789";
		special = " @#$_&-+()/*\"':;!?<>={}][|\\%";
		all = uppercase.concat(lowercase.concat(numbers));
		positions = SketchwareUtil.getDisplayWidthPixels(getApplicationContext()) / 18.5d;
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
		edittext1.setSelectAllOnFocus(true);
		textview2.setElevation(15);
		textinputlayout1.removeView(edittext1);
		com.google.android.material.textfield.TextInputLayout textinput = new com.google.android.material.textfield.TextInputLayout (this);
		 textinput.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)); 
		/*textinput.setEndIconDrawable(R.drawable.ic_content_copy_black);
    textinput.setEndIconMode(com.google.android.material.textfield.TextInputLayout.END_ICON_CUSTOM);*/
		//textinput.setBoxBackgroundColor(0xFFFFFFFF);
		textinput.setBoxStrokeColor(0xFF0D47A1);
		textinput.setBoxCornerRadii(5, 5, 5, 5);
		textinput.setPadding((int)8, (int)0 , (int)0 , (int)0 );
		textinput.setBoxBackgroundMode(textinput.BOX_BACKGROUND_OUTLINE);
		textinput.addView(edittext1);
		textinputlayout1.addView(textinput);
		/*I Love My JoB */
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _GenerateList (final String _string) {
		pos = 0;
		chars.clear();
		for(int _repeat12 = 0; _repeat12 < (int)(_string.length()); _repeat12++) {
			chars.add(_string.substring((int)(pos), (int)(pos + 1)));
			pos++;
		}
	}
	
	
	public void _applyGradient (final View _v, final String _colour1, final String _colour2, final String _borderColour, final double _cornerRadius, final double _borderThickness) {
		int[] colors = {Color.parseColor(_colour1),Color.parseColor(_colour2)};
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BR_TL, colors);
		gd.setCornerRadius((float)_cornerRadius); 
		gd.setStroke((int)_borderThickness, (Color.parseColor(_borderColour)));
		_v.setBackground(gd);
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