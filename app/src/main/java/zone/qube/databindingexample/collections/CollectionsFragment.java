package zone.qube.databindingexample.collections;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;

import zone.qube.databindingexample.databinding.CollectionsBinding;
import zone.qube.databindingexample.databinding.SimpleFragmentBinding;
import zone.qube.databindingexample.simple.SimpleModel;

public class CollectionsFragment extends Fragment {

    public static CollectionsFragment newInstance() {
        return new CollectionsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        final CollectionsBinding binding = CollectionsBinding.inflate(inflater);
        final Library library = new Library();
        library.addBook("Vladimir Nabokov","Lolita");
        library.addBook("Karel Capek","RuR");
        library.addBook("George Orwell","1984");
        library.addBook("Franz Kafka","The Trial");
        binding.setLibrary(library);
        return binding.getRoot();
    }
}
