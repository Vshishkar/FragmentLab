package by.mmf.team2.fragmenttest.data;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import by.mmf.team2.fragmenttest.R;

public class FoodListAdapter extends ArrayAdapter<Food> {

    public FoodListAdapter(@NonNull Context context, int resource, @NonNull List<Food> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Food food = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.food_item,parent,false);
        }

        TextView tvName = convertView.findViewById(R.id.food_name);
        TextView  tvDescription = convertView.findViewById(R.id.food_description);

        tvName.setText(food.getName());
        tvDescription.setText(food.getDescription());

        return convertView;
    }
}
