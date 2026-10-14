package ambercore;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: renamed from: ambercore.jA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2901jA extends ContentObserver {
    private ArrayList OooO00o;
    private Context OooO0O0;
    private Boolean OooO0OO;

    /* JADX INFO: renamed from: ambercore.jA$OooO0O0 */
    private static class OooO0O0 {
        private static final C2901jA OooO00o = new C2901jA();
    }

    private C2901jA() {
        super(new Handler(Looper.getMainLooper()));
        this.OooO0OO = Boolean.FALSE;
    }

    public void OooO00o(TD td) {
        if (td == null) {
            return;
        }
        if (this.OooO00o == null) {
            this.OooO00o = new ArrayList();
        }
        if (this.OooO00o.contains(td)) {
            return;
        }
        this.OooO00o.add(td);
    }

    public void OooO0Oo(TD td) {
        ArrayList arrayList;
        if (this.OooO0OO.booleanValue()) {
            this.OooO0O0.getContentResolver().unregisterContentObserver(this);
            this.OooO0OO = Boolean.FALSE;
        }
        this.OooO0O0 = null;
        if (td == null || (arrayList = this.OooO00o) == null) {
            return;
        }
        arrayList.remove(td);
    }

    public static C2901jA OooO0O0() {
        return OooO0O0.OooO00o;
    }

    public void OooO0OO(Context context) {
        Uri uriFor;
        this.OooO0O0 = context.getApplicationContext();
        if (context.getContentResolver() != null && !this.OooO0OO.booleanValue()) {
            if (AE.OooO0oO()) {
                uriFor = Settings.Global.getUriFor("force_fsg_nav_bar");
            } else if (AE.OooO0OO()) {
                if (!AE.OooO0o()) {
                    uriFor = Settings.Global.getUriFor("navigationbar_is_min");
                } else {
                    uriFor = Settings.System.getUriFor("navigationbar_is_min");
                }
            } else {
                uriFor = null;
            }
            if (uriFor != null) {
                context.getContentResolver().registerContentObserver(uriFor, true, this);
                this.OooO0OO = Boolean.TRUE;
            }
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        ArrayList arrayList;
        int i;
        super.onChange(z);
        Context context = this.OooO0O0;
        if (context != null && context.getContentResolver() != null && (arrayList = this.OooO00o) != null && !arrayList.isEmpty()) {
            if (AE.OooO0oO()) {
                i = Settings.Global.getInt(this.OooO0O0.getContentResolver(), "force_fsg_nav_bar", 0);
            } else if (AE.OooO0OO()) {
                if (!AE.OooO0o()) {
                    i = Settings.Global.getInt(this.OooO0O0.getContentResolver(), "navigationbar_is_min", 0);
                } else {
                    i = Settings.System.getInt(this.OooO0O0.getContentResolver(), "navigationbar_is_min", 0);
                }
            } else {
                i = 0;
            }
            for (TD td : this.OooO00o) {
                boolean z2 = true;
                if (i == 1) {
                    z2 = false;
                }
                td.OooO00o(z2);
            }
        }
    }
}
