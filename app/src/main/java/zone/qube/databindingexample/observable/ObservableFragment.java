package zone.qube.databindingexample.observable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zone.qube.databindingexample.databinding.ObservableBinding;


public class ObservableFragment extends Fragment {

    public static ObservableFragment newInstance() {
        return new ObservableFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final ObservableBinding binding = ObservableBinding.inflate(inflater);
        final ObservableUser user = new ObservableUser("Karl", "Marx");
        user.setBook(new ObservableUser.Book("The Communist Manifesto", 8));
        binding.setUser(user);
        return binding.getRoot();
    }
}
