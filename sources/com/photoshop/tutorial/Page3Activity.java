package com.photoshop.tutorial;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.PorterDuff;
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

public class Page3Activity extends AppCompatActivity {
    private Toolbar _toolbar;
    /* access modifiers changed from: private */
    public ArrayList<Integer> image_list = new ArrayList<>();
    private ListView listview5;
    /* access modifiers changed from: private */
    public Intent retouchint = new Intent();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> retouchlist = new ArrayList<>();
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
        setContentView(R.layout.page3);
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
                Page3Activity.this.onBackPressed();
            }
        });
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.listview5 = (ListView) findViewById(R.id.listview5);
        this.listview5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    Page3Activity.this.retouchint.setAction("android.intent.action.VIEW");
                    Page3Activity.this.retouchint.setClass(Page3Activity.this.getApplicationContext(), SpothealingmainActivity.class);
                    Page3Activity.this.startActivity(Page3Activity.this.retouchint);
                }
                if (i == 1) {
                    Page3Activity.this.retouchint.setAction("android.intent.action.VIEW");
                    Page3Activity.this.retouchint.setClass(Page3Activity.this.getApplicationContext(), ErasermainActivity.class);
                    Page3Activity.this.startActivity(Page3Activity.this.retouchint);
                }
                if (i == 2) {
                    Page3Activity.this.retouchint.setAction("android.intent.action.VIEW");
                    Page3Activity.this.retouchint.setClass(Page3Activity.this.getApplicationContext(), BlurmainActivity.class);
                    Page3Activity.this.startActivity(Page3Activity.this.retouchint);
                }
                if (i == 3) {
                    Page3Activity.this.retouchint.setAction("android.intent.action.VIEW");
                    Page3Activity.this.retouchint.setClass(Page3Activity.this.getApplicationContext(), DodgemainActivity.class);
                    Page3Activity.this.startActivity(Page3Activity.this.retouchint);
                }
            }
        });
    }

    private void initializeLogic() {
        getSupportActionBar().setTitle((CharSequence) "Retouching Tools");
        HashMap hashMap = new HashMap();
        hashMap.put("subcat3", "Spot Healing Brush (J)");
        this.retouchlist.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("subcat3", "Eraser (E)");
        this.retouchlist.add(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("subcat3", "Blur");
        this.retouchlist.add(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("subcat3", "Dodge (O)");
        this.retouchlist.add(hashMap4);
        this.image_list.add(Integer.valueOf(R.drawable.ic_shealingtool));
        this.image_list.add(Integer.valueOf(R.drawable.ic_eraser));
        this.image_list.add(Integer.valueOf(R.drawable.ic_blur));
        this.image_list.add(Integer.valueOf(R.drawable.ic_dodge));
        this.listview5.setAdapter(new Listview5Adapter(this.retouchlist));
        ((BaseAdapter) this.listview5.getAdapter()).notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public class Listview5Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public Listview5Adapter(ArrayList<HashMap<String, Object>> arrayList) {
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
            LayoutInflater layoutInflater = (LayoutInflater) Page3Activity.this.getBaseContext().getSystemService("layout_inflater");
            if (view == null) {
                view = layoutInflater.inflate(R.layout.row, (ViewGroup) null);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linear1);
            ImageView imageView = (ImageView) view.findViewById(R.id.caticon);
            ((TextView) view.findViewById(R.id.textview1)).setText(((HashMap) Page3Activity.this.retouchlist.get(i)).get("subcat3").toString());
            imageView.setImageResource(((Integer) Page3Activity.this.image_list.get(i)).intValue());
            imageView.setColorFilter(-6543440, PorterDuff.Mode.MULTIPLY);
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
