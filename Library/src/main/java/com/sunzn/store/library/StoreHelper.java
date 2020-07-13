package com.sunzn.store.library;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import java.util.HashMap;
import java.util.Map;

public class StoreHelper {

    public static void setValues(Context context, String name, String group, StoreListener listener) {
        if (context != null && !TextUtils.isEmpty(group) && listener != null) {
            String fileName = context.getPackageName() + "." + name;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            StoreEditor storeEditor = new StoreEditor(context, group, editor);
            listener.onEditor(storeEditor);
            editor.apply();
        }
    }

    public static String getString(Context context, String name, String group, String key, String value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            return preferences.getString(groupKey, value);
        } else {
            return value;
        }
    }

    public static void setString(Context context, String name, String group, String key, String value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            preferences.edit().putString(groupKey, value).apply();
        }
    }

    public static int getInt(Context context, String name, String group, String key, int value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            return preferences.getInt(groupKey, value);
        } else {
            return value;
        }
    }

    public static void setInt(Context context, String name, String group, String key, int value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            preferences.edit().putInt(groupKey, value).apply();
        }
    }

    public static long getLong(Context context, String name, String group, String key, long value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            return preferences.getLong(groupKey, value);
        } else {
            return value;
        }
    }

    public static void setLong(Context context, String name, String group, String key, long value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            preferences.edit().putLong(groupKey, value).apply();
        }
    }

    public static float getFloat(Context context, String name, String group, String key, Float value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            return preferences.getFloat(groupKey, value);
        } else {
            return value;
        }
    }

    public static void setFloat(Context context, String name, String group, String key, Float value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            preferences.edit().putFloat(groupKey, value).apply();
        }
    }

    public static boolean getBoolean(Context context, String name, String group, String key, boolean value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            return preferences.getBoolean(groupKey, value);
        } else {
            return value;
        }
    }

    public static void setBoolean(Context context, String name, String group, String key, boolean value) {
        if (context != null && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            preferences.edit().putBoolean(groupKey, value).apply();
        }
    }

    public static Map<String, ?> getAll(Context context, String name) {
        if (context != null && !TextUtils.isEmpty(name)) {
            String fileName = context.getPackageName() + "." + name;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            return preferences.getAll();
        } else {
            return new HashMap<>();
        }
    }

    public static boolean contains(Context context, String name, String group, String key) {
        if (context != null && !TextUtils.isEmpty(name) && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            return preferences.contains(groupKey);
        } else {
            return false;
        }
    }

    public static void remove(Context context, String name, String group, String key) {
        if (context != null && !TextUtils.isEmpty(name) && !TextUtils.isEmpty(group) && !TextUtils.isEmpty(key)) {
            String fileName = context.getPackageName() + "." + name;
            String groupKey = context.getPackageName() + "." + group + "." + key;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            preferences.edit().remove(groupKey).apply();
        }
    }

    public static void clear(Context context, String name) {
        if (context != null && !TextUtils.isEmpty(name)) {
            String fileName = context.getPackageName() + "." + name;
            SharedPreferences preferences = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
            preferences.edit().clear().apply();
        }
    }

}
