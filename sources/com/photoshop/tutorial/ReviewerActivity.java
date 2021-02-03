package com.photoshop.tutorial;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class ReviewerActivity extends AppCompatActivity {
    private Toolbar _toolbar;
    private double back = 0.0d;
    private AlertDialog.Builder exitreview;
    private Intent exitreviewint = new Intent();
    private LinearLayout linear1;
    private LinearLayout linear10;
    private LinearLayout linear11;
    private LinearLayout linear15;
    private LinearLayout linear17;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private TextView textview10;
    private TextView textview11;
    private TextView textview12;
    private TextView textview13;
    private TextView textview14;
    private TextView textview15;
    private TextView textview16;
    private TextView textview17;
    private TextView textview18;
    private TextView textview19;
    private TextView textview2;
    private TextView textview20;
    private TextView textview21;
    private TextView textview24;
    private TextView textview3;
    private TextView textview4;
    private TextView textview5;
    private TextView textview6;
    private TextView textview7;
    private TextView textview8;
    private TextView textview9;
    private ScrollView vscroll1;

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
        setContentView(R.layout.reviewer);
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
                ReviewerActivity.this.onBackPressed();
            }
        });
        this.linear15 = (LinearLayout) findViewById(R.id.linear15);
        this.vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        this.linear17 = (LinearLayout) findViewById(R.id.linear17);
        this.textview24 = (TextView) findViewById(R.id.textview24);
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(R.id.linear4);
        this.linear5 = (LinearLayout) findViewById(R.id.linear5);
        this.linear6 = (LinearLayout) findViewById(R.id.linear6);
        this.linear7 = (LinearLayout) findViewById(R.id.linear7);
        this.linear8 = (LinearLayout) findViewById(R.id.linear8);
        this.linear9 = (LinearLayout) findViewById(R.id.linear9);
        this.linear10 = (LinearLayout) findViewById(R.id.linear10);
        this.linear11 = (LinearLayout) findViewById(R.id.linear11);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.textview3 = (TextView) findViewById(R.id.textview3);
        this.textview4 = (TextView) findViewById(R.id.textview4);
        this.textview5 = (TextView) findViewById(R.id.textview5);
        this.textview6 = (TextView) findViewById(R.id.textview6);
        this.textview7 = (TextView) findViewById(R.id.textview7);
        this.textview8 = (TextView) findViewById(R.id.textview8);
        this.textview9 = (TextView) findViewById(R.id.textview9);
        this.textview10 = (TextView) findViewById(R.id.textview10);
        this.textview11 = (TextView) findViewById(R.id.textview11);
        this.textview12 = (TextView) findViewById(R.id.textview12);
        this.textview13 = (TextView) findViewById(R.id.textview13);
        this.textview14 = (TextView) findViewById(R.id.textview14);
        this.textview15 = (TextView) findViewById(R.id.textview15);
        this.textview16 = (TextView) findViewById(R.id.textview16);
        this.textview17 = (TextView) findViewById(R.id.textview17);
        this.textview18 = (TextView) findViewById(R.id.textview18);
        this.textview19 = (TextView) findViewById(R.id.textview19);
        this.textview20 = (TextView) findViewById(R.id.textview20);
        this.textview21 = (TextView) findViewById(R.id.textview21);
        this.exitreview = new AlertDialog.Builder(this);
    }

    private void initializeLogic() {
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setTitle((CharSequence) "Review your wrong answers");
        supportActionBar.setDisplayHomeAsUpEnabled(false);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        this.exitreviewint.setClass(getApplicationContext(), EvaluateActivity.class);
        startActivity(this.exitreviewint);
    }

    private void _Block_ScreenShot() {
        getWindow().setFlags(8192, 8192);
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
