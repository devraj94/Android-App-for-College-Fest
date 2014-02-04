package org.ignus;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

import org.ignus.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
public class Events extends Activity{
	
	  SparseArray<Group> groups = new SparseArray<Group>();
	int selection=0;
	Calendar cal=null;
	  InputStreamReader isr=null;
	  BufferedReader br=null;
	  InputStream is=null;
	  DataInputStream dis=null;
	  Context mycontext=null;
	  Resources resources=null;
	  Date d=null;

	  Events eve=null;
	  String filee="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		 cal=Calendar.getInstance();
		    d=cal.getTime();
		int date=d.getDate();
		  int month=d.getMonth();
		  if(date==27 && month==1){
			  filee="h_day1.txt";
		  }else if(date==28 && month==1){
			  filee="h_day2.txt";
		  }else if(date==1 && month==2){
			  filee="h_day3.txt";
		  }else if(date==2 && month==2){
			  filee="h_day4.txt";
		  }else{
			  filee="showtext";
		  }
	if(filee.compareTo("showtext")==0){
			  setContentView(R.layout.event_layout);
			  mycontext=getApplicationContext();

			    resources=this.getResources();
			    eve=this;
			    Button menu=(Button)findViewById(R.id.menu_button_events);
			    menu.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						openOptionsMenu();
					}
				});
	 }else{
		setContentView(R.layout.day1_layout);
		mycontext=getApplicationContext();

	    resources=this.getResources();
	 try {
			createData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
	    MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
	        groups);
	    listView.setAdapter(adapter);
	

		  } 
					
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater=getMenuInflater();
		inflater.inflate(R.menu.event_menu,menu);
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem mi){
		Intent myintent=new Intent(mycontext,Day1.class);
		if(mi.getItemId()==R.id.day1_bydate){
			myintent.putExtra("day", "day1.txt");
	           myintent.putExtra("cat", "a");
			startActivity(myintent);
			return true;
		}
		if(mi.getItemId()==R.id.day2_bydate){
			myintent.putExtra("day", "day2.txt");
			myintent.putExtra("cat", "a");
			startActivity(myintent);
					return true;
				}
		if(mi.getItemId()==R.id.day3_bydate){
			myintent.putExtra("day", "day3.txt");
			myintent.putExtra("cat", "a");
			startActivity(myintent);
			return true;
		}
		if(mi.getItemId()==R.id.day4_bydate){
			myintent.putExtra("day", "day4.txt");
			myintent.putExtra("cat", "a");
			startActivity(myintent);
					return true;
				}
		if(mi.getItemId()==R.id.cult_bycat){
           myintent.putExtra("day", "0");
           myintent.putExtra("cat", "cult");
			startActivity(myintent);
			return true;
		}
		if(mi.getItemId()==R.id.tech_bycat){
			myintent.putExtra("day", "0");
	        myintent.putExtra("cat", "tech");
			startActivity(myintent);
			return true;
		}
		if(mi.getItemId()==R.id.prakriti_bycat){
			myintent.putExtra("day", "0");
	        myintent.putExtra("cat", "prakriti");
			startActivity(myintent);
			return true;
		}
	return true;
	}
	
	public void createData() throws IOException {
	
		
		  Group group=new Group("HAPPENING NOW");
		  groups.append(0, group);
		  if(filee.compareTo("showtext")==0){
		  }else{
			  try{
				  int hrs=d.getHours();
				  is=mycontext.openFileInput(filee);
				  dis=new DataInputStream(is);
				  String line="";
				  int i=1;
				  while((line=dis.readLine())!=null){
					  String t[]=line.split(",");//name - time - venue,time
					  int event_time=Integer.parseInt(t[1])/100;
					  if(event_time>=(hrs-2)&& event_time<=(hrs+2)){
						   group=new Group(t[0]);
						  groups.append(i, group);
						  i++;
					  }
				  }
			  }catch(Exception e){
				  if(filee.compareTo("h_day1.txt")==0){
					  is=resources.openRawResource(R.raw.cult);
				  }else if(filee.compareTo("h_day2.txt")==0){
					  is=resources.openRawResource(R.raw.cult);
				  }else if(filee.compareTo("h_day3.txt")==0){
					  is=resources.openRawResource(R.raw.cult);
				  }else if(filee.compareTo("h_day4.txt")==0){
					  is=resources.openRawResource(R.raw.cult);
				  }
				  
				  int hrs=d.getHours();
				  isr=new InputStreamReader(is);
				  br=new BufferedReader(isr);
				  String line="";
				  int i=1;
				  while((line=br.readLine())!=null){
					  String t[]=line.split(",");//name - time - venue,time
					  int event_time=Integer.parseInt(t[1])/100;
					  if(event_time>=(hrs-2)&& event_time<=(hrs+2)){
						   group=new Group(t[0]);
						  groups.append(i, group);
						  i++;
					  }
				  }
			  }
		  }
		
		
	  
	  }
}