package zone.qube.databindingexample.observable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zone.qube.databindingexample.databinding.BaseObservableBinding;

public class BaseObservableFragment extends Fragment {

    public static BaseObservableFragment newInstance() {
        return new BaseObservableFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final BaseObservableBinding binding = BaseObservableBinding.inflate(inflater);
        binding.setUser(new BaseObservableUser());
        return binding.getRoot();
    }
}
