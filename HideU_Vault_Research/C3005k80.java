package ambercore;

import ambercore.InterfaceC5195oo0O0oo0;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ambercore.k80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C3005k80 implements InterfaceC5195oo0O0oo0 {
    private final Uri OooOO0O;
    private final C3323n80 OooOO0o;
    private InputStream OooOOO0;

    @Override // ambercore.InterfaceC5195oo0O0oo0
    public void cancel() {
    }

    /* JADX INFO: renamed from: ambercore.k80$OooO00o */
    static class OooO00o implements InterfaceC3217m80 {
        private static final String[] OooO0O0 = {"_data"};
        private final ContentResolver OooO00o;

        OooO00o(ContentResolver contentResolver) {
            this.OooO00o = contentResolver;
        }

        @Override // ambercore.InterfaceC3217m80
        public Cursor OooO00o(Uri uri) {
            return this.OooO00o.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, OooO0O0, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: ambercore.k80$OooO0O0 */
    static class OooO0O0 implements InterfaceC3217m80 {
        private static final String[] OooO0O0 = {"_data"};
        private final ContentResolver OooO00o;

        OooO0O0(ContentResolver contentResolver) {
            this.OooO00o = contentResolver;
        }

        @Override // ambercore.InterfaceC3217m80
        public Cursor OooO00o(Uri uri) {
            return this.OooO00o.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, OooO0O0, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static C3005k80 OooO0o0(Context context, Uri uri) {
        return OooO0Oo(context, uri, new OooO00o(context.getContentResolver()));
    }

    public static C3005k80 OooO0oO(Context context, Uri uri) {
        return OooO0Oo(context, uri, new OooO0O0(context.getContentResolver()));
    }

    private InputStream OooO0oo() throws Throwable {
        InputStream inputStreamOooO0Oo = this.OooOO0o.OooO0Oo(this.OooOO0O);
        int iOooO00o = inputStreamOooO0Oo != null ? this.OooOO0o.OooO00o(this.OooOO0O) : -1;
        return iOooO00o != -1 ? new C5860oooooO0(inputStreamOooO0Oo, iOooO00o) : inputStreamOooO0Oo;
    }

    @Override // ambercore.InterfaceC5195oo0O0oo0
    public Class OooO00o() {
        return InputStream.class;
    }

    @Override // ambercore.InterfaceC5195oo0O0oo0
    public void OooO0O0() {
        InputStream inputStream = this.OooOOO0;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // ambercore.InterfaceC5195oo0O0oo0
    public DataSource OooO0OO() {
        return DataSource.LOCAL;
    }

    C3005k80(Uri uri, C3323n80 c3323n80) {
        this.OooOO0O = uri;
        this.OooOO0o = c3323n80;
    }

    private static C3005k80 OooO0Oo(Context context, Uri uri, InterfaceC3217m80 interfaceC3217m80) {
        return new C3005k80(uri, new C3323n80(com.bumptech.glide.OooO0O0.OooO0Oo(context).OooOO0O().OooO0oO(), interfaceC3217m80, com.bumptech.glide.OooO0O0.OooO0Oo(context).OooO0o(), context.getContentResolver()));
    }

    @Override // ambercore.InterfaceC5195oo0O0oo0
    public void OooO0o(Priority priority, InterfaceC5195oo0O0oo0.OooO00o oooO00o) throws Throwable {
        try {
            InputStream inputStreamOooO0oo = OooO0oo();
            this.OooOOO0 = inputStreamOooO0oo;
            oooO00o.OooO0Oo(inputStreamOooO0oo);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            oooO00o.OooO0o0(e);
        }
    }
}
