package com.edwinpaezalonso.visitando.vista;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.edwinpaezalonso.visitando.R;

import java.util.List;

public class ListaUnoAdapter extends BaseAdapter {

    private Context context;
    private List<ListaUno> items;

    public ListaUnoAdapter(Context context, List<ListaUno> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (convertView == null) {
            // Create a new view into the list.
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.lista_uno, parent, false);
        }

        // Set data into the view.
        ImageView ivItem1 = (ImageView) rowView.findViewById(R.id.ivItem1);
        TextView tvTitle1 = (TextView) rowView.findViewById(R.id.tvTitle1);
        TextView tvDescripcion1 = (TextView) rowView.findViewById(R.id.tvDescripcion1);
        ListaUno item = this.items.get(position);
        tvTitle1.setText(item.getTitle1());
        tvDescripcion1.setText(item.getDescripcion1());
        ivItem1.setImageResource(item.getImage1());

        return rowView;
    }

}