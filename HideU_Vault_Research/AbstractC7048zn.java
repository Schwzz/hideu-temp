package ambercore;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.anddoes.launcher.R$mipmap;
import com.anddoes.launcher.R$string;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherApplication;
import com.android.launcher3.LauncherSettings$Favorites;
import com.android.launcher3.WorkspaceType;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ambercore.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7048zn {
    protected abstract C5172oo0O00o0 OooO0O0(C5172oo0O00o0 c5172oo0O00o0);

    public abstract Uri OooO0OO();

    public abstract String OooO0oo();

    protected abstract void OooOO0O(ArrayList arrayList);

    private void OooO00o(ContentResolver contentResolver, C5172oo0O00o0 c5172oo0O00o0) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Long.valueOf(c5172oo0O00o0.OooO00o));
        contentValues.put("itemType", Integer.valueOf(c5172oo0O00o0.OooO0O0));
        contentValues.put(TtmlNode.RUBY_CONTAINER, Integer.valueOf(c5172oo0O00o0.OooO0OO));
        contentValues.put("screen", Integer.valueOf(c5172oo0O00o0.OooO0Oo));
        contentValues.put("cellX", Integer.valueOf(c5172oo0O00o0.OooO0o0));
        contentValues.put("cellY", Integer.valueOf(c5172oo0O00o0.OooO0o));
        contentValues.put("spanX", Integer.valueOf(c5172oo0O00o0.OooO0oO));
        contentValues.put("spanY", Integer.valueOf(c5172oo0O00o0.OooO0oo));
        contentValues.put("title", c5172oo0O00o0.OooO);
        contentValues.put(SDKConstants.PARAM_INTENT, c5172oo0O00o0.OooOO0);
        contentValues.put("iconPackage", c5172oo0O00o0.OooOO0O);
        contentValues.put("iconResource", c5172oo0O00o0.OooOO0o);
        contentValues.put("icon", c5172oo0O00o0.OooOOO0);
        contentResolver.insert(LauncherSettings$Favorites.getContentUri(WorkspaceType.Default), contentValues);
    }

    private void OooOO0o(ArrayList arrayList) {
        ArrayList<C5172oo0O00o0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5172oo0O00o0 c5172oo0O00o0 = (C5172oo0O00o0) it.next();
            if (c5172oo0O00o0.OooO0O0 == 2) {
                arrayList2.add(c5172oo0O00o0);
            }
        }
        for (C5172oo0O00o0 c5172oo0O00o02 : arrayList2) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C5172oo0O00o0) it2.next()).OooO0OO == c5172oo0O00o02.OooO00o) {
                        break;
                    }
                } else {
                    arrayList.remove(c5172oo0O00o02);
                    break;
                }
            }
        }
    }

    String OooO0Oo() {
        return "#Intent;action=com.anddoes.launcher.ACTION;component=com.anddoes.launcher/.Launcher;S.LAUNCHER_ACTION=APP_DRAWER;end";
    }

    C5172oo0O00o0 OooO0o0(int i) {
        C5172oo0O00o0 c5172oo0O00o0 = new C5172oo0O00o0();
        c5172oo0O00o0.OooO0OO = -101;
        c5172oo0O00o0.OooO0Oo = i;
        c5172oo0O00o0.OooO0o0 = i;
        c5172oo0O00o0.OooO0o = 0;
        c5172oo0O00o0.OooO0oo = 1;
        c5172oo0O00o0.OooO0oO = 1;
        c5172oo0O00o0.OooOO0 = OooO0Oo();
        c5172oo0O00o0.OooO = "App Drawer";
        c5172oo0O00o0.OooO0O0 = 1;
        c5172oo0O00o0.OooOO0O = "com.anddoes.launcher";
        c5172oo0O00o0.OooOO0o = "com.anddoes.launcher:drawable/ic_allapps";
        return c5172oo0O00o0;
    }

    public boolean OooO(Context context) throws Throwable {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            ArrayList<C5172oo0O00o0> arrayListOooO00o = C5172oo0O00o0.OooO00o(contentResolver, OooO0OO());
            if (arrayListOooO00o == null) {
                return false;
            }
            OooOO0O(arrayListOooO00o);
            OooOO0o(arrayListOooO00o);
            if (arrayListOooO00o.size() == 0) {
                return false;
            }
            contentResolver.delete(LauncherSettings$Favorites.getContentUri(WorkspaceType.Default), null, null);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (C5172oo0O00o0 c5172oo0O00o0 : arrayListOooO00o) {
                C5172oo0O00o0 c5172oo0O00o0OooO0O0 = OooO0O0(c5172oo0O00o0);
                if (c5172oo0O00o0OooO0O0 != null) {
                    OooO00o(contentResolver, c5172oo0O00o0OooO0O0);
                    if (c5172oo0O00o0.OooO0OO == -101) {
                        z = true;
                    } else {
                        int i4 = c5172oo0O00o0.OooO0Oo;
                        if (i4 > i3) {
                            i3 = i4;
                        }
                        int i5 = c5172oo0O00o0.OooO0o0;
                        if (i5 > i) {
                            i = i5;
                        }
                        int i6 = c5172oo0O00o0.OooO0o;
                        if (i6 > i2) {
                            i2 = i6;
                        }
                    }
                }
            }
            C3341nK c3341nKOooO0o = C3279mo.OooO0Oo(LauncherApplication.getAppContext()).OooO0o();
            int i7 = i + 1;
            if (i7 > c3341nKOooO0o.o0000O0O() || i2 + 1 > c3341nKOooO0o.o000OO()) {
                c3341nKOooO0o.OooOOO(context.getString(R$string.pref_homescreen_portrait_grid_columns_key), i7);
                int i8 = i2 + 1;
                c3341nKOooO0o.OooOOO(context.getString(R$string.pref_homescreen_portrait_grid_rows_key), i8);
                c3341nKOooO0o.OooOOO(context.getString(R$string.pref_home_screen_grid_rows_key), i7);
                c3341nKOooO0o.OooOOO(context.getString(R$string.pref_home_screen_grid_columns_key), i8);
            }
            if (!z) {
                LauncherAppState.getLocalProvider(context.getApplicationContext()).getOpenHelper().initIds();
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public Drawable OooO0o(Context context) {
        try {
            return context.getPackageManager().getApplicationIcon(OooO0oo());
        } catch (PackageManager.NameNotFoundException unused) {
            return context.getResources().getDrawable(R$mipmap.ic_launcher_app);
        }
    }

    public String OooO0oO(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationInfo(OooO0oo(), 0).loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "Launcher";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r9 = r9.query(OooO0OO(), null, null, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r9 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean OooOO0(android.content.ContentResolver r9, java.util.List r10) {
        /*
            r8 = this;
            java.util.Iterator r10 = r10.iterator()
        L4:
            boolean r0 = r10.hasNext()
            r1 = 0
            if (r0 == 0) goto L55
            java.lang.Object r0 = r10.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r2 = r0.activityInfo
            android.os.Bundle r2 = r2.metaData
            if (r2 == 0) goto L1e
            java.lang.String r3 = "android.app.home.alternate"
            java.lang.String r2 = r2.getString(r3)
            goto L1f
        L1e:
            r2 = 0
        L1f:
            java.lang.String r3 = r8.OooO0oo()
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r0 = r0.packageName
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L37
            java.lang.String r0 = r8.OooO0oo()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4
        L37:
            android.net.Uri r3 = r8.OooO0OO()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            if (r9 == 0) goto L49
            r9.close()
        L49:
            r9 = 1
            return r9
        L4b:
            r0 = move-exception
            r9 = r0
            goto L51
        L4e:
            r0 = move-exception
            r9 = r0
            goto L52
        L51:
            throw r9
        L52:
            r9.printStackTrace()
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ambercore.AbstractC7048zn.OooOO0(android.content.ContentResolver, java.util.List):boolean");
    }
}
