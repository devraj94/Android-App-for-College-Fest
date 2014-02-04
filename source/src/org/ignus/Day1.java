package org.ignus;



import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

import org.ignus.R;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ExpandableListView;

public class Day1 extends Activity {
  // more efficient than HashMap for mapping integers to objects
  SparseArray<Group> groups = new SparseArray<Group>();

  Calendar cal=null;
  InputStreamReader isr=null;
  BufferedReader br=null;
  FileInputStream fis=null;
  InputStream is=null;
  DataInputStream dis=null;
  Context mycontext=null;
  Resources resources=null;
  Date d=null;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.day1_layout);
    mycontext=getApplicationContext();
    cal=Calendar.getInstance();
    d=cal.getTime();
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

  public void createData() throws IOException {
	  Bundle incoming=this.getIntent().getExtras();
	  String filee=incoming.getString("day");
	  String ff=incoming.getString("cat");
	  if(ff.compareTo("tech")==0){
		  int date=d.getDate();
		  int month=d.getMonth();
		  if(date==27 && month==1){
			  filee="tech1.txt";
		  }else if(date==28 && month==1){
			  filee="tech2.txt";
		  }else if(date==1 && month==2){
			  filee="tech3.txt";
		  }else if(date==2 && month==2){
			  filee="tech4.txt";
		  }else{
			  filee="tech.txt";
		  }
	  }else if(ff.compareTo("cult")==0){
		  int date=d.getDate();
		  int month=d.getMonth();
		  if(date==27 && month==1){
			  filee="cult1.txt";
		  }else if(date==28 && month==1){
			  filee="cult2.txt";
		  }else if(date==1 && month==2){
			  filee="cult3.txt";
		  }else if(date==2 && month==2){
			  filee="cult4.txt";
		  }else{
			  filee="cult.txt";
		  }
	  }else if(ff.compareTo("prakriti")==0){
		  int date=d.getDate();
		  int month=d.getMonth();
		   filee="prakriti.txt";
	  }
		 try{
			  fis=mycontext.openFileInput(filee);
			  dis=new DataInputStream(fis);
			  String line="";
			  int i=0;
			  while((line=dis.readLine())!=null){
				  String t[]=line.split(",");//name time venue co_ord,co_ord..
				  String info=dis.readLine();
				  Group group=new Group(t[0]+"  -  "+t[1]);
				  group.children.add(info);
				  group.children.add("Venue : "+t[2]);
				  for(int w=3;w<t.length;w++){
				  group.children.add("Co-ordinators : "+t[w]);
				  }
				  groups.append(i, group);
				  i++;
			  }
		  }catch(Exception e){
			  if(filee.compareTo("day1.txt")==0){
				  is=resources.openRawResource(R.raw.day1);
			  }else if(filee.compareTo("day2.txt")==0){
				  is=resources.openRawResource(R.raw.day2);
			  }else if(filee.compareTo("day3.txt")==0){
				  is=resources.openRawResource(R.raw.day3);
			  }else if(filee.compareTo("day4.txt")==0){
				  is=resources.openRawResource(R.raw.day4);
			  }else if(ff.compareTo("tech")==0){
				  int date=d.getDate();
				  int month=d.getMonth();
				  if(date==27 && month==1){
					  is=resources.openRawResource(R.raw.tech1);
				  }else if(date==28 && month==1){
					  is=resources.openRawResource(R.raw.tech2);
				  }else if(date==1 && month==2){
					  is=resources.openRawResource(R.raw.tech3);
				  }else if(date==2 && month==2){
					  is=resources.openRawResource(R.raw.tech4);
				  }else{
					  is=resources.openRawResource(R.raw.tech);
				  }
			  }else if(ff.compareTo("cult")==0){
				  int date=d.getDate();
				  int month=d.getMonth();
				  if(date==27 && month==1){
					  is=resources.openRawResource(R.raw.cult1);
				  }else if(date==28 && month==1){
					  is=resources.openRawResource(R.raw.cult2);
				  }else if(date==1 && month==2){
					  is=resources.openRawResource(R.raw.cult3);
				  }else if(date==2 && month==2){
					  is=resources.openRawResource(R.raw.cult4);
				  }else{
					  is=resources.openRawResource(R.raw.cult);
				  }

			  }else if(ff.compareTo("prakriti")==0){
				
					  is=resources.openRawResource(R.raw.prakriti);
				  

			  }

			  isr=new InputStreamReader(is);
			  br=new BufferedReader(isr);
			  String line="";
			  int i=0;
			  while((line=br.readLine())!=null){
				  String t[]=line.split(",");//name time venue co_ord,co_ord..
				  String info=br.readLine();
				  Group group=new Group(t[0]+"  -  "+t[1]);
				  group.children.add(info);
				  group.children.add("Venue : "+t[2]);
				  for(int w=3;w<t.length;w++){
				  group.children.add("Co-ordinators : "+t[w]);
				  }
				  groups.append(i, group);
				  i++;
			  }
		  }
	 
  
  }

} 
