package ambercore;

import com.calculator.hideu.hideapps.HideAppsSp;
import com.calculator.hideu.remoteconfig.CalcThemeConfig;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class U6 {
    public static final U6 OooO00o = new U6();

    static final class OooO00o extends SuspendLambda implements P2 {
        int OooOO0O;
        final /* synthetic */ boolean OooOO0o;
        final /* synthetic */ List OooOOO;
        final /* synthetic */ int OooOOO0;
        final /* synthetic */ boolean OooOOOO;

        @Override // ambercore.P2
        public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return ((OooO00o) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        OooO00o(boolean z, int i, List list, boolean z2, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            super(2, interfaceC4966oOooO0O0);
            this.OooOO0o = z;
            this.OooOOO0 = i;
            this.OooOOO = list;
            this.OooOOOO = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return new OooO00o(this.OooOO0o, this.OooOOO0, this.OooOOO, this.OooOOOO, interfaceC4966oOooO0O0);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            kotlin.coroutines.intrinsics.OooO00o.OooO0o();
            if (this.OooOO0O == 0) {
                kotlin.OooO0OO.OooO0O0(obj);
                HideAppsSp hideAppsSp = HideAppsSp.OooO0O0;
                boolean zOooO0O0 = hideAppsSp.OooO0O0("guideDefaultClick", true);
                if (zOooO0O0) {
                    hideAppsSp.OooOO0o("guideDefaultClick", false);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("first", String.valueOf(zOooO0O0));
                linkedHashMap.put(ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, String.valueOf(this.OooOO0o));
                linkedHashMap.put("count", String.valueOf(this.OooOOO0));
                linkedHashMap.put("name", U6.OooO00o.OooO0o0(this.OooOOO));
                if (this.OooOOOO) {
                    str = "page";
                } else {
                    str = "dialog";
                }
                linkedHashMap.put("type", str);
                C5922p90.OooOOO0("hideapp_guide_set_default_click", linkedHashMap);
                return C7028ze0.OooO00o;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void OooOO0O() {
        C5922p90.OooOOO("hideapp_guide_set_success", null, 2, null);
    }

    public static final void OooOOO(int i) {
        if (i == 1) {
            C5922p90.OooOOO("hideapp_guide_bubble_first", null, 2, null);
        }
        if (i == 2) {
            C5922p90.OooOOO("hideapp_guide_bubble_second", null, 2, null);
        }
    }

    public final void OooO() {
        C5922p90.OooOOO("hideapp_guide_layer_app", null, 2, null);
    }

    public final void OooO0O0() {
        C5922p90.OooOOO("hideapp_hidden_app_add", null, 2, null);
    }

    public final void OooO0OO() {
        C5922p90.OooOOO("calculator_click_contact", null, 2, null);
    }

    public final void OooO0Oo() {
        C5922p90.OooOOO("hide_apps_enable", null, 2, null);
    }

    public final void OooOO0() {
        C5922p90.OooOOO("hideapp_guide_layer_restore", null, 2, null);
    }

    public final void OooOO0o() {
        C5922p90.OooOOO("hideapp_guide_show_error", null, 2, null);
    }

    public final void OooOOO0() {
        C5922p90.OooOOO("hideapp_restore_widget_click", null, 2, null);
    }

    public final void OooOOoo() {
        C5922p90.OooOOO("hideapp_notification_granted", null, 2, null);
    }

    public final void OooOo0() {
        C5922p90.OooOOO("hideapp_notification_messages_click", null, 2, null);
    }

    public final void OooOo00() {
        C5922p90.OooOOO("hideapp_notification_clear_click", null, 2, null);
    }

    public final void OooOo0O() {
        C5922p90.OooOOO("hideapp_notification_delete_click", null, 2, null);
    }

    public final void OooOoOO() {
        C5922p90.OooOOO("hideapp_reset_dialog_later_click", null, 2, null);
    }

    public final void OooOoo() {
        C5922p90.OooOOO("hideapp_reset_dialog_set_click", null, 2, null);
    }

    public final void OooOoo0() {
        C5922p90.OooOOO("hideapp_reset_dialog_pv", null, 2, null);
    }

    public final void OooOooo() {
        C5922p90.OooOOO("hideapp_hidden_app_restore_click", null, 2, null);
    }

    public final void Oooo0() {
        C5922p90.OooOOO("hideapp_hidden_app_unhide_undo", null, 2, null);
    }

    public final void Oooo00O() {
        C5922p90.OooOOO("restore_launcher_success", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String OooO0o0(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() + str.length() < 99) {
                sb.append(str);
                sb.append(",");
            }
        }
        if (kotlin.text.OooOO0.OoooOoO(sb, ",", false, 2, null)) {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(kotlin.text.OooOO0.Ooooo0o(sb)), "deleteCharAt(...)");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final void OooOOo0(boolean z) {
        if (HideAppsSp.OooO0O0.OooOOoo()) {
            C5922p90.OooOOO0("launcher3_start", AbstractC1844Xs.OooO0o(AbstractC1061Ec0.OooO00o("default_launcher", String.valueOf(z))));
        }
    }

    public final void OooO0o(boolean z, int i, List pkgs, boolean z2) {
        Intrinsics.checkNotNullParameter(pkgs, "pkgs");
        AbstractC4506oO0oo0OO.OooO0Oo(AbstractC4999oOooo0O.OooO0O0(), C5469ooOO00O.OooO0O0(), null, new OooO00o(z, i, pkgs, z2, null), 2, null);
    }

    public final void OooO0oO() {
        HideAppsSp hideAppsSp = HideAppsSp.OooO0O0;
        boolean zOooO0O0 = hideAppsSp.OooO0O0("guideDefaultPv", true);
        if (zOooO0O0) {
            hideAppsSp.OooOO0o("guideDefaultPv", false);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("first", String.valueOf(zOooO0O0));
        C5922p90.OooOOO0("hideapp_guide_set_default_pv", linkedHashMap);
    }

    public final void OooO0oo() {
        HideAppsSp hideAppsSp = HideAppsSp.OooO0O0;
        boolean zOooO0O0 = hideAppsSp.OooO0O0("guidePv", true);
        if (zOooO0O0) {
            hideAppsSp.OooOO0o("guidePv", false);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("first", String.valueOf(zOooO0O0));
        C5922p90.OooOOO0("hideapp_guide_choose_apps_pv", linkedHashMap);
    }

    public final void OooOOOO() {
        HideAppsSp hideAppsSp = HideAppsSp.OooO0O0;
        if (hideAppsSp.OooOoOO()) {
            C5922p90.OooOOO("hideapps_first_open", null, 2, null);
            hideAppsSp.Oooo0oo();
        }
        C5922p90.OooOOO("hideapps_open", null, 2, null);
    }

    public final void OooOOOo(int i, ArrayList pkgs, String from) {
        Intrinsics.checkNotNullParameter(pkgs, "pkgs");
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("count", String.valueOf(i));
        linkedHashMap.put("name", OooO0o0(pkgs));
        linkedHashMap.put(Constants.MessagePayloadKeys.FROM, from);
        C5922p90.OooOOO0("hideapp_hidden_app_hide", linkedHashMap);
    }

    public final void OooOOo() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HideAppsSp hideAppsSp = HideAppsSp.OooO0O0;
        linkedHashMap.put("first", String.valueOf(hideAppsSp.OooOoo()));
        C5922p90.OooOOO0("hideapp_notification_box_pv", linkedHashMap);
        if (hideAppsSp.OooOoo()) {
            hideAppsSp.Oooo0();
        }
    }

    public final void OooOo(String from, String packageName) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        HideAppsSp hideAppsSp = HideAppsSp.OooO0O0;
        boolean zOooOoO = hideAppsSp.OooOoO();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("first", String.valueOf(zOooOoO));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Constants.MessagePayloadKeys.FROM, from);
        linkedHashMap2.put("recommend", K7.OooO0O0.OooOOo0(packageName) ? "Y" : "N");
        linkedHashMap2.put("name", packageName);
        linkedHashMap.putAll(linkedHashMap2);
        C5922p90.OooOOO0("hideapp_hidden_app_open", linkedHashMap);
        if (zOooOoO) {
            C5922p90.OooOOO0("hideapp_hidden_app_first_open", linkedHashMap2);
            hideAppsSp.OoooO00();
        }
    }

    public final void OooOo0o(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HideAppsSp hideAppsSp = HideAppsSp.OooO0O0;
        linkedHashMap.put("first", String.valueOf(hideAppsSp.OooOoo0()));
        linkedHashMap.put("status", z ? CalcThemeConfig.ON : "off");
        C5922p90.OooOOO0("hideapp_notification_switch_click", linkedHashMap);
        if (hideAppsSp.OooOoo0()) {
            hideAppsSp.Oooo00o();
        }
        Oooo0OO();
    }

    public final void OooOoO(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HideAppsSp hideAppsSp = HideAppsSp.OooO0O0;
        linkedHashMap.put("first", String.valueOf(hideAppsSp.OooOooO()));
        linkedHashMap.put("status", z ? CalcThemeConfig.ON : "off");
        C5922p90.OooOOO0("hideapp_recent_switch_click", linkedHashMap);
        if (hideAppsSp.OooOooO()) {
            hideAppsSp.Oooo0O0();
        }
        Oooo0o0();
    }

    public final void OooOoO0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HideAppsSp hideAppsSp = HideAppsSp.OooO0O0;
        linkedHashMap.put("first", String.valueOf(hideAppsSp.OooOooo()));
        C5922p90.OooOOO0("hideapp_settings_open", linkedHashMap);
        if (hideAppsSp.OooOooo()) {
            hideAppsSp.Oooo0OO();
        }
    }

    public final void OooOooO(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Constants.MessagePayloadKeys.FROM, from);
        C5922p90.OooOOO0("hideapp_restore_change_click", linkedHashMap);
    }

    public final void Oooo000(String from) {
        Intrinsics.checkNotNullParameter(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Constants.MessagePayloadKeys.FROM, from);
        C5922p90.OooOOO0("hideapp_restore_dialog_pv", linkedHashMap);
    }

    public final void Oooo00o(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("recommend", K7.OooO0O0.OooOOo0(packageName) ? "Y" : "N");
        linkedHashMap.put("name", packageName);
        C5922p90.OooOOO0("hideapp_hidden_app_unhide", linkedHashMap);
    }

    private U6() {
    }

    private final void Oooo0OO() {
        C5922p90.OooOOo();
    }

    private final void Oooo0o0() {
        C5922p90.OooOOoo();
    }

    public final void Oooo0O0() {
        C5922p90.OooOOo0();
    }
}
