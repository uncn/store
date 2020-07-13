package com.sunzn.store.sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sunzn.store.library.StoreEditor;
import com.sunzn.store.library.StoreHelper;
import com.sunzn.store.library.StoreListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StoreHelper.setValues(this, "0", "123", new StoreListener() {
            @Override
            public void onEditor(StoreEditor editor) {
                editor.setString("", "");
                editor.setLong("", 0);
            }
        });
    }
}
