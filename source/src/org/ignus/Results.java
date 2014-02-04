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

public class Results extends Activity {
  // more efficient than HashMap for mapping integers to objects
  SparseArray<Group> groups = new SparseArray<Group>();

  Calendar cal=null;
  InputStreamReader isr=null;
  BufferedReader br=null;
  FileInputStream fis=null;
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
	
		 try{
			  fis=mycontext.openFileInput("Results.txt");
			  dis=new DataInputStream(fis);
			  String line="";
			  int i=0;
			  while((line=dis.readLine())!=null){
				  String m[]=line.split(",");// insti_name--score no.of.events (next that no of lines with event name and place)
				  int n=Integer.parseInt(m[1]);
				  Group group=new Group(m[0]);
                  for(int l=0;l<n;l++){
				  group.children.add(dis.readLine());
                  }
				  groups.append(i, group);
				  i++;
			  }
		  }catch(Exception e){
			  int i=0;
			  Group group=new Group("Not Yet...");
			  groups.append(i, group);
		  }
	 
  
  }

} 
