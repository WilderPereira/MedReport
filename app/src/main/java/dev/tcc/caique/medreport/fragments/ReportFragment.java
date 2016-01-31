package dev.tcc.caique.medreport.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.tcc.caique.medreport.R;
import dev.tcc.caique.medreport.adapters.ReportAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReportFragment extends Fragment {


    public ReportFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private ReportAdapter reportAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_report, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.reportRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        reportAdapter = new ReportAdapter();
        recyclerView.setAdapter(reportAdapter);
        return v;
    }

}
