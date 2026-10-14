package ambercore;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amber.lib.statistical.StatisticalManager;
import com.amber.lib.tools.MD5Util;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.utils.Logger;
import com.spirit.ads.avazusdk.AvazuSdk;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ambercore.o000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C3470o000Oo {
    private static Set OooO0oO = new HashSet();
    private Context OooO00o;
    private String OooO0O0;
    private String OooO0OO;
    private WebView OooO0Oo;
    private DownloadListener OooO0o0 = new OooO00o();
    private WebViewClient OooO0o = new OooO0O0();

    /* JADX INFO: renamed from: ambercore.o000Oo$OooO00o */
    class OooO00o implements DownloadListener {
        OooO00o() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            C3470o000Oo.this.OooO0o(str);
        }
    }

    /* JADX INFO: renamed from: ambercore.o000Oo$OooO0O0 */
    class OooO0O0 extends WebViewClient {
        OooO0O0() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (C3470o000Oo.OooO0o0(str)) {
                C3470o000Oo.this.OooO0oO(str);
                return true;
            }
            webView.loadUrl(str);
            return true;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    private void OooO0Oo() {
        this.OooO0Oo = new WebView(this.OooO00o);
        OooO0oO.add(new SoftReference(this.OooO0Oo));
        WebView webView = this.OooO0Oo;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBlockNetworkImage(true);
        webView.setDownloadListener(this.OooO0o0);
        webView.setWebViewClient(this.OooO0o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooO0oO(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(8388608);
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(65536);
        Iterator<ResolveInfo> it = this.OooO00o.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                if ("com.android.vending".equals(next.activityInfo.packageName)) {
                    ActivityInfo activityInfo = next.activityInfo;
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                    break;
                }
            }
        }
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.OooO00o, intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TextUtils.isEmpty(Uri.parse(str).getQueryParameter("id"));
    }

    public static C3470o000Oo OooO0oo(Context context) {
        return new C3470o000Oo(context, "", "");
    }

    public void OooO(String str) {
        String strMD5 = MD5Util.MD5(System.currentTimeMillis() + AvazuSdk.getDeviceId());
        if (!TextUtils.isEmpty(str)) {
            str = str + "&clickid=" + strMD5;
        }
        HashMap map = new HashMap();
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, strMD5);
        StatisticalManager.getInstance().sendEvent(this.OooO00o, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "avazu_api_ad_click", map);
        if (OooO0o0(str)) {
            OooO0oO(str);
        } else {
            OooO0Oo();
            this.OooO0Oo.loadUrl(str);
        }
    }

    private C3470o000Oo(Context context, String str, String str2) {
        this.OooO00o = context;
        this.OooO0OO = str2;
        this.OooO0O0 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OooO0o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((DownloadManager) this.OooO00o.getSystemService(NativeAdPresenter.DOWNLOAD)).enqueue(new DownloadManager.Request(Uri.parse(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean OooO0o0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (!"play.google.com".equals(host) && !"market.android.com".equals(host) && !"market".equals(scheme)) {
            return false;
        }
        return true;
    }
}
