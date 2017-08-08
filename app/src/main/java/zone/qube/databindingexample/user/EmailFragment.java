package zone.qube.databindingexample.user;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zone.qube.databindingexample.databinding.EmailUserBinding;

public class EmailFragment extends Fragment {

    private static final String KEY_USERMODEL = "key:user_model";

    public static EmailFragment newInstance(@Nullable final UserModel userModel) {
        final EmailFragment userFrag = new EmailFragment();
        final Bundle args = new Bundle();
        args.putSerializable(KEY_USERMODEL, userModel);
        userFrag.setArguments(args);
        return userFrag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final EmailUserBinding binding = EmailUserBinding.inflate(inflater);
        binding.setUser((UserModel) getArguments().getSerializable(KEY_USERMODEL));
        return binding.getRoot();
    }
}
