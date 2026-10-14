package ambercore;

import ambercore.C6271sT;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.text.format.DateUtils;
import android.webkit.MimeTypeMap;
import androidx.core.content.ContextCompat;
import com.anddoes.launcher.R$string;
import com.calculator.hideu.HideUApplication;
import com.calculator.hideu.magicam.cameraengine.MagiCameraEngine;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ambercore.b90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC2046b90 {
    private static final SimpleDateFormat OooO00o = new SimpleDateFormat("yyyMMdd", Locale.US);

    public static final boolean OooO(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(HideUApplication.OooOO0O.OooO00o(), permission) == 0;
    }

    public static final int OooO00o(float f) {
        return (int) ((f * HideUApplication.OooOO0O.OooO00o().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final float OooO0O0(float f) {
        return (f * HideUApplication.OooOO0O.OooO00o().getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static final int OooO0OO(String str) {
        try {
            Intrinsics.checkNotNull(str);
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static final int[] OooO0Oo(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public static final int OooO0o() {
        return HideUApplication.OooOO0O.OooO00o().getResources().getDisplayMetrics().heightPixels;
    }

    public static final int OooO0oO() {
        return HideUApplication.OooOO0O.OooO00o().getResources().getDisplayMetrics().widthPixels;
    }

    public static final int[] OooO0oo(String path) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(path, "path");
        C6271sT.OooO00o oooO00o = C6271sT.OooOO0O;
        synchronized (oooO00o.OooO0O0()) {
            if (!new File(path).isFile()) {
                return new int[]{0, 0};
            }
            try {
                C6271sT c6271sTOooO00o = oooO00o.OooO00o();
                c6271sTOooO00o.setDataSource(path);
                String strExtractMetadata = c6271sTOooO00o.extractMetadata(18);
                int i = strExtractMetadata != null ? Integer.parseInt(strExtractMetadata) : 0;
                String strExtractMetadata2 = c6271sTOooO00o.extractMetadata(19);
                iArr = new int[]{i, strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : 0};
            } catch (Exception unused) {
                iArr = new int[]{0, 0};
            }
            return iArr;
        }
    }

    public static final String OooOO0O(Long l) {
        if (l == null) {
            return AbstractC1942a90.OooOOOO(R$string.unknown);
        }
        String elapsedTime = DateUtils.formatElapsedTime(l.longValue() / ((long) 1000));
        Intrinsics.checkNotNullExpressionValue(elapsedTime, "formatElapsedTime(...)");
        return elapsedTime;
    }

    public static final void OooOO0o(File photoFile) {
        Intrinsics.checkNotNullParameter(photoFile, "photoFile");
        String absolutePath = photoFile.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        if (absolutePath.length() == 0) {
            return;
        }
        Context contextOooO00o = HideUApplication.OooOO0O.OooO00o();
        contextOooO00o.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE").setData(Uri.fromFile(photoFile)));
        MediaScannerConnection.scanFile(contextOooO00o, new String[]{photoFile.getAbsolutePath()}, new String[]{MimeTypeMap.getSingleton().getMimeTypeFromExtension(OOO000.OooOo(photoFile))}, null);
    }

    public static final File OooOOO(Bitmap bitmap, File parent, String childName, boolean z) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(childName, "childName");
        try {
            if (!parent.exists()) {
                parent.mkdirs();
            }
            File file = new File(parent, childName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                C7028ze0 c7028ze0 = C7028ze0.OooO00o;
                AbstractC4751oOOoOOOO.OooO00o(fileOutputStream, null);
                OooOO0o(file);
                if (z && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                C3950o0Ooo0O0.OooO0Oo("MagiCameraEngine", "takePhoto -> save image", null, 4, null);
                return file;
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new File(parent, childName);
        }
    }

    public static final Bitmap OooOOO0(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        if (f == 0.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ File OooOOOO(Bitmap bitmap, File file, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            file = MagiCameraEngine.Oooo000.OooO0OO();
        }
        if ((i & 4) != 0) {
            str = System.currentTimeMillis() + BrandSafetyUtils.a;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return OooOOO(bitmap, file, str, z);
    }

    public static final Bitmap OooOOOo(int i, int i2, Bitmap originalBitmap) {
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        Matrix matrix = new Matrix();
        matrix.postScale(((i * 1.0f) / originalBitmap.getWidth()) * 1.0f, ((i2 * 1.0f) / originalBitmap.getHeight()) * 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(originalBitmap, 0, 0, originalBitmap.getWidth(), originalBitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        originalBitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static final Bitmap OooO0o0(String str) {
        return OooOOO0(BitmapFactory.decodeFile(str), OooO0OO(str));
    }

    public static final boolean OooOO0(String str) {
        int[] iArrOooO0Oo = OooO0Oo(str);
        if (iArrOooO0Oo[1] > iArrOooO0Oo[0] * 3) {
            return true;
        }
        return false;
    }
}
