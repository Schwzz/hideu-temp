package ambercore;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.anddoes.launcher.R$string;
import com.anddoes.launcher.R$xml;
import com.anddoes.launcher.settings.model.PreferenceViewType;
import com.anddoes.launcher.settings.ui.component.RecycleViewPreference;
import com.anddoes.launcher.settings.ui.wallpaper.WallpaperEffectActivity;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.messaging.Constants;
import java.util.Map;

/* JADX INFO: renamed from: ambercore.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C2619gb extends AbstractC3936o0OoOoO {
    public RecycleViewPreference OooOo;

    @Override // ambercore.AbstractC3936o0OoOoO
    public int OooO0OO() {
        return 0;
    }

    private static String OooOOOO(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursorQuery;
        String[] strArr2 = {"_data"};
        try {
            cursorQuery = context.getContentResolver().query(uri, strArr2, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        return cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(strArr2[0]));
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        }
        return null;
    }

    private static boolean OooOOo(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean OooOOoo(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    @Override // ambercore.AbstractC3936o0OoOoO
    public void OooO0oO(Map map) {
        addPreferencesFromResource(R$xml.preferences_home_wallpaper);
        Resources resources = getResources();
        String string = resources.getString(R$string.pref_show_wallpaper_key);
        PreferenceViewType preferenceViewType = PreferenceViewType.SWITCH_PREFERENCE;
        map.put(string, preferenceViewType);
        map.put(resources.getString(R$string.pref_wallpaper_scrolling_key), preferenceViewType);
        RecycleViewPreference recycleViewPreference = (RecycleViewPreference) findPreference(resources.getString(R$string.pref_wallpaper_select_key));
        this.OooOo = recycleViewPreference;
        recycleViewPreference.OooO0o0(this);
    }

    public static String OooOOOo(Context context, Uri uri) {
        return OooOOo0(context, uri);
    }

    private static String OooOOo0(Context context, Uri uri) {
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (OooOOoo(uri)) {
                return OooOOOO(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{documentId.split(CertificateUtil.DELIMITER)[1]});
            }
            if (OooOOo(uri)) {
                return OooOOOO(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return OooOOOO(context, uri, null, null);
            }
            if ("file".equals(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 5 && i2 == -1 && intent != null && intent.getData() != null) {
            WallpaperEffectActivity.o00000(getActivity(), OooOOOo(getActivity(), intent.getData()));
            AbstractC3717o0O00O.OooO0o0("wallpaper_edit_pv", Constants.MessagePayloadKeys.FROM, "select_img");
        }
    }
}
