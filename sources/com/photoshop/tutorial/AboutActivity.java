package com.photoshop.tutorial;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class AboutActivity extends AppCompatActivity {
    private Toolbar _toolbar;
    private ImageView imageview1;
    private ImageView imageview2;
    private ImageView imageview3;
    private ImageView imageview4;
    private ImageView imageview5;
    private ImageView imageview6;
    private LinearLayout linear10;
    private LinearLayout linear11;
    private LinearLayout linear12;
    private LinearLayout linear14;
    private LinearLayout linear2;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private TextView textview10;
    private TextView textview4;
    private TextView textview5;
    private TextView textview6;
    private TextView textview7;
    private TextView textview8;
    private TextView textview9;
    private ScrollView vscroll1;
    /* access modifiers changed from: private */
    public Intent webcarl = new Intent();

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.about);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this._toolbar = (Toolbar) findViewById(R.id._toolbar);
        setSupportActionBar(this._toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        this._toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AboutActivity.this.onBackPressed();
            }
        });
        this.vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.linear14 = (LinearLayout) findViewById(R.id.linear14);
        this.linear7 = (LinearLayout) findViewById(R.id.linear7);
        this.linear8 = (LinearLayout) findViewById(R.id.linear8);
        this.linear9 = (LinearLayout) findViewById(R.id.linear9);
        this.linear10 = (LinearLayout) findViewById(R.id.linear10);
        this.linear11 = (LinearLayout) findViewById(R.id.linear11);
        this.linear12 = (LinearLayout) findViewById(R.id.linear12);
        this.textview10 = (TextView) findViewById(R.id.textview10);
        this.imageview1 = (ImageView) findViewById(R.id.imageview1);
        this.textview4 = (TextView) findViewById(R.id.textview4);
        this.imageview2 = (ImageView) findViewById(R.id.imageview2);
        this.textview5 = (TextView) findViewById(R.id.textview5);
        this.imageview3 = (ImageView) findViewById(R.id.imageview3);
        this.textview6 = (TextView) findViewById(R.id.textview6);
        this.imageview4 = (ImageView) findViewById(R.id.imageview4);
        this.textview7 = (TextView) findViewById(R.id.textview7);
        this.imageview5 = (ImageView) findViewById(R.id.imageview5);
        this.textview8 = (TextView) findViewById(R.id.textview8);
        this.imageview6 = (ImageView) findViewById(R.id.imageview6);
        this.textview9 = (TextView) findViewById(R.id.textview9);
        this.linear7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AboutActivity.this.webcarl.setAction("android.intent.action.VIEW");
                AboutActivity.this.webcarl.setData(Uri.parse("https://www.facebook.com/Tantiado.Carl"));
                AboutActivity.this.startActivity(AboutActivity.this.webcarl);
            }
        });
    }

    private void initializeLogic() {
        getSupportActionBar().setTitle((CharSequence) "Titans");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1];
    }

    @Deprecated
    public int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i) {
        return TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}
