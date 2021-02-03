package com.photoshop.tutorial;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class EvaluateActivity extends AppCompatActivity {
    private Toolbar _toolbar;
    private Button button1;
    /* access modifiers changed from: private */
    public Intent eval = new Intent();
    private LinearLayout evalframe;
    private boolean h = false;
    private LinearLayout linear1;
    private Intent return1 = new Intent();
    private LinearLayout scoreframe;
    private TextView scorenumber;
    private TextView scoretext;
    private SharedPreferences sp;
    private LinearLayout wholeeval1;

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
        setContentView(R.layout.evaluate);
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
                EvaluateActivity.this.onBackPressed();
            }
        });
        this.wholeeval1 = (LinearLayout) findViewById(R.id.wholeeval1);
        this.evalframe = (LinearLayout) findViewById(R.id.evalframe);
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.scoreframe = (LinearLayout) findViewById(R.id.scoreframe);
        this.button1 = (Button) findViewById(R.id.button1);
        this.scoretext = (TextView) findViewById(R.id.scoretext);
        this.scorenumber = (TextView) findViewById(R.id.scorenumber);
        this.sp = getSharedPreferences("sp", 0);
        this.button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EvaluateActivity.this.eval.setClass(EvaluateActivity.this.getApplicationContext(), QuizActivity.class);
                EvaluateActivity.this.startActivity(EvaluateActivity.this.eval);
            }
        });
    }

    private void initializeLogic() {
        getSupportActionBar().setTitle((CharSequence) "Evaluation");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onStart() {
        super.onStart();
        if (this.sp.getString("score", "").equals("")) {
            this.scoreframe.setVisibility(8);
            return;
        }
        this.scoreframe.setVisibility(0);
        this.scorenumber.setText(this.sp.getString("score", ""));
        this.sp.edit().putString("score", "").commit();
    }

    public void onBackPressed() {
        this.return1.setClass(getApplicationContext(), MainActivity.class);
        startActivity(this.return1);
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
