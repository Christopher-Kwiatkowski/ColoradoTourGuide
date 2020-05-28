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
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.tables, R.string.tables_location, R.string.twothree));
        places.add(new Place(R.string.root, R.string.root_location, R.string.twothree));
        places.add(new Place(R.string.izakaya, R.string.izakaya_location, R.string.four));
        places.add(new Place(R.string.fruition, R.string.fruition_location, R.string.four));
        places.add(new Place(R.string.ambli, R.string.ambli_location, R.string.twothree));
        places.add(new Place(R.string.snooze, R.string.snooze_location, R.string.twothree));
        places.add(new Place(R.string.sushiden, R.string.sushiden_location, R.string.four));
        places.add(new Place(R.string.capital, R.string.capital_location, R.string.four));
        places.add(new Place(R.string.avelina, R.string.avelina_location, R.string.twothree));
        places.add(new Place(R.string.cholon, R.string.cholon_location, R.string.four));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
