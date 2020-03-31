package com.example.powerfullquestions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private TextView questions;
    private Button btn;
    private Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questions = findViewById(R.id.A_M_TextView_Question);
        btn = findViewById(R.id.a_m_button_next_question);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            randomQuestion();
            }
            private void randomQuestion(){
                int rng = rnd.nextInt(129) + 1;
                switch (rng){
                    case 1:
                        questions.setText(R.string.a);
                        break;
                    case 2:
                        questions.setText(R.string.b);
                        break;
                    case 3:
                        questions.setText(R.string.c);
                        break;
                    case 4:
                        questions.setText(R.string.d);
                        break;
                    case 5:
                        questions.setText(R.string.e);
                        break;
                    case 6:
                        questions.setText(R.string.f);
                        break;
                    case 7:
                        questions.setText(R.string.g);
                        break;
                    case 8:
                        questions.setText(R.string.h);
                        break;
                    case 9:
                        questions.setText(R.string.i);
                        break;
                    case 10:
                        questions.setText(R.string.j);
                        break;
                    case 11:
                        questions.setText(R.string.k);
                        break;
                    case 12:
                        questions.setText(R.string.l);
                        break;
                    case 13:
                        questions.setText(R.string.n);
                        break;
                    case 14:
                        questions.setText(R.string.m);
                        break;
                    case 15:
                        questions.setText(R.string.o);
                        break;
                    case 16:
                        questions.setText(R.string.p);
                        break;
                    case 17:
                        questions.setText(R.string.r);
                        break;
                    case 18:
                        questions.setText(R.string.s);
                        break;
                    case 19:
                        questions.setText(R.string.t);
                        break;
                    case 20:
                        questions.setText(R.string.u);
                        break;
                    case 21:
                        questions.setText(R.string.a1);
                        break;
                    case 22:
                        questions.setText(R.string.b1);
                        break;
                    case 23:
                        questions.setText(R.string.c1);
                        break;
                    case 24:
                        questions.setText(R.string.d1);
                        break;
                    case 25:
                        questions.setText(R.string.e1);
                        break;
                    case 26:
                        questions.setText(R.string.f1);
                        break;
                    case 27:
                        questions.setText(R.string.g1);
                        break;
                    case 28:
                        questions.setText(R.string.h1);
                        break;
                    case 29:
                        questions.setText(R.string.i1);
                        break;
                    case 30:
                        questions.setText(R.string.j1);
                        break;
                    case 31:
                        questions.setText(R.string.k1);
                        break;
                    case 32:
                        questions.setText(R.string.l1);
                        break;
                    case 33:
                        questions.setText(R.string.n1);
                        break;
                    case 34:
                        questions.setText(R.string.m1);
                        break;
                    case 35:
                        questions.setText(R.string.o1);
                        break;
                    case 36:
                        questions.setText(R.string.p1);
                        break;
                    case 37:
                        questions.setText(R.string.r1);
                        break;
                    case 38:
                        questions.setText(R.string.s1);
                        break;
                    case 39:
                        questions.setText(R.string.t1);
                        break;
                    case 40:
                        questions.setText(R.string.u1);
                        break;
                    case 41:
                        questions.setText(R.string.a2);
                        break;
                    case 42:
                        questions.setText(R.string.a3);
                        break;
                    case 43:
                        questions.setText(R.string.b2);
                        break;
                    case 44:
                        questions.setText(R.string.b3);
                        break;
                    case 45:
                        questions.setText(R.string.c2);
                        break;
                    case 46:
                        questions.setText(R.string.c3);
                        break;
                    case 47:
                        questions.setText(R.string.d2);
                        break;
                    case 48:
                        questions.setText(R.string.d3);
                        break;
                    case 49:
                        questions.setText(R.string.e2);
                        break;
                    case 50:
                        questions.setText(R.string.e3);
                        break;
                    case 51:
                        questions.setText(R.string.f2);
                        break;
                    case 53:
                        questions.setText(R.string.f3);
                        break;
                    case 54:
                        questions.setText(R.string.g4);
                        break;
                    case 55:
                        questions.setText(R.string.g5);
                        break;
                    case 56:
                        questions.setText(R.string.h2);
                        break;
                    case 57:
                        questions.setText(R.string.h4);
                        break;
                    case 58:
                        questions.setText(R.string.h5);
                        break;
                    case 59:
                        questions.setText(R.string.h6);
                        break;
                    case 60:
                        questions.setText(R.string.i4);
                        break;
                    case 61:
                        questions.setText(R.string.i5);
                        break;
                    case 62:
                        questions.setText(R.string.i6);
                        break;
                    case 63:
                        questions.setText(R.string.j2);
                        break;
                    case 64:
                        questions.setText(R.string.g2);
                        break;
                    case 65:
                        questions.setText(R.string.i2);
                        break;
                    case 66:
                        questions.setText(R.string.j4);
                        break;
                    case 67:
                        questions.setText(R.string.j5);
                        break;
                    case 68:
                        questions.setText(R.string.j6);
                        break;
                    case 69:
                        questions.setText(R.string.k2);
                        break;
                    case 70:
                        questions.setText(R.string.k4);
                        break;
                    case 71:
                        questions.setText(R.string.k5);
                        break;
                    case 72:
                        questions.setText(R.string.k6);
                        break;
                    case 73:
                        questions.setText(R.string.l2);
                        break;
                    case 74:
                        questions.setText(R.string.l4);
                        break;
                    case 75:
                        questions.setText(R.string.l5);
                        break;
                    case 76:
                        questions.setText(R.string.l6);
                        break;
                    case 77:
                        questions.setText(R.string.n2);
                        break;
                    case 78:
                        questions.setText(R.string.n4);
                        break;
                    case 79:
                        questions.setText(R.string.n5);
                        break;
                    case 80:
                        questions.setText(R.string.n6);
                        break;
                    case 81:
                        questions.setText(R.string.m2);
                        break;
                    case 82:
                        questions.setText(R.string.m4);
                        break;
                    case 83:
                        questions.setText(R.string.m5);
                        break;
                    case 84:
                        questions.setText(R.string.m6);
                        break;
                    case 85:
                        questions.setText(R.string.o2);
                        break;
                    case 86:
                        questions.setText(R.string.o4);
                        break;
                    case 87:
                        questions.setText(R.string.o5);
                        break;
                    case 88:
                        questions.setText(R.string.o6);
                        break;
                    case 89:
                        questions.setText(R.string.p2);
                        break;
                    case 90:
                        questions.setText(R.string.p4);
                        break;
                    case 91:
                        questions.setText(R.string.p5);
                        break;
                    case 92:
                        questions.setText(R.string.p6);
                        break;
                    case 93:
                        questions.setText(R.string.r2);
                        break;
                    case 94:
                        questions.setText(R.string.r4);
                        break;
                    case 95:
                        questions.setText(R.string.r5);
                        break;
                    case 96:
                        questions.setText(R.string.r6);
                        break;
                    case 97:
                        questions.setText(R.string.s2);
                        break;
                    case 98:
                        questions.setText(R.string.s4);
                        break;
                    case 99:
                        questions.setText(R.string.s5);
                        break;
                    case 100:
                        questions.setText(R.string.s6);
                        break;
                    case 101:
                        questions.setText(R.string.t2);
                        break;
                    case 102:
                        questions.setText(R.string.t4);
                        break;
                    case 103:
                        questions.setText(R.string.t5);
                        break;
                    case 104:
                        questions.setText(R.string.t6);
                        break;
                    case 105:
                        questions.setText(R.string.u2);
                        break;
                    case 106:
                        questions.setText(R.string.u5);
                        break;
                    case 107:
                        questions.setText(R.string.u6);
                        break;
                    case 108:
                        questions.setText(R.string.u7);
                        break;
                    case 109:
                        questions.setText(R.string.u8);
                        break;
                    case 110:
                        questions.setText(R.string.u9);
                        break;
                    case 111:
                        questions.setText(R.string.u10);
                        break;
                    case 112:
                        questions.setText(R.string.u11);
                        break;
                    case 113:
                        questions.setText(R.string.u12);
                        break;
                    case 114:
                        questions.setText(R.string.u13);
                        break;
                    case 115:
                        questions.setText(R.string.u14);
                        break;
                    case 116:
                        questions.setText(R.string.z);
                        break;
                    case 117:
                        questions.setText(R.string.z1);
                        break;
                    case 118:
                        questions.setText(R.string.z2);
                        break;
                    case 119:
                        questions.setText(R.string.z3);
                        break;
                    case 120:
                        questions.setText(R.string.z4);
                        break;
                    case 121:
                        questions.setText(R.string.z5);
                        break;
                    case 122:
                        questions.setText(R.string.z6);
                        break;
                    case 123:
                        questions.setText(R.string.z7);
                        break;
                    case 124:
                        questions.setText(R.string.z8);
                        break;
                    case 125:
                        questions.setText(R.string.z9);
                        break;
                    case 126:
                        questions.setText(R.string.z11);
                        break;
                    case 127:
                        questions.setText(R.string.z12);
                        break;
                    case 128:
                        questions.setText(R.string.z13);
                        break;
                    case 129:
                        questions.setText(R.string.z14);
                        break;

                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_main_forward:
                //starting activity in TakingNote mode
                startActivity(new Intent( this,TakingNoteActivity.class ));

                break;
            case R.id.a_m_all_questions:
                startActivity(new Intent(this,AllQuestionsActivity.class));
                break;
            case R.id.a_m_info:
                startActivity(new Intent(this, AboutAppActivity.class));
                break;
        }
        return true;
    }
}
