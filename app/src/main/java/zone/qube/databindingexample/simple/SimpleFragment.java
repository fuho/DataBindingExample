package zone.qube.databindingexample.simple;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zone.qube.databindingexample.databinding.SimpleFragmentBinding;

public class SimpleFragment extends Fragment {

    public static SimpleFragment newInstance() {
        return new SimpleFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final SimpleFragmentBinding binding = SimpleFragmentBinding.inflate(inflater);
        binding.setExample(new SimpleModel());
        return binding.getRoot();
    }
}
