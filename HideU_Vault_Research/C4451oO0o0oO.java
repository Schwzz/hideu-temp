package ambercore;

import ambercore.C4451oO0o0oO;
import android.app.Activity;
import android.content.Context;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import com.amber.hideu.browser.R$string;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: ambercore.oO0o0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4451oO0o0oO implements DownloadListener {
    public static final OooO00o OooOOO0 = new OooO00o(null);
    private final Context OooOO0O;
    private final A2 OooOO0o;

    /* JADX INFO: renamed from: ambercore.oO0o0oO$OooO00o */
    public static final class OooO00o {
        public /* synthetic */ OooO00o(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OooO00o() {
        }
    }

    /* JADX INFO: renamed from: ambercore.oO0o0oO$OooO0O0 */
    static final class OooO0O0 extends ContinuationImpl {
        Object OooOO0O;
        long OooOO0o;
        /* synthetic */ Object OooOOO;
        boolean OooOOO0;
        int OooOOOo;

        OooO0O0(InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            super(interfaceC4966oOooO0O0);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.OooOOO = obj;
            this.OooOOOo |= Integer.MIN_VALUE;
            return C4451oO0o0oO.this.OooO0oO(null, null, null, 0L, false, this);
        }
    }

    /* JADX INFO: renamed from: ambercore.oO0o0oO$OooO0OO */
    static final class OooO0OO extends SuspendLambda implements P2 {
        int OooOO0O;
        final /* synthetic */ String OooOO0o;
        final /* synthetic */ String OooOOO;
        final /* synthetic */ String OooOOO0;
        final /* synthetic */ C4451oO0o0oO OooOOOO;

        /* JADX INFO: renamed from: ambercore.oO0o0oO$OooO0OO$OooO00o */
        static final class OooO00o extends SuspendLambda implements P2 {
            int OooOO0O;
            final /* synthetic */ C4451oO0o0oO OooOO0o;

            @Override // ambercore.P2
            public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                return ((OooO00o) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            OooO00o(C4451oO0o0oO c4451oO0o0oO, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                super(2, interfaceC4966oOooO0O0);
                this.OooOO0o = c4451oO0o0oO;
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
                    this.OooOO0o.OooOO0o.invoke();
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
        OooO0OO(String str, String str2, String str3, C4451oO0o0oO c4451oO0o0oO, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            super(2, interfaceC4966oOooO0O0);
            this.OooOO0o = str;
            this.OooOOO0 = str2;
            this.OooOOO = str3;
            this.OooOOOO = c4451oO0o0oO;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return new OooO0OO(this.OooOO0o, this.OooOOO0, this.OooOOO, this.OooOOOO, interfaceC4966oOooO0O0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
        
            if (ambercore.AbstractC4505oO0oo0O0.OooO0oO(r0, r1, r15) == r13) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                java.lang.Object r13 = kotlin.coroutines.intrinsics.OooO00o.OooO0o()
                int r0 = r15.OooOO0O
                r14 = 2
                r1 = 1
                if (r0 == 0) goto L1e
                if (r0 == r1) goto L1a
                if (r0 != r14) goto L12
                kotlin.OooO0OO.OooO0O0(r16)
                goto L6d
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1a:
                kotlin.OooO0OO.OooO0O0(r16)
                goto L58
            L1e:
                kotlin.OooO0OO.OooO0O0(r16)
                ambercore.Q60$OooO00o r0 = ambercore.Q60.OooOoo0
                java.lang.String r2 = r15.OooOO0o
                ambercore.d40 r3 = ambercore.C2247d40.OooO00o
                java.io.File r3 = r3.OooO0oo()
                java.lang.String r3 = r3.getAbsolutePath()
                java.lang.String r4 = "getAbsolutePath(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                r4 = r2
                r2 = r3
                java.lang.String r3 = r15.OooOOO0
                ambercore.oO00O0OO$OooO00o r5 = ambercore.oO00O0OO.OooO0O0
                java.lang.String r6 = r15.OooOOO
                if (r6 != 0) goto L40
                java.lang.String r6 = ""
            L40:
                int r5 = r5.OooO00o(r6)
                r15.OooOO0O = r1
                r1 = r4
                r4 = r5
                r5 = 7
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = 448(0x1c0, float:6.28E-43)
                r12 = 0
                r10 = r15
                java.lang.Object r0 = ambercore.Q60.OooO00o.OooO0O0(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r0 != r13) goto L58
                goto L6c
            L58:
                ambercore.Ks r0 = ambercore.C5469ooOO00O.OooO0OO()
                ambercore.oO0o0oO$OooO0OO$OooO00o r1 = new ambercore.oO0o0oO$OooO0OO$OooO00o
                ambercore.oO0o0oO r2 = r15.OooOOOO
                r3 = 0
                r1.<init>(r2, r3)
                r15.OooOO0O = r14
                java.lang.Object r0 = ambercore.AbstractC4505oO0oo0O0.OooO0oO(r0, r1, r15)
                if (r0 != r13) goto L6d
            L6c:
                return r13
            L6d:
                ambercore.ze0 r0 = ambercore.C7028ze0.OooO00o
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ambercore.C4451oO0o0oO.OooO0OO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ambercore.oO0o0oO$OooO0Oo, reason: case insensitive filesystem */
    static final class C4452OooO0Oo extends SuspendLambda implements P2 {
        int OooOO0O;
        final /* synthetic */ String OooOO0o;
        final /* synthetic */ String OooOOO;
        final /* synthetic */ String OooOOO0;
        final /* synthetic */ String OooOOOO;
        final /* synthetic */ C4451oO0o0oO OooOOOo;
        final /* synthetic */ long OooOOo0;

        /* JADX INFO: renamed from: ambercore.oO0o0oO$OooO0Oo$OooO00o */
        static final class OooO00o extends SuspendLambda implements P2 {
            int OooOO0O;
            final /* synthetic */ C4451oO0o0oO OooOO0o;
            final /* synthetic */ long OooOOO;
            final /* synthetic */ String OooOOO0;
            final /* synthetic */ Ref.ObjectRef OooOOOO;
            final /* synthetic */ String OooOOOo;

            @Override // ambercore.P2
            public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                return ((OooO00o) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            OooO00o(C4451oO0o0oO c4451oO0o0oO, String str, long j, Ref.ObjectRef objectRef, String str2, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                super(2, interfaceC4966oOooO0O0);
                this.OooOO0o = c4451oO0o0oO;
                this.OooOOO0 = str;
                this.OooOOO = j;
                this.OooOOOO = objectRef;
                this.OooOOOo = str2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final C7028ze0 OooO0oo(C4451oO0o0oO c4451oO0o0oO, Context context, String str, long j, Ref.ObjectRef objectRef, String str2) {
                String str3 = (String) objectRef.element;
                Intrinsics.checkNotNull(str2);
                c4451oO0o0oO.OooO0oo((Activity) context, str, j, str3, str2);
                return C7028ze0.OooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                return new OooO00o(this.OooOO0o, this.OooOOO0, this.OooOOO, this.OooOOOO, this.OooOOOo, interfaceC4966oOooO0O0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.OooO00o.OooO0o();
                if (this.OooOO0O == 0) {
                    kotlin.OooO0OO.OooO0O0(obj);
                    final Context context = this.OooOO0o.OooOO0O;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (AbstractC3461o000O0oo.OooO0O0(activity)) {
                            C2247d40 c2247d40 = C2247d40.OooO00o;
                            if (!c2247d40.OooOO0o()) {
                                Context context2 = this.OooOO0o.OooOO0O;
                                final C4451oO0o0oO c4451oO0o0oO = this.OooOO0o;
                                final String str = this.OooOOO0;
                                final long j = this.OooOOO;
                                final Ref.ObjectRef objectRef = this.OooOOOO;
                                final String str2 = this.OooOOOo;
                                C2247d40.OooOOo(c2247d40, context2, new A2() { // from class: ambercore.oO0o0ooO
                                    @Override // ambercore.A2
                                    public final Object invoke() {
                                        return C4451oO0o0oO.C4452OooO0Oo.OooO00o.OooO0oo(c4451oO0o0oO, context, str, j, objectRef, str2);
                                    }
                                }, null, 4, null);
                            } else {
                                C4451oO0o0oO c4451oO0o0oO2 = this.OooOO0o;
                                String str3 = this.OooOOO0;
                                long j2 = this.OooOOO;
                                String str4 = (String) this.OooOOOO.element;
                                String str5 = this.OooOOOo;
                                Intrinsics.checkNotNull(str5);
                                c4451oO0o0oO2.OooO0oo(activity, str3, j2, str4, str5);
                            }
                        }
                    }
                    return C7028ze0.OooO00o;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // ambercore.P2
        public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return ((C4452OooO0Oo) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4452OooO0Oo(String str, String str2, String str3, String str4, C4451oO0o0oO c4451oO0o0oO, long j, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            super(2, interfaceC4966oOooO0O0);
            this.OooOO0o = str;
            this.OooOOO0 = str2;
            this.OooOOO = str3;
            this.OooOOOO = str4;
            this.OooOOOo = c4451oO0o0oO;
            this.OooOOo0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return new C4452OooO0Oo(this.OooOO0o, this.OooOOO0, this.OooOOO, this.OooOOOO, this.OooOOOo, this.OooOOo0, interfaceC4966oOooO0O0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strOooO0O0;
            T t;
            String strGuessFileName;
            Object objOooO0o = kotlin.coroutines.intrinsics.OooO00o.OooO0o();
            int i = this.OooOO0O;
            if (i != 0) {
                if (i == 1) {
                    kotlin.OooO0OO.OooO0O0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.OooO0OO.OooO0O0(obj);
                C4951oOoo0o0O c4951oOoo0o0OOooO00o = C2893j6.OooO00o.OooO00o(this.OooOO0o);
                if (c4951oOoo0o0OOooO00o != null) {
                    strOooO0O0 = c4951oOoo0o0OOooO00o.OooO0O0();
                } else {
                    strOooO0O0 = null;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                if (strOooO0O0 == null) {
                    t = this.OooOOO0;
                } else {
                    t = strOooO0O0;
                }
                objectRef.element = t;
                if (Intrinsics.areEqual(t, "application/octet-stream")) {
                    Fm0 fm0 = Fm0.OooO00o;
                    strGuessFileName = fm0.OooO0o0(this.OooOO0o);
                    if (strGuessFileName == null) {
                        strGuessFileName = fm0.OooO(this.OooOOO);
                    }
                    if (strGuessFileName != null) {
                        objectRef.element = oO0000OO.OooO00o.OooO0O0(strGuessFileName);
                    }
                } else {
                    strGuessFileName = null;
                }
                C3949o0Ooo0O.OooO0OO("BrowserDownloadListener", "onDownloadStart: amber url:" + this.OooOOOO + ", type:" + this.OooOOO0 + ", origin contentType:" + strOooO0O0 + ", contentType:" + ((String) objectRef.element), null, 4, null);
                if (strGuessFileName == null) {
                    strGuessFileName = URLUtil.guessFileName(this.OooOOOO, this.OooOOO, (String) objectRef.element);
                }
                AbstractC1285Ks abstractC1285KsOooO0OO = C5469ooOO00O.OooO0OO();
                OooO00o oooO00o = new OooO00o(this.OooOOOo, this.OooOOOO, this.OooOOo0, objectRef, strGuessFileName, null);
                this.OooOO0O = 1;
                if (AbstractC4505oO0oo0O0.OooO0oO(abstractC1285KsOooO0OO, oooO00o, this) == objOooO0o) {
                    return objOooO0o;
                }
            }
            return C7028ze0.OooO00o;
        }
    }

    /* JADX INFO: renamed from: ambercore.oO0o0oO$OooO0o0, reason: case insensitive filesystem */
    static final class C4453OooO0o0 extends SuspendLambda implements P2 {
        int OooOO0O;
        final /* synthetic */ String OooOOO;
        final /* synthetic */ String OooOOO0;
        final /* synthetic */ String OooOOOO;
        final /* synthetic */ long OooOOOo;
        final /* synthetic */ boolean OooOOo0;

        @Override // ambercore.P2
        public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return ((C4453OooO0o0) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4453OooO0o0(String str, String str2, String str3, long j, boolean z, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            super(2, interfaceC4966oOooO0O0);
            this.OooOOO0 = str;
            this.OooOOO = str2;
            this.OooOOOO = str3;
            this.OooOOOo = j;
            this.OooOOo0 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return C4451oO0o0oO.this.new C4453OooO0o0(this.OooOOO0, this.OooOOO, this.OooOOOO, this.OooOOOo, this.OooOOo0, interfaceC4966oOooO0O0);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOooO0o = kotlin.coroutines.intrinsics.OooO00o.OooO0o();
            int i = this.OooOO0O;
            if (i != 0) {
                if (i == 1) {
                    kotlin.OooO0OO.OooO0O0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.OooO0OO.OooO0O0(obj);
                C4451oO0o0oO c4451oO0o0oO = C4451oO0o0oO.this;
                String str = this.OooOOO0;
                String str2 = this.OooOOO;
                String str3 = this.OooOOOO;
                long j = this.OooOOOo;
                boolean z = this.OooOOo0;
                this.OooOO0O = 1;
                if (c4451oO0o0oO.OooO0oO(str, str2, str3, j, z, this) == objOooO0o) {
                    return objOooO0o;
                }
            }
            return C7028ze0.OooO00o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 OooO(Activity activity, final long j, final C4451oO0o0oO c4451oO0o0oO, final String str, final String str2, final String str3, boolean z) {
        if (z) {
            C5565ooOOoo00 c5565ooOOoo00OooO0OO = C5565ooOOoo00.OooO0oO.OooO0OO();
            boolean z2 = c5565ooOOoo00OooO0OO != null && c5565ooOOoo00OooO0OO.OooOOOO();
            if (LA.OooO00o(activity) != 1 || z2) {
                c4451oO0o0oO.OooOO0O(str, str2, str3, j, z2);
            } else {
                String string = activity.getString(R$string.data_usage_detail, Kg0.OooO00o.OooO0O0(activity, Long.valueOf(j)));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                final boolean z3 = z2;
                new DialogC4908oOoOoO00(activity, R$string.data_usage_warning, string, R$string.waiting_for_wifi_title, R$string.download, new L2() { // from class: ambercore.oO0o0oO0
                    @Override // ambercore.L2
                    public final Object invoke(Object obj) {
                        return C4451oO0o0oO.OooOO0(this.OooOO0O, str, str2, str3, j, z3, ((Boolean) obj).booleanValue());
                    }
                }).show();
            }
        }
        return C7028ze0.OooO00o;
    }

    public C4451oO0o0oO(Context mContext, A2 waitWifi) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(waitWifi, "waitWifi");
        this.OooOO0O = mContext;
        this.OooOO0o = waitWifi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        if (r0.OooOO0(r4, r14) == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0oO(java.lang.String r19, java.lang.String r20, java.lang.String r21, long r22, boolean r24, ambercore.InterfaceC4966oOooO0O0 r25) {
        /*
            r18 = this;
            r0 = r21
            r1 = r25
            boolean r2 = r1 instanceof ambercore.C4451oO0o0oO.OooO0O0
            if (r2 == 0) goto L1a
            r2 = r1
            ambercore.oO0o0oO$OooO0O0 r2 = (ambercore.C4451oO0o0oO.OooO0O0) r2
            int r3 = r2.OooOOOo
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.OooOOOo = r3
            r3 = r18
        L18:
            r14 = r2
            goto L22
        L1a:
            ambercore.oO0o0oO$OooO0O0 r2 = new ambercore.oO0o0oO$OooO0O0
            r3 = r18
            r2.<init>(r1)
            goto L18
        L22:
            java.lang.Object r1 = r14.OooOOO
            java.lang.Object r2 = kotlin.coroutines.intrinsics.OooO00o.OooO0o()
            int r4 = r14.OooOOOo
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L57
            if (r4 == r6) goto L3f
            if (r4 != r5) goto L37
            kotlin.OooO0OO.OooO0O0(r1)
            goto Lc5
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            boolean r0 = r14.OooOOO0
            long r7 = r14.OooOO0o
            java.lang.Object r4 = r14.OooOO0O
            java.lang.String r4 = (java.lang.String) r4
            kotlin.OooO0OO.OooO0O0(r1)
            r17 = r4
            r4 = r0
            r0 = r17
            r17 = r5
            r5 = r1
            r1 = r17
            r17 = r6
            goto L9a
        L57:
            kotlin.OooO0OO.OooO0O0(r1)
            ambercore.oO00O0OO$OooO00o r1 = ambercore.oO00O0OO.OooO0O0
            int r8 = r1.OooO00o(r0)
            ambercore.Q60$OooO00o r4 = ambercore.Q60.OooOoo0
            ambercore.d40 r1 = ambercore.C2247d40.OooO00o
            java.io.File r1 = r1.OooO0oo()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r7 = "getAbsolutePath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
            r14.OooOO0O = r0
            r9 = r22
            r14.OooOO0o = r9
            r7 = r24
            r14.OooOOO0 = r7
            r14.OooOOOo = r6
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 496(0x1f0, float:6.95E-43)
            r16 = 0
            r7 = r20
            r17 = r6
            r6 = r1
            r1 = r5
            r5 = r19
            java.lang.Object r4 = ambercore.Q60.OooO00o.OooO0O0(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r4 != r2) goto L95
            goto Lc4
        L95:
            r7 = r22
            r5 = r4
            r4 = r24
        L9a:
            ambercore.Q60 r5 = (ambercore.Q60) r5
            if (r0 == 0) goto La1
            r5.OooOo0(r0)
        La1:
            r5.OooOo(r7)
            ambercore.oO0oO00o r0 = ambercore.C4464oO0oO00o.OooO00o
            java.lang.String r6 = r5.OooO0O0()
            long r7 = r5.OooOOOo()
            r4 = r4 ^ 1
            r0.Oooo(r6, r7, r4)
            ambercore.ooOOoo00$OooO00o r0 = ambercore.C5565ooOOoo00.OooO0oO
            long r4 = r5.OooO()
            r6 = 0
            r14.OooOO0O = r6
            r14.OooOOOo = r1
            java.lang.Object r0 = r0.OooOO0(r4, r14)
            if (r0 != r2) goto Lc5
        Lc4:
            return r2
        Lc5:
            ambercore.ze0 r0 = ambercore.C7028ze0.OooO00o
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ambercore.C4451oO0o0oO.OooO0oO(java.lang.String, java.lang.String, java.lang.String, long, boolean, ambercore.oOooO0O0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 OooOO0(C4451oO0o0oO c4451oO0o0oO, String str, String str2, String str3, long j, boolean z, boolean z2) {
        C4464oO0oO00o.OooO00o.OooOoo0(z2);
        if (z2) {
            c4451oO0o0oO.OooOO0O(str, str2, str3, j, z);
        } else {
            AbstractC4506oO0oo0OO.OooO0Oo(AbstractC4999oOooo0O.OooO00o(C5469ooOO00O.OooO0O0()), null, null, new OooO0OO(str, str2, str3, c4451oO0o0oO, null), 3, null);
        }
        return C7028ze0.OooO00o;
    }

    private final void OooOO0O(String str, String str2, String str3, long j, boolean z) {
        if (str != null) {
            AbstractC4506oO0oo0OO.OooO0Oo(AbstractC4999oOooo0O.OooO00o(C5469ooOO00O.OooO0O0()), null, null, new C4453OooO0o0(str, str2, str3, j, z, null), 3, null);
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            AbstractC4506oO0oo0OO.OooO0Oo(AbstractC4999oOooo0O.OooO00o(C5469ooOO00O.OooO0O0()), null, null, new C4452OooO0Oo(str, str4, str3, str, this, j, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OooO0oo(final Activity activity, final String str, final long j, final String str2, final String str3) {
        String string = activity.getResources().getString(R$string.browser_download_title, str3);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        new DialogC4908oOoOoO00(activity, string, null, null, null, new L2() { // from class: ambercore.oO0o0o0o
            @Override // ambercore.L2
            public final Object invoke(Object obj) {
                return C4451oO0o0oO.OooO(activity, j, this, str, str3, str2, ((Boolean) obj).booleanValue());
            }
        }, 28, null).show();
    }
}
