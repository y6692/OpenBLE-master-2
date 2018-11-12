package com.nokelock.utils;

import android.bluetooth.BluetoothAdapter;
import android.content.IntentFilter;

import java.util.UUID;

/**
 * 配置
 * Created by sunshine on 2017/3/2.
 */

public class SampleGattAttributes {


    public static final UUID bltServerUUID = UUID.fromString("0000fee7-0000-1000-8000-00805f9b34fb");
    public static final UUID readDataUUID = UUID.fromString("000036f6-0000-1000-8000-00805f9b34fb");
    public static final UUID CLIENT_CHARACTERISTIC_CONFIG = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final UUID writeDataUUID = UUID.fromString("000036f5-0000-1000-8000-00805f9b34fb");

    public final static String ACTION_GATT_CONNECTED = "com.nokelock..ACTION_GATT_CONNECTED";// 连接
    public final static String ACTION_GATT_DISCONNECTED = "com.nokelock..ACTION_GATT_DISCONNECTED";// 断开
    public final static String ACTION_GATT_SERVICES_DISCOVERED = "com.nokelock..ACTION_GATT_SERVICES_DISCOVERED";// 发现服务
    public static final String ACTION_SCAN_DEVICE = "com.nokelock..ACTION_SCAN_DEVICE";//扫描设备
    public static final String ACTION_BLE_REAL_DATA = "com.nokelock..ACTION_BLE_REAL_DATA";//通知数据

    /**
     * 马蹄锁
     */


    public static byte[] key = {32,87,47,82,54,75,63,71,48,80,65,88,17,99,45,43};
    public static byte[] password = {0x30, 0x30, 0x30, 0x30, 0x30, 0x30};

//    public static byte[] key = {30,85,45,80,52,73,60,70,45,75,60,86,10,90,40,42};
//    public static byte[] password = {0x32, 0x30, 0x31, 0x37, 0x31, 0x35};

//    public static byte[] newkey = {30,85,45,80,52,73,60,70,45,75,60,86,10,90,40,42};
//    public static byte[] passwordnew = {0x32, 0x30, 0x31, 0x37, 0x31, 0x35};

    public static byte[] newkey = {32,87,47,82,54,75,63,71,48,80,65,88,17,99,45,43};
    public static byte[] passwordnew = {0x30, 0x30, 0x30, 0x30, 0x30, 0x30};

//    public static byte[] key = {74,50,90,95,30,21,61,17,80,46,99,94,4,73,1,15};
//    public static byte[] password = {0x4D, 0x47, 0x22, 0x3F, 0x38, 0x3B};

    /**
     * 意图过滤器
     * @return 意图过滤对象
     */
    public static IntentFilter makeGattUpdateIntentFilter() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_GATT_CONNECTED);
        intentFilter.addAction(ACTION_GATT_DISCONNECTED);
        intentFilter.addAction(ACTION_GATT_SERVICES_DISCOVERED);
        intentFilter.addAction(ACTION_SCAN_DEVICE);
        intentFilter.addAction(ACTION_BLE_REAL_DATA);
        intentFilter.addAction(BluetoothAdapter.ACTION_STATE_CHANGED);
        return intentFilter;
    }
}
