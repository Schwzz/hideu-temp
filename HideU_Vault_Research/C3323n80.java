package ambercore;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: ambercore.n80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3323n80 {
    private static final oO000OO OooO0o = new oO000OO();
    private final oO000OO OooO00o;
    private final InterfaceC3217m80 OooO0O0;
    private final InterfaceC4030o0o0OOOo OooO0OO;
    private final ContentResolver OooO0Oo;
    private final List OooO0o0;

    C3323n80(List list, InterfaceC3217m80 interfaceC3217m80, InterfaceC4030o0o0OOOo interfaceC4030o0o0OOOo, ContentResolver contentResolver) {
        this(list, OooO0o, interfaceC3217m80, interfaceC4030o0o0OOOo, contentResolver);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String OooO0O0(android.net.Uri r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            ambercore.m80 r1 = r4.OooO0O0     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            android.database.Cursor r1 = r1.OooO00o(r5)     // Catch: java.lang.Throwable -> L21 java.lang.SecurityException -> L23
            if (r1 == 0) goto L1b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1b
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L18 java.lang.SecurityException -> L24
            r1.close()
            return r5
        L18:
            r5 = move-exception
            r0 = r1
            goto L36
        L1b:
            if (r1 == 0) goto L20
            r1.close()
        L20:
            return r0
        L21:
            r5 = move-exception
            goto L36
        L23:
            r1 = r0
        L24:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L30
            j$.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L18
        L30:
            if (r1 == 0) goto L35
            r1.close()
        L35:
            return r0
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ambercore.C3323n80.OooO0O0(android.net.Uri):java.lang.String");
    }

    int OooO00o(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.OooO0Oo.openInputStream(uri);
                int iOooO0O0 = com.bumptech.glide.load.OooO00o.OooO0O0(this.OooO0o0, inputStreamOpenInputStream, this.OooO0OO);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iOooO0O0;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Objects.toString(uri);
                }
                if (inputStreamOpenInputStream == null) {
                    return -1;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    C3323n80(List list, oO000OO oo000oo, InterfaceC3217m80 interfaceC3217m80, InterfaceC4030o0o0OOOo interfaceC4030o0o0OOOo, ContentResolver contentResolver) {
        this.OooO00o = oo000oo;
        this.OooO0O0 = interfaceC3217m80;
        this.OooO0OO = interfaceC4030o0o0OOOo;
        this.OooO0Oo = contentResolver;
        this.OooO0o0 = list;
    }

    private boolean OooO0OO(File file) {
        return this.OooO00o.OooO00o(file) && 0 < this.OooO00o.OooO0OO(file);
    }

    public InputStream OooO0Oo(Uri uri) throws Throwable {
        String strOooO0O0 = OooO0O0(uri);
        if (TextUtils.isEmpty(strOooO0O0)) {
            return null;
        }
        File fileOooO0O0 = this.OooO00o.OooO0O0(strOooO0O0);
        if (!OooO0OO(fileOooO0O0)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileOooO0O0);
        try {
            return this.OooO0Oo.openInputStream(uriFromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
        }
    }
}
