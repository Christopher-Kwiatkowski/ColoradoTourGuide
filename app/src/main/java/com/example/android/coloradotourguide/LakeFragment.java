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
public class LakeFragment extends Fragment {

    public LakeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.granby, R.string.granby_location, R.string.free));
        places.add(new Place(R.string.bluemesa, R.string.bluemesa_location, R.string.free));
        places.add(new Place(R.string.horsetooth, R.string.horsetooth_location, R.string.free));
        places.add(new Place(R.string.dillon, R.string.dillon_location, R.string.free));
        places.add(new Place(R.string.chatfield, R.string.chatfield_location, R.string.free));
        places.add(new Place(R.string.shadow, R.string.shadow_location, R.string.free));
        places.add(new Place(R.string.greenmountain, R.string.greenmountain_location, R.string.free));
        places.add(new Place(R.string.sloan, R.string.sloan_location, R.string.free));
        places.add(new Place(R.string.cristobal, R.string.cristobal_location, R.string.free));
        places.add(new Place(R.string.martin, R.string.martin_location, R.string.free));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_lakes);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
