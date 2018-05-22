package in.studyforfun.fashionaddict;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class choose extends AppCompatActivity {
    LinearLayout l1;
    LinearLayout l2;
    LinearLayout l3;
    LinearLayout l4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        l1 = (LinearLayout)findViewById(R.id.menu);
        l1.setVisibility(View.GONE);
        l2 = (LinearLayout)findViewById(R.id.searchview);
        l2.setVisibility(View.GONE);
        l4 = (LinearLayout)findViewById(R.id.settingpanel);
        l4.setVisibility(View.GONE);
        l3 = (LinearLayout)findViewById(R.id.header);
        l3.setVisibility(View.VISIBLE);
    }

    public void collapse(View view) {
        l1.setVisibility(LinearLayout.VISIBLE);
        Animation animation   =    AnimationUtils.loadAnimation(this, R.anim.anim);
        animation.setDuration(500);
        l1.setAnimation(animation);
        l1.animate();
        animation.start();
    }

    public void coll(View view) {
        l1.setVisibility(LinearLayout.GONE);
        Animation animation   =    AnimationUtils.loadAnimation(this, R.anim.anim2);
        animation.setDuration(500);
        l1.setAnimation(animation);
        l1.animate();
        animation.start();
    }

    public void Search(View view) {
        l1.setVisibility(LinearLayout.GONE);
        l3.setVisibility(LinearLayout.GONE);
        l4.setVisibility(LinearLayout.GONE);
        l2.setVisibility(View.VISIBLE);
    }

    public void Cart(View view) {
        coll(l1);
        l3.setVisibility(LinearLayout.GONE);
        l2.setVisibility(LinearLayout.GONE);
        l4.setVisibility(LinearLayout.VISIBLE);
    }

    public void close2(View view) {
        l1.setVisibility(LinearLayout.GONE);
        l4.setVisibility(LinearLayout.GONE);
        l2.setVisibility(View.GONE);
        l3.setVisibility(LinearLayout.VISIBLE);
    }

    public void close3(View view) {
        l1.setVisibility(LinearLayout.GONE);
        l4.setVisibility(LinearLayout.GONE);
        l2.setVisibility(View.GONE);
        l3.setVisibility(LinearLayout.VISIBLE);
    }

}
