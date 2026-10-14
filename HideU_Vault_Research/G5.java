package ambercore;

import android.os.Build;
import android.util.LruCache;
import com.calculator.hideu.filemgr.data.FileEntity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class G5 extends E5 {
    private final String OooO00o = C2351e40.OooO00o.OooOOO();
    private final LruCache OooO0O0 = new LruCache(20);

    private final boolean OooO00o(File file, File file2, boolean z) {
        try {
            if (!OOO000.OooOo0O(file, file2, true, 0, 4, null).isFile()) {
                return false;
            }
            try {
                file.delete();
                return true;
            } catch (Exception unused) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            C5013oOooooO c5013oOooooO = C5013oOooooO.OooO00o;
            Exception exc = new Exception("copy_and_delete", e);
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            String absolutePath2 = file2.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
            C5013oOooooO.OooO0O0(c5013oOooooO, exc, absolutePath, absolutePath2, null, 8, null);
            if (file2.isFile()) {
                file2.delete();
            }
            return false;
        }
    }

    static /* synthetic */ boolean OooO0oO(G5 g5, File file, File file2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return g5.OooO0o(file, file2, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.File OooO0O0(com.calculator.hideu.filemgr.data.FileEntity r21) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ambercore.G5.OooO0O0(com.calculator.hideu.filemgr.data.FileEntity):java.io.File");
    }

    public boolean OooO0OO(FileEntity file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File file2 = new File(file.getPath(), file.getName());
        if (!file2.isFile()) {
            return false;
        }
        boolean zOooO0oO = OooO0oO(this, file2, new File(this.OooO00o, file.getHideName()), true, false, 8, null);
        if (!zOooO0oO) {
            C4317oO00o0O.OooO00o.Oooo0o();
            return zOooO0oO;
        }
        AbstractC2046b90.OooOO0o(file2);
        O0OO000.OooO0O0.OooOooO();
        return zOooO0oO;
    }

    public boolean OooO0Oo(FileEntity file, byte[] bArr) throws Throwable {
        IOException iOException;
        Throwable th;
        boolean z;
        FileOutputStream fileOutputStream;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(bArr, "byte");
        File file2 = new File(this.OooO00o, file.getHideName());
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!file2.isFile()) {
                    file2.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e) {
            iOException = e;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            z = true;
        } catch (IOException e3) {
            iOException = e3;
            fileOutputStream2 = fileOutputStream;
            iOException.printStackTrace();
            C5013oOooooO.OooO0O0(C5013oOooooO.OooO00o, new Exception("encrypt_file_byte", iOException), null, null, null, 14, null);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            z = false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 == null) {
                throw th;
            }
            try {
                fileOutputStream2.close();
                throw th;
            } catch (IOException e5) {
                e5.printStackTrace();
                throw th;
            }
        }
        if (z) {
            O0OO000.OooO0O0.OooOooO();
        } else {
            C4317oO00o0O.OooO00o.Oooo0o();
        }
        return z;
    }

    public boolean OooO0o0(File sourceFile, File hideFile, boolean z) {
        Intrinsics.checkNotNullParameter(sourceFile, "sourceFile");
        Intrinsics.checkNotNullParameter(hideFile, "hideFile");
        if (!sourceFile.isFile()) {
            return false;
        }
        boolean zOooO0o = OooO0o(sourceFile, hideFile, true, z);
        if (!zOooO0o) {
            C4317oO00o0O.OooO00o.Oooo0o();
            return zOooO0o;
        }
        AbstractC2046b90.OooOO0o(sourceFile);
        O0OO000.OooO0O0.OooOooO();
        return zOooO0o;
    }

    private final boolean OooO(File file, File file2, boolean z) {
        if (!file.renameTo(file2)) {
            return OooO00o(file, file2, z);
        }
        return true;
    }

    private final boolean OooO0o(File file, File file2, boolean z, boolean z2) {
        File fileOoooo0o;
        try {
            String parent = file2.getParent();
            if (parent != null) {
                fileOoooo0o = AbstractC1942a90.Ooooo0o(parent);
            } else {
                fileOoooo0o = null;
            }
            if ((fileOoooo0o == null || !fileOoooo0o.isDirectory()) && fileOoooo0o != null) {
                fileOoooo0o.mkdirs();
            }
            if (z2) {
                return OooO00o(file, file2, z);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                return OooO0oo(file, file2, z);
            }
            return OooO(file, file2, z);
        } catch (Exception e) {
            e.printStackTrace();
            C5013oOooooO c5013oOooooO = C5013oOooooO.OooO00o;
            Exception exc = new Exception("move_data", e);
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            String absolutePath2 = file2.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
            C5013oOooooO.OooO0O0(c5013oOooooO, exc, absolutePath, absolutePath2, null, 8, null);
            C3950o0Ooo0O0.OooO0o(this, String.valueOf(e.getMessage()), e);
            return false;
        }
    }

    private final boolean OooO0oo(File file, File file2, boolean z) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.ATOMIC_MOVE);
            return true;
        } catch (IOException unused) {
            return OooO(file, file2, z);
        }
    }
}
