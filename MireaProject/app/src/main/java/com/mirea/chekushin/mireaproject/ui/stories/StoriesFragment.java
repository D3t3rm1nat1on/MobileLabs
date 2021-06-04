package com.mirea.chekushin.mireaproject.ui.stories;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mirea.chekushin.mireaproject.R;

import java.util.ArrayList;
import java.util.List;

public class StoriesFragment extends Fragment {
    private RecyclerView recyclerView;
    private Button button_new_story;
    private Button button_save_story;
    private TextView name;
    private MyAdapter adapter;
    List<Item> items;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_stories, container, false);

        button_save_story = (Button) root.findViewById(R.id.button_save_story);
        button_new_story = (Button) root.findViewById(R.id.button_new_story);
        button_save_story.setOnClickListener(v -> add(v));

        recyclerView = root.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        items = new ArrayList<Item>();
//        items.add(new Item("Ebat_1"));
//        items.add(new Item("Ebat_2"));
//        items.add(new Item("Ebat_3"));
//        items.add(new Item("Ebat_4"));
//        items.add(new Item("Ebat_5"));
//        items.add(new Item("Ebat_6"));


        adapter = new MyAdapter(items);
        adapter.ROOT = root;

        recyclerView.setAdapter(adapter);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return root;
    }

    public void add(View view) {
        EditText edit = getActivity().findViewById(R.id.edit_text_filename);
        this.items.add(new Item(edit.getText().toString()));
        edit.setText("");
        adapter.notifyItemInserted(this.items.size() - 1);
    }

}