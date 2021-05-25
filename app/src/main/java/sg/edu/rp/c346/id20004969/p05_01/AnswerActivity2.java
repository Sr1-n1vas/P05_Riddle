package sg.edu.rp.c346.id20004969.p05_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer = findViewById(R.id.textViewQns2);
        Intent received2 = getIntent();
        String QuestionSelected2 = received2.getStringExtra("Question2");
        tvAnswer.setText(QuestionSelected2 + " answer is : Gone");

    }
}