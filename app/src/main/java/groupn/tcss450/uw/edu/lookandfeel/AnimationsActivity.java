package groupn.tcss450.uw.edu.lookandfeel;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static groupn.tcss450.uw.edu.lookandfeel.R.id.animate_me;

public class AnimationsActivity extends AppCompatActivity {


    public void animateSpin(View view) {
        View v = findViewById(animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.rotate_and_spin);
        set.setTarget(v);
        set.start();
    }

    public void animateMove(View view) {
        View v = findViewById(animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.move);
        set.setTarget(v);
        set.start();
    }

    public void animateFade(View view) {
        View v = findViewById(animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.fade);
        set.setTarget(v);
        set.start();
    }

    public void animateNew(View view) {
        View v = findViewById(animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.create);
        set.setTarget(v);
        set.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);
        Button spin = (Button) findViewById(R.id.spin_button);
        spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateSpin(v);
            }
        });

        Button move = (Button) findViewById(R.id.move_button);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateMove(v);
            }
        });

        Button fade = (Button) findViewById(R.id.fade_button);
        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateFade(v);
            }
        });

        TextView text= (TextView) findViewById(animate_me);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateNew(v);
            }
        });
    }
}
