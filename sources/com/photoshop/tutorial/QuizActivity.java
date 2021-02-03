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
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {
    private Timer _timer = new Timer();
    private Toolbar _toolbar;
    /* access modifiers changed from: private */
    public String answer = "";
    private Button button1;
    /* access modifiers changed from: private */
    public CheckBox checkbox1;
    /* access modifiers changed from: private */
    public CheckBox checkbox2;
    /* access modifiers changed from: private */
    public CheckBox checkbox3;
    /* access modifiers changed from: private */
    public CheckBox checkbox4;
    private LinearLayout linear1;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private ArrayList<HashMap<String, Object>> lmap = new ArrayList<>();
    /* access modifiers changed from: private */
    public double n = 0.0d;
    private TextView number;
    private double q = 0.0d;
    private TextView questionid;
    /* access modifiers changed from: private */
    public Intent reviewer = new Intent();
    /* access modifiers changed from: private */
    public double score = 0.0d;
    /* access modifiers changed from: private */
    public TextView scorenumber2;
    private TextView scoretext2;
    /* access modifiers changed from: private */
    public SharedPreferences sp;
    private TimerTask timerquiz;
    /* access modifiers changed from: private */
    public HashMap<String, Object> vmap = new HashMap<>();
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
        setContentView(R.layout.quiz);
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
                QuizActivity.this.onBackPressed();
            }
        });
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        this.scoretext2 = (TextView) findViewById(R.id.scoretext2);
        this.scorenumber2 = (TextView) findViewById(R.id.scorenumber2);
        this.linear5 = (LinearLayout) findViewById(R.id.linear5);
        this.linear4 = (LinearLayout) findViewById(R.id.linear4);
        this.checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        this.checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        this.checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
        this.checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
        this.button1 = (Button) findViewById(R.id.button1);
        this.number = (TextView) findViewById(R.id.number);
        this.questionid = (TextView) findViewById(R.id.questionid);
        this.sp = getSharedPreferences("sp", 0);
        this.checkbox1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuizActivity.this._select(QuizActivity.this.checkbox1, "a");
            }
        });
        this.checkbox2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuizActivity.this._select(QuizActivity.this.checkbox2, "b");
            }
        });
        this.checkbox3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuizActivity.this._select(QuizActivity.this.checkbox3, "c");
            }
        });
        this.checkbox4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuizActivity.this._select(QuizActivity.this.checkbox4, "d");
            }
        });
        this.button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (QuizActivity.this.answer.equals("")) {
                    SketchwareUtil.showMessage(QuizActivity.this.getApplicationContext(), "Select an Answer.");
                    return;
                }
                if (QuizActivity.this.vmap.get("ans").toString().equals(QuizActivity.this.answer)) {
                    SketchwareUtil.showMessage(QuizActivity.this.getApplicationContext(), "Correct Answer");
                    QuizActivity quizActivity = QuizActivity.this;
                    quizActivity.score = quizActivity.score + 1.0d;
                } else {
                    SketchwareUtil.showMessage(QuizActivity.this.getApplicationContext(), "Wrong Answer");
                }
                QuizActivity.this.scorenumber2.setText(String.valueOf((long) QuizActivity.this.score).concat("/".concat(String.valueOf((long) QuizActivity.this.n))));
                if (QuizActivity.this.n == 10.0d) {
                    QuizActivity.this.sp.edit().putString("score", QuizActivity.this.scorenumber2.getText().toString()).commit();
                    QuizActivity.this.reviewer.setClass(QuizActivity.this.getApplicationContext(), ReviewerActivity.class);
                    QuizActivity.this.startActivity(QuizActivity.this.reviewer);
                    return;
                }
                QuizActivity.this.answer = "";
                QuizActivity.this._falseCheckBoxes();
                QuizActivity.this._pickquestion();
            }
        });
    }

    private void initializeLogic() {
        getSupportActionBar().setTitle((CharSequence) "Quiz");
        this.n = 0.0d;
        this.score = 0.0d;
        this.lmap = (ArrayList) new Gson().fromJson("[\n{\n\"ques\" : \"This tool fills adjacent pixels that are similar in color value to the pixels you click\",\n\"a\" : \"Brush\",\n\"b\" : \"Dodge\",\n\"c\" : \"Paintbucket tool\",\n\"d\" : \"Quick Selection tool\",\n\"ans\" : \"c\"\n},\n\n{\n\"ques\" : \"The shortcut key to activate the pen tool.\",\n\"a\" : \"M\",\n\"b\" : \"N\",\n\"c\" : \"O\",\n\"d\" : \"P\",\n\"ans\" : \"d\"\n},\n\n{\n\"ques\" : \"B is the keyboard shortcut for:\",\n\"a\" : \"Blur\",\n\"b\" : \"Select Box\",\n\"c\" : \"Paint Brush\",\n\"d\" : \"Bevel\",\n\"ans\" : \"a\"\n},\n\n{\n\"ques\" : \"This tool paints with stylized stroke, using the source data from a specified history state or snapshot \",\n\"a\" : \"History brush\",\n\"b\" : \"Art history brush\",\n\"c\" : \"Lasso Tool\",\n\"d\" : \"Magnetic Lasso tool\",\n\"ans\" : \"b\"\n},\n\n{\n\"ques\" : \"It is a basic painting tool\",\n\"a\" : \"Pen\",\n\"b\" : \"Brush\",\n\"c\" : \"Spot Healing tool\",\n\"d\" : \"Patch tool\",\n\"ans\" : \"b\"\n},\n\n{\n\"ques\" : \"This tool is used to alter an image by creating strokes and adding color, just like in the real world.\",\n\"a\" : \"Retouching Tools\",\n\"b\" : \"Painting Tools\",\n\"c\" : \"Drawing and Type Tools\",\n\"d\" : \"Selection Tools\",\n\"ans\" : \"b\"\n},\n\n{\n\"ques\" : \"This tool is designed to create circular selections.\",\n\"a\" : \"Quick Selection\",\n\"b\" : \"Magic Wand Selection\",\n\"c\" : \"Move\",\n\"d\" : \"Elliptical Marquee Tool\",\n\"ans\" : \"d\"\n},\n\n{\n\"ques\" : \"M is the keyboard shortcut for:\",\n\"a\" : \"Elliptical/Rectangular Marquee Tool\",\n\"b\" : \"Move\",\n\"c\" : \"Dodge\",\n\"d\" : \"Horizontal Type Text\",\n\"ans\" : \"a\"\n},\n\n{\n\"ques\" : \"This tool automatically creates selection clinging to edges of contrast objects\",\n\"a\" : \"Lasso Tool\",\n\"b\" : \"Magnetic Lasso Tool\",\n\"c\" : \"Quick Selection Tool\",\n\"d\" : \"Magic Wand Tool\",\n\"ans\" : \"b\"\n},\n\n{\n\"ques\" : \"This tool has hard edges by default.\",\n\"a\" : \"Brush\",\n\"b\" : \"Paintbucket\",\n\"c\" : \"Pen\",\n\"d\" : \"Lasso Tool\",\n\"ans\" : \"c\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>() {
        }.getType());
        _pickquestion();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: private */
    public void _pickquestion() {
        this.n += 1.0d;
        this.q = (double) SketchwareUtil.getRandom(0, this.lmap.size() - 1);
        this.vmap = this.lmap.get((int) this.q);
        this.lmap.remove((int) this.q);
        this.number.setText(String.valueOf((long) this.n));
        this.questionid.setText(this.vmap.get("ques").toString());
        this.checkbox1.setText(this.vmap.get("a").toString());
        this.checkbox2.setText(this.vmap.get("b").toString());
        this.checkbox3.setText(this.vmap.get("c").toString());
        this.checkbox4.setText(this.vmap.get("d").toString());
    }

    /* access modifiers changed from: private */
    public void _falseCheckBoxes() {
        this.checkbox1.setChecked(false);
        this.checkbox2.setChecked(false);
        this.checkbox3.setChecked(false);
        this.checkbox4.setChecked(false);
    }

    /* access modifiers changed from: private */
    public void _select(CheckBox checkBox, String str) {
        if (checkBox.isChecked()) {
            this.answer = str;
            _falseCheckBoxes();
            checkBox.setChecked(true);
            return;
        }
        this.answer = "";
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
