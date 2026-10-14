package ambercore;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.anddoes.launcher.R$layout;
import com.anddoes.launcher.settings.model.PreferenceItem;
import com.anddoes.launcher.settings.ui.adapter.SettingsListAdapter;
import com.anddoes.launcher.ui.RecyclerItemClickListener;
import java.util.List;

/* JADX INFO: renamed from: ambercore.oV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class FragmentC5025oV extends FragmentC4310oO00OooO implements RecyclerItemClickListener.OooO0O0 {
    protected View OooOOOo;
    protected PreferenceItem OooOOo;
    protected RecyclerView OooOOo0;
    private List OooOOoo;
    private SettingsListAdapter OooOo00;

    @Override // com.anddoes.launcher.ui.RecyclerItemClickListener.OooO0O0
    public void OooO0OO(View view, int i) {
    }

    @Override // com.anddoes.launcher.ui.RecyclerItemClickListener.OooO0O0
    public void OooO00o(View view, int i) {
        List list = this.OooOOoo;
        if (list != null && i >= 0 && i < list.size()) {
            PreferenceItem preferenceItem = (PreferenceItem) this.OooOOoo.get(i);
            try {
                preferenceItem.mCallback.newInstance().OooO00o(getActivity(), preferenceItem, AbstractC6773x90.OooO00o(getActivity(), getArguments(), preferenceItem.mTitle));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void OooOOO() {
        this.OooOOo0 = (RecyclerView) this.OooOOOo.findViewById(R.id.list);
        this.OooOOoo = PreferenceItem.getChildrenItems(this.OooOOo);
        SettingsListAdapter settingsListAdapter = new SettingsListAdapter(getActivity(), this.OooOOoo);
        this.OooOo00 = settingsListAdapter;
        this.OooOOo0.setAdapter(settingsListAdapter);
        this.OooOOo0.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), this.OooOOo0, this));
    }

    @Override // ambercore.FragmentC4310oO00OooO, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.OooOOOo = layoutInflater.inflate(R$layout.fragment_settings_list, viewGroup, false);
        PreferenceItem preferenceItemValueOf = PreferenceItem.valueOf(getArguments().getString(PreferenceItem.EXTRA_PREFERENCE_ITEM));
        this.OooOOo = preferenceItemValueOf;
        OooOO0O(preferenceItemValueOf.mTitle);
        OooOOO();
        return this.OooOOOo;
    }
}
