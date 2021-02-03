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

public class LassomainActivity extends AppCompatActivity {
    private Toolbar _toolbar;
    /* access modifiers changed from: private */
    public ArrayList<Integer> image_list = new ArrayList<>();
    /* access modifiers changed from: private */
    public Intent lassoint = new Intent();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> lassomap = new ArrayList<>();
    private ListView listview11;

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
        setContentView(R.layout.lassomain);
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
                LassomainActivity.this.onBackPressed();
            }
        });
        this.listview11 = (ListView) findViewById(R.id.listview11);
        this.listview11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    LassomainActivity.this.lassoint.setAction("android.intent.action.VIEW");
                    LassomainActivity.this.lassoint.setClass(LassomainActivity.this.getApplicationContext(), LassosubActivity.class);
                    LassomainActivity.this.startActivity(LassomainActivity.this.lassoint);
                }
                if (i == 1) {
                    LassomainActivity.this.lassoint.setAction("android.intent.action.VIEW");
                    LassomainActivity.this.lassoint.setClass(LassomainActivity.this.getApplicationContext(), MlassosubActivity.class);
                    LassomainActivity.this.startActivity(LassomainActivity.this.lassoint);
                }
                if (i == 2) {
                    LassomainActivity.this.lassoint.setAction("android.intent.action.VIEW");
                    LassomainActivity.this.lassoint.setClass(LassomainActivity.this.getApplicationContext(), PlassosubActivity.class);
                    LassomainActivity.this.startActivity(LassomainActivity.this.lassoint);
                }
            }
        });
    }

    private void initializeLogic() {
        getSupportActionBar().setTitle((CharSequence) "Lasso Tools");
        HashMap hashMap = new HashMap();
        hashMap.put("subcat9", "Lasso");
        this.lassomap.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("subcat9", "Magnetic Lasso");
        this.lassomap.add(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("subcat9", "Polygonal Lasso");
        this.lassomap.add(hashMap3);
        this.image_list.add(Integer.valueOf(R.drawable.ic_lasso));
        this.image_list.add(Integer.valueOf(R.drawable.ic_mlasso));
        this.image_list.add(Integer.valueOf(R.drawable.ic_plasso));
        this.listview11.setAdapter(new Listview11Adapter(this.lassomap));
        ((BaseAdapter) this.listview11.getAdapter()).notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public class Listview11Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview11Adapter(ArrayList<HashMap<String, Object>> arrayList) {
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
            LayoutInflater layoutInflater = (LayoutInflater) LassomainActivity.this.getBaseContext().getSystemService("layout_inflater");
            if (view == null) {
                view = layoutInflater.inflate(R.layout.row, (ViewGroup) null);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linear1);
            ((TextView) view.findViewById(R.id.textview1)).setText(((HashMap) LassomainActivity.this.lassomap.get(i)).get("subcat9").toString());
            ((ImageView) view.findViewById(R.id.caticon)).setImageResource(((Integer) LassomainActivity.this.image_list.get(i)).intValue());
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
