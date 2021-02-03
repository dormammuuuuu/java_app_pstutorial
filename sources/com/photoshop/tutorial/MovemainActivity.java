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

public class MovemainActivity extends AppCompatActivity {
    private Toolbar _toolbar;
    /* access modifiers changed from: private */
    public ArrayList<Integer> image_list = new ArrayList<>();
    private ListView listview12;
    /* access modifiers changed from: private */
    public Intent moveint = new Intent();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> movemap = new ArrayList<>();

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
        setContentView(R.layout.movemain);
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
                MovemainActivity.this.onBackPressed();
            }
        });
        this.listview12 = (ListView) findViewById(R.id.listview12);
        this.listview12.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    MovemainActivity.this.moveint.setAction("android.intent.action.VIEW");
                    MovemainActivity.this.moveint.setClass(MovemainActivity.this.getApplicationContext(), MovesubActivity.class);
                    MovemainActivity.this.startActivity(MovemainActivity.this.moveint);
                }
                if (i == 1) {
                    MovemainActivity.this.moveint.setAction("android.intent.action.VIEW");
                    MovemainActivity.this.moveint.setClass(MovemainActivity.this.getApplicationContext(), EllipticalsubActivity.class);
                    MovemainActivity.this.startActivity(MovemainActivity.this.moveint);
                }
                if (i == 2) {
                    MovemainActivity.this.moveint.setAction("android.intent.action.VIEW");
                    MovemainActivity.this.moveint.setClass(MovemainActivity.this.getApplicationContext(), RectangularsubActivity.class);
                    MovemainActivity.this.startActivity(MovemainActivity.this.moveint);
                }
                if (i == 3) {
                    MovemainActivity.this.moveint.setAction("android.intent.action.VIEW");
                    MovemainActivity.this.moveint.setClass(MovemainActivity.this.getApplicationContext(), SrowsubActivity.class);
                    MovemainActivity.this.startActivity(MovemainActivity.this.moveint);
                }
                if (i == 4) {
                    MovemainActivity.this.moveint.setAction("android.intent.action.VIEW");
                    MovemainActivity.this.moveint.setClass(MovemainActivity.this.getApplicationContext(), ScolumnsubActivity.class);
                    MovemainActivity.this.startActivity(MovemainActivity.this.moveint);
                }
            }
        });
    }

    private void initializeLogic() {
        getSupportActionBar().setTitle((CharSequence) "Move and Marquee Tools");
        HashMap hashMap = new HashMap();
        hashMap.put("subcat10", "Move");
        this.movemap.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("subcat10", "Elliptical Marquee (M)");
        this.movemap.add(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("subcat10", "Rectangular Marquee (M)");
        this.movemap.add(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("subcat10", "Single Row Marquee");
        this.movemap.add(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("subcat10", "Single Column Marquee");
        this.movemap.add(hashMap5);
        this.image_list.add(Integer.valueOf(R.drawable.ic_move));
        this.image_list.add(Integer.valueOf(R.drawable.ic_emarquee));
        this.image_list.add(Integer.valueOf(R.drawable.ic_rmarquee));
        this.image_list.add(Integer.valueOf(R.drawable.ic_srmarquee));
        this.image_list.add(Integer.valueOf(R.drawable.ic_scmarquee));
        this.listview12.setAdapter(new Listview12Adapter(this.movemap));
        ((BaseAdapter) this.listview12.getAdapter()).notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public class Listview12Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview12Adapter(ArrayList<HashMap<String, Object>> arrayList) {
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
            LayoutInflater layoutInflater = (LayoutInflater) MovemainActivity.this.getBaseContext().getSystemService("layout_inflater");
            if (view == null) {
                view = layoutInflater.inflate(R.layout.row, (ViewGroup) null);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linear1);
            ((TextView) view.findViewById(R.id.textview1)).setText(((HashMap) MovemainActivity.this.movemap.get(i)).get("subcat10").toString());
            ((ImageView) view.findViewById(R.id.caticon)).setImageResource(((Integer) MovemainActivity.this.image_list.get(i)).intValue());
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
