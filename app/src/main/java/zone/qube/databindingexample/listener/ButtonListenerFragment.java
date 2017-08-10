package zone.qube.databindingexample.listener;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import zone.qube.databindingexample.databinding.ListenerBinding;

public class ButtonListenerFragment extends Fragment {

    private boolean mHasToastBeenShown = false;

    public static ButtonListenerFragment newInstance() {
        return new ButtonListenerFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final ListenerBinding binding = ListenerBinding.inflate(inflater);
        binding.setFragment(this);
        return binding.getRoot();
    }

    public boolean hasToastBeenShown(){
        return mHasToastBeenShown;
    }


    // listener binding
    public void showToast(String text) {
        mHasToastBeenShown = true;
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }

    // Method reference
    public void onButtonClick(final View view){
        showToast(String.format("Button with id %s clicked", view.getId() ));
    }

}
