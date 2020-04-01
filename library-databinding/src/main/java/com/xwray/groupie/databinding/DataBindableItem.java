package com.xwray.groupie.databinding;

import android.view.View;

import com.xwray.groupie.OnItemClickListener;
import com.xwray.groupie.OnItemLongClickListener;
import com.xwray.groupie.viewbinding.GroupieViewHolder;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class DataBindableItem<T extends ViewDataBinding> extends com.xwray.groupie.viewbinding.BindableItem<T> {
    @NonNull
    @Override
    protected T initializeViewBinding(@NonNull View view) {
        //noinspection ConstantConditions
        return DataBindingUtil.bind(view);
    }

    @Override
    public void bind(@NonNull GroupieViewHolder<T> viewHolder, int position, @NonNull List<Object> payloads, @Nullable OnItemClickListener onItemClickListener, @Nullable OnItemLongClickListener onItemLongClickListener) {
        super.bind(viewHolder, position, payloads, onItemClickListener, onItemLongClickListener);
        viewHolder.binding.executePendingBindings();
    }
}
