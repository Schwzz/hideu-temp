package ambercore;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.text.lookup.StringLookupFactory;

/* JADX INFO: renamed from: ambercore.ooooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC5831ooooO0o {
    private static boolean OooO00o;

    /* JADX INFO: renamed from: ambercore.ooooO0o$OooO0O0 */
    public static final class OooO0O0 implements LocationListener {
        final /* synthetic */ LocationManager OooO00o;

        OooO0O0(LocationManager locationManager) {
            this.OooO00o = locationManager;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.OooO00o.removeUpdates(this);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.OooO00o.removeUpdates(this);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.OooO00o.removeUpdates(this);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String provider, int i, Bundle extras) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(extras, "extras");
            this.OooO00o.removeUpdates(this);
            AbstractC5831ooooO0o.OooO00o = true;
        }
    }

    private static final boolean OooO0Oo(Context context) {
        OooO00o = false;
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
        }
        LocationManager locationManager = (LocationManager) systemService;
        List<String> providers = locationManager.getProviders(true);
        Intrinsics.checkNotNullExpressionValue(providers, "locationManager.getProviders(true)");
        if (providers.contains("gps") || providers.contains("network")) {
            return true;
        }
        if (!locationManager.isProviderEnabled("gps")) {
            locationManager.requestLocationUpdates("gps", 0L, 0.0f, new OooO0O0(locationManager));
        }
        return OooO00o;
    }

    /* JADX INFO: renamed from: ambercore.ooooO0o$OooO00o */
    public static final class OooO00o implements SensorEventListener {
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
        }

        OooO00o() {
        }
    }

    public static final boolean OooO0O0(Context activity, String permission) {
        String str;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permission, "permission");
        try {
            switch (permission.hashCode()) {
                case -2062386608:
                    if (permission.equals("android.permission.READ_SMS")) {
                        return OooO(activity);
                    }
                    return true;
                case -1928411001:
                    if (permission.equals("android.permission.READ_CALENDAR")) {
                        return OooO0o0(activity);
                    }
                    return true;
                case -1921431796:
                    if (permission.equals("android.permission.READ_CALL_LOG")) {
                        return OooO0o(activity);
                    }
                    return true;
                case -1888586689:
                    if (!permission.equals("android.permission.ACCESS_FINE_LOCATION")) {
                        return true;
                    }
                    return OooO0Oo(activity);
                case -1479758289:
                    str = "android.permission.RECEIVE_WAP_PUSH";
                    permission.equals(str);
                    return true;
                case -1238066820:
                    if (permission.equals("android.permission.BODY_SENSORS")) {
                        return OooO0OO(activity);
                    }
                    return true;
                case -895679497:
                    str = "android.permission.RECEIVE_MMS";
                    permission.equals(str);
                    return true;
                case -895673731:
                    str = "android.permission.RECEIVE_SMS";
                    permission.equals(str);
                    return true;
                case -406040016:
                    if (permission.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                        return OooOO0();
                    }
                    return true;
                case -63024214:
                    if (!permission.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                        return true;
                    }
                    return OooO0Oo(activity);
                case -5573545:
                    if (permission.equals("android.permission.READ_PHONE_STATE")) {
                        return OooO0oo(activity);
                    }
                    return true;
                case 52602690:
                    str = "android.permission.SEND_SMS";
                    permission.equals(str);
                    return true;
                case 112197485:
                    str = "android.permission.CALL_PHONE";
                    permission.equals(str);
                    return true;
                case 214526995:
                    if (permission.equals("android.permission.WRITE_CONTACTS")) {
                        return OooOOO0(activity);
                    }
                    return true;
                case 463403621:
                    str = "android.permission.CAMERA";
                    permission.equals(str);
                    return true;
                case 603653886:
                    str = "android.permission.WRITE_CALENDAR";
                    permission.equals(str);
                    return true;
                case 610633091:
                    if (permission.equals("android.permission.WRITE_CALL_LOG")) {
                        return OooOO0o(activity);
                    }
                    return true;
                case 784519842:
                    str = "android.permission.USE_SIP";
                    permission.equals(str);
                    return true;
                case 952819282:
                    str = "android.permission.PROCESS_OUTGOING_CALLS";
                    permission.equals(str);
                    return true;
                case 1271781903:
                    str = "android.permission.GET_ACCOUNTS";
                    permission.equals(str);
                    return true;
                case 1365911975:
                    if (permission.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                        return OooOOO();
                    }
                    return true;
                case 1831139720:
                    if (permission.equals("android.permission.RECORD_AUDIO")) {
                        return OooOO0O(activity);
                    }
                    return true;
                case 1977429404:
                    if (permission.equals("android.permission.READ_CONTACTS")) {
                        return OooO0oO(activity);
                    }
                    return true;
                case 2133799037:
                    str = "com.android.voicemail.permission.ADD_VOICEMAIL";
                    permission.equals(str);
                    return true;
                default:
                    return true;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    private static final boolean OooO0OO(Context context) {
        Object systemService = context.getSystemService("sensor");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.hardware.SensorManager");
        }
        SensorManager sensorManager = (SensorManager) systemService;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        OooO00o oooO00o = new OooO00o();
        sensorManager.registerListener(oooO00o, defaultSensor, 1);
        sensorManager.unregisterListener(oooO00o, defaultSensor);
        return true;
    }

    private static final boolean OooO0oo(Context context) {
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        return AbstractC5413ooO0Oo.OooOO0() ? !TextUtils.isEmpty(telephonyManager.getSubscriberId()) : (AbstractC5413ooO0Oo.OooOOO0() || AbstractC5413ooO0Oo.OooOO0O()) ? !TextUtils.isEmpty(telephonyManager.getDeviceId()) : (TextUtils.isEmpty(telephonyManager.getDeviceId()) && TextUtils.isEmpty(telephonyManager.getSubscriberId())) ? false : true;
    }

    private static final boolean OooOO0() {
        return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath()).listFiles() != null;
    }

    private static final boolean OooOO0O(Context context) throws InterruptedException, IOException {
        C4111o0oOoooo c4111o0oOoooo = new C4111o0oOoooo();
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_RINGTONES);
        if (externalFilesDir == null) {
            return false;
        }
        c4111o0oOoooo.OooO0oO(externalFilesDir.toString() + "/PermissionsDog.3gp");
        c4111o0oOoooo.OooO();
        return c4111o0oOoooo.OooO0Oo();
    }

    private static final boolean OooOOO() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath(), "PermissionsDog");
        if (file.exists()) {
            return file.delete();
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static final boolean OooO(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://sms/"), null, null, null, null);
        if (cursorQuery == null) {
            return false;
        }
        if (AbstractC5413ooO0Oo.OooOO0o() && OooOOOO(cursorQuery, cursorQuery.getColumnIndex(StringLookupFactory.KEY_DATE))) {
            cursorQuery.close();
            return false;
        }
        cursorQuery.close();
        return true;
    }

    private static final boolean OooO0o(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://call_log/calls"), null, null, null, null);
        if (cursorQuery == null) {
            return false;
        }
        if (AbstractC5413ooO0Oo.OooOO0o() && OooOOOO(cursorQuery, cursorQuery.getColumnIndex("number"))) {
            cursorQuery.close();
            return false;
        }
        cursorQuery.close();
        return true;
    }

    private static final boolean OooO0o0(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), null, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.close();
            return true;
        }
        return false;
    }

    private static final boolean OooO0oO(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        if (cursorQuery == null) {
            return false;
        }
        if (AbstractC5413ooO0Oo.OooOO0o() && OooOOOO(cursorQuery, cursorQuery.getColumnIndex("data1"))) {
            cursorQuery.close();
            return false;
        }
        cursorQuery.close();
        return true;
    }

    private static final boolean OooOO0o(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", (Integer) 1);
        contentValues.put("number", "1");
        contentValues.put(StringLookupFactory.KEY_DATE, (Integer) 20140808);
        contentValues.put("new", "0");
        contentResolver.insert(Uri.parse("content://call_log/calls"), contentValues);
        contentResolver.delete(Uri.parse("content://call_log/calls"), "number = ?", new String[]{"1"});
        return true;
    }

    private static final boolean OooOOO0(Context context) {
        ContentValues contentValues;
        ContentResolver contentResolver;
        Uri uriInsert;
        if (!OooO0oO(context) || (uriInsert = (contentResolver = context.getContentResolver()).insert(ContactsContract.RawContacts.CONTENT_URI, (contentValues = new ContentValues()))) == null) {
            return false;
        }
        long id = ContentUris.parseId(uriInsert);
        contentValues.put("mimetype", "vnd.android.cursor.item/name");
        contentValues.put("raw_contact_id", Long.valueOf(id));
        contentValues.put("data2", "PermissionsDog");
        contentValues.put("data1", "1");
        contentResolver.insert(ContactsContract.Data.CONTENT_URI, contentValues);
        Uri uri = Uri.parse("content://com.android.contacts/raw_contacts");
        ContentResolver contentResolver2 = context.getContentResolver();
        Cursor cursorQuery = contentResolver2.query(uri, new String[]{"_id"}, "display_name=?", new String[]{"PermissionsDog"}, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                int i = cursorQuery.getInt(0);
                contentResolver2.delete(uri, "display_name=?", new String[]{"PermissionsDog"});
                contentResolver2.delete(Uri.parse("content://com.android.contacts/data"), "raw_contact_id=?", new String[]{i + ""});
            }
            cursorQuery.close();
            return true;
        }
        return true;
    }

    private static final boolean OooOOOO(Cursor cursor, int i) {
        if (cursor.getCount() > 0) {
            if (cursor.moveToNext()) {
                return TextUtils.isEmpty(cursor.getString(i));
            }
            return false;
        }
        return true;
    }
}
