package ambercore;

import ambercore.C2258dA;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.amber.hideu.base.model.R$dimen;
import com.amber.hideu.browser.R$color;
import com.amber.hideu.browser.R$drawable;
import com.amber.hideu.browser.R$id;
import com.amber.hideu.browser.R$string;
import com.amber.hideu.browser.ui.home.DragFloatingActionButton;
import com.google.android.material.badge.BadgeDrawable;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Sl0 {
    public static final OooO00o OooO = new OooO00o(null);
    private final long OooO00o;
    private String OooO0O0;
    private String OooO0OO;
    private boolean OooO0Oo;
    private boolean OooO0o = true;
    private Sl0 OooO0o0;
    private View OooO0oO;
    private C5957pU OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: ambercore.Sl0$OooO00o$OooO00o, reason: collision with other inner class name */
        static final class C0016OooO00o extends SuspendLambda implements P2 {
            int OooOO0O;
            final /* synthetic */ Context OooOO0o;
            final /* synthetic */ Sl0 OooOOO;
            final /* synthetic */ String OooOOO0;

            @Override // ambercore.P2
            public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                return ((C0016OooO00o) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0016OooO00o(Context context, String str, Sl0 sl0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                super(2, interfaceC4966oOooO0O0);
                this.OooOO0o = context;
                this.OooOOO0 = str;
                this.OooOOO = sl0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
                return new C0016OooO00o(this.OooOO0o, this.OooOOO0, this.OooOOO, interfaceC4966oOooO0O0);
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
                    C2258dA c2258dAOooO00o = C2258dA.OooO0O0.OooO00o(this.OooOO0o);
                    C1720Tz c1720Tz = new C1720Tz(C4440oO0o0OO0.OooO00o.OooO0O0().OooO0OO(), null, 0, 6, null);
                    this.OooOO0O = 1;
                    obj = c2258dAOooO00o.OooO0oo(c1720Tz, this);
                    if (obj == objOooO0o) {
                        return objOooO0o;
                    }
                }
                Sl0 sl0 = new Sl0(((Number) obj).longValue());
                sl0.OooO0OO(this.OooOO0o);
                sl0.OooOo0o(this.OooOOO0);
                sl0.OooOOo(this.OooOOO);
                return sl0;
            }
        }

        public /* synthetic */ OooO00o(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OooO00o() {
        }

        public static /* synthetic */ Object OooO0O0(OooO00o oooO00o, Context context, String str, Sl0 sl0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                sl0 = null;
            }
            return oooO00o.OooO00o(context, str, sl0, interfaceC4966oOooO0O0);
        }

        public final Object OooO00o(Context context, String str, Sl0 sl0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return AbstractC4505oO0oo0O0.OooO0oO(C5469ooOO00O.OooO0OO(), new C0016OooO00o(context, str, sl0, null), interfaceC4966oOooO0O0);
        }
    }

    static final class OooO0O0 extends SuspendLambda implements P2 {
        int OooOO0O;

        @Override // ambercore.P2
        public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return ((OooO0O0) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
        }

        OooO0O0(InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            super(2, interfaceC4966oOooO0O0);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return Sl0.this.new OooO0O0(interfaceC4966oOooO0O0);
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
                C2258dA.OooO00o oooO00o = C2258dA.OooO0O0;
                Context contextOooO00o = C4963oOooO000.OooO0O0().OooO00o();
                Intrinsics.checkNotNullExpressionValue(contextOooO00o, "getContext(...)");
                C2258dA c2258dAOooO00o = oooO00o.OooO00o(contextOooO00o);
                long jOooOO0 = Sl0.this.OooOO0();
                this.OooOO0O = 1;
                if (c2258dAOooO00o.OooO0Oo(jOooOO0, this) == objOooO0o) {
                    return objOooO0o;
                }
            }
            File file = new File(C2247d40.OooO00o.OooO() + '/' + Sl0.this.OooOO0() + ".j");
            if (file.exists()) {
                file.delete();
            }
            return C7028ze0.OooO00o;
        }
    }

    static final class OooO0OO extends SuspendLambda implements P2 {
        int OooOO0O;
        final /* synthetic */ RecyclerView OooOOO0;

        @Override // ambercore.P2
        public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return ((OooO0OO) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        OooO0OO(RecyclerView recyclerView, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            super(2, interfaceC4966oOooO0O0);
            this.OooOOO0 = recyclerView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return Sl0.this.new OooO0OO(this.OooOOO0, interfaceC4966oOooO0O0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        
            if (r5 == r0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
        
            if (r5 == r0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.OooO00o.OooO0o()
                int r1 = r4.OooOO0O
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1f
                if (r1 == r2) goto L1b
                if (r1 != r3) goto L13
                kotlin.OooO0OO.OooO0O0(r5)
                goto L9b
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                kotlin.OooO0OO.OooO0O0(r5)
                goto L49
            L1f:
                kotlin.OooO0OO.OooO0O0(r5)
                ambercore.Sl0 r5 = ambercore.Sl0.this
                boolean r5 = r5.OooOOOo()
                r1 = 0
                if (r5 == 0) goto L54
                androidx.recyclerview.widget.RecyclerView r5 = r4.OooOOO0
                int r3 = com.amber.hideu.browser.R$id.tag_bitmap
                java.lang.Object r5 = r5.getTag(r3)
                boolean r3 = r5 instanceof android.graphics.Bitmap
                if (r3 == 0) goto L3a
                r1 = r5
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            L3a:
                if (r1 != 0) goto L4c
                ambercore.iA r5 = ambercore.C2799iA.OooO00o
                r4.OooOO0O = r2
                java.lang.String r1 = "home"
                java.lang.Object r5 = r5.OooO00o(r1, r4)
                if (r5 != r0) goto L49
                goto L9a
            L49:
                r1 = r5
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            L4c:
                androidx.recyclerview.widget.RecyclerView r5 = r4.OooOOO0
                int r0 = com.amber.hideu.browser.R$id.tag_bitmap
                r5.setTag(r0, r1)
                goto Lab
            L54:
                ambercore.Sl0 r5 = ambercore.Sl0.this
                boolean r5 = r5.OooO0oo()
                if (r5 == 0) goto L69
                ambercore.iA r5 = ambercore.C2799iA.OooO00o
                ambercore.Sl0 r2 = ambercore.Sl0.this
                android.view.View r2 = ambercore.Sl0.OooO00o(r2)
                android.graphics.Bitmap r5 = ambercore.C2799iA.OooO0OO(r5, r2, r1, r3, r1)
                goto L6a
            L69:
                r5 = r1
            L6a:
                if (r5 != 0) goto L84
                ambercore.Sl0 r5 = ambercore.Sl0.this
                android.view.View r5 = ambercore.Sl0.OooO00o(r5)
                if (r5 == 0) goto L7b
                int r2 = com.amber.hideu.browser.R$id.tag_bitmap
                java.lang.Object r5 = r5.getTag(r2)
                goto L7c
            L7b:
                r5 = r1
            L7c:
                boolean r2 = r5 instanceof android.graphics.Bitmap
                if (r2 == 0) goto L83
                r1 = r5
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            L83:
                r5 = r1
            L84:
                if (r5 != 0) goto L9d
                ambercore.iA r5 = ambercore.C2799iA.OooO00o
                ambercore.Sl0 r1 = ambercore.Sl0.this
                long r1 = r1.OooOO0()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r4.OooOO0O = r3
                java.lang.Object r5 = r5.OooO00o(r1, r4)
                if (r5 != r0) goto L9b
            L9a:
                return r0
            L9b:
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L9d:
                r1 = r5
                ambercore.Sl0 r5 = ambercore.Sl0.this
                android.view.View r5 = ambercore.Sl0.OooO00o(r5)
                if (r5 == 0) goto Lab
                int r0 = com.amber.hideu.browser.R$id.tag_bitmap
                r5.setTag(r0, r1)
            Lab:
                if (r1 != 0) goto Lba
                androidx.recyclerview.widget.RecyclerView r5 = r4.OooOOO0
                android.content.res.Resources r5 = r5.getResources()
                int r0 = com.amber.hideu.browser.R$drawable.browser2_shape_radius_8_313743_bottom
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeResource(r5, r0)
                return r5
            Lba:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ambercore.Sl0.OooO0OO.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final Bitmap OooO0Oo(Context context, int i) {
        Bitmap bitmapCreateBitmap = null;
        try {
            try {
                Drawable drawable = ContextCompat.getDrawable(context, i);
                if (drawable == null) {
                    return null;
                }
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNull(bitmapCreateBitmap);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable unused) {
        }
        return bitmapCreateBitmap;
    }

    public final void OooO0o0(boolean z) {
        if (z) {
            AbstractC4506oO0oo0OO.OooO0Oo(D4.OooOO0O, null, null, new OooO0O0(null), 3, null);
        }
        View view = this.OooO0oO;
        if (view != null) {
            view.setTag(R$id.tag_bitmap, null);
        }
        C5957pU c5957pU = this.OooO0oo;
        if (c5957pU != null) {
            c5957pU.destroy();
        }
        this.OooO0o0 = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Sl0) && this.OooO00o == ((Sl0) obj).OooO00o;
    }

    private final View OooOOOO(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C5957pU c5957pU = new C5957pU(context);
        this.OooO0oo = c5957pU;
        c5957pU.setId(R$id.browser_webview);
        c5957pU.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(c5957pU);
        View ca = new CA(context, null, 0, 6, null);
        ca.setId(R$id.network_error_view);
        ca.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ca.setVisibility(8);
        frameLayout.addView(ca);
        DragFloatingActionButton dragFloatingActionButton = new DragFloatingActionButton(context, null, 0, 6, null);
        dragFloatingActionButton.setId(R$id.browser_fragment_home_sniffer);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelSize = dragFloatingActionButton.getResources().getDimensionPixelSize(R$dimen.lib_percent_24dp);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        dragFloatingActionButton.setLayoutParams(layoutParams);
        dragFloatingActionButton.setVisibility(8);
        dragFloatingActionButton.setSupportBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(context, R$color.browser2_download_bg)));
        dragFloatingActionButton.setCustomSize(dragFloatingActionButton.getResources().getDimensionPixelSize(R$dimen.lib_percent_56dp));
        Drawable drawable = AppCompatResources.getDrawable(context, R$drawable.ic_browser2_download_floating);
        if (drawable != null) {
            dragFloatingActionButton.setImageDrawable(drawable);
        }
        dragFloatingActionButton.setSupportImageTintList(ColorStateList.valueOf(-1));
        frameLayout.addView(dragFloatingActionButton);
        return frameLayout;
    }

    public final Bitmap OooO(Context context) {
        Bitmap favicon;
        Intrinsics.checkNotNullParameter(context, "context");
        if (OooOOOo()) {
            return OooO0Oo(context, R$drawable.browser2_ic_home_black);
        }
        C5957pU c5957pU = this.OooO0oo;
        return (c5957pU == null || (favicon = c5957pU.getFavicon()) == null) ? OooO0Oo(context, R$drawable.browser2_search_key_url) : favicon;
    }

    public final boolean OooO0O0() {
        Sl0 sl0 = this.OooO0o0;
        if (sl0 == null && this.OooO0O0 == null) {
            return true;
        }
        return (sl0 == null || this.OooO0o) ? false : true;
    }

    public final void OooO0OO(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.OooO0oO = OooOOOO(context);
    }

    public final Sl0 OooO0o() {
        return this.OooO0o0;
    }

    public final boolean OooO0oo() {
        return this.OooO0Oo;
    }

    public final long OooOO0() {
        return this.OooO00o;
    }

    public final View OooOO0O() {
        return this.OooO0oO;
    }

    public final String OooOO0o() {
        return this.OooO0O0;
    }

    public final C5957pU OooOOO() {
        return this.OooO0oo;
    }

    public final String OooOOO0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.OooO0Oo) {
            C5957pU c5957pU = this.OooO0oo;
            String title = c5957pU != null ? c5957pU.getTitle() : null;
            if (title == null || title.length() == 0) {
                title = this.OooO0OO;
            }
            return (title == null || title.length() == 0 || Intrinsics.areEqual(title, C4440oO0o0OO0.OooO00o.OooO0O0().OooO0OO())) ? context.getResources().getString(R$string.home_page) : title;
        }
        String str = this.OooO0OO;
        if (str == null || str.length() == 0) {
            String string = context.getResources().getString(R$string.home_page);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String str2 = this.OooO0OO;
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    public final boolean OooOOOo() {
        String url = this.OooO0O0;
        if (url == null || url.length() == 0) {
            C5957pU c5957pUOooOOO = OooOOO();
            url = c5957pUOooOOO != null ? c5957pUOooOOO.getUrl() : null;
        }
        if (url == null || url.length() == 0) {
            url = C4440oO0o0OO0.OooO00o.OooO0O0().OooO0OO();
        }
        return Intrinsics.areEqual(url, C4440oO0o0OO0.OooO00o.OooO0O0().OooO0OO());
    }

    public final void OooOOo(Sl0 sl0) {
        this.OooO0o0 = sl0;
    }

    public final boolean OooOOo0() {
        View view = this.OooO0oO;
        return (view != null ? view.getTag(R$id.tag_init) : null) != null;
    }

    public final void OooOOoo(boolean z) {
        this.OooO0Oo = z;
    }

    public final void OooOo0() {
        View view = this.OooO0oO;
        if (view != null) {
            view.setTag(R$id.tag_init, Boolean.TRUE);
        }
    }

    public final void OooOo00(boolean z) {
        this.OooO0o = z;
    }

    public final void OooOo0O(String str) {
        this.OooO0OO = str;
    }

    public final void OooOo0o(String str) {
        this.OooO0O0 = str;
    }

    public int hashCode() {
        return AbstractC6648w.OooO00o(this.OooO00o);
    }

    public String toString() {
        return "WebHolder(id=" + this.OooO00o + ')';
    }

    public Sl0(long j) {
        this.OooO00o = j;
    }

    public final Object OooO0oO(RecyclerView recyclerView, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        return AbstractC4505oO0oo0O0.OooO0oO(C5469ooOO00O.OooO0OO(), new OooO0OO(recyclerView, null), interfaceC4966oOooO0O0);
    }
}
