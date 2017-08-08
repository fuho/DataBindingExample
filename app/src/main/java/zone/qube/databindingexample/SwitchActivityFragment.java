package zone.qube.databindingexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zone.qube.databindingexample.databinding.SwitchBinding;

public class SwitchActivityFragment extends Fragment {

    private static final String KEY_CLASS = "key:class";
    private Class mActivityClass;

    public static SwitchActivityFragment newInstance(@NonNull final Class klass) {
        final SwitchActivityFragment switchActivityFragment = new SwitchActivityFragment();
        final Bundle args = new Bundle();
        args.putSerializable(KEY_CLASS, klass);
        switchActivityFragment.setArguments(args);
        return switchActivityFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState
    ) {
        mActivityClass = (Class) getArguments().getSerializable(KEY_CLASS);
        final SwitchBinding binding = SwitchBinding.inflate(inflater);
        binding.setFragment(this);
        return binding.getRoot();
    }

    public Class getActivityClass() {
        return mActivityClass;
    }

    public void launch() {
        startActivity(new Intent(getContext(), mActivityClass));
    }
}
