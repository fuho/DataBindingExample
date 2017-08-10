package zone.qube.databindingexample.listener;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import zone.qube.databindingexample.databinding.ListenerBinding;
import zone.qube.databindingexample.databinding.WidgetsListenerBinding;

public class OtherWidgetsListenerFragment extends Fragment {

    public static OtherWidgetsListenerFragment newInstance() {
        return new OtherWidgetsListenerFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final WidgetsListenerBinding binding = WidgetsListenerBinding.inflate(inflater);
        binding.setData(new DataClass());
        return binding.getRoot();
    }

    public class DataClass {

        public void takeTwoParams(final boolean isChecked, final String template) {
            Toast.makeText(getContext(),
                           String.format(template, isChecked ? "checked" : "un-checked"),
                           Toast.LENGTH_SHORT
            ).show();
        }


    }
}
