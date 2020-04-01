package com.xwray.groupie.example.databinding;

import androidx.annotation.NonNull;

import com.xwray.groupie.Group;
import com.xwray.groupie.GroupDataObserver;
import com.xwray.groupie.Item;
import com.xwray.groupie.databinding.DataBindableItem;
import com.xwray.groupie.databinding.DataBindableItem;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple, non-editable, non-nested group of Items which displays a list as vertical columns.
 */
public class ColumnGroup implements Group {

    private List<DataBindableItem> items = new ArrayList<>();

    public ColumnGroup(List<? extends DataBindableItem> items) {
        for (int i = 0; i < items.size(); i++) {
            // Rearrange items so that the adapter appears to arrange them in vertical columns
            int index;
            if (i % 2 == 0) {
                index = i / 2;
            } else {
                index = (i - 1) / 2 + (int) (items.size() / 2f);
                // If columns are uneven, we'll put an extra one at the end of the first column,
                // meaning the second column's indices will all be increased by 1
                if (items.size() % 2 == 1) index++;
            }
            DataBindableItem trackItem = items.get(index);
            this.items.add(trackItem);
        }
    }

    @Override
    public void registerGroupDataObserver(@NonNull GroupDataObserver groupDataObserver) {
        // no real need to do anything here
    }

    @Override
    public void unregisterGroupDataObserver(@NonNull GroupDataObserver groupDataObserver) {
        // no real need to do anything here
    }

    @NonNull
    @Override
    public DataBindableItem getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getPosition(@NonNull Item item) {
        return items.indexOf(item);
    }

    @Override public int getItemCount() {
        return items.size();
    }
}
