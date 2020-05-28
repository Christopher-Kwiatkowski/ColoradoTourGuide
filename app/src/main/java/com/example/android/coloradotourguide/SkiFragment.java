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
public class SkiFragment extends Fragment {

    public SkiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.breckenridge, R.string.breckenridge_location, R.string.mid));
        places.add(new Place(R.string.vail, R.string.vail_location, R.string.high));
        places.add(new Place(R.string.steamboat, R.string.steamboat_location, R.string.low));
        places.add(new Place(R.string.aspen, R.string.aspen_location, R.string.high));
        places.add(new Place(R.string.keystone, R.string.keystone_location, R.string.mid));
        places.add(new Place(R.string.telluride, R.string.telluride_location, R.string.low));
        places.add(new Place(R.string.beavercreek, R.string.beavercreek_location, R.string.high));
        places.add(new Place(R.string.winterpark, R.string.winterpark_location, R.string.mid));
        places.add(new Place(R.string.eldora, R.string.eldora_location, R.string.low));
        places.add(new Place(R.string.copper, R.string.copper_location, R.string.mid));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_ski);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
