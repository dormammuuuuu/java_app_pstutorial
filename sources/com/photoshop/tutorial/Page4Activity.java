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

public class Page4Activity extends AppCompatActivity {
    private Toolbar _toolbar;
    /* access modifiers changed from: private */
    public ArrayList<Integer> image_list = new ArrayList<>();
    private ListView listview10;
    /* access modifiers changed from: private */
    public Intent selectionint = new Intent();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> selectionmap = new ArrayList<>();
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
        setContentView(R.layout.page4);
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
                Page4Activity.this.onBackPressed();
            }
        });
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.listview10 = (ListView) findViewById(R.id.listview10);
        this.listview10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    Page4Activity.this.selectionint.setAction("android.intent.action.VIEW");
                    Page4Activity.this.selectionint.setClass(Page4Activity.this.getApplicationContext(), LassomainActivity.class);
                    Page4Activity.this.startActivity(Page4Activity.this.selectionint);
                }
                if (i == 1) {
                    Page4Activity.this.selectionint.setAction("android.intent.action.VIEW");
                    Page4Activity.this.selectionint.setClass(Page4Activity.this.getApplicationContext(), MovemainActivity.class);
                    Page4Activity.this.startActivity(Page4Activity.this.selectionint);
                }
                if (i == 2) {
                    Page4Activity.this.selectionint.setAction("android.intent.action.VIEW");
                    Page4Activity.this.selectionint.setClass(Page4Activity.this.getApplicationContext(), QuickselectionmainActivity.class);
                    Page4Activity.this.startActivity(Page4Activity.this.selectionint);
                }
            }
        });
    }

    private void initializeLogic() {
        getSupportActionBar().setTitle((CharSequence) "Selection Tools");
        HashMap hashMap = new HashMap();
        hashMap.put("subcat8", "Lasso (L)");
        this.selectionmap.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("subcat8", "Move (V)");
        this.selectionmap.add(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("subcat8", "Quick Selection (W)");
        this.selectionmap.add(hashMap3);
        this.image_list.add(Integer.valueOf(R.drawable.ic_lasso));
        this.image_list.add(Integer.valueOf(R.drawable.ic_move));
        this.image_list.add(Integer.valueOf(R.drawable.ic_quickselection));
        this.listview10.setAdapter(new Listview10Adapter(this.selectionmap));
        ((BaseAdapter) this.listview10.getAdapter()).notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public class Listview10Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview10Adapter(ArrayList<HashMap<String, Object>> arrayList) {
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
            LayoutInflater layoutInflater = (LayoutInflater) Page4Activity.this.getBaseContext().getSystemService("layout_inflater");
            if (view == null) {
                view = layoutInflater.inflate(R.layout.row, (ViewGroup) null);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linear1);
            ((TextView) view.findViewById(R.id.textview1)).setText(((HashMap) Page4Activity.this.selectionmap.get(i)).get("subcat8").toString());
            ((ImageView) view.findViewById(R.id.caticon)).setImageResource(((Integer) Page4Activity.this.image_list.get(i)).intValue());
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
