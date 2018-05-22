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

public class Search2 extends AppCompatActivity {
LinearLayout l1;
LinearLayout l2;
LinearLayout l3;
LinearLayout l4;
WebView w3;
String url3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);
        w3 = (WebView)findViewById(R.id.web2);
        url3 = "main1.php";
        w3 = (WebView)findViewById(R.id.web2);
        url3 = "main1.php";

        WebSettings v = w3.getSettings();
        v.setJavaScriptEnabled(true);
        w3.setWebViewClient(new WebViewClient());
        w3.loadUrl("http://studyforfun.000webhostapp.com/"+url3);


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
