package com.example.ods_tabletmode_task;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.userholder> {
List<ModelClass> modelClassList;
  int  selectedItemPosition= -1;
    public AdapterClass(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public userholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recycler,parent,false);
        return new userholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull userholder holder, @SuppressLint("RecyclerView") int position) {
        holder.fname.setText("FirstName :"+modelClassList.get(position).getFname());
        holder.mail.setText("E-Mail :"+modelClassList.get(position).getMail());
        holder.mobile.setText("Mobile :"+modelClassList.get(position).getMobile());
//        holder.countt.setText(""+ getItemCount());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//   //holder.itemView.setBackgroundColor(Color.parseColor("3890"));
//
////        AppCompatActivity activity= (AppCompatActivity) view.getContext();
////        activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragmentB,new FragmentB(modelClassList.get(position).getFname(),modelClassList.get(position).getLname(),modelClassList.get(position).getMail(),modelClassList.get(position).getMobile(),modelClassList.get(position).getDesg(),modelClassList.get(position).getDoj())).addToBackStack(null).commit();
////        selectedItemPosition = position;
//
//
//    }
//});
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                selectedItemPosition=position;
//notifyDataSetChanged();
                AppCompatActivity activity= (AppCompatActivity) view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragmentB,new FragmentB(modelClassList.get(position).getFname(),modelClassList.get(position).getLname(),modelClassList.get(position).getMail(),modelClassList.get(position).getMobile(),modelClassList.get(position).getDesg(),modelClassList.get(position).getDoj())).addToBackStack(null).commit();
                selectedItemPosition = position;
                notifyDataSetChanged();
            }
        });

        if(selectedItemPosition == position){
            holder.itemView.setBackgroundColor(Color.parseColor("#DFE5EEED"));}
        else {
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

    }



    @Override
    public int getItemCount() {
      return  modelClassList.size();

    }

    public class userholder extends RecyclerView.ViewHolder {

        TextView fname,mail,mobile;
        TextView countt;
         LinearLayout linearLayout;
        TextView firstname,lasttname,maill, mobi, disg,dojoin;
        public userholder(@NonNull View itemView) {
            super(itemView);
            fname=itemView.findViewById(R.id.displayname);
            mail=itemView.findViewById(R.id.displayemail);
            mobile=itemView.findViewById(R.id.displaycontact);
            countt=itemView.findViewById(R.id.countno);
           linearLayout=itemView.findViewById(R.id.ll1);
           firstname=itemView.findViewById(R.id.fnamedispid);
            lasttname=itemView.findViewById(R.id.lnamedispid);
          maill=itemView.findViewById(R.id.maildispid);
          mobi=itemView.findViewById(R.id.mobiledispid);
          disg=itemView.findViewById(R.id.desgdispid);
            dojoin=itemView.findViewById(R.id.dojdispid);


        }
    }
}
