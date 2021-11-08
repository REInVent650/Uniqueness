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
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Switch;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class NewColorGenActivity extends  AppCompatActivity  { 
	
	
	private String error = "";
	private String colour = "";
	private double pos = 0;
	private double colourLength = 0;
	private double random = 0;
	private String errorLong = "";
	private  com.google.android.material.textfield.TextInputLayout textinput;
	private  com.google.android.material.textfield.TextInputLayout textinput2;
	
	private ArrayList<String> colours = new ArrayList<>();
	
	private LinearLayout linear33;
	private LinearLayout toolbar_layout;
	private ScrollView vscroll2;
	private LinearLayout pal;
	private LinearLayout pal2;
	private ImageView imageview5;
	private TextView textview3;
	private LinearLayout toolbar_sep;
	private LinearLayout linear1;
	private LinearLayout linear25;
	private TextView textview2;
	private LinearLayout linear4;
	private LinearLayout linear28;
	private LinearLayout linear12;
	private LinearLayout linear16;
	private LinearLayout linear14;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear24;
	private LinearLayout linear5;
	private ImageView imageview2;
	private TextView textview16;
	private TextView textview4;
	private LinearLayout linear13;
	private Switch red;
	private TextView textview9;
	private TextView textview8;
	private LinearLayout linear15;
	private Switch blue;
	private TextView textview10;
	private TextView textview11;
	private LinearLayout linear20;
	private Switch green;
	private TextView textview12;
	private TextView textview13;
	private LinearLayout linear23;
	private Switch alpha;
	private TextView textview14;
	private TextView textview15;
	private LinearLayout linear29;
	private LinearLayout textinputlayout1;
	private LinearLayout textinputlayout2;
	private Button button1;
	private LinearLayout palette;
	private LinearLayout palette2;
	private ImageView imageview3;
	private EditText edittext1;
	private EditText edittext2;
	
	private AlertDialog.Builder DE;
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.new_color_gen);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		toolbar_layout = (LinearLayout) findViewById(R.id.toolbar_layout);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		pal = (LinearLayout) findViewById(R.id.pal);
		pal2 = (LinearLayout) findViewById(R.id.pal2);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview3 = (TextView) findViewById(R.id.textview3);
		toolbar_sep = (LinearLayout) findViewById(R.id.toolbar_sep);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		red = (Switch) findViewById(R.id.red);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		blue = (Switch) findViewById(R.id.blue);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		green = (Switch) findViewById(R.id.green);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		alpha = (Switch) findViewById(R.id.alpha);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		textinputlayout1 = (LinearLayout) findViewById(R.id.textinputlayout1);
		textinputlayout2 = (LinearLayout) findViewById(R.id.textinputlayout2);
		button1 = (Button) findViewById(R.id.button1);
		palette = (LinearLayout) findViewById(R.id.palette);
		palette2 = (LinearLayout) findViewById(R.id.palette2);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		DE = new AlertDialog.Builder(this);
		
		linear33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear33.setVisibility(View.GONE);
			}
		});
		
		pal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				androidx.core.view.ViewCompat.setTranslationZ(pal, 10);
				androidx.core.view.ViewCompat.setTranslationZ(pal2, 1);
				androidx.core.view.ViewCompat.setTranslationZ(palette, 10);
				androidx.core.view.ViewCompat.setTranslationZ(palette2, 1);
			}
		});
		
		pal2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				androidx.core.view.ViewCompat.setTranslationZ(palette2, 10);
				androidx.core.view.ViewCompat.setTranslationZ(palette, 1);
				androidx.core.view.ViewCompat.setTranslationZ(pal2, 10);
				androidx.core.view.ViewCompat.setTranslationZ(pal, 1);
			}
		});
		
		linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ColorActivity.class);
				startActivity(i);
			}
		});
		
		linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear33.setVisibility(View.VISIBLE);
			}
		});
		
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
							if (red.isChecked()) {
								random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
								colour = colour.concat(colours.get((int)(random)));
							}
							else {
								colour = colour.concat("0");
							}
						}
						else {
							if ((pos == 4) || (pos == 5)) {
								if (green.isChecked()) {
									random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
									colour = colour.concat(colours.get((int)(random)));
								}
								else {
									colour = colour.concat("0");
								}
							}
							else {
								if ((pos == 6) || (pos == 7)) {
									if (blue.isChecked()) {
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
					palette.setBackgroundColor(Color.parseColor(colour));
					pal.setBackgroundColor(Color.parseColor(colour));
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
							if (red.isChecked()) {
								random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
								colour = colour.concat(colours.get((int)(random)));
							}
							else {
								colour = colour.concat("0");
							}
						}
						else {
							if ((pos == 4) || (pos == 5)) {
								if (green.isChecked()) {
									random = SketchwareUtil.getRandom((int)(0), (int)(colours.size() - 1));
									colour = colour.concat(colours.get((int)(random)));
								}
								else {
									colour = colour.concat("0");
								}
							}
							else {
								if ((pos == 6) || (pos == 7)) {
									if (blue.isChecked()) {
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
					palette2.setBackgroundColor(Color.parseColor(colour));
					pal2.setBackgroundColor(Color.parseColor(colour));
					edittext2.setText(colour);
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
			}
		});
		
		palette.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				androidx.core.view.ViewCompat.setTranslationZ(palette, 10);
				androidx.core.view.ViewCompat.setTranslationZ(palette2, 1);
				androidx.core.view.ViewCompat.setTranslationZ(pal, 10);
				androidx.core.view.ViewCompat.setTranslationZ(pal2, 1);
			}
		});
		
		palette2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				androidx.core.view.ViewCompat.setTranslationZ(palette2, 10);
				androidx.core.view.ViewCompat.setTranslationZ(palette, 1);
				androidx.core.view.ViewCompat.setTranslationZ(pal2, 10);
				androidx.core.view.ViewCompat.setTranslationZ(pal, 1);
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.contains("#") && ((_charSeq.length() == 3) || ((_charSeq.length() == 5) || ((_charSeq.length() == 7) || (_charSeq.length() == 9))))) {
					try {
						textinput.setBoxStrokeColor(Color.parseColor(_charSeq));
						pal.setBackgroundColor(Color.parseColor(_charSeq));
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
						palette2.setBackgroundColor(Color.parseColor(_charSeq));
						pal2.setBackgroundColor(Color.parseColor(_charSeq));
						textinput2.setBoxStrokeColor(Color.parseColor(colour));
						if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
								Window w = NewColorGenActivity.this.getWindow();
								w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
								w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor(_charSeq));
						}
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
		linear33.setVisibility(View.GONE);
		_init();
		colourLength = 8;
		button1.performClick();
		/* TextInputLayouts Codes ReiNVeint */
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
	
	
	public void _methods () {
	}
	public static boolean isDark(int color){
		return Color.luminance(color) < 0.5;
	}
	public static int getBgColorInt(View v){
		android.graphics.drawable.ColorDrawable viewColor = (android.graphics.drawable.ColorDrawable) v.getBackground();
		return viewColor.getColor();
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