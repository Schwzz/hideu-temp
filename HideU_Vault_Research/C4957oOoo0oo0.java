package ambercore;

import ambercore.AbstractC5421ooO0Ooo0;
import ambercore.O0o0oo0;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import coil.decode.DataSource;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;

/* JADX INFO: renamed from: ambercore.oOoo0oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4957oOoo0oo0 implements O0o0oo0 {
    private final Uri OooO00o;
    private final C6993zE OooO0O0;

    /* JADX INFO: renamed from: ambercore.oOoo0oo0$OooO00o */
    public static final class OooO00o implements O0o0oo0.OooO00o {
        private final boolean OooO0OO(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "content");
        }

        @Override // ambercore.O0o0oo0.OooO00o
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public O0o0oo0 OooO00o(Uri uri, C6993zE c6993zE, InterfaceC1098Ff interfaceC1098Ff) {
            if (!OooO0OO(uri)) {
                return null;
            }
            return new C4957oOoo0oo0(uri, c6993zE);
        }
    }

    private final Bundle OooO0Oo() {
        AbstractC5421ooO0Ooo0 abstractC5421ooO0Ooo0OooO0O0 = this.OooO0O0.OooOOO().OooO0O0();
        AbstractC5421ooO0Ooo0.OooO00o oooO00o = abstractC5421ooO0Ooo0OooO0O0 instanceof AbstractC5421ooO0Ooo0.OooO00o ? (AbstractC5421ooO0Ooo0.OooO00o) abstractC5421ooO0Ooo0OooO0O0 : null;
        if (oooO00o == null) {
            return null;
        }
        int i = oooO00o.OooO00o;
        AbstractC5421ooO0Ooo0 abstractC5421ooO0Ooo0OooO00o = this.OooO0O0.OooOOO().OooO00o();
        AbstractC5421ooO0Ooo0.OooO00o oooO00o2 = abstractC5421ooO0Ooo0OooO00o instanceof AbstractC5421ooO0Ooo0.OooO00o ? (AbstractC5421ooO0Ooo0.OooO00o) abstractC5421ooO0Ooo0OooO00o : null;
        if (oooO00o2 == null) {
            return null;
        }
        int i2 = oooO00o2.OooO00o;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
        return bundle;
    }

    @Override // ambercore.O0o0oo0
    public Object OooO00o(InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.OooO0O0.OooO0oO().getContentResolver();
        if (OooO0O0(this.OooO00o)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.OooO00o, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.OooO00o + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !OooO0OO(this.OooO00o)) {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.OooO00o);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.OooO00o + "'.").toString());
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.OooO00o, "image/*", OooO0Oo(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.OooO00o + "'.").toString());
            }
        }
        return new C6970z20(AbstractC1762Vf.OooO0O0(Okio.buffer(Okio.source(inputStreamOpenInputStream)), this.OooO0O0.OooO0oO(), new C4948oOoo0o(this.OooO00o)), contentResolver.getType(this.OooO00o), DataSource.DISK);
    }

    public C4957oOoo0oo0(Uri uri, C6993zE c6993zE) {
        this.OooO00o = uri;
        this.OooO0O0 = c6993zE;
    }

    public final boolean OooO0O0(Uri uri) {
        if (Intrinsics.areEqual(uri.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(uri.getLastPathSegment(), "display_photo")) {
            return true;
        }
        return false;
    }

    public final boolean OooO0OO(Uri uri) {
        List<String> pathSegments;
        int size;
        if (!Intrinsics.areEqual(uri.getAuthority(), "media") || (size = (pathSegments = uri.getPathSegments()).size()) < 3 || !Intrinsics.areEqual(pathSegments.get(size - 3), "audio") || !Intrinsics.areEqual(pathSegments.get(size - 2), "albums")) {
            return false;
        }
        return true;
    }
}
