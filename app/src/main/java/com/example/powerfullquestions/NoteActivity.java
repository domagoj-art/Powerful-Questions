package com.example.powerfullquestions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class NoteActivity extends AppCompatActivity {

    private EditText nEtTitle;
    private EditText nEtContent;

    private String nNoteFileName;
    private Note nLoadedNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        nEtTitle = findViewById(R.id.activity_note_question);
        nEtContent = findViewById(R.id.activity_note_answer);


        nNoteFileName = getIntent().getStringExtra("NOTE_FILE");
        if (nNoteFileName != null && !nNoteFileName.isEmpty()) {
            nLoadedNote = Utilities.getNoteByName(this, nNoteFileName);

            if (nLoadedNote != null) {
                nEtTitle.setText(nLoadedNote.getnTitle());
                nEtContent.setText(nLoadedNote.getnContent());
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_new_note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_new_note_save:
                saveNote();
                break;

            case R.id.action_new_note_delete:
                deleteNote();
                break;

            case R.id.action_new_note_back:
                startActivity(new Intent(this, TakingNoteActivity.class));

                break;

        }
        return true;
    }

    public void saveNote() {
        Note note;

        if (nEtTitle.getText().toString().trim().isEmpty() ){
            Toast.makeText(this, "please enter a title and a content", Toast.LENGTH_SHORT).show();
            return;
        }

        if (nLoadedNote == null) {
            note = new Note(System.currentTimeMillis(), nEtTitle.getText().toString(),
                    nEtContent.getText().toString());
        } else {
            note = new Note(nLoadedNote.getnDateTime(), nEtTitle.getText().toString(),
                    nEtContent.getText().toString());
        }
        if (Utilities.saveNote(this, note)) {
            Toast.makeText(this, "your note is saved", Toast.LENGTH_SHORT).show();
            finish();
        } else {
            Toast.makeText(this, "can not save note, pleas make sure you have enugh space on your device"
                    , Toast.LENGTH_SHORT).show();
        }
        finish();
    }

    private void deleteNote() {
        if (nLoadedNote == null) {
            finish();
        } else {

            AlertDialog.Builder dialog = new AlertDialog.Builder(this)
                    .setTitle("delete")
                    .setMessage("you are about delete " + nEtTitle.getText().toString() + " ,are you sure?")
                    .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Utilities.deleteNote(getApplicationContext(),
                                    nLoadedNote.getnDateTime() + Utilities.FILE_EXTENSION);
                            Toast.makeText(getApplicationContext()
                                    , nEtTitle.getText().toString() + " is deleted", Toast.LENGTH_LONG).show();
                            finish();
                        }
                    })
                    .setNegativeButton("no", null)
                    .setCancelable(false);

            dialog.show();
        }

    }
}

