package ambercore;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.FileProvider;
import com.amber.hideu.browser.ui.home.HomeFragmentParent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ambercore.oO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4460oO0oO extends WebChromeClient implements InterfaceC4444oO0o0OoO {
    private final InterfaceC4447oO0o0o0 OooOO0O;
    private final InterfaceC1442Oe OooOO0o;
    private Uri OooOOO;
    private ValueCallback OooOOO0;

    /* JADX INFO: renamed from: ambercore.oO0oO$OooO00o */
    static final class OooO00o extends SuspendLambda implements P2 {
        int OooOO0O;
        final /* synthetic */ Message OooOOO0;

        @Override // ambercore.P2
        public final Object invoke(InterfaceC4994oOooo0 interfaceC4994oOooo0, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return ((OooO00o) create(interfaceC4994oOooo0, interfaceC4966oOooO0O0)).invokeSuspend(C7028ze0.OooO00o);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        OooO00o(Message message, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            super(2, interfaceC4966oOooO0O0);
            this.OooOOO0 = message;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4966oOooO0O0 create(Object obj, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
            return C4460oO0oO.this.new OooO00o(this.OooOOO0, interfaceC4966oOooO0O0);
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
                InterfaceC4447oO0o0o0 interfaceC4447oO0o0o0 = C4460oO0oO.this.OooOO0O;
                this.OooOO0O = 1;
                obj = interfaceC4447oO0o0o0.OooO0O0(this);
                if (obj == objOooO0o) {
                    return objOooO0o;
                }
            }
            Sl0 sl0 = (Sl0) obj;
            if (sl0 == null) {
                return C7028ze0.OooO00o;
            }
            C5957pU c5957pUOooOOO = sl0.OooOOO();
            if (c5957pUOooOOO == null) {
                return C7028ze0.OooO00o;
            }
            Object obj2 = this.OooOOO0.obj;
            if (obj2 instanceof WebView.WebViewTransport) {
                ((WebView.WebViewTransport) obj2).setWebView(c5957pUOooOOO);
            }
            this.OooOOO0.sendToTarget();
            return C7028ze0.OooO00o;
        }
    }

    private final void OooOO0o() {
        Uri uriFromFile;
        InterfaceC4447oO0o0o0 interfaceC4447oO0o0o0 = this.OooOO0O;
        if (!(interfaceC4447oO0o0o0 instanceof HomeFragmentParent) || ((HomeFragmentParent) interfaceC4447oO0o0o0).getContext() == null) {
            return;
        }
        File file = new File(C2466f40.OooO00o.OooO(), System.currentTimeMillis() + BrandSafetyUtils.a);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            Context context = ((HomeFragmentParent) this.OooOO0O).getContext();
            Intrinsics.checkNotNull(context);
            StringBuilder sb = new StringBuilder();
            Context context2 = ((HomeFragmentParent) this.OooOO0O).getContext();
            Intrinsics.checkNotNull(context2);
            sb.append(context2.getPackageName());
            sb.append(".fileProvider");
            uriFromFile = FileProvider.getUriForFile(context, sb.toString(), file);
        } else {
            uriFromFile = Uri.fromFile(file);
        }
        this.OooOOO = uriFromFile;
        intent.putExtra("output", uriFromFile);
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), "Select image");
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Parcelable[]{intent});
        ActivityResultLauncher activityResultLauncherO0000oOO = ((HomeFragmentParent) this.OooOO0O).o0000oOO();
        if (activityResultLauncherO0000oOO != null) {
            activityResultLauncherO0000oOO.launch(intentCreateChooser);
        }
    }

    public final void OooO0o(int i, Intent intent) {
        if (i == -1) {
            ArrayList arrayList = new ArrayList();
            if (intent != null) {
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        ClipData.Item itemAt = clipData.getItemAt(i2);
                        Intrinsics.checkNotNullExpressionValue(itemAt, "getItemAt(...)");
                        arrayList.add(itemAt.getUri());
                    }
                }
                String dataString = intent.getDataString();
                if (dataString != null) {
                    arrayList.clear();
                    arrayList.add(Uri.parse(dataString));
                }
            } else {
                Uri uri = this.OooOOO;
                if (uri != null) {
                    arrayList.add(uri);
                }
            }
            if (arrayList.isEmpty()) {
                ValueCallback valueCallback = this.OooOOO0;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                ValueCallback valueCallback2 = this.OooOOO0;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(arrayList.toArray(new Uri[0]));
                }
            }
        } else {
            ValueCallback valueCallback3 = this.OooOOO0;
            if (valueCallback3 != null) {
                valueCallback3.onReceiveValue(null);
            }
        }
        this.OooOOO0 = null;
        this.OooOOO = null;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        C3949o0Ooo0O.OooO0OO("TAG", "onHideCustomView: ", null, 4, null);
        InterfaceC1442Oe interfaceC1442Oe = this.OooOO0o;
        if (interfaceC1442Oe != null) {
            interfaceC1442Oe.OooO0O0();
        }
    }

    public C4460oO0oO(InterfaceC4447oO0o0o0 mUi, InterfaceC1442Oe interfaceC1442Oe) {
        Intrinsics.checkNotNullParameter(mUi, "mUi");
        this.OooOO0O = mUi;
        this.OooOO0o = interfaceC1442Oe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 OooO(int i, List list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        return C7028ze0.OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OooO0oO(C4460oO0oO c4460oO0oO, WebView webView, String str) {
        c4460oO0oO.OooOO0O.OooOO0o(webView.getUrl(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 OooO0oo(RW access) {
        Intrinsics.checkNotNullParameter(access, "$this$access");
        access.OooOO0(new Q2() { // from class: ambercore.oO0oO0Oo
            @Override // ambercore.Q2
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C4460oO0oO.OooO(((Integer) obj).intValue(), (List) obj2, ((Boolean) obj3).booleanValue());
            }
        });
        access.OooO0oo(new Q2() { // from class: ambercore.oO0oO0oO
            @Override // ambercore.Q2
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C4460oO0oO.OooOO0(((Integer) obj).intValue(), (List) obj2, (List) obj3);
            }
        });
        return C7028ze0.OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7028ze0 OooOO0(int i, List list, List list2) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(list2, "<unused var>");
        return C7028ze0.OooO00o;
    }

    private final void OooOO0O(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String str;
        ValueCallback valueCallback2 = this.OooOOO0;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        this.OooOOO0 = valueCallback;
        String[] acceptTypes = fileChooserParams != null ? fileChooserParams.getAcceptTypes() : null;
        boolean z = false;
        if ((acceptTypes != null ? acceptTypes.length : 0) > 0) {
            if (acceptTypes != null && (str = acceptTypes[0]) != null && kotlin.text.OooOO0.o000oOoO(str, "image", false, 2, null)) {
                z = true;
            }
            if (z) {
                OooOO0o();
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        this.OooOO0O.OooOOo0();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean z, boolean z2, Message message) {
        Intrinsics.checkNotNullParameter(view, "view");
        if ((!z2 && !Build.MANUFACTURER.equals("vivo")) || message == null) {
            return false;
        }
        AbstractC4506oO0oo0OO.OooO0Oo(AbstractC4999oOooo0O.OooO00o(C5469ooOO00O.OooO0OO()), null, null, new OooO00o(message, null), 3, null);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        InterfaceC1442Oe interfaceC1442Oe = this.OooOO0o;
        if (interfaceC1442Oe != null) {
            interfaceC1442Oe.OooO00o(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        InterfaceC4447oO0o0o0 interfaceC4447oO0o0o0 = this.OooOO0O;
        if ((interfaceC4447oO0o0o0 instanceof HomeFragmentParent) && ((HomeFragmentParent) interfaceC4447oO0o0o0).getContext() != null) {
            C2466f40 c2466f40 = C2466f40.OooO00o;
            Context context = ((HomeFragmentParent) this.OooOO0O).getContext();
            Intrinsics.checkNotNull(context);
            if (c2466f40.OooOO0O(context)) {
                Context context2 = ((HomeFragmentParent) this.OooOO0O).getContext();
                Intrinsics.checkNotNull(context2);
                if (AbstractC6363tH.OooO0OO(context2, 0, "android.permission.CAMERA")) {
                    OooOO0O(valueCallback, fileChooserParams);
                    return true;
                }
                Context context3 = ((HomeFragmentParent) this.OooOO0O).getContext();
                Intrinsics.checkNotNull(context3);
                B4.OooO0Oo(context3, "android.permission.CAMERA", new L2() { // from class: ambercore.oO0oO0O
                    @Override // ambercore.L2
                    public final Object invoke(Object obj) {
                        return C4460oO0oO.OooO0oo((RW) obj);
                    }
                });
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        this.OooOO0O.OooO0o0(i);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        this.OooOO0O.OooO(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(final WebView webView, final String str, boolean z) {
        super.onReceivedTouchIconUrl(webView, str, z);
        if (webView != null) {
            webView.post(new Runnable() { // from class: ambercore.oOo00OoO
                @Override // java.lang.Runnable
                public final void run() {
                    C4460oO0oO.OooO0oO(this.OooOO0O, webView, str);
                }
            });
        }
    }
}
