package ambercore;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.format.Formatter;
import android.util.Base64;
import com.amber.hideu.browser.R$string;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Kg0 {
    public static final Kg0 OooO00o = new Kg0();

    public final Object OooO0o0(String str, String str2, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) throws Throwable {
        String strSubstring = str.substring(kotlin.text.OooOO0.OoooooO(str, ",", 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bArrDecode = Base64.decode(strSubstring, 0);
        Intrinsics.checkNotNull(bArrDecode);
        OooO0o(str2, bArrDecode);
        return C7028ze0.OooO00o;
    }

    private final void OooO0o(String str, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        File file = new File(C2247d40.OooO00o.OooO0oo(), str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 == null) {
            } else {
                fileOutputStream2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public final int OooO00o(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return ((int) ((((long) url.length()) * 3) / 4)) - (kotlin.text.OooOO0.OooOoO(url, "==", false, 2, null) ? 2 : 1);
    }

    public final String OooO0O0(Context context, Long l) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (l == null || l.longValue() < 0) {
            return T80.OooO0o(R$string.unknown);
        }
        String fileSize = Formatter.formatFileSize(context, l.longValue());
        return fileSize == null ? T80.OooO0o(R$string.unknown) : fileSize;
    }

    public final boolean OooO0OO(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        boolean zOooo = kotlin.text.OooOO0.Oooo(url, "data:image", false, 2, null);
        C3949o0Ooo0O.OooO0OO("TAG", url + ",isBase64: " + zOooo, null, 4, null);
        return zOooo;
    }

    public final boolean OooO0Oo(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        boolean z = false;
        if (!file.exists()) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            z = true;
        }
        C3949o0Ooo0O.OooO0OO("TAG", "isPic: " + z, null, 4, null);
        return z;
    }

    private Kg0() {
    }
}
