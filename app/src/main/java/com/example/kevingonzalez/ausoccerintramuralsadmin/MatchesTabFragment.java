package com.example.kevingonzalez.ausoccerintramuralsadmin;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class MatchesTabFragment extends Fragment {

    FloatingActionButton addMatchButton;
    MatchesModel matchesModel;
    MatchesAdapter matchesAdapter;

    CustomListView matchday1list, matchday2list, matchday3list, matchday4list, matchday5list, matchday6list;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference matchday1 = database.getReference("Matches").child("Matchday1");
    DatabaseReference matchday2 = database.getReference("Matches").child("Matchday2");
    DatabaseReference matchday3 = database.getReference("Matches").child("Matchday3");
    DatabaseReference matchday4 = database.getReference("Matches").child("Matchday4");
    DatabaseReference matchday5 = database.getReference("Matches").child("Matchday5");
    DatabaseReference matchday6 = database.getReference("Matches").child("Matchday6");

    public MatchesTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_matches_tab, container, false);

        addMatchButton = v.findViewById(R.id.add_match_fab);
        matchday1list = v.findViewById(R.id.matchday1_list);
        matchday2list = v.findViewById(R.id.matchday2_list);
        matchday3list = v.findViewById(R.id.matchday3_list);
        matchday4list = v.findViewById(R.id.matchday4_list);
        matchday5list = v.findViewById(R.id.matchday5_list);
        matchday6list = v.findViewById(R.id.matchday6_list);

        addMatchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AddMatchActivity.class);
                startActivity(intent);
            }
        });


        return v;
    }

}
