package org.ignus;
import org.ignus.R;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;

public class picture_display extends Activity {
	ImageView view=null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.picture_display_layout);
	Bundle incoming=this.getIntent().getExtras();
	view=(ImageView)findViewById(R.id.picture_display_image);
	String str=incoming.getString("name").toString();
	if(str.compareTo("maharshi")==0){
		view.setImageResource(R.drawable.maharshi_main);
	}
	if(str.compareTo("tavish")==0){
		view.setImageResource(R.drawable.tavish_main);
	}
	if(str.compareTo("mohit")==0){
		view.setImageResource(R.drawable.mohit_main);
	}
	if(str.compareTo("pratik")==0){
		view.setImageResource(R.drawable.pratik_main);
	}
	if(str.compareTo("sahu")==0){
		view.setImageResource(R.drawable.sahu_main);
	}
	if(str.compareTo("atulagarwal")==0){
		view.setImageResource(R.drawable.atulagarwal_main);
	}
	if(str.compareTo("kedar")==0){
		view.setImageResource(R.drawable.kedar_main);
	}
	if(str.compareTo("nithin")==0){
		view.setImageResource(R.drawable.nithin_main);
	}
	if(str.compareTo("dhirajbatt")==0){
		view.setImageResource(R.drawable.dhirajbatt_main);
	}
	if(str.compareTo("sankha")==0){
		view.setImageResource(R.drawable.sankha_main);
	}
	if(str.compareTo("jitendra")==0){
		view.setImageResource(R.drawable.jitendra_main);
	}
	if(str.compareTo("sahil")==0){
		view.setImageResource(R.drawable.sahil_main);
	}
	if(str.compareTo("neelesh")==0){
		view.setImageResource(R.drawable.neelesh_main);
	}
	if(str.compareTo("sandeep")==0){
		view.setImageResource(R.drawable.sandeep_main);
	}
	if(str.compareTo("abhishek")==0){
		view.setImageResource(R.drawable.no_image_main);
	}
	if(str.compareTo("kumarsaurav")==0){
		view.setImageResource(R.drawable.no_image_main);
	}
	if(str.compareTo("neerajkumar")==0){
		view.setImageResource(R.drawable.no_image_main);
	}
	if(str.compareTo("sudhendhra")==0){
		view.setImageResource(R.drawable.no_image_main);
	}
	if(str.compareTo("krati")==0){
		view.setImageResource(R.drawable.no_image_main);
	}
	if(str.compareTo("rishabgarg")==0){
		view.setImageResource(R.drawable.no_image_main);
	}
	}
}
