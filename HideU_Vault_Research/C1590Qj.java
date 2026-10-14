package ambercore;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.util.Pair;
import com.anddoes.launcher.LauncherReceiver;
import com.anddoes.launcher.preference.ProcessPreference;
import com.calculator.hideu.HideUApplication;
import com.calculator.hideu.hideapps.HideAppsSp;
import com.calculator.hideu.hideapps.bean.AppHiddenBean;
import com.calculator.hideu.launcher.config.Definitions$ItemPosition;
import com.calculator.hideu.launcher.config.Definitions$ItemState;
import com.calculator.hideu.launcher.config.Definitions$ItemType;
import com.calculator.hideu.launcher.initialize.action.LauncherAction;
import com.calculator.hideu.launcher.initialize.shortcut.LauncherShortcut;
import com.calculator.hideu.launcher.initialize.widget.LauncherWidget;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ambercore.Qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C1590Qj {
    private final C4651oOOOO0O OooO00o;
    private final SparseArray OooO0O0 = new SparseArray();
    private volatile Set OooO0OO;
    private final ProcessPreference OooO0Oo;

    /* JADX INFO: renamed from: ambercore.Qj$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(Object obj);
    }

    /* JADX INFO: renamed from: ambercore.Qj$OooO0OO */
    public interface OooO0OO {
        void OooO00o();

        void OooO0O0();
    }

    private boolean OoooO(C6507uj c6507uj, List list) {
        if (c6507uj != null) {
            for (int i = 0; i < list.size(); i++) {
                if (Oooo0oo(c6507uj, (AppHiddenBean) list.get(i))) {
                    this.OooO00o.OooO00o(c6507uj.OooO0o0());
                    this.OooO0O0.remove(c6507uj.OooO0o0());
                    this.OooO0OO.remove(c6507uj.OooOO0O());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ambercore.Qj$OooO00o */
    static /* synthetic */ class OooO00o {
        static final /* synthetic */ int[] OooO00o;

        static {
            int[] iArr = new int[Definitions$ItemType.values().length];
            OooO00o = iArr;
            try {
                iArr[Definitions$ItemType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OooO00o[Definitions$ItemType.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OooO00o[Definitions$ItemType.SHORTCUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OooO00o[Definitions$ItemType.WIDGET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OooO00o[Definitions$ItemType.APP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OooO0OO(C1590Qj c1590Qj, C6507uj c6507uj, int i) {
        C4652oOOOO0Oo c4652oOOOO0OoOooO0o0 = c1590Qj.OooO00o.OooO0o0(c6507uj.OooO0o0());
        if (c4652oOOOO0OoOooO0o0 == null) {
            return;
        }
        try {
            ArrayList<C6507uj> arrayList = new ArrayList();
            JSONArray jSONArray = new JSONObject(c4652oOOOO0OoOooO0o0.OooO0OO()).getJSONArray("itemIds");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                int i3 = jSONArray.getInt(i2);
                C6507uj c6507ujOooOOo = c1590Qj.OooOOo(c1590Qj.OooO00o.OooO0o0(i3));
                if (c6507ujOooOOo == null) {
                    c1590Qj.OooO00o.OooO00o(i3);
                    c1590Qj.OooO0O0.remove(i3);
                } else if (c6507ujOooOOo.OooO0oo() != Definitions$ItemType.SHORTCUT) {
                    arrayList.add(c6507ujOooOOo);
                } else {
                    c6507ujOooOOo.Oooo0o0(c6507uj.OooOOO0());
                    c6507ujOooOOo.OoooO0(c6507uj.OooOOoo());
                    c6507ujOooOOo.OoooO0O(c6507uj.OooOo00());
                    c6507ujOooOOo.Oooo000(c6507uj.OooO0oO());
                    c6507ujOooOOo.Oooo(Definitions$ItemState.Visible);
                    GY.OooO0Oo().OooO0OO().OoooOoO(c6507ujOooOOo);
                }
            }
            c1590Qj.OooO00o.OooO00o(c6507uj.OooO0o0());
            c1590Qj.OooO0O0.remove(c6507uj.OooO0o0());
            if (!C6832xn.OooO0Oo && !com.anddoes.launcher.OooO00o.OoooO0O(HideUApplication.getAppContext())) {
                C3950o0Ooo0O0.OooO00o("Qin", c1590Qj.OooOoo0(Collections.singletonList(Integer.valueOf(i))).toString());
                List listOooO0Oo = H80.OooO0Oo(c1590Qj.OooOoo0(Collections.singletonList(Integer.valueOf(i))));
                C3950o0Ooo0O0.OooO00o("Qin", listOooO0Oo.toString());
                for (C6507uj c6507uj2 : arrayList) {
                    Pair pairOooO0oO = H80.OooO0oO(listOooO0Oo);
                    C3950o0Ooo0O0.OooO00o("Qin", c6507uj2.toString());
                    C3950o0Ooo0O0.OooO00o("Qin", pairOooO0oO.toString());
                    c6507uj2.Oooo0o0(((Integer) pairOooO0oO.first).intValue());
                    c6507uj2.OoooO0(((Point) pairOooO0oO.second).x);
                    c6507uj2.OoooO0O(((Point) pairOooO0oO.second).y);
                    c6507uj2.Oooo(Definitions$ItemState.Visible);
                    c6507uj2.Oooo000(Definitions$ItemPosition.Desktop);
                    GY.OooO0Oo().OooO0OO().OoooOoO(c6507uj2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void OooO0o(C1590Qj c1590Qj, final OooO0O0 oooO0O0, int i) {
        if (oooO0O0 == null) {
            c1590Qj.getClass();
            return;
        }
        C4652oOOOO0Oo c4652oOOOO0OoOooO0o0 = c1590Qj.OooO00o.OooO0o0(i);
        if (c4652oOOOO0OoOooO0o0 == null) {
            AbstractC7050zo.OooO0O0(new Runnable() { // from class: ambercore.Fj
                @Override // java.lang.Runnable
                public final void run() {
                    oooO0O0.OooO00o(null);
                }
            });
        }
        final C6507uj c6507ujOooOOo = c1590Qj.OooOOo(c4652oOOOO0OoOooO0o0);
        AbstractC7050zo.OooO0O0(new Runnable() { // from class: ambercore.Gj
            @Override // java.lang.Runnable
            public final void run() {
                oooO0O0.OooO00o(c6507ujOooOOo);
            }
        });
    }

    public static /* synthetic */ void OooOO0O(C1590Qj c1590Qj, int i, int i2) {
        C4652oOOOO0Oo c4652oOOOO0OoOooO0o0 = c1590Qj.OooO00o.OooO0o0(i);
        if (c4652oOOOO0OoOooO0o0 == null) {
            return;
        }
        C6507uj c6507ujOooOOo = c1590Qj.OooOOo(c4652oOOOO0OoOooO0o0);
        C6507uj c6507uj = null;
        for (C6507uj c6507uj2 : c6507ujOooOOo.OooO()) {
            if (c6507uj2.OooO0o0() == i2) {
                c6507uj = c6507uj2;
            }
        }
        c6507ujOooOOo.OooO().remove(c6507uj);
        c4652oOOOO0OoOooO0o0.OooOOO0(c6507ujOooOOo.OooOo0());
        c4652oOOOO0OoOooO0o0.OooOOOO(c6507ujOooOOo.OooOOO0());
        c4652oOOOO0OoOooO0o0.OooOOOo(c6507ujOooOOo.OooO0oO().ordinal());
        c4652oOOOO0OoOooO0o0.OooOOo(c6507ujOooOOo.OooOOoo());
        c4652oOOOO0OoOooO0o0.OooOOoo(c6507ujOooOOo.OooOo00());
        c1590Qj.OooO00o.OooOO0o(c4652oOOOO0OoOooO0o0);
        c1590Qj.OooO0O0.put(c6507ujOooOOo.OooO0o0(), c6507ujOooOOo);
    }

    public static /* synthetic */ void OooOO0o(C1590Qj c1590Qj, C6507uj c6507uj) {
        c1590Qj.OooO00o.OooO00o(c6507uj.OooO0o0());
        c1590Qj.OooO0O0.remove(c6507uj.OooO0o0());
    }

    private C6507uj OooOOo(C4652oOOOO0Oo c4652oOOOO0Oo) {
        if (c4652oOOOO0Oo == null) {
            return null;
        }
        C6507uj c6507uj = new C6507uj(c4652oOOOO0Oo.OooO0o0(), c4652oOOOO0Oo.OooO00o() == 1, c4652oOOOO0Oo.OooO0O0() == 1);
        c6507uj.Oooo00O(Definitions$ItemType.get(c4652oOOOO0Oo.OooOO0()));
        c6507uj.Oooo0(c4652oOOOO0Oo.OooO0o());
        if (c4652oOOOO0Oo.OooO0Oo() != null) {
            c6507uj.OooOooo(BitmapFactory.decodeByteArray(c4652oOOOO0Oo.OooO0Oo(), 0, c4652oOOOO0Oo.OooO0Oo().length));
        }
        c6507uj.OoooO0(c4652oOOOO0Oo.OooOO0O());
        c6507uj.OoooO0O(c4652oOOOO0Oo.OooOO0o());
        c6507uj.Oooo0o0(c4652oOOOO0Oo.OooO0oO());
        c6507uj.Oooo000(Definitions$ItemPosition.get(c4652oOOOO0Oo.OooO0oo()));
        c6507uj.Oooo(Definitions$ItemState.get(c4652oOOOO0Oo.OooO()));
        try {
            JSONObject jSONObject = new JSONObject(c4652oOOOO0Oo.OooO0OO());
            int i = OooO00o.OooO00o[c6507uj.OooO0oo().ordinal()];
            if (i == 1) {
                JSONArray jSONArray = jSONObject.getJSONArray("itemIds");
                c6507uj.Oooo00o(new ArrayList(jSONArray.length()));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    int i3 = jSONArray.getInt(i2);
                    C6507uj c6507ujOooOOo = OooOOo(this.OooO00o.OooO0o0(i3));
                    if (c6507ujOooOOo != null) {
                        c6507uj.OooO().add(c6507ujOooOOo);
                    } else {
                        this.OooO00o.OooO00o(i3);
                    }
                }
            } else {
                if (i == 2) {
                    c6507uj.OooOoo(LauncherAction.Action.valueOf(jSONObject.getString("action")));
                    c6507uj.Oooo0oO(jSONObject.getInt("spanX"));
                    c6507uj.Oooo0oo(jSONObject.getInt("spanY"));
                    return c6507uj;
                }
                if (i == 3) {
                    c6507uj.Oooo0o(LauncherShortcut.Shortcut.valueOf(jSONObject.getString("shortcut")));
                    c6507uj.Oooo0oO(jSONObject.getInt("spanX"));
                    c6507uj.Oooo0oo(jSONObject.getInt("spanY"));
                    return c6507uj;
                }
                if (i == 4) {
                    c6507uj.OoooO00(LauncherWidget.Widget.valueOf(jSONObject.getString("widget")));
                    c6507uj.Oooo0oO(jSONObject.getInt("spanX"));
                    c6507uj.Oooo0oo(jSONObject.getInt("spanY"));
                    return c6507uj;
                }
                if (i == 5) {
                    String string = jSONObject.getString("packageName");
                    String string2 = jSONObject.getString("packageIntent");
                    c6507uj.Oooo0OO(string);
                    c6507uj.Oooo0O0(string2);
                    return c6507uj;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            C3950o0Ooo0O0.OooOOOO("parse data json error:");
            if (c6507uj.OooO0oo() == Definitions$ItemType.GROUP) {
                HashMap map = new HashMap();
                map.put("get_group", c4652oOOOO0Oo.OooO0OO());
                C5922p90.OooOOO0("test_hideu_launcher_get_group", map);
            }
        }
        return c6507uj;
    }

    private void OooOOoo() {
        if (C4567oOO0O0o0.OooO00o.OooO00o().OooO0oo()) {
            C3899o0Oo0o00.Oooo0OO = false;
            return;
        }
        E4 e4 = E4.OooO0O0;
        if (C6454u80.OooO00o.OooO0o0(e4.OooOOo(), e4.OooOOo0(), TimeZone.getDefault())) {
            return;
        }
        C3899o0Oo0o00.Oooo0OO = true;
    }

    private void Oooo() {
        this.OooO0Oo.OooOo0o();
        LauncherReceiver.OooO0o(HideUApplication.OooOO0o);
    }

    private C6507uj Oooo00o(Map map, int i, int i2, int i3) {
        C6507uj c6507uj = (C6507uj) map.get(i + "," + i2 + "," + i3);
        if (c6507uj == null) {
            return null;
        }
        int iOooOOO0 = c6507uj.OooOOO0();
        int iOooOOoo = c6507uj.OooOOoo();
        int iOooOo00 = c6507uj.OooOo00();
        if (i == iOooOOO0 && i2 == iOooOOoo && i3 == iOooOo00) {
            return c6507uj;
        }
        return null;
    }

    private C6507uj Oooo0oO(Map map, int[][] iArr, int i, int i2, int i3, C6507uj c6507uj) {
        if (iArr[i2][i3] == 0) {
            c6507uj.Oooo0o0(i);
            c6507uj.OoooO0(i2);
            c6507uj.OoooO0O(i3);
            return null;
        }
        C6507uj c6507ujOooo00o = Oooo00o(map, i, i2, i3);
        c6507uj.Oooo0o0(i);
        c6507uj.OoooO0(i2);
        c6507uj.OoooO0O(i3);
        return c6507ujOooo00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List OoooO00(boolean z, List list, List list2) {
        C6507uj c6507ujOooOoOO;
        C6507uj c6507ujOooOoOO2;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        C3950o0Ooo0O0.OooO0OO("Qin rePositionItemAfterRestoreIfNeed isDefaultLauncher " + z4);
        boolean zOooOoO0 = HideAppsSp.OooO0O0.OooOoO0();
        C4006o0o00oo c4006o0o00ooOooO0O0 = GY.OooO0Oo().OooO0O0();
        int iOooO0Oo = c4006o0o00ooOooO0O0.OooO0Oo();
        int iOooOO0 = c4006o0o00ooOooO0O0.OooOO0();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        C6507uj c6507uj = null;
        C6507uj c6507uj2 = null;
        C6507uj c6507uj3 = null;
        C6507uj c6507uj4 = null;
        while (it.hasNext()) {
            C6507uj c6507ujOooOOo = OooOOo((C4652oOOOO0Oo) it.next());
            if (c6507ujOooOOo.OooOOoo() >= iOooO0Oo || c6507ujOooOOo.OooOo00() >= iOooOO0) {
                list2.add(c6507ujOooOOo);
            } else {
                arrayList.add(c6507ujOooOOo);
            }
            if (c6507ujOooOOo.OooO0oo() == Definitions$ItemType.GROUP) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (C6507uj c6507uj5 : c6507ujOooOOo.OooO()) {
                    if (z4) {
                        z3 = zOooOoO0;
                    } else {
                        z3 = zOooOoO0;
                        if (c6507uj5.OooOOO() == LauncherShortcut.Shortcut.RESTORE) {
                            arrayList3.add(c6507uj5);
                        } else if (!z3 && this.OooO0OO.contains(c6507uj5.OooOO0O())) {
                            arrayList3.add(c6507uj5);
                        } else {
                            arrayList2.add(c6507uj5);
                        }
                    }
                    if (c6507uj5.OooOOO() == LauncherShortcut.Shortcut.HIDE_APPS) {
                        c6507uj2 = c6507ujOooOOo;
                    } else if (c6507uj5.OooOOO() == LauncherShortcut.Shortcut.RESTORE) {
                        c6507uj4 = c6507ujOooOOo;
                    }
                    z4 = z;
                    zOooOoO0 = z3;
                }
                z2 = zOooOoO0;
                if (arrayList2.size() == 1) {
                    list2.addAll(arrayList3);
                    C6507uj c6507uj6 = (C6507uj) arrayList2.get(0);
                    c6507uj6.Oooo0o0(c6507ujOooOOo.OooOOO0());
                    c6507uj6.OoooO0(c6507ujOooOOo.OooOOoo());
                    c6507uj6.OoooO0O(c6507ujOooOOo.OooOo00());
                    c6507uj6.Oooo000(Definitions$ItemPosition.Desktop);
                    c6507uj6.Oooo(Definitions$ItemState.Visible);
                    arrayList.add(c6507uj6);
                    GY.OooO0Oo().OooO0OO().OoooOoO(c6507uj6);
                    arrayList.remove(c6507ujOooOOo);
                    GY.OooO0Oo().OooO0OO().OooOo0O(c6507ujOooOOo);
                }
            } else {
                z2 = zOooOoO0;
                if (c6507ujOooOOo.OooOOO() == LauncherShortcut.Shortcut.HIDE_APPS) {
                    c6507uj = c6507ujOooOOo;
                } else if (c6507ujOooOOo.OooOOO() == LauncherShortcut.Shortcut.RESTORE) {
                    c6507uj3 = c6507ujOooOOo;
                }
            }
            z4 = z;
            zOooOoO0 = z2;
        }
        List listOooO0Oo = H80.OooO0Oo(arrayList);
        C6507uj c6507ujOooOOo2 = OooOOo(this.OooO00o.OooO(LauncherShortcut.Shortcut.HIDE_MORE));
        boolean zEquals = com.calculator.hideu.remoteconfig.OooO00o.OooO00o.OooOo0O().equals("B");
        C3950o0Ooo0O0.OooO0OO("Qin prepare set hide more " + zEquals);
        C3950o0Ooo0O0.OooO0OO(String.valueOf(c6507ujOooOOo2));
        C3950o0Ooo0O0.OooO0OO(arrayList.toString());
        if (!zEquals) {
            arrayList.remove(c6507ujOooOOo2);
        }
        C3950o0Ooo0O0.OooO0OO(arrayList.toString());
        if (z) {
            C4651oOOOO0O c4651oOOOO0O = this.OooO00o;
            LauncherShortcut.Shortcut shortcut = LauncherShortcut.Shortcut.RESTORE;
            if (OooOOo(c4651oOOOO0O.OooO(shortcut)) == null) {
                Pair pairOooO0oO = H80.OooO0oO(listOooO0Oo);
                if (c6507uj == null && c6507uj2 == null) {
                    c6507ujOooOoOO2 = C6507uj.OooOoOO(Definitions$ItemPosition.Desktop, -1, 0, 0, shortcut, null, true, false);
                } else {
                    if (c6507uj == null) {
                        c6507uj = c6507uj2;
                    }
                    int[] iArrOooOo0o = OooOo0o(c6507uj, ((Integer) pairOooO0oO.first).intValue() != 0);
                    C6507uj c6507ujOooOoOO3 = C6507uj.OooOoOO(Definitions$ItemPosition.Desktop, iArrOooOo0o[0], iArrOooOo0o[1], iArrOooOo0o[2], shortcut, null, true, false);
                    try {
                        if (((int[][]) listOooO0Oo.get(c6507ujOooOoOO3.OooOOO0()))[c6507ujOooOoOO3.OooOOoo()][c6507ujOooOoOO3.OooOo00()] != 0) {
                            OoooOO0(c6507ujOooOoOO3, arrayList, listOooO0Oo);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    c6507ujOooOoOO2 = c6507ujOooOoOO3;
                }
                if (c6507ujOooOoOO2.OooOOO0() == -1) {
                    c6507ujOooOoOO2.Oooo0o0(((Integer) pairOooO0oO.first).intValue());
                    c6507ujOooOoOO2.OoooO0(((Point) pairOooO0oO.second).x);
                    c6507ujOooOoOO2.OoooO0O(((Point) pairOooO0oO.second).y);
                }
                c6507ujOooOoOO2.Oooo0(LauncherShortcut.Shortcut.RESTORE.name());
                this.OooO00o.OooOO0(c6507ujOooOoOO2.OoooOO0());
                arrayList.add(c6507ujOooOoOO2);
                c6507uj3 = c6507ujOooOoOO2;
            }
            if (zEquals) {
                C3950o0Ooo0O0.OooO0OO("Qin hide more " + c6507ujOooOOo2);
                if (c6507ujOooOOo2 == null && z) {
                    List listOooO0Oo2 = H80.OooO0Oo(arrayList);
                    Pair pairOooO0oO2 = H80.OooO0oO(listOooO0Oo2);
                    C3950o0Ooo0O0.OooO0OO("Qin hide more space " + pairOooO0oO2);
                    C3950o0Ooo0O0.OooO0OO("Qin hide more space " + c6507uj3);
                    C3950o0Ooo0O0.OooO0OO("Qin hide more space " + c6507uj4);
                    if (c6507uj3 == null && c6507uj4 == null) {
                        c6507ujOooOoOO = C6507uj.OooOoOO(Definitions$ItemPosition.Desktop, -1, 0, 0, LauncherShortcut.Shortcut.HIDE_MORE, null, true, false);
                    } else {
                        if (c6507uj4 == null) {
                            c6507uj4 = c6507uj3;
                        }
                        int[] iArrOooOo0o2 = OooOo0o(c6507uj4, ((Integer) pairOooO0oO2.first).intValue() != 0);
                        C6507uj c6507ujOooOoOO4 = C6507uj.OooOoOO(Definitions$ItemPosition.Desktop, iArrOooOo0o2[0], iArrOooOo0o2[1], iArrOooOo0o2[2], LauncherShortcut.Shortcut.HIDE_MORE, null, true, false);
                        C3950o0Ooo0O0.OooO0OO("Qin new hide more " + c6507ujOooOoOO4);
                        try {
                            boolean z5 = ((int[][]) listOooO0Oo2.get(c6507ujOooOoOO4.OooOOO0()))[c6507ujOooOoOO4.OooOOoo()][c6507ujOooOoOO4.OooOo00()] == 0;
                            C3950o0Ooo0O0.OooO0OO("Qin isCorrectPos " + z5);
                            if (!z5) {
                                OoooOO0(c6507ujOooOoOO4, arrayList, listOooO0Oo2);
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        c6507ujOooOoOO = c6507ujOooOoOO4;
                    }
                    if (c6507ujOooOoOO.OooOOO0() == -1) {
                        c6507ujOooOoOO.Oooo0o0(((Integer) pairOooO0oO2.first).intValue());
                        c6507ujOooOoOO.OoooO0(((Point) pairOooO0oO2.second).x);
                        c6507ujOooOoOO.OoooO0O(((Point) pairOooO0oO2.second).y);
                    }
                    c6507ujOooOoOO.Oooo0(LauncherShortcut.Shortcut.HIDE_MORE.name());
                    this.OooO00o.OooOO0(c6507ujOooOoOO.OoooOO0());
                    arrayList.add(c6507ujOooOoOO);
                }
                C3950o0Ooo0O0.OooO0OO("Qin rePosition items " + arrayList);
                return arrayList;
            }
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C6507uj c6507uj7 = (C6507uj) it2.next();
                Pair pairOooO0oO3 = H80.OooO0oO(listOooO0Oo);
                c6507uj7.Oooo0o0(((Integer) pairOooO0oO3.first).intValue());
                c6507uj7.OoooO0(((Point) pairOooO0oO3.second).x);
                c6507uj7.OoooO0O(((Point) pairOooO0oO3.second).y);
                c6507uj7.Oooo(Definitions$ItemState.Visible);
                c6507uj7.Oooo000(Definitions$ItemPosition.Desktop);
                GY.OooO0Oo().OooO0OO().OoooOoO(c6507uj7);
            }
        }
        return arrayList;
    }

    private void OoooOO0(C6507uj c6507uj, List list, List list2) {
        HashMap map;
        int i;
        int[][] iArr;
        HashMap map2;
        HashMap map3 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6507uj c6507uj2 = (C6507uj) it.next();
            map3.put(c6507uj2.OooOOO0() + "," + c6507uj2.OooOOoo() + "," + c6507uj2.OooOo00(), c6507uj2);
        }
        C4006o0o00oo c4006o0o00ooOooO0O0 = GY.OooO0Oo().OooO0O0();
        int iOooO0Oo = c4006o0o00ooOooO0O0.OooO0Oo();
        int iOooOO0 = c4006o0o00ooOooO0O0.OooOO0();
        C6507uj c6507uj3 = c6507uj;
        int i2 = 0;
        while (i2 < list2.size()) {
            int[][] iArr2 = (int[][]) list2.get(i2);
            if (i2 == 0) {
                int iOooOo00 = c6507uj.OooOo00();
                while (iOooOo00 >= 1) {
                    C6507uj c6507uj4 = c6507uj3;
                    int i3 = 0;
                    while (i3 < iOooO0Oo) {
                        if (iOooOo00 != c6507uj.OooOo00() || i3 >= c6507uj.OooOOoo()) {
                            C6507uj c6507ujOooo0oO = Oooo0oO(map3, iArr2, i2, i3, iOooOo00, c6507uj4);
                            i = i3;
                            iArr = iArr2;
                            map2 = map3;
                            OoooOoO(c6507uj4);
                            if (c6507ujOooo0oO == null) {
                                return;
                            } else {
                                c6507uj4 = c6507ujOooo0oO;
                            }
                        } else {
                            i = i3;
                            iArr = iArr2;
                            map2 = map3;
                        }
                        map3 = map2;
                        iArr2 = iArr;
                        i3 = i + 1;
                    }
                    iOooOo00--;
                    map3 = map3;
                    iArr2 = iArr2;
                    c6507uj3 = c6507uj4;
                }
                map = map3;
            } else {
                int[][] iArr3 = iArr2;
                map = map3;
                int i4 = 0;
                while (i4 < iOooOO0) {
                    C6507uj c6507uj5 = c6507uj3;
                    HashMap map4 = map;
                    int[][] iArr4 = iArr3;
                    int i5 = 0;
                    while (i5 < iOooO0Oo) {
                        C6507uj c6507ujOooo0oO2 = Oooo0oO(map4, iArr4, i2, i5, i4, c6507uj5);
                        HashMap map5 = map4;
                        int i6 = i5;
                        int[][] iArr5 = iArr4;
                        OoooOoO(c6507uj5);
                        if (c6507ujOooo0oO2 == null) {
                            return;
                        }
                        map4 = map5;
                        iArr4 = iArr5;
                        c6507uj5 = c6507ujOooo0oO2;
                        i5 = i6 + 1;
                    }
                    iArr3 = iArr4;
                    map = map4;
                    i4++;
                    c6507uj3 = c6507uj5;
                }
            }
            i2++;
            map3 = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OoooOOO(C6507uj c6507uj, String str) {
        C4652oOOOO0Oo c4652oOOOO0OoOooO0o0 = this.OooO00o.OooO0o0(c6507uj.OooO0o0());
        if (c4652oOOOO0OoOooO0o0 == null) {
            return;
        }
        if (str != null) {
            c4652oOOOO0OoOooO0o0.OooOOO(str);
        }
        c4652oOOOO0OoOooO0o0.OooOOO0(c6507uj.OooOo0());
        c4652oOOOO0OoOooO0o0.OooOOOO(c6507uj.OooOOO0());
        c4652oOOOO0OoOooO0o0.OooOOOo(c6507uj.OooO0oO().ordinal());
        c4652oOOOO0OoOooO0o0.OooOOo(c6507uj.OooOOoo());
        c4652oOOOO0OoOooO0o0.OooOOoo(c6507uj.OooOo00());
        this.OooO00o.OooOO0o(c4652oOOOO0OoOooO0o0);
        this.OooO0O0.put(c6507uj.OooO0o0(), c6507uj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OoooOOo(C6507uj c6507uj) {
        C4652oOOOO0Oo c4652oOOOO0OoOooO0o0 = this.OooO00o.OooO0o0(c6507uj.OooO0o0());
        if (c4652oOOOO0OoOooO0o0 != null) {
            c4652oOOOO0OoOooO0o0.OooOOOO(c6507uj.OooOOO0());
            c4652oOOOO0OoOooO0o0.OooOOOo(c6507uj.OooO0oO().ordinal());
            c4652oOOOO0OoOooO0o0.OooOOo0(c6507uj.OooOOo0().ordinal());
            c4652oOOOO0OoOooO0o0.OooOOo(c6507uj.OooOOoo());
            c4652oOOOO0OoOooO0o0.OooOOoo(c6507uj.OooOo00());
            this.OooO00o.OooOO0o(c4652oOOOO0OoOooO0o0);
            this.OooO0O0.put(c6507uj.OooO0o0(), c6507uj);
        }
    }

    public void OooOo00(final C6507uj c6507uj) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.xj
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooO0Oo(this.OooOO0O, c6507uj);
            }
        });
    }

    public void OooOo0O(final C6507uj c6507uj) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Jj
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooOO0o(this.OooOO0O, c6507uj);
            }
        });
    }

    public List OooOoO() {
        List listOooO0OO = this.OooO00o.OooO0OO();
        ArrayList arrayList = new ArrayList(listOooO0OO.size());
        Iterator it = listOooO0OO.iterator();
        while (it.hasNext()) {
            arrayList.add(OooOOo((C4652oOOOO0Oo) it.next()));
        }
        return arrayList;
    }

    public C6507uj OooOoO0(int i, int i2, int i3, Definitions$ItemPosition definitions$ItemPosition) {
        return OooOOo(this.OooO00o.OooO0oO(i, i2, i3, definitions$ItemPosition));
    }

    public List OooOoOO() {
        return OooOoo0(Collections.EMPTY_LIST);
    }

    public List OooOoo() {
        List listOooO0Oo = this.OooO00o.OooO0Oo();
        ArrayList arrayList = new ArrayList(listOooO0Oo.size());
        Iterator it = listOooO0Oo.iterator();
        while (it.hasNext()) {
            arrayList.add(OooOOo((C4652oOOOO0Oo) it.next()));
        }
        return arrayList;
    }

    public List OooOoo0(List list) {
        List listOooO0O0 = this.OooO00o.OooO0O0();
        ArrayList arrayList = new ArrayList(listOooO0O0.size());
        Iterator it = listOooO0O0.iterator();
        while (it.hasNext()) {
            C6507uj c6507ujOooOOo = OooOOo((C4652oOOOO0Oo) it.next());
            if (!list.contains(Integer.valueOf(c6507ujOooOOo.OooO0o0()))) {
                if (c6507ujOooOOo.OooO0oo() != Definitions$ItemType.APP) {
                    arrayList.add(c6507ujOooOOo);
                } else if (this.OooO0OO.contains(c6507ujOooOOo.OooOO0O())) {
                    arrayList.add(c6507ujOooOOo);
                }
            }
        }
        return arrayList;
    }

    public List OooOooO(boolean z, List list) {
        ArrayList arrayList = new ArrayList();
        List<C6507uj> listOoooO00 = OoooO00(z, this.OooO00o.OooO0oo(Definitions$ItemPosition.Desktop), list);
        boolean zOooOoO0 = HideAppsSp.OooO0O0.OooOoO0();
        for (C6507uj c6507uj : listOoooO00) {
            int iOooOOO0 = c6507uj.OooOOO0();
            while (iOooOOO0 >= arrayList.size()) {
                arrayList.add(new ArrayList());
            }
            if (c6507uj.OooO0oo() == Definitions$ItemType.APP) {
                if (this.OooO0OO.contains(c6507uj.OooOO0O())) {
                    if (z) {
                        ((List) arrayList.get(iOooOOO0)).add(c6507uj);
                    } else if (zOooOoO0) {
                        c6507uj.OooOooO(false);
                        ((List) arrayList.get(iOooOOO0)).add(c6507uj);
                    }
                }
            } else if (c6507uj.OooO0oo() == Definitions$ItemType.GROUP) {
                Iterator it = c6507uj.OooO().iterator();
                while (it.hasNext()) {
                    C6507uj c6507uj2 = (C6507uj) it.next();
                    if (!z) {
                        if (c6507uj2.OooOOO() == LauncherShortcut.Shortcut.RESTORE) {
                            it.remove();
                        } else if (this.OooO0OO.contains(c6507uj2.OooOO0O())) {
                            if (zOooOoO0) {
                                c6507uj2.OooOooO(false);
                            } else {
                                it.remove();
                            }
                        }
                    }
                }
                if (!c6507uj.OooO().isEmpty()) {
                    ((List) arrayList.get(iOooOOO0)).add(c6507uj);
                }
            } else if (c6507uj.OooOOO() != LauncherShortcut.Shortcut.RESTORE) {
                ((List) arrayList.get(iOooOOO0)).add(c6507uj);
            } else if (z) {
                ((List) arrayList.get(iOooOOO0)).add(c6507uj);
            }
        }
        return arrayList;
    }

    public List OooOooo(boolean z, List list) {
        boolean zOooOoO0 = HideAppsSp.OooO0O0.OooOoO0();
        List listOooO0oo = this.OooO00o.OooO0oo(Definitions$ItemPosition.Dock);
        ArrayList arrayList = new ArrayList(listOooO0oo.size());
        Iterator it = listOooO0oo.iterator();
        while (it.hasNext()) {
            C6507uj c6507ujOooOOo = OooOOo((C4652oOOOO0Oo) it.next());
            if (c6507ujOooOOo.OooO0oo() == Definitions$ItemType.APP) {
                if (this.OooO0OO.contains(c6507ujOooOOo.OooOO0O())) {
                    if (z) {
                        arrayList.add(c6507ujOooOOo);
                    } else if (zOooOoO0) {
                        c6507ujOooOOo.OooOooO(false);
                        arrayList.add(c6507ujOooOOo);
                    }
                }
            } else if (c6507ujOooOOo.OooO0oo() == Definitions$ItemType.GROUP) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = c6507ujOooOOo.OooO().iterator();
                while (it2.hasNext()) {
                    C6507uj c6507uj = (C6507uj) it2.next();
                    if (!z) {
                        if (c6507uj.OooOOO() == LauncherShortcut.Shortcut.RESTORE) {
                            it2.remove();
                            arrayList3.add(c6507uj);
                        } else if (!this.OooO0OO.contains(c6507uj.OooOO0O())) {
                            arrayList2.add(c6507uj);
                        } else if (zOooOoO0) {
                            c6507uj.OooOooO(false);
                            arrayList2.add(c6507uj);
                        } else {
                            it2.remove();
                            arrayList3.add(c6507uj);
                        }
                    }
                }
                if (!c6507ujOooOOo.OooO().isEmpty()) {
                    if (arrayList2.size() == 1) {
                        list.addAll(arrayList3);
                        C6507uj c6507uj2 = (C6507uj) arrayList2.get(0);
                        c6507uj2.Oooo0o0(c6507ujOooOOo.OooOOO0());
                        c6507uj2.OoooO0(c6507ujOooOOo.OooOOoo());
                        c6507uj2.OoooO0O(c6507ujOooOOo.OooOo00());
                        c6507uj2.Oooo000(Definitions$ItemPosition.Dock);
                        c6507uj2.Oooo(Definitions$ItemState.Visible);
                        arrayList.add(c6507uj2);
                        GY.OooO0Oo().OooO0OO().OoooOoO(c6507uj2);
                        GY.OooO0Oo().OooO0OO().OooOo0O(c6507ujOooOOo);
                    } else {
                        arrayList.add(c6507ujOooOOo);
                    }
                }
            } else if (c6507ujOooOOo.OooOOO() != LauncherShortcut.Shortcut.RESTORE) {
                arrayList.add(c6507ujOooOOo);
            } else if (z) {
                arrayList.add(c6507ujOooOOo);
            }
        }
        return arrayList;
    }

    public void Oooo0(final OooO0O0 oooO0O0, final OooO0O0 oooO0O02) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.yj
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooOOOO(this.OooOO0O, oooO0O0, oooO0O02);
            }
        });
    }

    public void Oooo000(final int i, final OooO0O0 oooO0O0) {
        C6507uj c6507uj = (C6507uj) this.OooO0O0.get(i);
        if (c6507uj == null || oooO0O0 == null) {
            AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Dj
                @Override // java.lang.Runnable
                public final void run() {
                    C1590Qj.OooO0o(this.OooOO0O, oooO0O0, i);
                }
            });
        } else {
            oooO0O0.OooO00o(c6507uj);
        }
    }

    public C6507uj Oooo00O(int i) {
        return OooOOo(this.OooO00o.OooO0o(i));
    }

    public void Oooo0O0(final List list, final OooO0O0 oooO0O0) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Nj
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooO00o(this.OooOO0O, list, oooO0O0);
            }
        });
    }

    public void Oooo0OO(final List list, final OooO0OO oooO0OO) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Oj
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooO0o0(this.OooOO0O, list, oooO0OO);
            }
        });
    }

    public boolean Oooo0o(String str) {
        return this.OooO0OO.contains(str);
    }

    public void OoooO0(final int i, final int i2) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Cj
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooOO0O(this.OooOO0O, i, i2);
            }
        });
    }

    public void OoooO0O(final List list, final OooO0OO oooO0OO) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Kj
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooO(this.OooOO0O, list, oooO0OO);
            }
        });
    }

    public void OoooOo0(final C6507uj c6507uj, final String str) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Ij
            @Override // java.lang.Runnable
            public final void run() {
                this.OooOO0O.OoooOOO(c6507uj, str);
            }
        });
    }

    public void OoooOoO(final C6507uj c6507uj) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Hj
            @Override // java.lang.Runnable
            public final void run() {
                this.OooOO0O.OoooOOo(c6507uj);
            }
        });
    }

    public void OoooOoo(final List list) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Lj
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooOO0(this.OooOO0O, list);
            }
        });
    }

    public void o000oOoO(final List list, final OooO0OO oooO0OO) {
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Pj
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooOOo0(this.OooOO0O, list, oooO0OO);
            }
        });
    }

    public C1590Qj(Context context) {
        ProcessPreference processPreferenceOooO0oO = C3279mo.OooO0Oo(HideUApplication.OooOO0o).OooO0oO();
        this.OooO0Oo = processPreferenceOooO0oO;
        this.OooO00o = new C4651oOOOO0O(context.getApplicationContext());
        this.OooO0OO = new HashSet(processPreferenceOooO0oO.OooOo0o());
    }

    public static /* synthetic */ void OooO(C1590Qj c1590Qj, List list, final OooO0OO oooO0OO) {
        List listOooOoOO = c1590Qj.OooOoOO();
        for (int i = 0; i < listOooOoOO.size(); i++) {
            C6507uj c6507uj = (C6507uj) listOooOoOO.get(i);
            if (c6507uj.OooO0oo() == Definitions$ItemType.GROUP) {
                List listOooO = c6507uj.OooO();
                if (listOooO != null) {
                    Iterator it = listOooO.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        if (c1590Qj.OoooO((C6507uj) it.next(), list)) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (z) {
                        if (listOooO.size() > 1) {
                            c1590Qj.OoooOOO(c6507uj, c6507uj.OooOO0());
                        } else if (listOooO.size() == 1) {
                            c1590Qj.OooO00o.OooO00o(c6507uj.OooO0o0());
                            c1590Qj.OooO0O0.remove(c6507uj.OooO0o0());
                            C6507uj c6507uj2 = (C6507uj) listOooO.get(0);
                            if (c6507uj2 != null) {
                                c6507uj2.OoooO0(c6507uj.OooOOoo());
                                c6507uj2.OoooO0O(c6507uj.OooOo00());
                                c6507uj2.Oooo(Definitions$ItemState.Visible);
                                c6507uj2.Oooo0o0(c6507uj.OooOOO0());
                                c6507uj2.Oooo000(c6507uj.OooO0oO());
                                c1590Qj.OoooOOo(c6507uj2);
                            }
                        } else {
                            c1590Qj.OooO00o.OooO00o(c6507uj.OooO0o0());
                            c1590Qj.OooO0O0.remove(c6507uj.OooO0o0());
                        }
                    }
                }
            } else {
                c1590Qj.OoooO(c6507uj, list);
            }
        }
        c1590Qj.OooO0Oo.OooOooo(c1590Qj.OooO0OO);
        c1590Qj.Oooo();
        Objects.requireNonNull(oooO0OO);
        AbstractC7050zo.OooO0O0(new Runnable() { // from class: ambercore.Mj
            @Override // java.lang.Runnable
            public final void run() {
                oooO0OO.OooO00o();
            }
        });
    }

    public static /* synthetic */ void OooO00o(C1590Qj c1590Qj, List list, final OooO0O0 oooO0O0) {
        c1590Qj.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6507uj c6507uj = (C6507uj) it.next();
            c1590Qj.OooO00o.OooOO0(c6507uj.OoooOO0());
            c1590Qj.OooO0O0.put(c6507uj.OooO0o0(), c6507uj);
        }
        if (oooO0O0 != null) {
            AbstractC7050zo.OooO0O0(new Runnable() { // from class: ambercore.Bj
                @Override // java.lang.Runnable
                public final void run() {
                    oooO0O0.OooO00o(null);
                }
            });
        }
    }

    public static /* synthetic */ void OooO0Oo(C1590Qj c1590Qj, C6507uj c6507uj) {
        c1590Qj.getClass();
        c1590Qj.OooO00o.OooOO0(c6507uj.OoooOO0());
        c1590Qj.OooO0O0.put(c6507uj.OooO0o0(), c6507uj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OooO0o0(C1590Qj c1590Qj, List list, OooO0OO oooO0OO) {
        List<C6507uj> listOooOoOO = c1590Qj.OooOoOO();
        HashSet hashSet = new HashSet();
        for (C6507uj c6507uj : listOooOoOO) {
            if (c6507uj.OooO0oo() == Definitions$ItemType.APP) {
                hashSet.add(c6507uj.OooOO0O());
            }
        }
        for (int i = 0; i < list.size(); i++) {
            AppHiddenBean appHiddenBean = (AppHiddenBean) list.get(i);
            if (!hashSet.contains(appHiddenBean.getPackageIntent())) {
                Pair pairOooO0oO = H80.OooO0oO(H80.OooO0Oo(listOooOoOO));
                String appName = appHiddenBean.getAppName();
                int iIntValue = ((Integer) pairOooO0oO.first).intValue();
                Point point = (Point) pairOooO0oO.second;
                C6507uj c6507ujOooOoO0 = C6507uj.OooOoO0(appName, iIntValue, point.x, point.y, appHiddenBean.getPackageIntent(), appHiddenBean.getPackageName());
                c1590Qj.OooO00o.OooOO0(c6507ujOooOoO0.OoooOO0());
                c1590Qj.OooO0O0.put(c6507ujOooOoO0.OooO0o0(), c6507ujOooOoO0);
                listOooOoOO.add(c6507ujOooOoO0);
                c1590Qj.OooO0OO.add(appHiddenBean.getPackageIntent());
            }
        }
        c1590Qj.OooO0Oo.OooOooo(c1590Qj.OooO0OO);
        c1590Qj.Oooo();
        if (oooO0OO != null) {
            AbstractC7050zo.OooO0O0(new RunnableC7037zj(oooO0OO));
        }
    }

    public static /* synthetic */ void OooOO0(C1590Qj c1590Qj, List list) {
        c1590Qj.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6507uj c6507uj = (C6507uj) it.next();
            C4652oOOOO0Oo c4652oOOOO0OoOooO0o0 = c1590Qj.OooO00o.OooO0o0(c6507uj.OooO0o0());
            if (c4652oOOOO0OoOooO0o0 != null) {
                c4652oOOOO0OoOooO0o0.OooOOOO(c6507uj.OooOOO0());
                c4652oOOOO0OoOooO0o0.OooOOOo(c6507uj.OooO0oO().ordinal());
                c4652oOOOO0OoOooO0o0.OooOOo0(c6507uj.OooOOo0().ordinal());
                c4652oOOOO0OoOooO0o0.OooOOo(c6507uj.OooOOoo());
                c4652oOOOO0OoOooO0o0.OooOOoo(c6507uj.OooOo00());
                c1590Qj.OooO00o.OooOO0o(c4652oOOOO0OoOooO0o0);
                c1590Qj.OooO0O0.put(c6507uj.OooO0o0(), c6507uj);
            }
        }
    }

    public static /* synthetic */ void OooOOO(OooO0O0 oooO0O0, List list, OooO0O0 oooO0O02, List list2) {
        oooO0O0.OooO00o(list);
        oooO0O02.OooO00o(list2);
    }

    public static /* synthetic */ void OooOOOO(C1590Qj c1590Qj, final OooO0O0 oooO0O0, final OooO0O0 oooO0O02) {
        boolean z;
        c1590Qj.getClass();
        if (oooO0O0 != null && oooO0O02 != null) {
            if (!C6832xn.OooO0Oo && !com.anddoes.launcher.OooO00o.OoooO0O(HideUApplication.getAppContext())) {
                z = false;
            } else {
                z = true;
            }
            ArrayList arrayList = new ArrayList();
            c1590Qj.OooOOoo();
            final List listOooOooo = c1590Qj.OooOooo(z, arrayList);
            final List listOooOooO = c1590Qj.OooOooO(z, arrayList);
            AbstractC7050zo.OooO0O0(new Runnable() { // from class: ambercore.Aj
                @Override // java.lang.Runnable
                public final void run() {
                    C1590Qj.OooOOO(oooO0O0, listOooOooO, oooO0O02, listOooOooo);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OooOOo0(C1590Qj c1590Qj, List list, OooO0OO oooO0OO) {
        for (C6507uj c6507uj : c1590Qj.OooOoOO()) {
            Iterator it = c1590Qj.OooO0OO.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (c6507uj.OooOO0O().equals(str)) {
                        c1590Qj.OooO00o.OooO00o(c6507uj.OooO0o0());
                        c1590Qj.OooO0O0.remove(c6507uj.OooO0o0());
                        c1590Qj.OooO0OO.remove(str);
                        break;
                    }
                }
            }
        }
        List listOooOoOO = c1590Qj.OooOoOO();
        for (int i = 0; i < list.size(); i++) {
            AppHiddenBean appHiddenBean = (AppHiddenBean) list.get(i);
            if (!c1590Qj.OooO0OO.contains(appHiddenBean.getPackageIntent())) {
                Pair pairOooO0oO = H80.OooO0oO(H80.OooO0Oo(listOooOoOO));
                String appName = appHiddenBean.getAppName();
                int iIntValue = ((Integer) pairOooO0oO.first).intValue();
                Point point = (Point) pairOooO0oO.second;
                C6507uj c6507ujOooOoO0 = C6507uj.OooOoO0(appName, iIntValue, point.x, point.y, appHiddenBean.getPackageIntent(), appHiddenBean.getPackageName());
                c1590Qj.OooO00o.OooOO0(c6507ujOooOoO0.OoooOO0());
                c1590Qj.OooO0O0.put(c6507ujOooOoO0.OooO0o0(), c6507ujOooOoO0);
                listOooOoOO.add(c6507ujOooOoO0);
                c1590Qj.OooO0OO.add(appHiddenBean.getPackageIntent());
                if (i == 0) {
                    c1590Qj.OooO0Oo.OooOoo(String.valueOf(c6507ujOooOoO0.OooO0o0()));
                    c1590Qj.OooO0Oo.OooOoo0(c6507ujOooOoO0.OooO0O0());
                }
            }
        }
        c1590Qj.OooO0Oo.OooOooo(c1590Qj.OooO0OO);
        c1590Qj.Oooo();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AppHiddenBean) it2.next()).getPackageName());
        }
        R6.OooO0O0.OooOoOO(arrayList);
        Objects.requireNonNull(oooO0OO);
        AbstractC7050zo.OooO0O0(new RunnableC7037zj(oooO0OO));
    }

    private int[] OooOo0o(C6507uj c6507uj, boolean z) {
        if (c6507uj.OooOOO0() == 0) {
            if (c6507uj.OooOOoo() == 3) {
                if (c6507uj.OooOo00() == 1) {
                    if (z) {
                        return new int[]{c6507uj.OooOOO0() + 1, 0, 0};
                    }
                    return new int[]{-1, 0, 0};
                }
                return new int[]{c6507uj.OooOOO0(), 0, c6507uj.OooOo00() - 1};
            }
            return new int[]{c6507uj.OooOOO0(), c6507uj.OooOOoo() + 1, c6507uj.OooOo00()};
        }
        if (c6507uj.OooOOoo() == 3) {
            if (c6507uj.OooOo00() == 4) {
                if (z) {
                    return new int[]{c6507uj.OooOOO0() + 1, 0, 0};
                }
                return new int[]{-1, 0, 0};
            }
            return new int[]{c6507uj.OooOOO0(), 0, c6507uj.OooOo00() + 1};
        }
        return new int[]{c6507uj.OooOOO0(), c6507uj.OooOOoo() + 1, c6507uj.OooOo00()};
    }

    private boolean Oooo0oo(C6507uj c6507uj, AppHiddenBean appHiddenBean) {
        if (c6507uj.OooO0oo() == Definitions$ItemType.APP && ((TextUtils.equals(c6507uj.OooOO0O(), appHiddenBean.getPackageIntent()) || TextUtils.isEmpty(appHiddenBean.getPackageIntent())) && TextUtils.equals(c6507uj.OooOO0o(), appHiddenBean.getPackageName()))) {
            return true;
        }
        if (c6507uj.OooOOO() == LauncherShortcut.Shortcut.HIDE_MORE && TextUtils.equals(c6507uj.OooOO0(), appHiddenBean.getAppName())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void OooOo(C6507uj c6507uj) {
        Pair pairOooO0oO = H80.OooO0oO(H80.OooO0Oo(OooOoOO()));
        c6507uj.Oooo0o0(((Integer) pairOooO0oO.first).intValue());
        c6507uj.OoooO0(((Point) pairOooO0oO.second).x);
        c6507uj.OoooO0O(((Point) pairOooO0oO.second).y);
        c6507uj.Oooo(Definitions$ItemState.Visible);
        c6507uj.Oooo000(Definitions$ItemPosition.Desktop);
        GY.OooO0Oo().OooO0OO().OoooOoO(c6507uj);
    }

    public void OooOo0(final C6507uj c6507uj, final int i) {
        if (c6507uj.OooO0oo() != Definitions$ItemType.GROUP) {
            return;
        }
        AbstractC7050zo.OooO0OO(new Runnable() { // from class: ambercore.Ej
            @Override // java.lang.Runnable
            public final void run() {
                C1590Qj.OooO0OO(this.OooOO0O, c6507uj, i);
            }
        });
    }

    public void Oooo0o0(C6507uj c6507uj) {
        this.OooO00o.OooOO0(c6507uj.OoooOO0());
        this.OooO0O0.put(c6507uj.OooO0o0(), c6507uj);
    }
}
