package com.example.ods_tabletmode_task;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentB extends Fragment {

 String fname,mob,mail1,lname,desg,doj;
    public FragmentB() {
        // Required empty public constructor
    }



    public FragmentB(String fname, String lname, String mail, String mobile, String desg, String doj) {
        this.fname=fname;
        this.mob=mobile;
        this.mail1=mail;
        this.lname=lname;
        this.desg=desg;
        this.doj=doj;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View Root=inflater.inflate(R.layout.fragment_b, container, false);

        TextView firstname=Root.findViewById(R.id.fnamedispid);
        TextView lasttname=Root.findViewById(R.id.lnamedispid);
        TextView maill=Root.findViewById(R.id.maildispid);
        TextView mobi=Root.findViewById(R.id.mobiledispid);
        TextView disg=Root.findViewById(R.id.desgdispid);
        TextView dojoin=Root.findViewById(R.id.dojdispid);

        firstname.setText("FirstName :"+fname);
        maill.setText("E-Mail :"+mail1);
        mobi.setText("Mobile No. :"+mob);
        lasttname.setText("LastName :"+lname);
        disg.setText("Designation :"+doj);
        dojoin.setText("Date of Joining :"+desg);

        return Root;
    }
}