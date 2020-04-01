package com.xwray.groupie.databinding;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

public class GroupieDataBindingViewHolder<T extends ViewDataBinding> extends com.xwray.groupie.viewbinding.GroupieViewHolder<T> {
    public GroupieDataBindingViewHolder(@NonNull T binding) {
        super(binding);
    }
}
