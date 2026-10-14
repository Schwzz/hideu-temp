package ambercore;

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
import com.anddoes.launcher.R$string;
import com.anddoes.launcher.R$xml;
import com.anddoes.launcher.settings.ui.component.CustomSwitchPreference;
import com.anddoes.launcher.settings.ui.gesture.draglist.CustomizeMenuListAdapter;
import com.anddoes.launcher.settings.ui.gesture.draglist.ItemTouchHelperCallback;
import com.anddoes.launcher.ui.RecyclerItemClickListener;

/* JADX INFO: renamed from: ambercore.oo0O00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class FragmentC5162oo0O00 extends FragmentC4310oO00OooO implements InterfaceC2375eE, RecyclerItemClickListener.OooO0O0 {
    private RecyclerView OooOOOo;
    private CustomizeMenuListAdapter OooOOo;
    private ItemTouchHelper OooOOo0;
    private SharedPreferences OooOOoo;

    @Override // com.anddoes.launcher.ui.RecyclerItemClickListener.OooO0O0
    public void OooO0OO(View view, int i) {
    }

    @Override // ambercore.FragmentC4310oO00OooO
    public boolean OooO0oo(String str) {
        return false;
    }

    @Override // com.anddoes.launcher.ui.RecyclerItemClickListener.OooO0O0
    public void OooO00o(View view, int i) {
        if (this.OooOOo.OooOO0O.get(i) instanceof CustomSwitchPreference) {
            ((SwitchCompat) view.findViewById(R$id.switch_preference)).toggle();
        }
    }

    @Override // ambercore.InterfaceC2375eE
    public void OooO0O0(RecyclerView.ViewHolder viewHolder) {
        this.OooOOo0.startDrag(viewHolder);
    }

    @Override // ambercore.FragmentC4310oO00OooO, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.OooOOOo = new RecyclerView(viewGroup.getContext());
        this.OooOOoo = C3279mo.OooO0Oo(getActivity()).OooO0o().OoooO();
        OooOO0O(R$string.apex_menu);
        return this.OooOOOo;
    }

    @Override // ambercore.FragmentC4310oO00OooO
    public void OooO(SharedPreferences sharedPreferences, String str) {
        super.OooO(sharedPreferences, str);
        AbstractC6773x90.OooO0o(getArguments(), str, getClass().getSimpleName());
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.OooOOo.OooOOO0();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.OooOOo = new CustomizeMenuListAdapter(getActivity(), this, R$xml.preferences_customize_menu, "Order_CustomizeMenuFragment");
        this.OooOOOo.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.OooOOOo.setHasFixedSize(true);
        this.OooOOOo.setAdapter(this.OooOOo);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelperCallback(this.OooOOo));
        this.OooOOo0 = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.OooOOOo);
        this.OooOOOo.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), this.OooOOOo, this));
    }
}
