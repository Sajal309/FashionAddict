package in.studyforfun.fashionaddict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

public class Women extends AppCompatActivity {
    LinearLayout l1;
    WebView w3;
    String url3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);
        w3 = (WebView)findViewById(R.id.web2);
        url3 = "type1.php?cat=Womens";

        WebSettings v = w3.getSettings();
        v.setJavaScriptEnabled(true);
        w3.setWebViewClient(new WebViewClient());
        w3.loadUrl("http://studyforfun.000webhostapp.com/"+url3);

        l1 = (LinearLayout)findViewById(R.id.menu);
        l1.setVisibility(View.GONE);
    }

    public void b_rands(){
        w3.loadUrl("http://studyforfun.000webhostapp.com/"+url3);
        l1.setVisibility(View.GONE);
    }

    public void Home(View view) {
        Intent i = new Intent(Women.this,MainActivity.class);
        startActivity(i);
        l1.setVisibility(LinearLayout.GONE);









    }

    public void Mens(View view) {
        Intent i = new Intent(Women.this,Men.class);
        startActivity(i);
        l1.setVisibility(LinearLayout.GONE);
    }

    public void Womens(View view) {
        Intent i = new Intent(Women.this,Women.class);
        startActivity(i);
        l1.setVisibility(LinearLayout.GONE);
    }

    public void Brands(View view) {
        url3 = "main1.php#brands";
        b_rands();
    }

    public void More(View view) {
        Intent i = new Intent(Women.this,More.class);
        startActivity(i);
        l1.setVisibility(LinearLayout.GONE);
    }

    public void collapse(View view) {
        l1.setVisibility(LinearLayout.VISIBLE);
        Animation animation   =    AnimationUtils.loadAnimation(this, R.anim.anim);
        animation.setDuration(500);
        l1.setAnimation(animation);
        l1.animate();
        animation.start();

    }

    public void Account(View view) {
        Intent i = new Intent(Women.this,Account.class);
        startActivity(i);
        l1.setVisibility(LinearLayout.GONE);
    }

    public void coll(View view) {
        l1.setVisibility(LinearLayout.GONE);
        Animation animation   =    AnimationUtils.loadAnimation(this, R.anim.anim2);
        animation.setDuration(500);
        l1.setAnimation(animation);
        l1.animate();
        animation.start();
    }
    @Override
    public void onBackPressed() {
        if (w3.canGoBack()) {
            w3.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public void Search(View view) {
        Intent i = new Intent(this,Search.class);
        startActivity(i);
        l1.setVisibility(LinearLayout.GONE);
    }


    public void Cart(View view) {
        Intent i = new Intent(this,Cart.class);
        startActivity(i);
        l1.setVisibility(LinearLayout.GONE);
    }
}
