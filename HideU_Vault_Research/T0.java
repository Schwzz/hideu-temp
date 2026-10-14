package ambercore;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.preference.Preference;
import com.anddoes.launcher.R$string;
import com.anddoes.launcher.R$xml;
import com.anddoes.launcher.settings.model.PreferenceViewType;
import com.anddoes.launcher.settings.ui.component.ClickDetectListPreference;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.Utilities;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.Map;
import net.margaritov.preference.colorpicker.ColorPickerPreference;

/* JADX INFO: loaded from: classes8.dex */
public class T0 extends AbstractC3936o0OoOoO implements Preference.OnPreferenceClickListener {
    private static int OooOoo0;
    private ColorPickerPreference OooOo;
    private DeviceProfile OooOoO;
    private ClickDetectListPreference OooOoO0;
    private boolean OooOoOO = false;

    class OooO00o implements ClickDetectListPreference.OooO00o {
        OooO00o() {
        }

        @Override // com.anddoes.launcher.settings.ui.component.ClickDetectListPreference.OooO00o
        public void OooO00o(String str) {
            if (com.ironsource.mediationsdk.l.f.equals(str)) {
                T0.this.OooOOoo();
            }
        }
    }

    private static class OooO0O0 extends AsyncTask {
        private final WeakReference OooO00o;
        private final Intent OooO0O0;
        private final ProgressDialog OooO0OO;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            Context applicationContext = ((T0) this.OooO00o.get()).getActivity().getApplicationContext();
            Bitmap bitmapOooO0oo = com.anddoes.launcher.OooO00o.OooO0oo(applicationContext, this.OooO0O0.getData());
            if (bitmapOooO0oo == null) {
                return Boolean.FALSE;
            }
            File file = new File(applicationContext.getFilesDir(), "images");
            if (file.exists() || file.mkdirs()) {
                try {
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file, "folder_bg.png")));
                        try {
                            Matrix matrix = new Matrix();
                            matrix.setRectToRect(new RectF(0.0f, 0.0f, bitmapOooO0oo.getWidth(), bitmapOooO0oo.getHeight()), new RectF(0.0f, 0.0f, T0.OooOoo0, T0.OooOoo0), Matrix.ScaleToFit.CENTER);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapOooO0oo, 0, 0, bitmapOooO0oo.getWidth(), bitmapOooO0oo.getHeight(), matrix, true);
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
                            bufferedOutputStream.close();
                            bitmapCreateBitmap.recycle();
                        } finally {
                        }
                    } catch (Throwable th) {
                        bitmapOooO0oo.recycle();
                        throw th;
                    }
                } catch (Exception unused) {
                    Boolean bool = Boolean.FALSE;
                    bitmapOooO0oo.recycle();
                    return bool;
                }
            } else {
                bitmapOooO0oo.recycle();
            }
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            this.OooO0OO.dismiss();
            if (!bool.booleanValue() || this.OooO00o.get() == null) {
                return;
            }
            ((T0) this.OooO00o.get()).OooOOo();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            this.OooO0OO.show();
        }

        OooO0O0(T0 t0, Intent intent) {
            this.OooO00o = new WeakReference(t0);
            this.OooO0O0 = intent;
            ProgressDialog progressDialog = new ProgressDialog(t0.getActivity());
            this.OooO0OO = progressDialog;
            progressDialog.setCancelable(false);
            progressDialog.setMessage(t0.getString(R$string.processing));
        }
    }

    private void OooOo0() {
    }

    private void OooOo00() {
    }

    @Override // ambercore.AbstractC3936o0OoOoO
    public int OooO0OO() {
        return 0;
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 || i2 != -1 || intent == null || intent.getData() == null) {
            return;
        }
        new OooO0O0(this, intent).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOOo() {
        if (com.ironsource.mediationsdk.l.f.equals(this.OooOoO0.getValue())) {
            this.OooOOO.o00O0oo0();
        } else {
            this.OooOoO0.setValue(com.ironsource.mediationsdk.l.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooOOoo() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        Utilities.startActivityForResultSafely(this, Intent.createChooser(intent, getString(R$string.select_image)), 1);
    }

    @Override // ambercore.AbstractC3936o0OoOoO
    public void OooO0oO(Map map) {
        addPreferencesFromResource(R$xml.preferences_folder);
        Resources resources = getResources();
        String string = resources.getString(R$string.pref_folder_preview_key);
        PreferenceViewType preferenceViewType = PreferenceViewType.LIST_PREFERENCE;
        map.put(string, preferenceViewType);
        map.put(resources.getString(R$string.pref_folder_icon_background_key), preferenceViewType);
        map.put(resources.getString(R$string.pref_folder_background_style_key), preferenceViewType);
        map.put(resources.getString(R$string.pref_folder_background_alpha_key), PreferenceViewType.SEEKBAR_PREFERENCE);
        String string2 = resources.getString(R$string.pref_hide_folder_name_key);
        PreferenceViewType preferenceViewType2 = PreferenceViewType.SWITCH_PREFERENCE;
        map.put(string2, preferenceViewType2);
        map.put(resources.getString(R$string.pref_folder_show_labels_key), preferenceViewType2);
        map.put(resources.getString(R$string.pref_folder_label_color_key), PreferenceViewType.COLORPICK_PREFERENCE);
        map.put(resources.getString(R$string.pref_folder_label_font_key), preferenceViewType);
        map.put(resources.getString(R$string.pref_folder_label_shadow_key), preferenceViewType2);
        map.put(resources.getString(R$string.pref_auto_merge_folders_key), preferenceViewType2);
        ClickDetectListPreference clickDetectListPreference = (ClickDetectListPreference) findPreference(getString(R$string.pref_folder_icon_background_key));
        this.OooOoO0 = clickDetectListPreference;
        clickDetectListPreference.OooO00o(new OooO00o());
        this.OooOo = (ColorPickerPreference) findPreference(getString(R$string.pref_folder_label_color_key));
        OooOo0();
        OooOo00();
        DeviceProfile deviceProfile = LauncherAppState.getInstance().getDeviceProfile(false);
        this.OooOoO = deviceProfile;
        OooOoo0 = deviceProfile.folderIconSizePx;
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public boolean onPreferenceClick(Preference preference) {
        OooO0o("folder_settings");
        return true;
    }

    @Override // ambercore.AbstractC3936o0OoOoO
    public void OooO0oo(SharedPreferences sharedPreferences, String str) {
        super.OooO0oo(sharedPreferences, str);
        if (str.equals(getString(R$string.pref_folder_label_color_key))) {
            this.OooOo.OooO0oo(this.OooOOO.o00000o0());
        } else if (str.equals(getString(R$string.pref_folder_icon_background_key))) {
            OooOOO(str);
        }
    }
}
