package ambercore;

import android.R;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anddoes.launcher.R$id;
import com.anddoes.launcher.R$layout;
import com.anddoes.launcher.R$string;
import com.anddoes.launcher.customscreen.ReorderAdapter;
import com.anddoes.launcher.customscreen.ui.FilterItemTouchHelperCallback;
import com.anddoes.launcher.ui.InterceptEventLinearLayout;
import com.anddoes.launcher.ui.RecyclerItemClickListener;
import com.android.launcher3.LauncherApplication;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: ambercore.oo00ooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC5154oo00ooO extends FragmentC4310oO00OooO implements InterfaceC2375eE, RecyclerItemClickListener.OooO0O0, View.OnClickListener {
    private RecyclerView OooOOOo;
    private ReorderAdapter OooOOo;
    private ItemTouchHelper OooOOo0;
    private InterceptEventLinearLayout OooOOoo;
    private boolean OooOo0;
    private SwitchCompat OooOo00;
    private C3341nK OooOo0O;

    @Override // com.anddoes.launcher.ui.RecyclerItemClickListener.OooO0O0
    public void OooO00o(View view, int i) {
    }

    @Override // com.anddoes.launcher.ui.RecyclerItemClickListener.OooO0O0
    public void OooO0OO(View view, int i) {
    }

    @Override // ambercore.FragmentC4310oO00OooO
    public boolean OooO0oo(String str) {
        return false;
    }

    private void OooOOO(boolean z) {
        this.OooOOoo.setNeedInterceptEvent(!z);
        this.OooOOo.OooOO0o(z);
    }

    @Override // ambercore.InterfaceC2375eE
    public void OooO0O0(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof ReorderAdapter.ItemViewHolder) {
            this.OooOOo0.startDrag(viewHolder);
        }
    }

    @Override // ambercore.FragmentC4310oO00OooO, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R$layout.fragment_home_custom_screen, viewGroup, false);
        this.OooOo00 = (SwitchCompat) viewInflate.findViewById(R$id.switch_compat);
        this.OooOOoo = (InterceptEventLinearLayout) viewInflate.findViewById(R$id.rvParent);
        this.OooOOOo = (RecyclerView) viewInflate.findViewById(R.id.list);
        OooOO0o(getString(R$string.custom_screen_show));
        return viewInflate;
    }

    @Override // ambercore.FragmentC4310oO00OooO
    public void OooO(SharedPreferences sharedPreferences, String str) {
        super.OooO(sharedPreferences, str);
        AbstractC6773x90.OooO0o(getArguments(), str, getClass().getSimpleName());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R$id.switch_compat) {
            boolean zIsChecked = ((SwitchCompat) view).isChecked();
            this.OooOo0O.OooOO0O(R$string.pref_show_custom_screen_key, zIsChecked);
            if (this.OooOo0 != zIsChecked) {
                OooO0o("custom_screen_changed");
            } else {
                LauncherApplication.setNeedReboot(false);
                LauncherApplication.sShouldSyncPreference = true;
            }
            OooOOO(zIsChecked);
        }
    }

    @Override // ambercore.FragmentC4310oO00OooO, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // ambercore.FragmentC4310oO00OooO, android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.OooOOo.OooOO0O();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C3341nK c3341nKOooO0o = C3279mo.OooO0Oo(LauncherApplication.getAppContext()).OooO0o();
        this.OooOo0O = c3341nKOooO0o;
        boolean zO00O00o = c3341nKOooO0o.o00O00o();
        this.OooOo0 = zO00O00o;
        this.OooOo00.setChecked(zO00O00o);
        this.OooOo00.setOnClickListener(this);
        this.OooOOo = new ReorderAdapter(getActivity(), com.anddoes.launcher.customscreen.OooO00o.OooOO0o().OooOOo());
        this.OooOOOo.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.OooOOOo.setHasFixedSize(true);
        this.OooOOOo.setAdapter(this.OooOOo);
        this.OooOOo.OooOOO0(this.OooOo0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.OooOOo.OooOOO(arguments.getString(Constants.MessagePayloadKeys.FROM));
        }
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new FilterItemTouchHelperCallback(this.OooOOo));
        this.OooOOo0 = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.OooOOOo);
        this.OooOOOo.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), this.OooOOOo, this));
        OooOOO(this.OooOo0);
    }
}
