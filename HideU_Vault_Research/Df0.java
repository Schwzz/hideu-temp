package ambercore;

import ambercore.InterfaceC0950Ax;
import android.content.ContentResolver;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Df0 implements InterfaceC0950Ax {
    private static final Set OooO0O0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final OooO0OO OooO00o;

    public static final class OooO00o implements InterfaceC0981Bx, OooO0OO {
        private final ContentResolver OooO00o;

        @Override // ambercore.Df0.OooO0OO
        public InterfaceC5195oo0O0oo0 OooO00o(Uri uri) {
            return new C4043o0o0Ooo0(this.OooO00o, uri);
        }

        @Override // ambercore.InterfaceC0981Bx
        public InterfaceC0950Ax OooO0Oo(C0982By c0982By) {
            return new Df0(this);
        }

        public OooO00o(ContentResolver contentResolver) {
            this.OooO00o = contentResolver;
        }
    }

    public static class OooO0O0 implements InterfaceC0981Bx, OooO0OO {
        private final ContentResolver OooO00o;

        @Override // ambercore.Df0.OooO0OO
        public InterfaceC5195oo0O0oo0 OooO00o(Uri uri) {
            return new o0OO00O0(this.OooO00o, uri);
        }

        @Override // ambercore.InterfaceC0981Bx
        public InterfaceC0950Ax OooO0Oo(C0982By c0982By) {
            return new Df0(this);
        }

        public OooO0O0(ContentResolver contentResolver) {
            this.OooO00o = contentResolver;
        }
    }

    public interface OooO0OO {
        InterfaceC5195oo0O0oo0 OooO00o(Uri uri);
    }

    /* JADX INFO: renamed from: ambercore.Df0$OooO0Oo, reason: case insensitive filesystem */
    public static class C1033OooO0Oo implements InterfaceC0981Bx, OooO0OO {
        private final ContentResolver OooO00o;

        @Override // ambercore.Df0.OooO0OO
        public InterfaceC5195oo0O0oo0 OooO00o(Uri uri) {
            return new C3209m40(this.OooO00o, uri);
        }

        @Override // ambercore.InterfaceC0981Bx
        public InterfaceC0950Ax OooO0Oo(C0982By c0982By) {
            return new Df0(this);
        }

        public C1033OooO0Oo(ContentResolver contentResolver) {
            this.OooO00o = contentResolver;
        }
    }

    @Override // ambercore.InterfaceC0950Ax
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public InterfaceC0950Ax.OooO00o OooO00o(Uri uri, int i, int i2, C6782xE c6782xE) {
        return new InterfaceC0950Ax.OooO00o(new C2588gD(uri), this.OooO00o.OooO00o(uri));
    }

    @Override // ambercore.InterfaceC0950Ax
    /* JADX INFO: renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public boolean OooO0O0(Uri uri) {
        return OooO0O0.contains(uri.getScheme());
    }

    public Df0(OooO0OO oooO0OO) {
        this.OooO00o = oooO0OO;
    }
}
