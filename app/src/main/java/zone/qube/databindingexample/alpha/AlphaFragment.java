package zone.qube.databindingexample.alpha;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zone.qube.databindingexample.databinding.AlphaFragmentBinding;

public class AlphaFragment extends Fragment {

    public static AlphaFragment newInstance() {
        return new AlphaFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final AlphaFragmentBinding binding = AlphaFragmentBinding.inflate(inflater);
        binding.setExample(new ExampleModel());
        return binding.getRoot();
    }
}
