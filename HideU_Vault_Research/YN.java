package ambercore;

import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class YN {
    private static N20 OooO;
    public static final YN OooO00o = new YN();
    private static final String OooO0O0 = "Recyclebin_first_open";
    private static final String OooO0OO = "Recyclebin_open";
    private static final String OooO0Oo = "Recyclebin_restore_click";
    private static final String OooO0o0 = "Recyclebin_delete_click";
    private static final String OooO0o = "Recyclebin_clear_click";
    private static final String OooO0oO = "Recyclebin_file_open";
    private static final String OooO0oo = Constants.MessagePayloadKeys.FROM;

    private final N20 OooO0O0() {
        if (OooO == null) {
            OooO = new N20();
        }
        N20 n20 = OooO;
        Intrinsics.checkNotNull(n20);
        return n20;
    }

    public final void OooO0Oo() {
        C5922p90.OooOOO(OooO0o, null, 2, null);
    }

    public final void OooO0o() {
        C5922p90.OooOOO(OooO0oO, null, 2, null);
    }

    public final void OooO0o0(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooO0oo, from);
        C5922p90.OooOOO0(OooO0o0, linkedHashMap);
    }

    public final void OooO0oO() {
        C5922p90.OooOOO(OooO0OO, null, 2, null);
        if (OooO0OO()) {
            C5922p90.OooOOO(OooO0O0, null, 2, null);
            OooO00o();
        }
    }

    public final void OooO0oo(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooO0oo, from);
        C5922p90.OooOOO0(OooO0Oo, linkedHashMap);
    }

    private YN() {
    }

    private final void OooO00o() {
        OooO0O0().OooOO0o(N20.OooO0O0.OooO00o(), false);
    }

    private final boolean OooO0OO() {
        return OooO0O0().OooO0O0(N20.OooO0O0.OooO00o(), true);
    }
}
