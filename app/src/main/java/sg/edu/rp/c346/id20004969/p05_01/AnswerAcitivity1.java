package sg.edu.rp.c346.id20004969.p05_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerAcitivity1 extends AppCompatActivity {
TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_acitivity1);

        tvAnswer = findViewById(R.id.textViewQns1);
        Intent received = getIntent();
        String QuestionSelected = received.getStringExtra("Question");
        if(QuestionSelected.equalsIgnoreCase("Q1"))
        {
            tvAnswer.setText("Q1 answer is QUEUE");
        }
        else
        {
            tvAnswer.setText("Q2 answer is Gone");
        }

    }
}