package zone.qube.databindingexample.listener;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import zone.qube.databindingexample.databinding.ListenerBinding;
import zone.qube.databindingexample.user.UserModel;

public class ListenerFragment extends Fragment {

    public static ListenerFragment newInstance() {
        return new ListenerFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final ListenerBinding binding = ListenerBinding.inflate(inflater);
        binding.setFragment(this);
        return binding.getRoot();
    }

    public void buttonClicked() {
        Toast.makeText(getContext(), "buttonClicked", Toast.LENGTH_SHORT).show();
    }
}
