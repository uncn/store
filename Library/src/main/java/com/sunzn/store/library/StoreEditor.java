package com.sunzn.store.library;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public class StoreEditor {

    private SharedPreferences.Editor editor;

    private Context context;

    private String group;

    public StoreEditor(Context context, String group, SharedPreferences.Editor editor) {
        this.context = context;
        this.editor = editor;
        this.group = group;
    }

    public void setString(String key, String value) {
        if (context != null && editor != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String groupKey = context.getPackageName() + "." + group + "." + key;
            editor.putString(groupKey, value);
        }
    }

    public void setLong(String key, long value) {
        if (context != null && editor != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String groupKey = context.getPackageName() + "." + group + "." + key;
            editor.putLong(groupKey, value);
        }
    }

    public void setFloat(String key, float value) {
        if (context != null && editor != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String groupKey = context.getPackageName() + "." + group + "." + key;
            editor.putFloat(groupKey, value);
        }
    }

    public void setBoolean(String key, boolean value) {
        if (context != null && editor != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String groupKey = context.getPackageName() + "." + group + "." + key;
            editor.putBoolean(groupKey, value);
        }
    }

    public void setInt(String key, int value) {
        if (context != null && editor != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String groupKey = context.getPackageName() + "." + group + "." + key;
            editor.putInt(groupKey, value);
        }
    }

}
