package com.example.qrdolgozat;

import com.example.qrdolgozat.ListItem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.List;
public class PersonListAdapter<ListItem> extends ArrayAdapter<ListItem> {
    private int resourceLayout;
    public PersonListAdapter(Context context, int resource, List<ListItem> items) {
        super(context, resource, items);
        this.resourceLayout = resource;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = LayoutInflater.from(getContext());
            v = vi.inflate(resourceLayout, null);
        }
        ListItem listItem = getItem(position);
        if (listItem != null) {
            TextView modositButton = v.findViewById(R.id.modositButton);
            TextView nevText = v.findViewById(R.id.nevText);
            TextView jegyText = v.findViewById(R.id.jegyText);
            if (modositButton != null) {
                modositButton.setText("Szerkesztés");
            }
            if (nevText != null) {
                nevText.setText(listItem.getId());
            }
            if (nevText != null) {
                nevText.setText(listItem.getName());
            }
            if (jegyText != null) {
                jegyText.setText(listItem.getGrade());
            }
        }
        return v;
    }
}