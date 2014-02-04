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
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;



public class Contacts extends Activity {
  // more efficient than HashMap for mapping integers to objects
  SparseArray<Group> groups = new SparseArray<Group>();
  ImageView maharshi,tavish,mohit,pratik,sahu,atulagarwal,krati,rishabgarg,sudhendhra,kumarsaurav,neerajkumar,abhishek,sandeep,neelesh,sahil,kedar,nithin,dhirajbatt,jitendra,sankha=null;
  Context mycontext=null;
  Resources resources=null;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.contacts_layout);
    mycontext=getApplicationContext();
    resources=this.getResources();
    maharshi=(ImageView)findViewById(R.id.imageView_maharshi_small);
    tavish=(ImageView)findViewById(R.id.imageView_tavish_small);
    mohit=(ImageView)findViewById(R.id.imageView_mohit_small);
    pratik=(ImageView)findViewById(R.id.imageView_pratik_small);
    nithin=(ImageView)findViewById(R.id.imageView_nithin_small);
    kedar=(ImageView)findViewById(R.id.imageView_kedar_small);
    sahu=(ImageView)findViewById(R.id.imageView1_sahu_small);
    dhirajbatt=(ImageView)findViewById(R.id.imageView_dhirajbatt_small);
    atulagarwal=(ImageView)findViewById(R.id.imageView_atulagarwal_small);
    sankha=(ImageView)findViewById(R.id.imageView_sankha_small);
    jitendra=(ImageView)findViewById(R.id.imageView_jitendra_small);
    sahil=(ImageView)findViewById(R.id.imageView_sahil_small);
    neelesh=(ImageView)findViewById(R.id.imageView_neelesh_small);
    sandeep=(ImageView)findViewById(R.id.imageView_sandeep_small);
    abhishek=(ImageView)findViewById(R.id.imageView_abhisheksingh_small);
    kumarsaurav=(ImageView)findViewById(R.id.imageView_kumarsaurav_small);
    neerajkumar=(ImageView)findViewById(R.id.imageView_neeraj_small);
    sudhendhra=(ImageView)findViewById(R.id.imageView_sudendhra_small);
    krati=(ImageView)findViewById(R.id.imageView_krati_small);
    rishabgarg=(ImageView)findViewById(R.id.imageView_ridhabgarg_small);
    maharshi.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "maharshi");
			startActivity(myIntent);
		}
	});
   tavish.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "tavish");
			startActivity(myIntent);
		}
	});
   
   mohit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "mohit");
			startActivity(myIntent);
		}
	});
   pratik.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "pratik");
			startActivity(myIntent);
		}
	});
   sahu.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "sahu");
			startActivity(myIntent);
		}
	});
   atulagarwal.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "atulagarwal");
			startActivity(myIntent);
		}
	});
   kedar.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "kedar");
			startActivity(myIntent);
		}
	});
   nithin.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "nithin");
			startActivity(myIntent);
		}
	});
   dhirajbatt.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "dhirajbatt");
			startActivity(myIntent);
		}
	});
   sankha.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "sankha");
			startActivity(myIntent);
		}
	});
   jitendra.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "jitendra");
			startActivity(myIntent);
		}
	});
   sahil.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "sahil");
			startActivity(myIntent);
		}
	});
   neelesh.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "neelesh");
			startActivity(myIntent);
		}
	});
   sandeep.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "sandeep");
			startActivity(myIntent);
		}
	});
   abhishek.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "abhishek");
			startActivity(myIntent);
		}
	});
   kumarsaurav.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "kumarsaurav");
			startActivity(myIntent);
		}
	});
   neerajkumar.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "neerajkumar");
			startActivity(myIntent);
		}
	});
   sudhendhra.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "sudhendhra");
			startActivity(myIntent);
		}
	});
   krati.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "krati");
			startActivity(myIntent);
		}
	});
   rishabgarg.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent myIntent=new Intent(getApplicationContext(),picture_display.class);
			myIntent.putExtra("name", "rishabgarg");
			startActivity(myIntent);
		}
	});
    /*   try {
		createData();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   ExpandableListView listView = (ExpandableListView) findViewById(R.id.contacts_listView);
    ContactsMyExpandableListAdapter adapter = new ContactsMyExpandableListAdapter(this,
        groups);
    listView.setAdapter(adapter); */
    Toast.makeText(mycontext, "Designed and Developed By: \n K MAHARSHI DEVARAJ ", Toast.LENGTH_SHORT).show();
   
  }

  public void createData() throws IOException {
	 int i=0;
	/*  Group group=new Group("Fest Cultural Coordinator :");
	  group.children.add("Pratik Kumar - +91 9782458240");
	  group.children.add("Tavish Garg - +91 9828801027 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Fest Technical Coordinator :");
	  group.children.add("Himanshu Sahu - +91 8824371609 ");
	  group.children.add("Mohit Dadhich - +91 9462211897");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Marketing :");
	  group.children.add("Kedar Vaidya - +91 9828608892");
	  group.children.add("Nithin Veer Reddy - +91 8947052876 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Hospitality and Public Relations :");
	  group.children.add("Atul Agarwal - +91 8386078781");
	  group.children.add("Abhishek Singh - +91 8963863663  ");
	  group.children.add("Kumar Saurav  - +91 9829936053 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Events :");
	  group.children.add("Dhiraj Bhatt - +91 9828797616");
	  group.children.add("Sankha Narayan Guria - +91 8947083543  ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Tech Expo :");
	  group.children.add("Neelesh Dwivedi - +91 9772359680");
	  group.children.add("Neeraj Kumar - +91 9828507799 ");
	  group.children.add("Sudhendra Kowlagi - +91 9982151117 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head WorkShop :");
	  group.children.add("Jitendra Choudhary - +91 9610840149");
	  group.children.add("Sahil Kharb - +91 9828954288 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Creativit :");
	  group.children.add("Yash Kumar Sonthalia - +91 8947098489 ");
	  group.children.add("Abhishek Saini - +91 7877337301 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Web Development :");
	  group.children.add("Aseem Raj - +91 9660186398");
	  group.children.add("Jinank Jain - +91 7597846108 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Special Events and Pronights :");
	  group.children.add("Shivam Punia - +91 9784282911");
	  group.children.add("Maninder Singh - +91 9828500405 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Publicity and Media :");
	  group.children.add("Siddharth Maheshwari - +91 8290441040");
	  group.children.add("Deep Kumar - +91 8947052799");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Finance :");
	  group.children.add("Prashant Mittal - +91 8387833263");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Prakriti :");
	  group.children.add("Krati Saxena - +91 8947034880");
	  group.children.add("Sandeep Hatte - +91 8386068763 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Survey :");
	  group.children.add("Gautam Kumar - +91 8559893660");
	  groups.append(i, group);
	  i++;
	  group=new Group("Head Services :");
	  group.children.add("Srikar RY - +91 7791955220");
	  group.children.add("Anshul Singh Parihar - +91 8233500106 ");
	  groups.append(i, group);
	  i++;
	  group=new Group("App Designed and Developmed By : ");
	  group.children.add("K Maharshi Devaraj - +91 8947052873 ");
	  group.children.add("Rishab");
	  groups.append(i, group);
	  i++;
	   */
	  
		  }
	 
  
  }

