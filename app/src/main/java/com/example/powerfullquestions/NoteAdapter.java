package com.example.powerfullquestions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NoteAdapter extends ArrayAdapter<Note> {
    public NoteAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Note> notes) {
        super(context, resource, notes);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       // return super.getView(position, convertView, parent);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_note, null);

        }
        Note note = getItem(position);
        if (convertView != null) {
            TextView nTitle = convertView.findViewById(R.id.item_note_title);
            TextView nDate = convertView.findViewById(R.id.item_note_date);
            TextView nContent =  convertView.findViewById(R.id.item_note_content);

            nTitle.setText(note.getnTitle());
            nDate.setText(note.getTimeDateFormatted(getContext()));

            if (note.getnContent().length() > 50) {
               nContent.setText(note.getnContent().substring(0,50));
            }else {
                nContent.setText(note.getnContent());
            }
        }
        return convertView;
    }
}

