package com.photoshop.tutorial;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private boolean DarkMode_IsDark = false;
    private String DarkMode_SetString = "";
    private DrawerLayout _drawer;
    private LinearLayout _drawer_aboutid;
    private LinearLayout _drawer_cropid;
    private LinearLayout _drawer_drawingid;
    private LinearLayout _drawer_evaluateid;
    private LinearLayout _drawer_exitid;
    private ImageView _drawer_imageview1;
    private ImageView _drawer_imageview10;
    private ImageView _drawer_imageview11;
    private ImageView _drawer_imageview12;
    private ImageView _drawer_imageview13;
    private ImageView _drawer_imageview2;
    private ImageView _drawer_imageview3;
    private ImageView _drawer_imageview4;
    private ImageView _drawer_imageview5;
    private ImageView _drawer_imageview7;
    private ImageView _drawer_imageview8;
    private ImageView _drawer_imageview9;
    private LinearLayout _drawer_linear1;
    private LinearLayout _drawer_linear13;
    private LinearLayout _drawer_linear14;
    private LinearLayout _drawer_linear15;
    private LinearLayout _drawer_mainid;
    private LinearLayout _drawer_paintingid;
    private LinearLayout _drawer_retouchid;
    private LinearLayout _drawer_selectionid;
    private LinearLayout _drawer_shareid;
    private TextView _drawer_textview1;
    private TextView _drawer_textview10;
    private TextView _drawer_textview11;
    private TextView _drawer_textview12;
    private TextView _drawer_textview13;
    private TextView _drawer_textview2;
    private TextView _drawer_textview3;
    private TextView _drawer_textview4;
    private TextView _drawer_textview5;
    private TextView _drawer_textview7;
    private TextView _drawer_textview8;
    private TextView _drawer_textview9;
    private ScrollView _drawer_vscroll2;
    private Timer _timer = new Timer();
    private Toolbar _toolbar;
    /* access modifiers changed from: private */
    public Intent drawer = new Intent();
    private double exit = 0.0d;
    /* access modifiers changed from: private */
    public AlertDialog.Builder exitdialog;
    private Intent exitmain = new Intent();
    private Intent homeint = new Intent();
    private ArrayList<HashMap<String, Object>> homelist = new ArrayList<>();
    private Intent i = new Intent();
    private LinearLayout linear1;
    private ArrayList<String> mylist = new ArrayList<>();
    private Intent splash = new Intent();
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;
    private TimerTask timer;
    private ScrollView vscroll2;

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
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
                MainActivity.this.onBackPressed();
            }
        });
        this._drawer = (DrawerLayout) findViewById(R.id._drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, this._drawer, this._toolbar, R.string.app_name, R.string.app_name);
        this._drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id._nav_view);
        this.vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.textview3 = (TextView) findViewById(R.id.textview3);
        this.textview4 = (TextView) findViewById(R.id.textview4);
        this._drawer_linear13 = (LinearLayout) linearLayout.findViewById(R.id.linear13);
        this._drawer_vscroll2 = (ScrollView) linearLayout.findViewById(R.id.vscroll2);
        this._drawer_imageview10 = (ImageView) linearLayout.findViewById(R.id.imageview10);
        this._drawer_linear1 = (LinearLayout) linearLayout.findViewById(R.id.linear1);
        this._drawer_mainid = (LinearLayout) linearLayout.findViewById(R.id.mainid);
        this._drawer_evaluateid = (LinearLayout) linearLayout.findViewById(R.id.evaluateid);
        this._drawer_linear14 = (LinearLayout) linearLayout.findViewById(R.id.linear14);
        this._drawer_paintingid = (LinearLayout) linearLayout.findViewById(R.id.paintingid);
        this._drawer_retouchid = (LinearLayout) linearLayout.findViewById(R.id.retouchid);
        this._drawer_selectionid = (LinearLayout) linearLayout.findViewById(R.id.selectionid);
        this._drawer_drawingid = (LinearLayout) linearLayout.findViewById(R.id.drawingid);
        this._drawer_cropid = (LinearLayout) linearLayout.findViewById(R.id.cropid);
        this._drawer_linear15 = (LinearLayout) linearLayout.findViewById(R.id.linear15);
        this._drawer_aboutid = (LinearLayout) linearLayout.findViewById(R.id.aboutid);
        this._drawer_shareid = (LinearLayout) linearLayout.findViewById(R.id.shareid);
        this._drawer_exitid = (LinearLayout) linearLayout.findViewById(R.id.exitid);
        this._drawer_imageview1 = (ImageView) linearLayout.findViewById(R.id.imageview1);
        this._drawer_textview1 = (TextView) linearLayout.findViewById(R.id.textview1);
        this._drawer_imageview8 = (ImageView) linearLayout.findViewById(R.id.imageview8);
        this._drawer_textview8 = (TextView) linearLayout.findViewById(R.id.textview8);
        this._drawer_imageview11 = (ImageView) linearLayout.findViewById(R.id.imageview11);
        this._drawer_textview11 = (TextView) linearLayout.findViewById(R.id.textview11);
        this._drawer_imageview2 = (ImageView) linearLayout.findViewById(R.id.imageview2);
        this._drawer_textview2 = (TextView) linearLayout.findViewById(R.id.textview2);
        this._drawer_imageview3 = (ImageView) linearLayout.findViewById(R.id.imageview3);
        this._drawer_textview3 = (TextView) linearLayout.findViewById(R.id.textview3);
        this._drawer_imageview4 = (ImageView) linearLayout.findViewById(R.id.imageview4);
        this._drawer_textview4 = (TextView) linearLayout.findViewById(R.id.textview4);
        this._drawer_imageview5 = (ImageView) linearLayout.findViewById(R.id.imageview5);
        this._drawer_textview5 = (TextView) linearLayout.findViewById(R.id.textview5);
        this._drawer_imageview7 = (ImageView) linearLayout.findViewById(R.id.imageview7);
        this._drawer_textview7 = (TextView) linearLayout.findViewById(R.id.textview7);
        this._drawer_textview12 = (TextView) linearLayout.findViewById(R.id.textview12);
        this._drawer_imageview13 = (ImageView) linearLayout.findViewById(R.id.imageview13);
        this._drawer_textview13 = (TextView) linearLayout.findViewById(R.id.textview13);
        this._drawer_imageview12 = (ImageView) linearLayout.findViewById(R.id.imageview12);
        this._drawer_textview10 = (TextView) linearLayout.findViewById(R.id.textview10);
        this._drawer_imageview9 = (ImageView) linearLayout.findViewById(R.id.imageview9);
        this._drawer_textview9 = (TextView) linearLayout.findViewById(R.id.textview9);
        this.exitdialog = new AlertDialog.Builder(this);
        this._drawer_mainid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.drawer.setClass(MainActivity.this.getApplicationContext(), MainActivity.class);
                MainActivity.this.startActivity(MainActivity.this.drawer);
            }
        });
        this._drawer_evaluateid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.drawer.setClass(MainActivity.this.getApplicationContext(), EvaluateActivity.class);
                MainActivity.this.startActivity(MainActivity.this.drawer);
            }
        });
        this._drawer_paintingid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.drawer.setClass(MainActivity.this.getApplicationContext(), Page2Activity.class);
                MainActivity.this.startActivity(MainActivity.this.drawer);
            }
        });
        this._drawer_retouchid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.drawer.setClass(MainActivity.this.getApplicationContext(), Page3Activity.class);
                MainActivity.this.startActivity(MainActivity.this.drawer);
            }
        });
        this._drawer_selectionid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.drawer.setClass(MainActivity.this.getApplicationContext(), Page4Activity.class);
                MainActivity.this.startActivity(MainActivity.this.drawer);
            }
        });
        this._drawer_drawingid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.drawer.setClass(MainActivity.this.getApplicationContext(), Page5Activity.class);
                MainActivity.this.startActivity(MainActivity.this.drawer);
            }
        });
        this._drawer_cropid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.drawer.setClass(MainActivity.this.getApplicationContext(), Page6Activity.class);
                MainActivity.this.startActivity(MainActivity.this.drawer);
            }
        });
        this._drawer_aboutid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.drawer.setClass(MainActivity.this.getApplicationContext(), AboutActivity.class);
                MainActivity.this.startActivity(MainActivity.this.drawer);
            }
        });
        this._drawer_shareid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String str = "";
                try {
                    str = MainActivity.this.getPackageManager().getPackageInfo("com.photoshop.tutorial", 1).applicationInfo.publicSourceDir;
                } catch (Exception e) {
                    MainActivity.this.showMessage(e.toString());
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("*/*");
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(str)));
                MainActivity.this.startActivity(Intent.createChooser(intent, "Send APK"));
            }
        });
        this._drawer_exitid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.exitdialog.setMessage("Are you sure you want to exit?");
                MainActivity.this.exitdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                });
                MainActivity.this.exitdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                MainActivity.this.exitdialog.create().show();
            }
        });
    }

    private void initializeLogic() {
        getSupportActionBar().setTitle((CharSequence) "Basic Photoshop Tutorial");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
    }

    public void onBackPressed() {
        this.exit += 1.0d;
        if (this.exit == 2.0d) {
            this.exit = 2.0d;
            finish();
            return;
        }
        SketchwareUtil.showMessage(getApplicationContext(), "Double tap to exit app.");
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
    public int getRandom(int i2, int i3) {
        return new Random().nextInt((i3 - i2) + 1) + i2;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i2)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i2) {
        return TypedValue.applyDimension(1, (float) i2, getResources().getDisplayMetrics());
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
