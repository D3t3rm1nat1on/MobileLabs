package com.mirea.chekushin.mireaproject.ui.stories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.mirea.chekushin.mireaproject.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    public static View ROOT;
    private List<Item> items;

    public MyAdapter(List<Item> items) {
        this.items = items;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.txtViewTitle.setText(items.get(position).getName());
    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtViewTitle;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            View a = MyAdapter.ROOT.findViewById(R.id.name);
            txtViewTitle = (TextView) MyAdapter.ROOT.findViewById(R.id.name);
//            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.item_title);
        }
    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return items.size();
    }
}