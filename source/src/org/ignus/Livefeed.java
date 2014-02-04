package org.ignus;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.ignus.R;

import android.app.ListActivity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class Livefeed extends ListActivity {

	  InputStreamReader isr=null;
	  BufferedReader br=null;
	  FileInputStream fis=null;
	  DataInputStream dis=null;
	  Context mycontext=null;
	  Resources resources=null;
	  ArrayList<String> list=null;
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    mycontext=getApplicationContext();
    list=new ArrayList<String>();
    resources=this.getResources();
    try{
		  fis=mycontext.openFileInput("Livefeed.txt");
		  dis=new DataInputStream(fis);
		  String line="";
		  int i=0;
		  while((line=dis.readLine())!=null){
			 list.add(line);
		  }
	  }catch(Exception e){
		list.add("No Messages Yet");
	  }
    String[] values = new String[list.size()] ;
    for(int i=0;i<list.size();i++){
    	values[i]=list.get(i);
    }
    // use your own layout
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        R.layout.livefeed_layout, R.id.feed_label, values);
    setListAdapter(adapter);
  }

  @Override
  protected void onListItemClick(ListView l, View v, int position, long id) {
    String item = (String) getListAdapter().getItem(position);
    Toast.makeText(this, item , Toast.LENGTH_LONG).show();
  }
} 
