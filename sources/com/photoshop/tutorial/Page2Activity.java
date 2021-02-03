package com.photoshop.tutorial;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Page2Activity extends AppCompatActivity {
    private Toolbar _toolbar;
    /* access modifiers changed from: private */
    public Intent brushint = new Intent();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> brushlist = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<Integer> image_list = new ArrayList<>();
    private ListView listview2;
    private TextView textview1;
    private TextView textview2;

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
        setContentView(R.layout.page2);
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
                Page2Activity.this.onBackPressed();
            }
        });
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.listview2 = (ListView) findViewById(R.id.listview2);
        this.listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    Page2Activity.this.brushint.setAction("android.intent.action.VIEW");
                    Page2Activity.this.brushint.setClass(Page2Activity.this.getApplicationContext(), Act1Activity.class);
                    Page2Activity.this.startActivity(Page2Activity.this.brushint);
                }
                if (i == 1) {
                    Page2Activity.this.brushint.setAction("android.intent.action.VIEW");
                    Page2Activity.this.brushint.setClass(Page2Activity.this.getApplicationContext(), Act2Activity.class);
                    Page2Activity.this.startActivity(Page2Activity.this.brushint);
                }
                if (i == 2) {
                    Page2Activity.this.brushint.setAction("android.intent.action.VIEW");
                    Page2Activity.this.brushint.setClass(Page2Activity.this.getApplicationContext(), Act3Activity.class);
                    Page2Activity.this.startActivity(Page2Activity.this.brushint);
                }
            }
        });
    }

    private void initializeLogic() {
        getSupportActionBar().setTitle((CharSequence) "Painting Tools");
        HashMap hashMap = new HashMap();
        hashMap.put("cat", "Brush (B)");
        this.brushlist.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("cat", "History Brush (Y)");
        this.brushlist.add(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("cat", "Paint Bucket(G)");
        this.brushlist.add(hashMap3);
        this.image_list.add(Integer.valueOf(R.drawable.ic_brush));
        this.image_list.add(Integer.valueOf(R.drawable.ic_hbrush));
        this.image_list.add(Integer.valueOf(R.drawable.ic_bucket));
        this.listview2.setAdapter(new Listview2Adapter(this.brushlist));
        ((BaseAdapter) this.listview2.getAdapter()).notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public class Listview2Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview2Adapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = (LayoutInflater) Page2Activity.this.getBaseContext().getSystemService("layout_inflater");
            if (view == null) {
                view = layoutInflater.inflate(R.layout.row, (ViewGroup) null);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linear1);
            ((TextView) view.findViewById(R.id.textview1)).setText(((HashMap) Page2Activity.this.brushlist.get(i)).get("cat").toString());
            ((ImageView) view.findViewById(R.id.caticon)).setImageResource(((Integer) Page2Activity.this.image_list.get(i)).intValue());
            return view;
        }
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
