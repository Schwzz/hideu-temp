package ambercore;

import ambercore.G20;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ambercore.oOO0oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4610oOO0oo0o {
    private static G20 OooOooO;
    public static final C4610oOO0oo0o OooO00o = new C4610oOO0oo0o();
    private static final String OooO0O0 = "camera_first_open";
    private static final String OooO0OO = "camera_open";
    private static final String OooO0Oo = "camera_capture_click";
    private static final String OooO0o0 = "camera_capture_first_click";
    private static final String OooO0o = "gallery_first_open";
    private static final String OooO0oO = "gallery_open";
    private static final String OooO0oo = "gallery_exit";
    private static final String OooO = "allvideos_first_open";
    private static final String OooOO0 = "allvideos_open";
    private static final String OooOO0O = "allvideos_exit";
    private static final String OooOO0o = "camera_gallery_click";
    private static final String OooOOO0 = "camera_exit_click";
    private static final String OooOOO = "gallery_view_click";
    private static final String OooOOOO = "gallery_order_click";
    private static final String OooOOOo = "gallery_modify";
    private static final String OooOOo0 = "result";
    private static final String OooOOo = Constants.MessagePayloadKeys.FROM;
    private static final String OooOOoo = "type";
    private static final String OooOo00 = "direction";
    private static final String OooOo0 = "flash";
    private static final String OooOo0O = "picture_open";
    private static final String OooOo0o = "gallery_picture_edit";
    private static final String OooOo = "filter_used";
    private static final String OooOoO0 = "file_share";
    private static final String OooOoO = "gallery_album_create";
    private static final String OooOoOO = "gallery_all_photos_pv";
    private static final String OooOoo0 = "gallery_albums_pv";
    private static final String OooOoo = "gallery_ablums_open";

    public final void Oooo0O0() {
        C5922p90.OooOOO("picture_back", null, 2, null);
    }

    private final G20 OooO0Oo() {
        if (OooOooO == null) {
            OooOooO = new G20();
        }
        G20 g20 = OooOooO;
        Intrinsics.checkNotNull(g20);
        return g20;
    }

    public final void OooO(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("album_delete", linkedHashMap);
    }

    public final void OooO0oo(int i, String from, int i2, int i3) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        linkedHashMap.put("count_sum", String.valueOf(i2));
        linkedHashMap.put("count_now", String.valueOf(i3));
        if (i == 11) {
            C5922p90.OooOOO0(OooOoO, linkedHashMap);
        } else {
            C5922p90.OooOOO0("allvideos_album_create", linkedHashMap);
        }
    }

    public final void OooOO0(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("album_rename", linkedHashMap);
    }

    public final void OooOO0O(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("album_unhide", linkedHashMap);
    }

    public final void OooOO0o(int i) {
        if (i == 11) {
            C5922p90.OooOOO(OooOoOO, null, 2, null);
        } else {
            C5922p90.OooOOO("allvideos_all_videos_pv", null, 2, null);
        }
    }

    public final void OooOOO() {
        C5922p90.OooOOO(OooOO0o, null, 2, null);
    }

    public final void OooOOO0() {
        C5922p90.OooOOO(OooOOO0, null, 2, null);
    }

    public final void OooOOOO(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0(OooO0OO, linkedHashMap);
        if (OooO0o0()) {
            C5922p90.OooOOO0(OooO0O0, linkedHashMap);
            OooO00o();
        }
    }

    public final void OooOOOo(String direction, String flash, String from, boolean z) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(flash, "flash");
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOo00, direction);
        linkedHashMap.put(OooOo0, flash);
        linkedHashMap.put(OooOOo, from);
        linkedHashMap.put(OooOo, String.valueOf(z));
        G20 g20OooO0Oo = OooO0Oo();
        G20.OooO00o oooO00o = G20.OooO0O0;
        if (g20OooO0Oo.OooO0O0(oooO00o.OooO0OO(), true)) {
            OooO0Oo().OooOO0o(oooO00o.OooO0OO(), false);
            C5922p90.OooOOO0(OooO0o0, linkedHashMap);
        }
        C5922p90.OooOOO0(OooO0Oo, linkedHashMap);
        C3370ng0.OooO0o(C3370ng0.OooO00o.OooO00o(), "camera_capture", null, 2, null);
    }

    public final void OooOOo(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo0, result);
        C5922p90.OooOOO0(OooOOO, linkedHashMap);
    }

    public final void OooOOo0(String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo0, result);
        C5922p90.OooOOO0(OooOOOO, linkedHashMap);
    }

    public final void OooOOoo(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("file_delete_click", linkedHashMap);
    }

    public final void OooOo(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("file_set_wallpaper_click", linkedHashMap);
    }

    public final void OooOo0(String from, String type) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(type, "type");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        linkedHashMap.put(OooOOoo, type);
        C5922p90.OooOOO0("file_move", linkedHashMap);
    }

    public final void OooOo00(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("file_more_click", linkedHashMap);
    }

    public final void OooOo0O(String from, String type) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(type, "type");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        linkedHashMap.put(OooOOoo, type);
        C5922p90.OooOOO0("file_move_click", linkedHashMap);
    }

    public final void OooOo0o(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("file_rename_click", linkedHashMap);
    }

    public final void OooOoO(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (Intrinsics.areEqual(from, "gallery")) {
            C5922p90.OooOOO(OooO0oo, null, 2, null);
        }
    }

    public final void OooOoO0(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("file_unhide_click", linkedHashMap);
    }

    public final void OooOoOO(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("file_info_click", linkedHashMap);
    }

    public final void OooOoo(int i) {
        if (i == 11) {
            C5922p90.OooOOO(OooOoo, null, 2, null);
        } else {
            C5922p90.OooOOO("allvideos_ablums_open", null, 2, null);
        }
    }

    public final void OooOoo0(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        HashMap map = new HashMap(1);
        map.put(OooOOo, from);
        C5922p90.OooOOO0(OooO0oO, map);
        if (OooO0o()) {
            C5922p90.OooOOO0(OooO0o, map);
            OooO0O0();
        }
    }

    public final void OooOooO(int i) {
        if (i == 11) {
            C5922p90.OooOOO(OooOoo0, null, 2, null);
        } else {
            C5922p90.OooOOO("allvideos_albums_pv", null, 2, null);
        }
    }

    public final void OooOooo(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (Intrinsics.areEqual(from, "allvideos")) {
            C5922p90.OooOOO(OooOO0O, null, 2, null);
        }
    }

    public final void Oooo0(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0(OooOo0O, linkedHashMap);
    }

    public final void Oooo000(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        HashMap map = new HashMap(1);
        map.put(OooOOo, from);
        C5922p90.OooOOO0(OooOO0, map);
        if (OooO0oO()) {
            C5922p90.OooOOO0(OooO, map);
            OooO0OO();
        }
    }

    public final void Oooo00O(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0("hide_album_choose_click", linkedHashMap);
    }

    public final void Oooo00o(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0(OooOOOo, linkedHashMap);
    }

    public final void Oooo0OO(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        C5922p90.OooOOO0(OooOo0o, linkedHashMap);
    }

    public final void Oooo0o0(String from, String type) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(type, "type");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OooOOo, from);
        linkedHashMap.put(OooOOoo, type);
        C5922p90.OooOOO0(OooOoO0, linkedHashMap);
    }

    private C4610oOO0oo0o() {
    }

    private final void OooO00o() {
        OooO0Oo().OooOO0o(G20.OooO0O0.OooO0Oo(), false);
    }

    private final void OooO0O0() {
        OooO0Oo().OooOO0o(G20.OooO0O0.OooO0o0(), false);
    }

    private final void OooO0OO() {
        OooO0Oo().OooOO0o(G20.OooO0O0.OooO0o(), false);
    }

    private final boolean OooO0o() {
        return OooO0Oo().OooO0O0(G20.OooO0O0.OooO0o0(), true);
    }

    private final boolean OooO0o0() {
        return OooO0Oo().OooO0O0(G20.OooO0O0.OooO0Oo(), true);
    }

    private final boolean OooO0oO() {
        return OooO0Oo().OooO0O0(G20.OooO0O0.OooO0o(), true);
    }
}
