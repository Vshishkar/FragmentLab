package by.mmf.team2.fragmenttest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.List;

import by.mmf.team2.fragmenttest.data.Food;
import by.mmf.team2.fragmenttest.data.FoodListAdapter;
import by.mmf.team2.fragmenttest.data.FoodStaticData;


public class FoodListFragment extends ListFragment {

    private List<Food> foodList = FoodStaticData.getFoodList();

    public FoodListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        FoodListAdapter arrayAdapter = new FoodListAdapter(getContext(),R.layout.food_item,foodList);
        setListAdapter(arrayAdapter);
        //getListView().setOnItemClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_list, container, false);
        return view;
    }


    /*@Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getActivity(), "Item: " + i, Toast.LENGTH_SHORT).show();
    }*/
}
