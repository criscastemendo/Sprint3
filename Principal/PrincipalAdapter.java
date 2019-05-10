package com.criscastemendo.sprint3.Principal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import com.criscastemendo.sprint3.R;
import com.criscastemendo.sprint3.Data.ContadorItem;

public class PrincipalAdapter
    extends RecyclerView.Adapter<PrincipalAdapter.ViewHolder> {

  private List<ContadorItem> itemList;
  private final View.OnClickListener clickListener;

  public PrincipalAdapter(View.OnClickListener listener) {

    itemList = new ArrayList();
    clickListener = listener;
  }

  public void addItem(ContadorItem item){
    itemList.add(item);
    notifyDataSetChanged();
  }

  public void addItems(List<ContadorItem> items){
    itemList.addAll(items);
    notifyDataSetChanged();
  }

  public void setItems(List<ContadorItem> items){
    itemList = items;
    notifyDataSetChanged();
  }

  @Override
  public int getItemCount() {
    return itemList.size();
  }


  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.contador_list_content, parent, false);
    return new ViewHolder(view);
  }
  @Override
  public void onBindViewHolder(final ViewHolder holder, int position) {
    holder.itemView.setTag(itemList.get(position));
    holder.itemView.setOnClickListener(clickListener);
    holder.contentView.setText(itemList.get(position).contador);
  }

  class ViewHolder extends RecyclerView.ViewHolder {
    final TextView contentView;

    ViewHolder(View view) {
      super(view);
      contentView = view.findViewById(R.id.content);

    }
  }
}
