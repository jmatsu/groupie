package com.xwray.groupie.databinding;

import androidx.databinding.ViewDataBinding;
import androidx.annotation.NonNull;

/**
 * @deprecated Use {@link com.xwray.groupie.databinding.GroupieDataBindingViewHolder}
 */
@Deprecated
public class GroupieViewHolder<T extends ViewDataBinding> extends com.xwray.groupie.GroupieViewHolder {
    public final T binding;

    public GroupieViewHolder(@NonNull T binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
