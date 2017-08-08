package zone.qube.databindingexample.beta;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zone.qube.databindingexample.alpha.AlphaModel;
import zone.qube.databindingexample.databinding.AlphaFragmentBinding;
import zone.qube.databindingexample.databinding.BetaFragmentBinding;

public class BetaFragment extends Fragment {

    private static final String KEY_USERMODEL = "key:user_model";

    public static BetaFragment newInstance(@Nullable final UserModel userModel) {
        final BetaFragment betaFragment = new BetaFragment();
        final Bundle args = new Bundle();
        args.putSerializable(KEY_USERMODEL, userModel);
        betaFragment.setArguments(args);
        return betaFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final BetaFragmentBinding binding = BetaFragmentBinding.inflate(inflater);
        binding.setUser((UserModel) getArguments().getSerializable(KEY_USERMODEL));
        return binding.getRoot();
    }
}
