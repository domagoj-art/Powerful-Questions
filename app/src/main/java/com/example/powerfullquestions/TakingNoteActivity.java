package com.example.powerfullquestions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TakingNoteActivity extends AppCompatActivity {

    private ListView nListView;
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taking_note);





        nListView = findViewById(R.id.taking_note_listView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_taking_note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.action_create_takingNote:
                startActivity(new Intent(this,NoteActivity.class));
            break;

            case R.id.action_back_takingNote:
                startActivity(new Intent(this,MainActivity.class));

                break;

            case R.id.action_tasks_menu_taking_note:
                startActivity(new Intent(this, Task1Activity.class));
                break;

        }
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        nListView.setAdapter(null);

        ArrayList<Note> notes = Utilities.getAllSavedNotes(this);

        if (notes == null || notes.size() == 0) {
            Toast.makeText(this,"you have no saved notes!",Toast.LENGTH_SHORT).show();
            return;
        }else {
            NoteAdapter na = new NoteAdapter(this,R.layout.item_note ,notes);
            nListView.setAdapter(na);

            nListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String fileName = ((Note)nListView.getItemAtPosition(position)).getnDateTime()
                            + Utilities.FILE_EXTENSION;

                    Intent viewNoteIntent = new Intent(getApplicationContext(), NoteActivity.class);
                    viewNoteIntent.putExtra( "NOTE_FILE",fileName);
                    startActivity(viewNoteIntent);
                }
            });
        }
    }
}
