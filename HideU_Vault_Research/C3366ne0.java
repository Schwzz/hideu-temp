package ambercore;

import ambercore.C3366ne0;
import ambercore.InterfaceC2205ck;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.fragment.app.FragmentManager;
import com.calculator.hideu.filemgr.ui.outter.OperateHideDialog;
import com.calculator.hideu.magicam.view.UnHideApkDialog;
import com.calculator.hideu.magicam.view.UnHideEnsureDialog;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ambercore.ne0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3366ne0 {
    private int OooO;
    private final InterfaceC2698hE OooO00o;
    private boolean OooO0O0;
    private boolean OooO0OO;
    private final InterfaceC1044Do OooO0Oo;
    private final Handler OooO0o;
    private InterfaceC4994oOooo0 OooO0o0;
    private boolean OooO0oO;
    private InterfaceC2205ck OooO0oo;
    private int OooOO0;
    private final SparseIntArray OooOO0O;
    private String OooOO0o;
    private InterfaceC2838ie OooOOO;
    private List OooOOO0;
    private final OooO0O0 OooOOOO;

    /* JADX INFO: renamed from: ambercore.ne0$OooO00o */
    public static final class OooO00o extends L00 {
        OooO00o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void OooO0Oo(C3366ne0 c3366ne0) {
            InterfaceC2838ie interfaceC2838ie = c3366ne0.OooOOO;
            if (interfaceC2838ie != null) {
                interfaceC2838ie.dismiss();
            }
            c3366ne0.OooOOO = null;
        }

        @Override // ambercore.L00, ambercore.InterfaceC6243s8
        public void onAdClose() {
            super.onAdClose();
            InterfaceC2838ie interfaceC2838ie = C3366ne0.this.OooOOO;
            if (interfaceC2838ie != null) {
                interfaceC2838ie.dismiss();
            }
            C3366ne0.this.OooOOO = null;
        }

        @Override // ambercore.L00, ambercore.InterfaceC6243s8
        public void onAdShow() {
            super.onAdShow();
            Handler handler = C3366ne0.this.OooO0o;
            final C3366ne0 c3366ne0 = C3366ne0.this;
            handler.postDelayed(new Runnable() { // from class: ambercore.me0
                @Override // java.lang.Runnable
                public final void run() {
                    C3366ne0.OooO00o.OooO0Oo(c3366ne0);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: ambercore.ne0$OooO0O0 */
    public static final class OooO0O0 extends Handler {
        OooO0O0(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            InterfaceC2838ie interfaceC2838ie = C3366ne0.this.OooOOO;
            if (interfaceC2838ie != null) {
                interfaceC2838ie.OoooOOO(msg.what);
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.ne0$OooO0OO */
    static final class OooO0OO extends SuspendLambda implements P2 {
        Object OooOO0O;
        Object OooOO0o;
        Object OooOOO;
        Object OooOOO0;
        int OooOOOO;
        int OooOOOo;
        int OooOOo0;
        final /* synthetic */ List OooOOoo;

        /* JADX INFO: renamed from: ambercore.ne0$OooO0OO$OooO00o */
        static final class OooO00o extends SuspendLambda implements P2 {
            int OooOO0O;
            final /* synthetic */ C3366ne0 OooOO0o;

            @Override // ambercore.P2
            public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                return ((OooO00o) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            OooO00o(C3366ne0 c3366ne0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                super(2, interfaceC4966oOooO0O0);
                this.OooOO0o = c3366ne0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                return new OooO00o(this.OooOO0o, interfaceC4966oOooO0O0);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.OooO00o.OooO0o();
                if (this.OooOO0O == 0) {
                    kotlin.OooO0OO.OooO0O0(obj);
                    InterfaceC2838ie interfaceC2838ie = this.OooOO0o.OooOOO;
                    if (interfaceC2838ie != null) {
                        interfaceC2838ie.Ooooo0o();
                    }
                    this.OooOO0o.OooOoo0();
                    return C7028ze0.OooO00o;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // ambercore.P2
        public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return ((OooO0OO) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        OooO0OO(List list, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            super(2, interfaceC4966oOooO0O0);
            this.OooOOoo = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return C3366ne0.this.new OooO0OO(this.OooOOoo, interfaceC4966oOooO0O0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0140, code lost:
        
            if (ambercore.AbstractC4505oO0oo0O0.OooO0oO(r15, r1, r14) == r0) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:13:0x003f, B:39:0x00dc, B:41:0x00e4, B:43:0x00f8, B:45:0x0106, B:47:0x011e, B:21:0x007c, B:23:0x0082, B:25:0x008a, B:26:0x008d, B:28:0x0096, B:33:0x00b6, B:35:0x00bc, B:36:0x00c0, B:46:0x0117, B:42:0x00ed, B:20:0x006e), top: B:59:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:13:0x003f, B:39:0x00dc, B:41:0x00e4, B:43:0x00f8, B:45:0x0106, B:47:0x011e, B:21:0x007c, B:23:0x0082, B:25:0x008a, B:26:0x008d, B:28:0x0096, B:33:0x00b6, B:35:0x00bc, B:36:0x00c0, B:46:0x0117, B:42:0x00ed, B:20:0x006e), top: B:59:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00ed A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:13:0x003f, B:39:0x00dc, B:41:0x00e4, B:43:0x00f8, B:45:0x0106, B:47:0x011e, B:21:0x007c, B:23:0x0082, B:25:0x008a, B:26:0x008d, B:28:0x0096, B:33:0x00b6, B:35:0x00bc, B:36:0x00c0, B:46:0x0117, B:42:0x00ed, B:20:0x006e), top: B:59:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0106 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:13:0x003f, B:39:0x00dc, B:41:0x00e4, B:43:0x00f8, B:45:0x0106, B:47:0x011e, B:21:0x007c, B:23:0x0082, B:25:0x008a, B:26:0x008d, B:28:0x0096, B:33:0x00b6, B:35:0x00bc, B:36:0x00c0, B:46:0x0117, B:42:0x00ed, B:20:0x006e), top: B:59:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0117 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:13:0x003f, B:39:0x00dc, B:41:0x00e4, B:43:0x00f8, B:45:0x0106, B:47:0x011e, B:21:0x007c, B:23:0x0082, B:25:0x008a, B:26:0x008d, B:28:0x0096, B:33:0x00b6, B:35:0x00bc, B:36:0x00c0, B:46:0x0117, B:42:0x00ed, B:20:0x006e), top: B:59:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d8 -> B:14:0x0042). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 356
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ambercore.C3366ne0.OooO0OO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3366ne0(InterfaceC2698hE listener, boolean z) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.OooO00o = listener;
        this.OooO0O0 = z;
        this.OooO0Oo = AbstractC1276Ko.OooO00o(new A2() { // from class: ambercore.ie0
            @Override // ambercore.A2
            public final Object invoke() {
                return C3366ne0.Oooo00o(this.OooOO0O);
            }
        });
        this.OooO0o0 = AbstractC4999oOooo0O.OooO0O0();
        this.OooO0o = new Handler(Looper.getMainLooper());
        this.OooO0oO = true;
        this.OooOO0O = new SparseIntArray();
        this.OooOOOO = new OooO0O0(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OooOoo0() {
        this.OooO0oO = true;
        FileObserverC1937a7.OooO0O0.OooO00o();
        LY.OooO00o.OooO0OO(O30.class).OooO0o0(new O30(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 OooOo(C3366ne0 c3366ne0, OperateHideDialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3366ne0.Oooo0();
        return C7028ze0.OooO00o;
    }

    private final InterfaceC2838ie OooOo0(final Activity activity, FragmentManager fragmentManager, List list) {
        return OperateHideDialog.OooOoOO.OooO00o(fragmentManager, false, list.size(), this.OooO0O0, new L2() { // from class: ambercore.je0
            @Override // ambercore.L2
            public final Object invoke(Object obj) {
                return C3366ne0.OooOo0O(this.OooOO0O, (OperateHideDialog) obj);
            }
        }, new P2() { // from class: ambercore.ke0
            @Override // ambercore.P2
            public final Object invoke(Object obj, Object obj2) {
                return C3366ne0.OooOo0o(this.OooOO0O, activity, (OperateHideDialog) obj, ((Boolean) obj2).booleanValue());
            }
        }, new L2() { // from class: ambercore.le0
            @Override // ambercore.L2
            public final Object invoke(Object obj) {
                return C3366ne0.OooOo(this.OooOO0O, (OperateHideDialog) obj);
            }
        });
    }

    private final void OooOo00() {
        H5.OooO00o("unhide", this.OooO);
        this.OooO00o.OooOoo(this.OooOO0o == null ? "original" : "hideu", this.OooOO0O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 OooOo0O(C3366ne0 c3366ne0, OperateHideDialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3366ne0.OooOoo0();
        return C7028ze0.OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 OooOo0o(C3366ne0 c3366ne0, Activity activity, OperateHideDialog operateHideDialog, boolean z) {
        C2088be0 c2088be0OooOoO;
        Intrinsics.checkNotNullParameter(operateHideDialog, "<unused var>");
        c3366ne0.OooOoo0();
        c3366ne0.OooOo00();
        if (T80.OooOO0O() || (c2088be0OooOoO = c3366ne0.OooOoO()) == null || !c2088be0OooOoO.OooOOo(activity) || !z) {
            InterfaceC2838ie interfaceC2838ie = c3366ne0.OooOOO;
            if (interfaceC2838ie != null) {
                interfaceC2838ie.dismiss();
            }
            c3366ne0.OooOOO = null;
        } else {
            C2088be0 c2088be0OooOoO2 = c3366ne0.OooOoO();
            if (c2088be0OooOoO2 != null) {
                c2088be0OooOoO2.OooOoOO(activity);
            }
        }
        return C7028ze0.OooO00o;
    }

    private final C2088be0 OooOoO() {
        return (C2088be0) this.OooO0Oo.getValue();
    }

    private final void OooOoo(Activity activity, FragmentManager fragmentManager, List list) {
        LY.OooO00o.OooO0OO(O30.class).OooO0o0(new O30(true));
        FileObserverC1937a7.OooO0O0.OooO0O0();
        this.OooO00o.OoooO();
        InterfaceC2205ck interfaceC2205ck = this.OooO0oo;
        if (interfaceC2205ck != null) {
            InterfaceC2205ck.OooO00o.OooO00o(interfaceC2205ck, null, 1, null);
        }
        this.OooOOO0 = list;
        InterfaceC2838ie interfaceC2838ieOooOo0 = OooOo0(activity, fragmentManager, list);
        this.OooOOO = interfaceC2838ieOooOo0;
        if (interfaceC2838ieOooOo0 != null) {
            interfaceC2838ieOooOo0.o0O0O00(activity, fragmentManager);
        }
    }

    public static /* synthetic */ void OooOooo(C3366ne0 c3366ne0, Activity activity, FragmentManager fragmentManager, List list, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        c3366ne0.OooOooO(activity, fragmentManager, list, z);
    }

    private final void Oooo0() {
        List list = this.OooOOO0;
        if (list == null) {
            return;
        }
        C4317oO00o0O.OooO00o.o000oOoO(list.size());
        this.OooO0oo = AbstractC4506oO0oo0OO.OooO0Oo(this.OooO0o0, C5469ooOO00O.OooO0O0(), null, new OooO0OO(list, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 Oooo000(C3366ne0 c3366ne0, Activity activity, FragmentManager fragmentManager, List list, UnHideEnsureDialog.OooO0OO pathBean) {
        Intrinsics.checkNotNullParameter(pathBean, "pathBean");
        c3366ne0.OooOO0o = pathBean.OooO0O0();
        c3366ne0.OooOoo(activity, fragmentManager, list);
        return C7028ze0.OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 Oooo00O(C3366ne0 c3366ne0, Activity activity, FragmentManager fragmentManager, List list, UnHideEnsureDialog.OooO0OO pathBean) {
        Intrinsics.checkNotNullParameter(pathBean, "pathBean");
        c3366ne0.OooOO0o = pathBean.OooO0O0();
        c3366ne0.OooOoo(activity, fragmentManager, list);
        return C7028ze0.OooO00o;
    }

    public final void OooOoO0() {
        C2088be0 c2088be0OooOoO;
        AbstractC4999oOooo0O.OooO0o(this.OooO0o0, null, 1, null);
        InterfaceC2838ie interfaceC2838ie = this.OooOOO;
        if (interfaceC2838ie != null) {
            interfaceC2838ie.dismiss();
        }
        this.OooOOO0 = null;
        if (this.OooO0OO && (c2088be0OooOoO = OooOoO()) != null) {
            c2088be0OooOoO.OooOo0o();
        }
        this.OooOOO = null;
    }

    public final void OooOooO(final Activity activity, final FragmentManager fragmentManager, final List files, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(files, "files");
        if (!files.isEmpty() && this.OooO0oO) {
            if (!AbstractC4999oOooo0O.OooO(this.OooO0o0)) {
                this.OooO0o0 = AbstractC4999oOooo0O.OooO0O0();
            }
            if (z) {
                UnHideApkDialog unHideApkDialogOooO00o = (UnHideApkDialog) fragmentManager.findFragmentByTag("UnHideApkDialog");
                if (unHideApkDialogOooO00o == null) {
                    unHideApkDialogOooO00o = UnHideApkDialog.OooOOoo.OooO00o(activity, this.OooO0O0, new L2() { // from class: ambercore.ge0
                        @Override // ambercore.L2
                        public final Object invoke(Object obj) {
                            return C3366ne0.Oooo000(this.OooOO0O, activity, fragmentManager, files, (UnHideEnsureDialog.OooO0OO) obj);
                        }
                    });
                }
                unHideApkDialogOooO00o.o00000oo(activity, fragmentManager, "UnHideApkDialog");
            } else {
                UnHideEnsureDialog unHideEnsureDialogOooO00o = (UnHideEnsureDialog) fragmentManager.findFragmentByTag("UnHideEnsureDialog");
                if (unHideEnsureDialogOooO00o == null) {
                    unHideEnsureDialogOooO00o = UnHideEnsureDialog.OooOo00.OooO00o(activity, this.OooO0O0, new L2() { // from class: ambercore.he0
                        @Override // ambercore.L2
                        public final Object invoke(Object obj) {
                            return C3366ne0.Oooo00O(this.OooOO0O, activity, fragmentManager, files, (UnHideEnsureDialog.OooO0OO) obj);
                        }
                    });
                }
                unHideEnsureDialogOooO00o.o00000oo(activity, fragmentManager, "UnHideEnsureDialog");
            }
            OooOoOO(activity);
        }
    }

    private final void OooOoOO(Activity activity) {
        if (!T80.OooOO0O() && !com.calculator.hideu.ad.window.OooO0O0.OooO0OO.OooO0O0() && !C3474o000Oo0o.OooO0O0.OooOo00()) {
            C2088be0 c2088be0OooOoO = OooOoO();
            if (c2088be0OooOoO != null) {
                c2088be0OooOoO.OooOoO0(new OooO00o());
            }
            C2088be0 c2088be0OooOoO2 = OooOoO();
            if (c2088be0OooOoO2 != null) {
                c2088be0OooOoO2.OooOo0O(activity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2088be0 Oooo00o(C3366ne0 c3366ne0) {
        if (T80.OooOO0O()) {
            return null;
        }
        c3366ne0.OooO0OO = true;
        return new C2088be0();
    }

    public /* synthetic */ C3366ne0(InterfaceC2698hE interfaceC2698hE, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2698hE, (i & 2) != 0 ? false : z);
    }
}
