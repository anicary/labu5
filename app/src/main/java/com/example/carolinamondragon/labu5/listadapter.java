package com.example.carolinamondragon.labu5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Carolina Mondragon on 21/05/2018.
 */

public class listadapter extends BaseAdapter {
    Context context;
    String nom[];
    String  tel[];
    String ini[];
    LayoutInflater inflater;
    String p,t;
    public listadapter(Context context,String nom[],String tel[]){
        this.context=context;
        this.nom=nom;
        this.tel=tel;
        ini=getIniciales();
    }

    public String[] getIniciales(){
        String temp[]=new String[nom.length];
        for (int i=0;i<nom.length;i++){
            temp[i]=nom[i].substring(0,1);
        }
        return temp;
    }

    @Override
    public int getCount() {
        return nom.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView txtNombre;
        TextView txtTelefono;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_item, viewGroup, false);

        txtNombre = (TextView) itemView.findViewById(R.id.nom);
        txtTelefono = (TextView) itemView.findViewById(R.id.tel);

        txtNombre.setText(nom[i]);
        txtTelefono.setText(tel[i]);

        return itemView;
    }

    public String getEmojiByUnicode(int unicode){
        return new String(Character.toChars(unicode));
    }

}
