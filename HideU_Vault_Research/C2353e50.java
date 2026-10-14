package ambercore;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.amber.scaleimageview.ImageViewState;
import com.amber.scaleimageview.R$styleable;
import com.amber.scaleimageview.decoder.SkiaImageDecoder;
import com.amber.scaleimageview.decoder.SkiaImageRegionDecoder;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ambercore.e50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C2353e50 extends View {
    private static final String o000000 = "e50";
    private static Bitmap.Config o00000Oo;
    private Bitmap OooOO0O;
    private boolean OooOO0o;
    private Uri OooOOO;
    private boolean OooOOO0;
    private int OooOOOO;
    private Map OooOOOo;
    private int OooOOo;
    private boolean OooOOo0;
    private float OooOOoo;
    private int OooOo;
    private int OooOo0;
    private float OooOo00;
    private int OooOo0O;
    private int OooOo0o;
    private Executor OooOoO;
    private int OooOoO0;
    private boolean OooOoOO;
    private boolean OooOoo;
    private boolean OooOoo0;
    private boolean OooOooO;
    private float OooOooo;
    private int Oooo;
    private float Oooo0;
    private int Oooo000;
    private int Oooo00O;
    private float Oooo00o;
    private PointF Oooo0O0;
    private PointF Oooo0OO;
    private Float Oooo0o;
    private PointF Oooo0o0;
    private PointF Oooo0oO;
    private PointF Oooo0oo;
    private Rect OoooO;
    private int OoooO0;
    private int OoooO00;
    private Rect OoooO0O;
    private boolean OoooOO0;
    private boolean OoooOOO;
    private int OoooOOo;
    private GestureDetector OoooOo0;
    private GestureDetector OoooOoO;
    private InterfaceC1632Rf OoooOoo;
    private final ReadWriteLock Ooooo00;
    private InterfaceC5198oo0OO Ooooo0o;
    private InterfaceC5198oo0OO OooooO0;
    private PointF OooooOO;
    private float OooooOo;
    private float Oooooo;
    private final float Oooooo0;
    private boolean OoooooO;
    private PointF Ooooooo;
    private int o000OOo;
    private boolean o000oOoO;
    private C2354OooO0Oo o00O0O;
    private boolean o00Oo0;
    private boolean o00Ooo;
    private OooO o00o0O;
    private Paint o00oO0O;
    private Paint o00oO0o;
    private View.OnLongClickListener o00ooo;
    private final float o0O0O00;
    private final float[] o0OO00O;
    private Matrix o0OOO0o;
    private RectF o0Oo0oo;
    private PointF o0OoOo0;
    private Paint o0ooOO0;
    private Paint o0ooOOo;
    private OooOO0O o0ooOoO;
    private final Handler oo000o;
    private final float[] oo0o0Oo;
    private PointF ooOO;
    private static final List o000000O = Arrays.asList(0, 90, 180, 270, -1);
    private static final List o000000o = Arrays.asList(1, 2, 3);
    private static final List o00000 = Arrays.asList(2, 1);
    private static final List o00000O0 = Arrays.asList(1, 2, 3);
    private static final List o00000O = Arrays.asList(2, 1, 3, 4);
    public static final ExecutorService o00000OO = Executors.newScheduledThreadPool(3);

    /* JADX INFO: renamed from: ambercore.e50$OooO */
    public interface OooO {
        void OooO00o();

        void OooO0O0();

        void OooO0OO(Exception exc);

        void OooO0Oo(Exception exc);

        void OooO0o(Exception exc);

        void OooO0o0();
    }

    /* JADX INFO: renamed from: ambercore.e50$OooO00o */
    class OooO00o implements Handler.Callback {
        OooO00o() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1 && C2353e50.this.o00ooo != null) {
                C2353e50.this.OoooOOo = 0;
                C2353e50 c2353e50 = C2353e50.this;
                C2353e50.super.setOnLongClickListener(c2353e50.o00ooo);
                C2353e50.this.performLongClick();
                C2353e50.super.setOnLongClickListener(null);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooO0O0 */
    class OooO0O0 extends GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ Context OooOO0O;

        OooO0O0(Context context) {
            this.OooOO0O = context;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (!C2353e50.this.OooOoo || !C2353e50.this.o00Oo0 || C2353e50.this.Oooo0O0 == null) {
                return super.onDoubleTapEvent(motionEvent);
            }
            C2353e50.this.setGestureDetector(this.OooOO0O);
            if (!C2353e50.this.OooOooO) {
                C2353e50 c2353e50 = C2353e50.this;
                c2353e50.OoooOOO(c2353e50.o0000oO(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                return true;
            }
            C2353e50.this.OooooOO = new PointF(motionEvent.getX(), motionEvent.getY());
            C2353e50.this.Oooo0OO = new PointF(C2353e50.this.Oooo0O0.x, C2353e50.this.Oooo0O0.y);
            C2353e50 c2353e502 = C2353e50.this;
            c2353e502.Oooo0 = c2353e502.Oooo00o;
            C2353e50.this.OoooOOO = true;
            C2353e50.this.OoooOO0 = true;
            C2353e50.this.Oooooo = -1.0f;
            C2353e50 c2353e503 = C2353e50.this;
            c2353e503.o0OoOo0 = c2353e503.o0000oO(c2353e503.OooooOO);
            C2353e50.this.ooOO = new PointF(motionEvent.getX(), motionEvent.getY());
            C2353e50.this.Ooooooo = new PointF(C2353e50.this.o0OoOo0.x, C2353e50.this.o0OoOo0.y);
            C2353e50.this.OoooooO = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!C2353e50.this.OooOoo0 || !C2353e50.this.o00Oo0 || C2353e50.this.Oooo0O0 == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || C2353e50.this.OoooOO0))) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            PointF pointF = new PointF(C2353e50.this.Oooo0O0.x + (f * 0.25f), C2353e50.this.Oooo0O0.y + (f2 * 0.25f));
            new C2355OooO0o0(C2353e50.this, new PointF(((C2353e50.this.getWidth() / 2) - pointF.x) / C2353e50.this.Oooo00o, ((C2353e50.this.getHeight() / 2) - pointF.y) / C2353e50.this.Oooo00o), (OooO00o) null).OooO0o0(1).OooO0oo(false).OooO0oO(3).OooO0OO();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C2353e50.this.performClick();
            return true;
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooO0OO */
    class OooO0OO extends GestureDetector.SimpleOnGestureListener {
        OooO0OO() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C2353e50.this.performClick();
            return true;
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooO0Oo, reason: case insensitive filesystem */
    private static class C2354OooO0Oo {
        private boolean OooO;
        private float OooO00o;
        private float OooO0O0;
        private PointF OooO0OO;
        private PointF OooO0Oo;
        private PointF OooO0o;
        private PointF OooO0o0;
        private PointF OooO0oO;
        private long OooO0oo;
        private int OooOO0;
        private int OooOO0O;
        private long OooOO0o;

        private C2354OooO0Oo() {
            this.OooO0oo = 500L;
            this.OooO = true;
            this.OooOO0 = 2;
            this.OooOO0O = 1;
            this.OooOO0o = System.currentTimeMillis();
        }

        static /* synthetic */ InterfaceC2357OooO0oo OooO0OO(C2354OooO0Oo c2354OooO0Oo) {
            c2354OooO0Oo.getClass();
            return null;
        }

        static /* synthetic */ InterfaceC2357OooO0oo OooO0Oo(C2354OooO0Oo c2354OooO0Oo, InterfaceC2357OooO0oo interfaceC2357OooO0oo) {
            c2354OooO0Oo.getClass();
            return interfaceC2357OooO0oo;
        }

        /* synthetic */ C2354OooO0Oo(OooO00o oooO00o) {
            this();
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooO0o */
    private static class OooO0o extends AsyncTask {
        private final WeakReference OooO00o;
        private final WeakReference OooO0O0;
        private final WeakReference OooO0OO;
        private final Uri OooO0Oo;
        private Bitmap OooO0o;
        private final boolean OooO0o0;
        private Exception OooO0oO;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            try {
                String string = this.OooO0Oo.toString();
                Context context = (Context) this.OooO0O0.get();
                InterfaceC5198oo0OO interfaceC5198oo0OO = (InterfaceC5198oo0OO) this.OooO0OO.get();
                C2353e50 c2353e50 = (C2353e50) this.OooO00o.get();
                if (context == null || interfaceC5198oo0OO == null || c2353e50 == null) {
                    return null;
                }
                c2353e50.OoooOO0("BitmapLoadTask.doInBackground", new Object[0]);
                this.OooO0o = ((InterfaceC6816xf) interfaceC5198oo0OO.OooO00o()).OooO00o(context, this.OooO0Oo);
                return Integer.valueOf(c2353e50.OooooOO(context, string));
            } catch (Exception e) {
                Log.e(C2353e50.o000000, "Failed to load bitmap", e);
                this.OooO0oO = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(C2353e50.o000000, "Failed to load bitmap - OutOfMemoryError", e2);
                this.OooO0oO = new RuntimeException(e2);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            C2353e50 c2353e50 = (C2353e50) this.OooO00o.get();
            if (c2353e50 != null) {
                Bitmap bitmap = this.OooO0o;
                if (bitmap != null && num != null) {
                    if (this.OooO0o0) {
                        c2353e50.o00ooo(bitmap);
                        return;
                    } else {
                        c2353e50.o00o0O(bitmap, num.intValue(), false);
                        return;
                    }
                }
                if (this.OooO0oO == null || c2353e50.o00o0O == null) {
                    return;
                }
                if (this.OooO0o0) {
                    c2353e50.o00o0O.OooO0OO(this.OooO0oO);
                } else {
                    c2353e50.o00o0O.OooO0o(this.OooO0oO);
                }
            }
        }

        OooO0o(C2353e50 c2353e50, Context context, InterfaceC5198oo0OO interfaceC5198oo0OO, Uri uri, boolean z) {
            this.OooO00o = new WeakReference(c2353e50);
            this.OooO0O0 = new WeakReference(context);
            this.OooO0OO = new WeakReference(interfaceC5198oo0OO);
            this.OooO0Oo = uri;
            this.OooO0o0 = z;
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooO0o0, reason: case insensitive filesystem */
    public final class C2355OooO0o0 {
        private final float OooO00o;
        private final PointF OooO0O0;
        private final PointF OooO0OO;
        private long OooO0Oo;
        private int OooO0o;
        private int OooO0o0;
        private boolean OooO0oO;
        private boolean OooO0oo;

        /* synthetic */ C2355OooO0o0(C2353e50 c2353e50, float f, PointF pointF, OooO00o oooO00o) {
            this(f, pointF);
        }

        /* synthetic */ C2355OooO0o0(C2353e50 c2353e50, float f, PointF pointF, PointF pointF2, OooO00o oooO00o) {
            this(f, pointF, pointF2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C2355OooO0o0 OooO0oO(int i) {
            this.OooO0o = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C2355OooO0o0 OooO0oo(boolean z) {
            this.OooO0oo = z;
            return this;
        }

        public void OooO0OO() {
            PointF pointFOoOO;
            if (C2353e50.this.o00O0O != null) {
                C2354OooO0Oo.OooO0OO(C2353e50.this.o00O0O);
            }
            int paddingLeft = C2353e50.this.getPaddingLeft() + (((C2353e50.this.getWidth() - C2353e50.this.getPaddingRight()) - C2353e50.this.getPaddingLeft()) / 2);
            int paddingTop = C2353e50.this.getPaddingTop() + (((C2353e50.this.getHeight() - C2353e50.this.getPaddingBottom()) - C2353e50.this.getPaddingTop()) / 2);
            float fO00O0O = C2353e50.this.o00O0O(this.OooO00o);
            if (this.OooO0oo) {
                C2353e50 c2353e50 = C2353e50.this;
                PointF pointF = this.OooO0O0;
                pointFOoOO = c2353e50.ooOO(pointF.x, pointF.y, fO00O0O, new PointF());
            } else {
                pointFOoOO = this.OooO0O0;
            }
            OooO00o oooO00o = null;
            C2353e50.this.o00O0O = new C2354OooO0Oo(oooO00o);
            C2353e50.this.o00O0O.OooO00o = C2353e50.this.Oooo00o;
            C2353e50.this.o00O0O.OooO0O0 = fO00O0O;
            C2353e50.this.o00O0O.OooOO0o = System.currentTimeMillis();
            C2353e50.this.o00O0O.OooO0o0 = pointFOoOO;
            C2353e50.this.o00O0O.OooO0OO = C2353e50.this.getCenter();
            C2353e50.this.o00O0O.OooO0Oo = pointFOoOO;
            C2353e50.this.o00O0O.OooO0o = C2353e50.this.o00000Oo(pointFOoOO);
            C2353e50.this.o00O0O.OooO0oO = new PointF(paddingLeft, paddingTop);
            C2353e50.this.o00O0O.OooO0oo = this.OooO0Oo;
            C2353e50.this.o00O0O.OooO = this.OooO0oO;
            C2353e50.this.o00O0O.OooOO0 = this.OooO0o0;
            C2353e50.this.o00O0O.OooOO0O = this.OooO0o;
            C2353e50.this.o00O0O.OooOO0o = System.currentTimeMillis();
            C2354OooO0Oo.OooO0Oo(C2353e50.this.o00O0O, null);
            PointF pointF2 = this.OooO0OO;
            if (pointF2 != null) {
                float f = pointF2.x - (C2353e50.this.o00O0O.OooO0OO.x * fO00O0O);
                float f2 = this.OooO0OO.y - (C2353e50.this.o00O0O.OooO0OO.y * fO00O0O);
                OooOO0O oooOO0O = new OooOO0O(fO00O0O, new PointF(f, f2), oooO00o);
                C2353e50.this.OooooO0(true, oooOO0O);
                C2353e50.this.o00O0O.OooO0oO = new PointF(this.OooO0OO.x + (oooOO0O.OooO0O0.x - f), this.OooO0OO.y + (oooOO0O.OooO0O0.y - f2));
            }
            C2353e50.this.invalidate();
        }

        public C2355OooO0o0 OooO0Oo(long j) {
            this.OooO0Oo = j;
            return this;
        }

        public C2355OooO0o0 OooO0o(boolean z) {
            this.OooO0oO = z;
            return this;
        }

        /* synthetic */ C2355OooO0o0(C2353e50 c2353e50, PointF pointF, OooO00o oooO00o) {
            this(pointF);
        }

        public C2355OooO0o0 OooO0o0(int i) {
            if (C2353e50.o00000.contains(Integer.valueOf(i))) {
                this.OooO0o0 = i;
                return this;
            }
            throw new IllegalArgumentException("Unknown easing type: " + i);
        }

        private C2355OooO0o0(PointF pointF) {
            this.OooO0Oo = 500L;
            this.OooO0o0 = 2;
            this.OooO0o = 1;
            this.OooO0oO = true;
            this.OooO0oo = true;
            this.OooO00o = C2353e50.this.Oooo00o;
            this.OooO0O0 = pointF;
            this.OooO0OO = null;
        }

        private C2355OooO0o0(float f, PointF pointF) {
            this.OooO0Oo = 500L;
            this.OooO0o0 = 2;
            this.OooO0o = 1;
            this.OooO0oO = true;
            this.OooO0oo = true;
            this.OooO00o = f;
            this.OooO0O0 = pointF;
            this.OooO0OO = null;
        }

        private C2355OooO0o0(float f, PointF pointF, PointF pointF2) {
            this.OooO0Oo = 500L;
            this.OooO0o0 = 2;
            this.OooO0o = 1;
            this.OooO0oO = true;
            this.OooO0oo = true;
            this.OooO00o = f;
            this.OooO0O0 = pointF;
            this.OooO0OO = pointF2;
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooO0oO, reason: case insensitive filesystem */
    public static class C2356OooO0oO implements OooO {
        @Override // ambercore.C2353e50.OooO
        public void OooO00o() {
        }

        @Override // ambercore.C2353e50.OooO
        public void OooO0OO(Exception exc) {
        }

        @Override // ambercore.C2353e50.OooO
        public void OooO0Oo(Exception exc) {
        }

        @Override // ambercore.C2353e50.OooO
        public void OooO0o(Exception exc) {
        }

        @Override // ambercore.C2353e50.OooO
        public void OooO0o0() {
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooO0oo, reason: case insensitive filesystem */
    public interface InterfaceC2357OooO0oo {
    }

    /* JADX INFO: renamed from: ambercore.e50$OooOO0 */
    public interface OooOO0 {
    }

    /* JADX INFO: renamed from: ambercore.e50$OooOO0O */
    private static class OooOO0O {
        private float OooO00o;
        private final PointF OooO0O0;

        /* synthetic */ OooOO0O(float f, PointF pointF, OooO00o oooO00o) {
            this(f, pointF);
        }

        private OooOO0O(float f, PointF pointF) {
            this.OooO00o = f;
            this.OooO0O0 = pointF;
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooOO0o, reason: case insensitive filesystem */
    private static class C2358OooOO0o {
        private Rect OooO00o;
        private int OooO0O0;
        private Bitmap OooO0OO;
        private boolean OooO0Oo;
        private Rect OooO0o;
        private boolean OooO0o0;
        private Rect OooO0oO;

        private C2358OooOO0o() {
        }

        /* synthetic */ C2358OooOO0o(OooO00o oooO00o) {
            this();
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooOOO */
    private static class OooOOO extends AsyncTask {
        private final WeakReference OooO00o;
        private final WeakReference OooO0O0;
        private final WeakReference OooO0OO;
        private final Uri OooO0Oo;
        private Exception OooO0o;
        private InterfaceC1632Rf OooO0o0;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public int[] doInBackground(Void... voidArr) {
            try {
                String string = this.OooO0Oo.toString();
                Context context = (Context) this.OooO0O0.get();
                InterfaceC5198oo0OO interfaceC5198oo0OO = (InterfaceC5198oo0OO) this.OooO0OO.get();
                C2353e50 c2353e50 = (C2353e50) this.OooO00o.get();
                if (context == null || interfaceC5198oo0OO == null || c2353e50 == null) {
                    return null;
                }
                c2353e50.OoooOO0("TilesInitTask.doInBackground", new Object[0]);
                InterfaceC1632Rf interfaceC1632Rf = (InterfaceC1632Rf) interfaceC5198oo0OO.OooO00o();
                this.OooO0o0 = interfaceC1632Rf;
                Point pointOooO00o = interfaceC1632Rf.OooO00o(context, this.OooO0Oo);
                int iWidth = pointOooO00o.x;
                int iHeight = pointOooO00o.y;
                int iOooooOO = c2353e50.OooooOO(context, string);
                if (c2353e50.OoooO0O != null) {
                    c2353e50.OoooO0O.left = Math.max(0, c2353e50.OoooO0O.left);
                    c2353e50.OoooO0O.top = Math.max(0, c2353e50.OoooO0O.top);
                    c2353e50.OoooO0O.right = Math.min(iWidth, c2353e50.OoooO0O.right);
                    c2353e50.OoooO0O.bottom = Math.min(iHeight, c2353e50.OoooO0O.bottom);
                    iWidth = c2353e50.OoooO0O.width();
                    iHeight = c2353e50.OoooO0O.height();
                }
                return new int[]{iWidth, iHeight, iOooooOO};
            } catch (Exception e) {
                Log.e(C2353e50.o000000, "Failed to initialise bitmap decoder", e);
                this.OooO0o = e;
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(int[] iArr) {
            C2353e50 c2353e50 = (C2353e50) this.OooO00o.get();
            if (c2353e50 != null) {
                InterfaceC1632Rf interfaceC1632Rf = this.OooO0o0;
                if (interfaceC1632Rf != null && iArr != null && iArr.length == 3) {
                    c2353e50.o00oO0O(interfaceC1632Rf, iArr[0], iArr[1], iArr[2]);
                } else {
                    if (this.OooO0o == null || c2353e50.o00o0O == null) {
                        return;
                    }
                    c2353e50.o00o0O.OooO0o(this.OooO0o);
                }
            }
        }

        OooOOO(C2353e50 c2353e50, Context context, InterfaceC5198oo0OO interfaceC5198oo0OO, Uri uri) {
            this.OooO00o = new WeakReference(c2353e50);
            this.OooO0O0 = new WeakReference(context);
            this.OooO0OO = new WeakReference(interfaceC5198oo0OO);
            this.OooO0Oo = uri;
        }
    }

    /* JADX INFO: renamed from: ambercore.e50$OooOOO0 */
    private static class OooOOO0 extends AsyncTask {
        private final WeakReference OooO00o;
        private final WeakReference OooO0O0;
        private final WeakReference OooO0OO;
        private Exception OooO0Oo;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voidArr) {
            try {
                C2353e50 c2353e50 = (C2353e50) this.OooO00o.get();
                InterfaceC1632Rf interfaceC1632Rf = (InterfaceC1632Rf) this.OooO0O0.get();
                C2358OooOO0o c2358OooOO0o = (C2358OooOO0o) this.OooO0OO.get();
                if (interfaceC1632Rf == null || c2358OooOO0o == null || c2353e50 == null || !interfaceC1632Rf.isReady() || !c2358OooOO0o.OooO0o0) {
                    if (c2358OooOO0o == null) {
                        return null;
                    }
                    c2358OooOO0o.OooO0Oo = false;
                    return null;
                }
                c2353e50.OoooOO0("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", c2358OooOO0o.OooO00o, Integer.valueOf(c2358OooOO0o.OooO0O0));
                c2353e50.Ooooo00.readLock().lock();
                try {
                    if (!interfaceC1632Rf.isReady()) {
                        c2358OooOO0o.OooO0Oo = false;
                        c2353e50.Ooooo00.readLock().unlock();
                        return null;
                    }
                    c2353e50.Ooooo00(c2358OooOO0o.OooO00o, c2358OooOO0o.OooO0oO);
                    if (c2353e50.OoooO0O != null) {
                        c2358OooOO0o.OooO0oO.offset(c2353e50.OoooO0O.left, c2353e50.OoooO0O.top);
                    }
                    Bitmap bitmapOooO0O0 = interfaceC1632Rf.OooO0O0(c2358OooOO0o.OooO0oO, c2358OooOO0o.OooO0O0);
                    c2353e50.Ooooo00.readLock().unlock();
                    return bitmapOooO0O0;
                } catch (Throwable th) {
                    c2353e50.Ooooo00.readLock().unlock();
                    throw th;
                }
            } catch (Exception e) {
                Log.e(C2353e50.o000000, "Failed to decode tile", e);
                this.OooO0Oo = e;
                return null;
            } catch (OutOfMemoryError e2) {
                Log.e(C2353e50.o000000, "Failed to decode tile - OutOfMemoryError", e2);
                this.OooO0Oo = new RuntimeException(e2);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            C2353e50 c2353e50 = (C2353e50) this.OooO00o.get();
            C2358OooOO0o c2358OooOO0o = (C2358OooOO0o) this.OooO0OO.get();
            if (c2353e50 == null || c2358OooOO0o == null) {
                return;
            }
            if (bitmap != null) {
                c2358OooOO0o.OooO0OO = bitmap;
                c2358OooOO0o.OooO0Oo = false;
                c2353e50.o00oO0o();
            } else {
                if (this.OooO0Oo == null || c2353e50.o00o0O == null) {
                    return;
                }
                c2353e50.o00o0O.OooO0Oo(this.OooO0Oo);
            }
        }

        OooOOO0(C2353e50 c2353e50, InterfaceC1632Rf interfaceC1632Rf, C2358OooOO0o c2358OooOO0o) {
            this.OooO00o = new WeakReference(c2353e50);
            this.OooO0O0 = new WeakReference(interfaceC1632Rf);
            this.OooO0OO = new WeakReference(c2358OooOO0o);
            c2358OooOO0o.OooO0Oo = true;
        }
    }

    public C2353e50(Context context, AttributeSet attributeSet) {
        int resourceId;
        String string;
        super(context, attributeSet);
        this.OooOOo = 0;
        this.OooOOoo = 2.0f;
        this.OooOo00 = o00Oo0();
        this.OooOo0 = -1;
        this.OooOo0O = 1;
        this.OooOo0o = 1;
        this.OooOo = Integer.MAX_VALUE;
        this.OooOoO0 = Integer.MAX_VALUE;
        this.OooOoO = o00000OO;
        this.OooOoOO = true;
        this.OooOoo0 = true;
        this.OooOoo = true;
        this.OooOooO = true;
        this.OooOooo = 1.0f;
        this.Oooo000 = 1;
        this.Oooo00O = 500;
        this.Ooooo00 = new ReentrantReadWriteLock(true);
        this.Ooooo0o = new C4835oOo00oO(SkiaImageDecoder.class);
        this.OooooO0 = new C4835oOo00oO(SkiaImageRegionDecoder.class);
        this.o0OO00O = new float[8];
        this.oo0o0Oo = new float[8];
        this.o000OOo = 0;
        this.o0O0O00 = getResources().getDisplayMetrics().density;
        setMinimumDpi(160);
        setDoubleTapZoomDpi(160);
        setMinimumTileDpi(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
        setGestureDetector(context);
        this.oo000o = new Handler(new OooO00o());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.SubsamplingScaleImageView);
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SubsamplingScaleImageView_assetName) && (string = typedArrayObtainStyledAttributes.getString(R$styleable.SubsamplingScaleImageView_assetName)) != null && string.length() > 0) {
                setImage(C1730Uf.OooO00o(string).OooOOOO());
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SubsamplingScaleImageView_src) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SubsamplingScaleImageView_src, 0)) > 0) {
                setImage(C1730Uf.OooOO0o(resourceId).OooOOOO());
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SubsamplingScaleImageView_panEnabled)) {
                setPanEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.SubsamplingScaleImageView_panEnabled, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SubsamplingScaleImageView_zoomEnabled)) {
                setZoomEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.SubsamplingScaleImageView_zoomEnabled, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SubsamplingScaleImageView_quickScaleEnabled)) {
                setQuickScaleEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.SubsamplingScaleImageView_quickScaleEnabled, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SubsamplingScaleImageView_tileBackgroundColor)) {
                setTileBackgroundColor(typedArrayObtainStyledAttributes.getColor(R$styleable.SubsamplingScaleImageView_tileBackgroundColor, Color.argb(0, 0, 0, 0)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.Oooooo0 = TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics());
    }

    private float OoooOOo(int i, long j, float f, float f2, long j2) {
        if (i == 1) {
            return OoooOoO(j, f, f2, j2);
        }
        if (i == 2) {
            return OoooOo0(j, f, f2, j2);
        }
        throw new IllegalStateException("Unexpected easing type: " + i);
    }

    private float OoooOo0(long j, float f, float f2, long j2) {
        float f3;
        float f4 = j / (j2 / 2.0f);
        if (f4 < 1.0f) {
            f3 = (f2 / 2.0f) * f4;
        } else {
            float f5 = f4 - 1.0f;
            f3 = (-f2) / 2.0f;
            f4 = (f5 * (f5 - 2.0f)) - 1.0f;
        }
        return (f3 * f4) + f;
    }

    private float OoooOoO(long j, float f, float f2, long j2) {
        float f3 = j / j2;
        return ((-f2) * f3 * (f3 - 2.0f)) + f;
    }

    private synchronized void Oooooo(Point point) throws Throwable {
        Throwable th;
        try {
            try {
                OoooOO0("initialiseBaseLayer maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
                OooOO0O oooOO0O = new OooOO0O(0.0f, new PointF(0.0f, 0.0f), null);
                this.o0ooOoO = oooOO0O;
                OooooO0(true, oooOO0O);
                int iOoooO00 = OoooO00(this.o0ooOoO.OooO00o);
                this.OooOOOO = iOoooO00;
                if (iOoooO00 > 1) {
                    try {
                        this.OooOOOO = iOoooO00 / 2;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (this.OooOOOO != 1 || this.OoooO0O != null || o000000() >= point.x || o000OOo() >= point.y) {
                    OoooooO(point);
                    Iterator it = ((List) this.OooOOOo.get(Integer.valueOf(this.OooOOOO))).iterator();
                    while (it.hasNext()) {
                        OoooOoo(new OooOOO0(this, this.OoooOoo, (C2358OooOO0o) it.next()));
                    }
                    o0OOO0o(true);
                } else {
                    this.OoooOoo.recycle();
                    this.OoooOoo = null;
                    OoooOoo(new OooO0o(this, getContext(), this.Ooooo0o, this.OooOOO, false));
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private void o000000O(float f, PointF pointF, int i) {
    }

    private void o00000O0(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    private boolean o00000oo(C2358OooOO0o c2358OooOO0o) {
        return o0000O0(0.0f) <= ((float) c2358OooOO0o.OooO00o.right) && ((float) c2358OooOO0o.OooO00o.left) <= o0000O0((float) getWidth()) && o0000O0O(0.0f) <= ((float) c2358OooOO0o.OooO00o.bottom) && ((float) c2358OooOO0o.OooO00o.top) <= o0000O0O((float) getHeight());
    }

    private float o000oOoO(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o00o0O(Bitmap bitmap, int i, boolean z) {
        OooO oooO;
        try {
            OoooOO0("onImageLoaded", new Object[0]);
            int i2 = this.Oooo;
            if (i2 > 0 && this.OoooO00 > 0 && (i2 != bitmap.getWidth() || this.OoooO00 != bitmap.getHeight())) {
                o0OO00O(false);
            }
            Bitmap bitmap2 = this.OooOO0O;
            if (bitmap2 != null && !this.OooOOO0) {
                bitmap2.recycle();
            }
            if (this.OooOO0O != null && this.OooOOO0 && (oooO = this.o00o0O) != null) {
                oooO.OooO00o();
            }
            this.OooOO0o = false;
            this.OooOOO0 = z;
            this.OooOO0O = bitmap;
            this.Oooo = bitmap.getWidth();
            this.OoooO00 = bitmap.getHeight();
            this.OoooO0 = i;
            boolean zOoooO0O = OoooO0O();
            boolean zOoooO0 = OoooO0();
            if (zOoooO0O || zOoooO0) {
                invalidate();
                requestLayout();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o00oO0O(InterfaceC1632Rf interfaceC1632Rf, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        try {
            OoooOO0("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.OooOOo));
            int i7 = this.Oooo;
            if (i7 > 0 && (i6 = this.OoooO00) > 0 && (i7 != i || i6 != i2)) {
                o0OO00O(false);
                Bitmap bitmap = this.OooOO0O;
                if (bitmap != null) {
                    if (!this.OooOOO0) {
                        bitmap.recycle();
                    }
                    this.OooOO0O = null;
                    OooO oooO = this.o00o0O;
                    if (oooO != null && this.OooOOO0) {
                        oooO.OooO00o();
                    }
                    this.OooOO0o = false;
                    this.OooOOO0 = false;
                }
            }
            this.OoooOoo = interfaceC1632Rf;
            this.Oooo = i;
            this.OoooO00 = i2;
            this.OoooO0 = i3;
            OoooO0O();
            if (!OoooO0() && (i4 = this.OooOo) > 0 && i4 != Integer.MAX_VALUE && (i5 = this.OooOoO0) > 0 && i5 != Integer.MAX_VALUE && getWidth() > 0 && getHeight() > 0) {
                Oooooo(new Point(this.OooOo, this.OooOoO0));
            }
            invalidate();
            requestLayout();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o00oO0o() {
        Bitmap bitmap;
        try {
            OoooOO0("onTileLoaded", new Object[0]);
            OoooO0O();
            OoooO0();
            if (Ooooooo() && (bitmap = this.OooOO0O) != null) {
                if (!this.OooOOO0) {
                    bitmap.recycle();
                }
                this.OooOO0O = null;
                OooO oooO = this.o00o0O;
                if (oooO != null && this.OooOOO0) {
                    oooO.OooO00o();
                }
                this.OooOO0o = false;
                this.OooOOO0 = false;
            }
            invalidate();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o00ooo(Bitmap bitmap) {
        try {
            OoooOO0("onPreviewLoaded", new Object[0]);
            if (this.OooOO0O == null && !this.o00Ooo) {
                Rect rect = this.OoooO;
                if (rect != null) {
                    this.OooOO0O = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.OoooO.height());
                } else {
                    this.OooOO0O = bitmap;
                }
                this.OooOO0o = true;
                if (OoooO0O()) {
                    invalidate();
                    requestLayout();
                }
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o000000o(C1730Uf c1730Uf, C1730Uf c1730Uf2) {
        o00000(c1730Uf, c1730Uf2, null);
    }

    public final void o00000O(float f, PointF pointF) {
        this.o00O0O = null;
        this.Oooo0o = Float.valueOf(f);
        this.Oooo0oO = pointF;
        this.Oooo0oo = pointF;
        invalidate();
    }

    protected void o00Ooo() {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) throws Throwable {
        int i;
        char c;
        float height;
        int i2;
        int i3;
        int i4;
        int i5;
        super.onDraw(canvas);
        OoooO();
        if (this.Oooo == 0 || this.OoooO00 == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.OooOOOo == null && this.OoooOoo != null) {
            Oooooo(OooooOo(canvas));
        }
        if (OoooO0O()) {
            o0ooOOo();
            C2354OooO0Oo c2354OooO0Oo = this.o00O0O;
            if (c2354OooO0Oo != null && c2354OooO0Oo.OooO0o != null) {
                float f = this.Oooo00o;
                if (this.Oooo0o0 == null) {
                    this.Oooo0o0 = new PointF(0.0f, 0.0f);
                }
                this.Oooo0o0.set(this.Oooo0O0);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.o00O0O.OooOO0o;
                boolean z = jCurrentTimeMillis > this.o00O0O.OooO0oo;
                long jMin = Math.min(jCurrentTimeMillis, this.o00O0O.OooO0oo);
                this.Oooo00o = OoooOOo(this.o00O0O.OooOO0, jMin, this.o00O0O.OooO00o, this.o00O0O.OooO0O0 - this.o00O0O.OooO00o, this.o00O0O.OooO0oo);
                float fOoooOOo = OoooOOo(this.o00O0O.OooOO0, jMin, this.o00O0O.OooO0o.x, this.o00O0O.OooO0oO.x - this.o00O0O.OooO0o.x, this.o00O0O.OooO0oo);
                float fOoooOOo2 = OoooOOo(this.o00O0O.OooOO0, jMin, this.o00O0O.OooO0o.y, this.o00O0O.OooO0oO.y - this.o00O0O.OooO0o.y, this.o00O0O.OooO0oo);
                this.Oooo0O0.x -= o0000Ooo(this.o00O0O.OooO0Oo.x) - fOoooOOo;
                this.Oooo0O0.y -= o00000oO(this.o00O0O.OooO0Oo.y) - fOoooOOo2;
                Ooooo0o(z || this.o00O0O.OooO00o == this.o00O0O.OooO0O0);
                o000000O(f, this.Oooo0o0, this.o00O0O.OooOO0O);
                o0OOO0o(z);
                if (z) {
                    C2354OooO0Oo.OooO0OO(this.o00O0O);
                    this.o00O0O = null;
                }
                invalidate();
            }
            int i6 = 180;
            int i7 = 90;
            int i8 = 5;
            if (this.OooOOOo == null || !Ooooooo()) {
                i = 5;
                c = 0;
                Bitmap bitmap = this.OooOO0O;
                if (bitmap != null && !bitmap.isRecycled()) {
                    float width = this.Oooo00o;
                    if (this.OooOO0o) {
                        width *= this.Oooo / this.OooOO0O.getWidth();
                        height = this.Oooo00o * (this.OoooO00 / this.OooOO0O.getHeight());
                    } else {
                        height = width;
                    }
                    if (this.o0OOO0o == null) {
                        this.o0OOO0o = new Matrix();
                    }
                    this.o0OOO0o.reset();
                    this.o0OOO0o.postScale(width, height);
                    this.o0OOO0o.postRotate(getRequiredRotation());
                    Matrix matrix = this.o0OOO0o;
                    PointF pointF = this.Oooo0O0;
                    matrix.postTranslate(pointF.x, pointF.y);
                    if (getRequiredRotation() == 180) {
                        Matrix matrix2 = this.o0OOO0o;
                        float f2 = this.Oooo00o;
                        matrix2.postTranslate(this.Oooo * f2, f2 * this.OoooO00);
                    } else if (getRequiredRotation() == 90) {
                        this.o0OOO0o.postTranslate(this.Oooo00o * this.OoooO00, 0.0f);
                    } else if (getRequiredRotation() == 270) {
                        this.o0OOO0o.postTranslate(0.0f, this.Oooo00o * this.Oooo);
                    }
                    if (this.o0ooOOo != null) {
                        if (this.o0Oo0oo == null) {
                            this.o0Oo0oo = new RectF();
                        }
                        this.o0Oo0oo.set(0.0f, 0.0f, this.OooOO0o ? this.OooOO0O.getWidth() : this.Oooo, this.OooOO0o ? this.OooOO0O.getHeight() : this.OoooO00);
                        this.o0OOO0o.mapRect(this.o0Oo0oo);
                        canvas.drawRect(this.o0Oo0oo, this.o0ooOOo);
                    }
                    canvas.drawBitmap(this.OooOO0O, this.o0OOO0o, this.o00oO0o);
                }
            } else {
                int iMin = Math.min(this.OooOOOO, OoooO00(this.Oooo00o));
                boolean z2 = false;
                for (Map.Entry entry : this.OooOOOo.entrySet()) {
                    if (((Integer) entry.getKey()).intValue() == iMin) {
                        for (C2358OooOO0o c2358OooOO0o : (List) entry.getValue()) {
                            if (c2358OooOO0o.OooO0o0 && (c2358OooOO0o.OooO0Oo || c2358OooOO0o.OooO0OO == null)) {
                                z2 = true;
                            }
                        }
                    }
                }
                for (Map.Entry entry2 : this.OooOOOo.entrySet()) {
                    if (((Integer) entry2.getKey()).intValue() == iMin || z2) {
                        for (C2358OooOO0o c2358OooOO0o2 : (List) entry2.getValue()) {
                            o00000o0(c2358OooOO0o2.OooO00o, c2358OooOO0o2.OooO0o);
                            if (c2358OooOO0o2.OooO0Oo || c2358OooOO0o2.OooO0OO == null) {
                                i2 = iMin;
                                i3 = i6;
                                i4 = i7;
                                i5 = i8;
                                if (c2358OooOO0o2.OooO0Oo && this.OooOOo0) {
                                    canvas.drawText("LOADING", c2358OooOO0o2.OooO0o.left + o0ooOoO(i5), c2358OooOO0o2.OooO0o.top + o0ooOoO(35), this.o00oO0O);
                                }
                            } else {
                                if (this.o0ooOOo != null) {
                                    canvas.drawRect(c2358OooOO0o2.OooO0o, this.o0ooOOo);
                                }
                                if (this.o0OOO0o == null) {
                                    this.o0OOO0o = new Matrix();
                                }
                                this.o0OOO0o.reset();
                                i2 = iMin;
                                i3 = i6;
                                i4 = i7;
                                i5 = i8;
                                o00000O0(this.o0OO00O, 0.0f, 0.0f, c2358OooOO0o2.OooO0OO.getWidth(), 0.0f, c2358OooOO0o2.OooO0OO.getWidth(), c2358OooOO0o2.OooO0OO.getHeight(), 0.0f, c2358OooOO0o2.OooO0OO.getHeight());
                                if (getRequiredRotation() == 0) {
                                    o00000O0(this.oo0o0Oo, c2358OooOO0o2.OooO0o.left, c2358OooOO0o2.OooO0o.top, c2358OooOO0o2.OooO0o.right, c2358OooOO0o2.OooO0o.top, c2358OooOO0o2.OooO0o.right, c2358OooOO0o2.OooO0o.bottom, c2358OooOO0o2.OooO0o.left, c2358OooOO0o2.OooO0o.bottom);
                                } else if (getRequiredRotation() == i4) {
                                    o00000O0(this.oo0o0Oo, c2358OooOO0o2.OooO0o.right, c2358OooOO0o2.OooO0o.top, c2358OooOO0o2.OooO0o.right, c2358OooOO0o2.OooO0o.bottom, c2358OooOO0o2.OooO0o.left, c2358OooOO0o2.OooO0o.bottom, c2358OooOO0o2.OooO0o.left, c2358OooOO0o2.OooO0o.top);
                                } else if (getRequiredRotation() == i3) {
                                    o00000O0(this.oo0o0Oo, c2358OooOO0o2.OooO0o.right, c2358OooOO0o2.OooO0o.bottom, c2358OooOO0o2.OooO0o.left, c2358OooOO0o2.OooO0o.bottom, c2358OooOO0o2.OooO0o.left, c2358OooOO0o2.OooO0o.top, c2358OooOO0o2.OooO0o.right, c2358OooOO0o2.OooO0o.top);
                                } else if (getRequiredRotation() == 270) {
                                    o00000O0(this.oo0o0Oo, c2358OooOO0o2.OooO0o.left, c2358OooOO0o2.OooO0o.bottom, c2358OooOO0o2.OooO0o.left, c2358OooOO0o2.OooO0o.top, c2358OooOO0o2.OooO0o.right, c2358OooOO0o2.OooO0o.top, c2358OooOO0o2.OooO0o.right, c2358OooOO0o2.OooO0o.bottom);
                                }
                                this.o0OOO0o.setPolyToPoly(this.o0OO00O, 0, this.oo0o0Oo, 0, 4);
                                canvas.drawBitmap(c2358OooOO0o2.OooO0OO, this.o0OOO0o, this.o00oO0o);
                                if (this.OooOOo0) {
                                    canvas.drawRect(c2358OooOO0o2.OooO0o, this.o0ooOO0);
                                }
                            }
                            if (c2358OooOO0o2.OooO0o0 && this.OooOOo0) {
                                canvas.drawText("ISS " + c2358OooOO0o2.OooO0O0 + " RECT " + c2358OooOO0o2.OooO00o.top + "," + c2358OooOO0o2.OooO00o.left + "," + c2358OooOO0o2.OooO00o.bottom + "," + c2358OooOO0o2.OooO00o.right, c2358OooOO0o2.OooO0o.left + o0ooOoO(i5), c2358OooOO0o2.OooO0o.top + o0ooOoO(15), this.o00oO0O);
                            }
                            i7 = i4;
                            i6 = i3;
                            i8 = i5;
                            iMin = i2;
                        }
                    }
                    i7 = i7;
                    i6 = i6;
                    i8 = i8;
                    iMin = iMin;
                }
                i = i8;
                c = 0;
            }
            if (this.OooOOo0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scale: ");
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[1];
                objArr[c] = Float.valueOf(this.Oooo00o);
                sb.append(String.format(locale, "%.2f", objArr));
                sb.append(" (");
                Object[] objArr2 = new Object[1];
                objArr2[c] = Float.valueOf(o00Oo0());
                sb.append(String.format(locale, "%.2f", objArr2));
                sb.append(" - ");
                Object[] objArr3 = new Object[1];
                objArr3[c] = Float.valueOf(this.OooOOoo);
                sb.append(String.format(locale, "%.2f", objArr3));
                sb.append(")");
                canvas.drawText(sb.toString(), o0ooOoO(i), o0ooOoO(15), this.o00oO0O);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Translate: ");
                Object[] objArr4 = new Object[1];
                objArr4[c] = Float.valueOf(this.Oooo0O0.x);
                sb2.append(String.format(locale, "%.2f", objArr4));
                sb2.append(CertificateUtil.DELIMITER);
                Object[] objArr5 = new Object[1];
                objArr5[c] = Float.valueOf(this.Oooo0O0.y);
                sb2.append(String.format(locale, "%.2f", objArr5));
                canvas.drawText(sb2.toString(), o0ooOoO(i), o0ooOoO(30), this.o00oO0O);
                PointF center = getCenter();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Source center: ");
                Object[] objArr6 = new Object[1];
                objArr6[c] = Float.valueOf(center.x);
                sb3.append(String.format(locale, "%.2f", objArr6));
                sb3.append(CertificateUtil.DELIMITER);
                Object[] objArr7 = new Object[1];
                objArr7[c] = Float.valueOf(center.y);
                sb3.append(String.format(locale, "%.2f", objArr7));
                canvas.drawText(sb3.toString(), o0ooOoO(i), o0ooOoO(45), this.o00oO0O);
                C2354OooO0Oo c2354OooO0Oo2 = this.o00O0O;
                if (c2354OooO0Oo2 != null) {
                    PointF pointFO00000Oo = o00000Oo(c2354OooO0Oo2.OooO0OO);
                    PointF pointFO00000Oo2 = o00000Oo(this.o00O0O.OooO0o0);
                    PointF pointFO00000Oo3 = o00000Oo(this.o00O0O.OooO0Oo);
                    canvas.drawCircle(pointFO00000Oo.x, pointFO00000Oo.y, o0ooOoO(10), this.o0ooOO0);
                    this.o0ooOO0.setColor(SupportMenu.CATEGORY_MASK);
                    canvas.drawCircle(pointFO00000Oo2.x, pointFO00000Oo2.y, o0ooOoO(20), this.o0ooOO0);
                    this.o0ooOO0.setColor(-16776961);
                    canvas.drawCircle(pointFO00000Oo3.x, pointFO00000Oo3.y, o0ooOoO(25), this.o0ooOO0);
                    this.o0ooOO0.setColor(-16711681);
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, o0ooOoO(30), this.o0ooOO0);
                }
                if (this.OooooOO != null) {
                    this.o0ooOO0.setColor(SupportMenu.CATEGORY_MASK);
                    PointF pointF2 = this.OooooOO;
                    canvas.drawCircle(pointF2.x, pointF2.y, o0ooOoO(20), this.o0ooOO0);
                }
                if (this.o0OoOo0 != null) {
                    this.o0ooOO0.setColor(-16776961);
                    canvas.drawCircle(o0000Ooo(this.o0OoOo0.x), o00000oO(this.o0OoOo0.y), o0ooOoO(35), this.o0ooOO0);
                }
                if (this.ooOO != null && this.OoooOOO) {
                    this.o0ooOO0.setColor(-16711681);
                    PointF pointF3 = this.ooOO;
                    canvas.drawCircle(pointF3.x, pointF3.y, o0ooOoO(30), this.o0ooOO0);
                }
                this.o0ooOO0.setColor(-65281);
            }
        }
    }

    protected void oo000o() {
    }

    public final void oo0o0Oo() {
        this.o00O0O = null;
        this.Oooo0o = Float.valueOf(o00O0O(0.0f));
        if (o0OoOo0()) {
            this.Oooo0oO = new PointF(o000000() / 2, o000OOo() / 2);
        } else {
            this.Oooo0oO = new PointF(0.0f, 0.0f);
        }
        invalidate();
    }

    public final void setDoubleTapZoomDuration(int i) {
        this.Oooo00O = Math.max(0, i);
    }

    public final void setImage(@NonNull C1730Uf c1730Uf) {
        o00000(c1730Uf, null, null);
    }

    public void setOnStateChangedListener(OooOO0 oooOO0) {
    }

    private void OoooO() {
        if (this.o00oO0o == null) {
            Paint paint = new Paint();
            this.o00oO0o = paint;
            paint.setAntiAlias(true);
            this.o00oO0o.setFilterBitmap(true);
            this.o00oO0o.setDither(true);
        }
        if ((this.o00oO0O == null || this.o0ooOO0 == null) && this.OooOOo0) {
            Paint paint2 = new Paint();
            this.o00oO0O = paint2;
            paint2.setTextSize(o0ooOoO(12));
            this.o00oO0O.setColor(-65281);
            this.o00oO0O.setStyle(Paint.Style.FILL);
            Paint paint3 = new Paint();
            this.o0ooOO0 = paint3;
            paint3.setColor(-65281);
            this.o0ooOO0.setStyle(Paint.Style.STROKE);
            this.o0ooOO0.setStrokeWidth(o0ooOoO(1));
        }
    }

    private int OoooO00(float f) {
        int iRound;
        if (this.OooOo0 > 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            f *= this.OooOo0 / ((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f);
        }
        int iO000000 = (int) (o000000() * f);
        int iO000OOo = (int) (o000OOo() * f);
        if (iO000000 == 0 || iO000OOo == 0) {
            return 32;
        }
        int i = 1;
        if (o000OOo() > iO000OOo || o000000() > iO000000) {
            iRound = Math.round(o000OOo() / iO000OOo);
            int iRound2 = Math.round(o000000() / iO000000);
            if (iRound >= iRound2) {
                iRound = iRound2;
            }
        } else {
            iRound = 1;
        }
        while (true) {
            int i2 = i * 2;
            if (i2 >= iRound) {
                return i;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OoooOO0(String str, Object... objArr) {
        if (this.OooOOo0) {
            String.format(str, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OoooOOO(PointF pointF, PointF pointF2) {
        if (!this.OooOoo0) {
            PointF pointF3 = this.Oooo0oo;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = o000000() / 2;
                pointF.y = o000OOo() / 2;
            }
        }
        float fMin = Math.min(this.OooOOoo, this.OooOooo);
        float f = this.Oooo00o;
        boolean z = ((double) f) <= ((double) fMin) * 0.9d || f == this.OooOo00;
        if (!z) {
            fMin = o00Oo0();
        }
        float f2 = fMin;
        int i = this.Oooo000;
        if (i != 3) {
            if (i == 2 || !z || !this.OooOoo0) {
                new C2355OooO0o0(this, f2, pointF, (OooO00o) null).OooO0o(false).OooO0Oo(this.Oooo00O).OooO0oO(4).OooO0OO();
            } else if (i == 1) {
                new C2355OooO0o0(this, f2, pointF, pointF2, null).OooO0o(false).OooO0Oo(this.Oooo00O).OooO0oO(4).OooO0OO();
            }
            invalidate();
        }
        o00000O(f2, pointF);
        invalidate();
    }

    private void OoooOoo(AsyncTask asyncTask) {
        asyncTask.executeOnExecutor(this.OooOoO, new Void[0]);
    }

    private void Ooooo0o(boolean z) {
        boolean z2;
        float f = 0.0f;
        if (this.Oooo0O0 == null) {
            this.Oooo0O0 = new PointF(0.0f, 0.0f);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.o0ooOoO == null) {
            this.o0ooOoO = new OooOO0O(f, new PointF(0.0f, 0.0f), null);
        }
        this.o0ooOoO.OooO00o = this.Oooo00o;
        this.o0ooOoO.OooO0O0.set(this.Oooo0O0);
        OooooO0(z, this.o0ooOoO);
        this.Oooo00o = this.o0ooOoO.OooO00o;
        this.Oooo0O0.set(this.o0ooOoO.OooO0O0);
        if (!z2 || this.OooOo0o == 4) {
            return;
        }
        this.Oooo0O0.set(o0000(o000000() / 2, o000OOo() / 2, this.Oooo00o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooooO0(boolean z, OooOO0O oooOO0O) {
        float fMax;
        int iMax;
        float fMax2;
        if (this.OooOo0O == 2 && o0OoOo0()) {
            z = false;
        }
        PointF pointF = oooOO0O.OooO0O0;
        float fO00O0O = o00O0O(oooOO0O.OooO00o);
        float fO000000 = o000000() * fO00O0O;
        float fO000OOo = o000OOo() * fO00O0O;
        if (this.OooOo0O == 3 && o0OoOo0()) {
            pointF.x = Math.max(pointF.x, (getWidth() / 2) - fO000000);
            pointF.y = Math.max(pointF.y, (getHeight() / 2) - fO000OOo);
        } else if (z) {
            pointF.x = Math.max(pointF.x, getWidth() - fO000000);
            pointF.y = Math.max(pointF.y, getHeight() - fO000OOo);
        } else {
            pointF.x = Math.max(pointF.x, -fO000000);
            pointF.y = Math.max(pointF.y, -fO000OOo);
        }
        float paddingLeft = (getPaddingLeft() > 0 || getPaddingRight() > 0) ? getPaddingLeft() / (getPaddingLeft() + getPaddingRight()) : 0.5f;
        float paddingTop = (getPaddingTop() > 0 || getPaddingBottom() > 0) ? getPaddingTop() / (getPaddingTop() + getPaddingBottom()) : 0.5f;
        if (this.OooOo0O == 3 && o0OoOo0()) {
            fMax = Math.max(0, getWidth() / 2);
            iMax = Math.max(0, getHeight() / 2);
        } else {
            if (z) {
                fMax = Math.max(0.0f, (getWidth() - fO000000) * paddingLeft);
                fMax2 = Math.max(0.0f, (getHeight() - fO000OOo) * paddingTop);
                pointF.x = Math.min(pointF.x, fMax);
                pointF.y = Math.min(pointF.y, fMax2);
                oooOO0O.OooO00o = fO00O0O;
            }
            fMax = Math.max(0, getWidth());
            iMax = Math.max(0, getHeight());
        }
        fMax2 = iMax;
        pointF.x = Math.min(pointF.x, fMax);
        pointF.y = Math.min(pointF.y, fMax2);
        oooOO0O.OooO00o = fO00O0O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int OooooOO(Context context, String str) {
        int i = 0;
        if (str.startsWith("content")) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{"orientation"}, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        int i2 = cursorQuery.getInt(0);
                        if (!o000000O.contains(Integer.valueOf(i2)) || i2 == -1) {
                            Log.w(o000000, "Unsupported orientation: " + i2);
                        } else {
                            i = i2;
                        }
                    }
                } catch (Exception unused) {
                    Log.w(o000000, "Could not get orientation of image from media store");
                    if (cursorQuery != null) {
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } finally {
            }
        } else if (str.startsWith("file:///") && !str.startsWith("file:///android_asset/")) {
            try {
                int attributeInt = new ExifInterface(str.substring(7)).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
                if (attributeInt != 1 && attributeInt != 0) {
                    if (attributeInt == 6) {
                        return 90;
                    }
                    if (attributeInt == 3) {
                        return 180;
                    }
                    if (attributeInt == 8) {
                        return 270;
                    }
                    Log.w(o000000, "Unsupported EXIF orientation: " + attributeInt);
                    return 0;
                }
                return 0;
            } catch (Exception unused2) {
                Log.w(o000000, "Could not get EXIF orientation of image");
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    private Point OooooOo(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.OooOo), Math.min(canvas.getMaximumBitmapHeight(), this.OooOoO0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void OoooooO(Point point) {
        char c = 2;
        int i = 0;
        int i2 = 1;
        OoooOO0("initialiseTileMap maxTileDimensions=%dx%d", Integer.valueOf(point.x), Integer.valueOf(point.y));
        this.OooOOOo = new LinkedHashMap();
        int i3 = this.OooOOOO;
        int i4 = 1;
        int i5 = 1;
        while (true) {
            int iO000000 = o000000() / i4;
            int iO000OOo = o000OOo() / i5;
            int i6 = iO000000 / i3;
            int i7 = iO000OOo / i3;
            while (true) {
                if (i6 + i4 + i2 <= point.x && (i6 <= ((double) getWidth()) * 1.25d || i3 >= this.OooOOOO)) {
                    break;
                }
                char c2 = c;
                int i8 = i;
                i4 += i2;
                iO000000 = o000000() / i4;
                i6 = iO000000 / i3;
                i = i8;
                c = c2;
            }
            while (true) {
                if (i7 + i5 + i2 <= point.y && (i7 <= ((double) getHeight()) * 1.25d || i3 >= this.OooOOOO)) {
                    break;
                }
                char c3 = c;
                int i9 = i;
                i5 += i2;
                iO000OOo = o000OOo() / i5;
                i7 = iO000OOo / i3;
                i = i9;
                c = c3;
            }
            ArrayList arrayList = new ArrayList(i4 * i5);
            int i10 = i;
            while (i10 < i4) {
                int i11 = i;
                while (i11 < i5) {
                    C2358OooOO0o c2358OooOO0o = new C2358OooOO0o(null);
                    c2358OooOO0o.OooO0O0 = i3;
                    c2358OooOO0o.OooO0o0 = i3 == this.OooOOOO ? i2 : i;
                    char c4 = c;
                    int i12 = i2;
                    c2358OooOO0o.OooO00o = new Rect(i10 * iO000000, i11 * iO000OOo, i10 == i4 + (-1) ? o000000() : (i10 + 1) * iO000000, i11 == i5 + (-1) ? o000OOo() : (i11 + 1) * iO000OOo);
                    c2358OooOO0o.OooO0o = new Rect(0, 0, 0, 0);
                    c2358OooOO0o.OooO0oO = new Rect(c2358OooOO0o.OooO00o);
                    arrayList.add(c2358OooOO0o);
                    i11++;
                    i = 0;
                    c = c4;
                    i2 = i12;
                }
                i10++;
                c = c;
            }
            char c5 = c;
            int i13 = i;
            this.OooOOOo.put(Integer.valueOf(i3), arrayList);
            i2 = i2;
            if (i3 == i2) {
                return;
            }
            i3 /= 2;
            i = i13;
            c = c5;
        }
    }

    private boolean Ooooooo() {
        boolean z = true;
        if (this.OooOO0O != null && !this.OooOO0o) {
            return true;
        }
        Map map = this.OooOOOo;
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getKey()).intValue() == this.OooOOOO) {
                for (C2358OooOO0o c2358OooOO0o : (List) entry.getValue()) {
                    if (c2358OooOO0o.OooO0Oo || c2358OooOO0o.OooO0OO == null) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return o00000Oo;
    }

    @AnyThread
    private int getRequiredRotation() {
        int i = this.OooOOo;
        return i == -1 ? this.OoooO0 : i;
    }

    private void o00000o0(Rect rect, Rect rect2) {
        rect2.set((int) o0000Ooo(rect.left), (int) o00000oO(rect.top), (int) o0000Ooo(rect.right), (int) o00000oO(rect.bottom));
    }

    private float o00000oO(float f) {
        PointF pointF = this.Oooo0O0;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.Oooo00o) + pointF.y;
    }

    private float o0000O0(float f) {
        PointF pointF = this.Oooo0O0;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.x) / this.Oooo00o;
    }

    private float o0000O0O(float f) {
        PointF pointF = this.Oooo0O0;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f - pointF.y) / this.Oooo00o;
    }

    private float o0000Ooo(float f) {
        PointF pointF = this.Oooo0O0;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f * this.Oooo00o) + pointF.x;
    }

    private void o0O0O00(ImageViewState imageViewState) {
        if (imageViewState == null || !o000000O.contains(Integer.valueOf(imageViewState.getOrientation()))) {
            return;
        }
        this.OooOOo = imageViewState.getOrientation();
        this.Oooo0o = Float.valueOf(imageViewState.getScale());
        this.Oooo0oO = imageViewState.getCenter();
        invalidate();
    }

    private void o0OO00O(boolean z) {
        OooO oooO;
        OoooOO0("reset newImage=" + z, new Object[0]);
        this.Oooo00o = 0.0f;
        this.Oooo0 = 0.0f;
        this.Oooo0O0 = null;
        this.Oooo0OO = null;
        this.Oooo0o0 = null;
        this.Oooo0o = Float.valueOf(0.0f);
        this.Oooo0oO = null;
        this.Oooo0oo = null;
        this.OoooOO0 = false;
        this.o000oOoO = false;
        this.OoooOOO = false;
        this.OoooOOo = 0;
        this.OooOOOO = 0;
        this.OooooOO = null;
        this.OooooOo = 0.0f;
        this.Oooooo = 0.0f;
        this.OoooooO = false;
        this.o0OoOo0 = null;
        this.Ooooooo = null;
        this.ooOO = null;
        this.o00O0O = null;
        this.o0ooOoO = null;
        this.o0OOO0o = null;
        this.o0Oo0oo = null;
        if (z) {
            this.OooOOO = null;
            this.Ooooo00.writeLock().lock();
            try {
                InterfaceC1632Rf interfaceC1632Rf = this.OoooOoo;
                if (interfaceC1632Rf != null) {
                    interfaceC1632Rf.recycle();
                    this.OoooOoo = null;
                }
                this.Ooooo00.writeLock().unlock();
                Bitmap bitmap = this.OooOO0O;
                if (bitmap != null && !this.OooOOO0) {
                    bitmap.recycle();
                }
                if (this.OooOO0O != null && this.OooOOO0 && (oooO = this.o00o0O) != null) {
                    oooO.OooO00o();
                }
                this.Oooo = 0;
                this.OoooO00 = 0;
                this.OoooO0 = 0;
                this.OoooO0O = null;
                this.OoooO = null;
                this.o00Oo0 = false;
                this.o00Ooo = false;
                this.OooOO0O = null;
                this.OooOO0o = false;
                this.OooOOO0 = false;
            } catch (Throwable th) {
                this.Ooooo00.writeLock().unlock();
                throw th;
            }
        }
        Map map = this.OooOOOo;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                for (C2358OooOO0o c2358OooOO0o : (List) ((Map.Entry) it.next()).getValue()) {
                    c2358OooOO0o.OooO0o0 = false;
                    if (c2358OooOO0o.OooO0OO != null) {
                        c2358OooOO0o.OooO0OO.recycle();
                        c2358OooOO0o.OooO0OO = null;
                    }
                }
            }
            this.OooOOOo = null;
        }
        setGestureDetector(getContext());
    }

    private void o0OOO0o(boolean z) {
        if (this.OoooOoo == null || this.OooOOOo == null) {
            return;
        }
        int iMin = Math.min(this.OooOOOO, OoooO00(this.Oooo00o));
        Iterator it = this.OooOOOo.entrySet().iterator();
        while (it.hasNext()) {
            for (C2358OooOO0o c2358OooOO0o : (List) ((Map.Entry) it.next()).getValue()) {
                if (c2358OooOO0o.OooO0O0 < iMin || (c2358OooOO0o.OooO0O0 > iMin && c2358OooOO0o.OooO0O0 != this.OooOOOO)) {
                    c2358OooOO0o.OooO0o0 = false;
                    if (c2358OooOO0o.OooO0OO != null) {
                        c2358OooOO0o.OooO0OO.recycle();
                        c2358OooOO0o.OooO0OO = null;
                    }
                }
                if (c2358OooOO0o.OooO0O0 == iMin) {
                    if (o00000oo(c2358OooOO0o)) {
                        c2358OooOO0o.OooO0o0 = true;
                        if (!c2358OooOO0o.OooO0Oo && c2358OooOO0o.OooO0OO == null && z) {
                            OoooOoo(new OooOOO0(this, this.OoooOoo, c2358OooOO0o));
                        }
                    } else if (c2358OooOO0o.OooO0O0 != this.OooOOOO) {
                        c2358OooOO0o.OooO0o0 = false;
                        if (c2358OooOO0o.OooO0OO != null) {
                            c2358OooOO0o.OooO0OO.recycle();
                            c2358OooOO0o.OooO0OO = null;
                        }
                    }
                } else if (c2358OooOO0o.OooO0O0 == this.OooOOOO) {
                    c2358OooOO0o.OooO0o0 = true;
                }
            }
        }
    }

    private int o0ooOoO(int i) {
        return (int) (this.o0O0O00 * i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureDetector(Context context) {
        this.OoooOo0 = new GestureDetector(context, new OooO0O0(context));
        this.OoooOoO = new GestureDetector(context, new OooO0OO());
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        o00000Oo = config;
    }

    public void Oooooo0(Matrix matrix) {
        float f = this.Oooo00o;
        matrix.setScale(f, f);
        matrix.setRotate(getRotate());
    }

    public float getMaxScale() {
        return this.OooOOoo;
    }

    public final int getOrientation() {
        return this.OooOOo;
    }

    public int getRotate() {
        return this.o000OOo;
    }

    public final int getSHeight() {
        return this.OoooO00;
    }

    public final int getSWidth() {
        return this.Oooo;
    }

    public final float getScale() {
        return this.Oooo00o;
    }

    @Nullable
    public final ImageViewState getState() {
        if (this.Oooo0O0 == null || this.Oooo <= 0 || this.OoooO00 <= 0) {
            return null;
        }
        return new ImageViewState(getScale(), getCenter(), getOrientation());
    }

    public final void o00000(C1730Uf c1730Uf, C1730Uf c1730Uf2, ImageViewState imageViewState) {
        if (c1730Uf == null) {
            throw new NullPointerException("imageSource must not be null");
        }
        o0OO00O(true);
        if (imageViewState != null) {
            o0O0O00(imageViewState);
        }
        if (c1730Uf2 != null) {
            if (c1730Uf.OooO0Oo() != null) {
                throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            }
            if (c1730Uf.OooO0oo() <= 0 || c1730Uf.OooO0o() <= 0) {
                throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            }
            this.Oooo = c1730Uf.OooO0oo();
            this.OoooO00 = c1730Uf.OooO0o();
            this.OoooO = c1730Uf2.OooO0oO();
            if (c1730Uf2.OooO0Oo() != null) {
                this.OooOOO0 = c1730Uf2.OooOO0O();
                o00ooo(c1730Uf2.OooO0Oo());
            } else {
                Uri uriOooOO0 = c1730Uf2.OooOO0();
                if (uriOooOO0 == null && c1730Uf2.OooO0o0() != null) {
                    uriOooOO0 = Uri.parse("android.resource://" + getContext().getPackageName() + RemoteSettings.FORWARD_SLASH_STRING + c1730Uf2.OooO0o0());
                }
                OoooOoo(new OooO0o(this, getContext(), this.Ooooo0o, uriOooOO0, true));
            }
        }
        if (c1730Uf.OooO0Oo() != null && c1730Uf.OooO0oO() != null) {
            o00o0O(Bitmap.createBitmap(c1730Uf.OooO0Oo(), c1730Uf.OooO0oO().left, c1730Uf.OooO0oO().top, c1730Uf.OooO0oO().width(), c1730Uf.OooO0oO().height()), 0, false);
            return;
        }
        if (c1730Uf.OooO0Oo() != null) {
            o00o0O(c1730Uf.OooO0Oo(), 0, c1730Uf.OooOO0O());
            return;
        }
        this.OoooO0O = c1730Uf.OooO0oO();
        Uri uriOooOO02 = c1730Uf.OooOO0();
        this.OooOOO = uriOooOO02;
        if (uriOooOO02 == null && c1730Uf.OooO0o0() != null) {
            this.OooOOO = Uri.parse("android.resource://" + getContext().getPackageName() + RemoteSettings.FORWARD_SLASH_STRING + c1730Uf.OooO0o0());
        }
        if (c1730Uf.OooO() || this.OoooO0O != null) {
            OoooOoo(new OooOOO(this, getContext(), this.OooooO0, this.OooOOO));
        } else {
            OoooOoo(new OooO0o(this, getContext(), this.Ooooo0o, this.OooOOO, false));
        }
    }

    public final PointF o00000OO(float f, float f2, PointF pointF) {
        if (this.Oooo0O0 == null) {
            return null;
        }
        pointF.set(o0000Ooo(f), o00000oO(f2));
        return pointF;
    }

    public final PointF o00000Oo(PointF pointF) {
        return o00000OO(pointF.x, pointF.y, new PointF());
    }

    public final PointF o0000O00(float f, float f2) {
        return o0000oo(f, f2, new PointF());
    }

    public final PointF o0000oO(PointF pointF) {
        return o0000oo(pointF.x, pointF.y, new PointF());
    }

    public final PointF o0000oo(float f, float f2, PointF pointF) {
        if (this.Oooo0O0 == null) {
            return null;
        }
        pointF.set(o0000O0(f), o0000O0O(f2));
        return pointF;
    }

    public final boolean o0OoOo0() {
        return this.o00Oo0;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        C2354OooO0Oo c2354OooO0Oo = this.o00O0O;
        if (c2354OooO0Oo != null && !c2354OooO0Oo.OooO) {
            o0Oo0oo(true);
            return true;
        }
        C2354OooO0Oo c2354OooO0Oo2 = this.o00O0O;
        if (c2354OooO0Oo2 != null) {
            C2354OooO0Oo.OooO0OO(c2354OooO0Oo2);
        }
        this.o00O0O = null;
        if (this.Oooo0O0 == null) {
            GestureDetector gestureDetector2 = this.OoooOoO;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
            }
            return true;
        }
        if (!this.OoooOOO && ((gestureDetector = this.OoooOo0) == null || gestureDetector.onTouchEvent(motionEvent))) {
            this.OoooOO0 = false;
            this.o000oOoO = false;
            this.OoooOOo = 0;
            return true;
        }
        if (this.Oooo0OO == null) {
            this.Oooo0OO = new PointF(0.0f, 0.0f);
        }
        if (this.Oooo0o0 == null) {
            this.Oooo0o0 = new PointF(0.0f, 0.0f);
        }
        if (this.OooooOO == null) {
            this.OooooOO = new PointF(0.0f, 0.0f);
        }
        float f = this.Oooo00o;
        this.Oooo0o0.set(this.Oooo0O0);
        boolean zO0ooOO0 = o0ooOO0(motionEvent);
        o000000O(f, this.Oooo0o0, 2);
        return zO0ooOO0 || super.onTouchEvent(motionEvent);
    }

    public final void setBitmapDecoderClass(@NonNull Class<? extends InterfaceC6816xf> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.Ooooo0o = new C4835oOo00oO(cls);
    }

    public final void setBitmapDecoderFactory(@NonNull InterfaceC5198oo0OO interfaceC5198oo0OO) {
        if (interfaceC5198oo0OO == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.Ooooo0o = interfaceC5198oo0OO;
    }

    public final void setDebug(boolean z) {
        this.OooOOo0 = z;
    }

    public final void setDoubleTapZoomScale(float f) {
        this.OooOooo = f;
    }

    public final void setDoubleTapZoomStyle(int i) {
        if (o000000o.contains(Integer.valueOf(i))) {
            this.Oooo000 = i;
            return;
        }
        throw new IllegalArgumentException("Invalid zoom style: " + i);
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.OooOoOO = z;
    }

    public void setExecutor(@NonNull Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        }
        this.OooOoO = executor;
    }

    public final void setMaxScale(float f) {
        this.OooOOoo = f;
    }

    public void setMaxTileSize(int i) {
        this.OooOo = i;
        this.OooOoO0 = i;
    }

    public final void setMinScale(float f) {
        this.OooOo00 = f;
    }

    public final void setMinimumScaleType(int i) {
        if (!o00000O.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException("Invalid scale type: " + i);
        }
        this.OooOo0o = i;
        if (o0OoOo0()) {
            Ooooo0o(true);
            invalidate();
        }
    }

    public void setOnImageEventListener(OooO oooO) {
        this.o00o0O = oooO;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.o00ooo = onLongClickListener;
    }

    public final void setOrientation(int i) {
        if (!o000000O.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException("Invalid orientation: " + i);
        }
        this.OooOOo = i;
        o0OO00O(false);
        invalidate();
        requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        PointF pointF;
        this.OooOoo0 = z;
        if (z || (pointF = this.Oooo0O0) == null) {
            return;
        }
        pointF.x = (getWidth() / 2) - (this.Oooo00o * (o000000() / 2));
        this.Oooo0O0.y = (getHeight() / 2) - (this.Oooo00o * (o000OOo() / 2));
        if (o0OoOo0()) {
            o0OOO0o(true);
            invalidate();
        }
    }

    public final void setPanLimit(int i) {
        if (!o00000O0.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException("Invalid pan limit: " + i);
        }
        this.OooOo0O = i;
        if (o0OoOo0()) {
            Ooooo0o(true);
            invalidate();
        }
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.OooOooO = z;
    }

    public final void setRegionDecoderClass(@NonNull Class<? extends InterfaceC1632Rf> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.OooooO0 = new C4835oOo00oO(cls);
    }

    public final void setRegionDecoderFactory(@NonNull InterfaceC5198oo0OO interfaceC5198oo0OO) {
        if (interfaceC5198oo0OO == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.OooooO0 = interfaceC5198oo0OO;
    }

    public void setRotate(int i) {
        if (i == 0) {
            setOrientation(-1);
        } else {
            setOrientation(((getAppliedOrientation() + 360) + i) % 360);
        }
        this.o000OOo = i;
    }

    public final void setZoomEnabled(boolean z) {
        this.OooOoo = z;
    }

    private boolean OoooO0() {
        boolean zOoooooo = Ooooooo();
        if (!this.o00Ooo && zOoooooo) {
            o0ooOOo();
            this.o00Ooo = true;
            o00Ooo();
            OooO oooO = this.o00o0O;
            if (oooO != null) {
                oooO.OooO0O0();
            }
        }
        return zOoooooo;
    }

    private boolean OoooO0O() {
        boolean z;
        if (getWidth() > 0 && getHeight() > 0 && this.Oooo > 0 && this.OoooO00 > 0 && (this.OooOO0O != null || Ooooooo())) {
            z = true;
        } else {
            z = false;
        }
        if (!this.o00Oo0 && z) {
            o0ooOOo();
            this.o00Oo0 = true;
            oo000o();
            OooO oooO = this.o00o0O;
            if (oooO != null) {
                oooO.OooO0o0();
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ooooo00(Rect rect, Rect rect2) {
        if (getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (getRequiredRotation() == 90) {
            int i = rect.top;
            int i2 = this.OoooO00;
            rect2.set(i, i2 - rect.right, rect.bottom, i2 - rect.left);
        } else {
            if (getRequiredRotation() == 180) {
                int i3 = this.Oooo;
                int i4 = i3 - rect.right;
                int i5 = this.OoooO00;
                rect2.set(i4, i5 - rect.bottom, i3 - rect.left, i5 - rect.top);
                return;
            }
            int i6 = this.Oooo;
            rect2.set(i6 - rect.bottom, rect.left, i6 - rect.top, rect.right);
        }
    }

    private PointF o0000(float f, float f2, float f3) {
        int paddingLeft = getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2);
        int paddingTop = getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        if (this.o0ooOoO == null) {
            this.o0ooOoO = new OooOO0O(0.0f, new PointF(0.0f, 0.0f), null);
        }
        this.o0ooOoO.OooO00o = f3;
        this.o0ooOoO.OooO0O0.set(paddingLeft - (f * f3), paddingTop - (f2 * f3));
        OooooO0(true, this.o0ooOoO);
        return this.o0ooOoO.OooO0O0;
    }

    private int o000000() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation != 90 && requiredRotation != 270) {
            return this.Oooo;
        }
        return this.OoooO00;
    }

    private int o000OOo() {
        int requiredRotation = getRequiredRotation();
        if (requiredRotation != 90 && requiredRotation != 270) {
            return this.OoooO00;
        }
        return this.Oooo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o00O0O(float f) {
        return Math.min(this.OooOOoo, Math.max(o00Oo0(), f));
    }

    private float o00Oo0() {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i = this.OooOo0o;
        if (i != 2 && i != 4) {
            if (i == 3) {
                float f = this.OooOo00;
                if (f > 0.0f) {
                    return f;
                }
            }
            return Math.min((getWidth() - paddingLeft) / o000000(), (getHeight() - paddingBottom) / o000OOo());
        }
        return Math.max((getWidth() - paddingLeft) / o000000(), (getHeight() - paddingBottom) / o000OOo());
    }

    private void o0Oo0oo(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r1 != 262) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean o0ooOO0(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ambercore.C2353e50.o0ooOO0(android.view.MotionEvent):boolean");
    }

    private void o0ooOOo() {
        Float f;
        if (getWidth() != 0 && getHeight() != 0 && this.Oooo > 0 && this.OoooO00 > 0) {
            if (this.Oooo0oO != null && (f = this.Oooo0o) != null) {
                this.Oooo00o = f.floatValue();
                if (this.Oooo0O0 == null) {
                    this.Oooo0O0 = new PointF();
                }
                this.Oooo0O0.x = (getWidth() / 2) - (this.Oooo00o * this.Oooo0oO.x);
                this.Oooo0O0.y = (getHeight() / 2) - (this.Oooo00o * this.Oooo0oO.y);
                this.Oooo0oO = null;
                this.Oooo0o = null;
                Ooooo0o(true);
                o0OOO0o(true);
            }
            Ooooo0o(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointF ooOO(float f, float f2, float f3, PointF pointF) {
        PointF pointFO0000 = o0000(f, f2, f3);
        pointF.set(((getPaddingLeft() + (((getWidth() - getPaddingRight()) - getPaddingLeft()) / 2)) - pointFO0000.x) / f3, ((getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2)) - pointFO0000.y) / f3);
        return pointF;
    }

    public final int getAppliedOrientation() {
        return getRequiredRotation();
    }

    @Nullable
    public final PointF getCenter() {
        return o0000O00(getWidth() / 2, getHeight() / 2);
    }

    public final float getMinScale() {
        return o00Oo0();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z2 = false;
        if (mode != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (mode2 != 1073741824) {
            z2 = true;
        }
        if (this.Oooo > 0 && this.OoooO00 > 0) {
            if (z && z2) {
                size = o000000();
                size2 = o000OOo();
            } else if (z2) {
                size2 = (int) ((((double) o000OOo()) / ((double) o000000())) * ((double) size));
            } else if (z) {
                size = (int) ((((double) o000000()) / ((double) o000OOo())) * ((double) size2));
            }
        }
        setMeasuredDimension(Math.max(size, getSuggestedMinimumWidth()), Math.max(size2, getSuggestedMinimumHeight()));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        OoooOO0("onSizeChanged %dx%d -> %dx%d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2));
        PointF center = getCenter();
        if (this.o00Oo0 && center != null) {
            this.o00O0O = null;
            this.Oooo0o = Float.valueOf(this.Oooo00o);
            this.Oooo0oO = center;
        }
    }

    public final void setDoubleTapZoomDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setDoubleTapZoomScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMaximumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMinScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public final void setMinimumDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        setMaxScale(((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / i);
    }

    public void setMinimumTileDpi(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.OooOo0 = (int) Math.min((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f, i);
        if (o0OoOo0()) {
            o0OO00O(false);
            invalidate();
        }
    }

    public final void setTileBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.o0ooOOo = null;
        } else {
            Paint paint = new Paint();
            this.o0ooOOo = paint;
            paint.setStyle(Paint.Style.FILL);
            this.o0ooOOo.setColor(i);
        }
        invalidate();
    }

    public C2353e50(Context context) {
        this(context, null);
    }
}
