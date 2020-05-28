package com.example.android.coloradotourguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MountainFragment extends Fragment {

    public MountainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.elbert, R.string.elbert_location, R.string.free, R.drawable.elbert));
        places.add(new Place(R.string.massive, R.string.massive_location, R.string.free, R.drawable.massive));
        places.add(new Place(R.string.harvard, R.string.harvard_location, R.string.free, R.drawable.harvard));
        places.add(new Place(R.string.blanca, R.string.blanca_location, R.string.free, R.drawable.blanca));
        places.add(new Place(R.string.laplata, R.string.laplata_location, R.string.free, R.drawable.laplata));
        places.add(new Place(R.string.uncompahgre, R.string.uncompahgre_location, R.string.free, R.drawable.uncompahgre));
        places.add(new Place(R.string.crestone, R.string.crestone_location, R.string.free, R.drawable.crestone));
        places.add(new Place(R.string.lincoln, R.string.lincoln_location, R.string.free, R.drawable.lincoln));
        places.add(new Place(R.string.grays, R.string.grays_location, R.string.free, R.drawable.grays));
        places.add(new Place(R.string.antero, R.string.antero_location, R.string.free, R.drawable.antero));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_mountains);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
