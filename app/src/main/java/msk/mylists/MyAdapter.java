package msk.mylists;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

  private List<RecyclerData> data;
  private Context context;

  public MyAdapter(List<RecyclerData> data, Context context) {
    this.data = data;
    this.context = context;
  }

  @Override public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return new MyViewHolder(
        LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false));
  }

  @Override public void onBindViewHolder(MyViewHolder holder, int position) {

    holder.getTextView().setText(data.get(position).getRecyclerItemText());
    holder.getDescription().setText(data.get(position).getRecyclerItemDescription());
    Picasso.with(context).load(data.get(position).getImageUrl()).into(holder.getImage());
  }

  @Override public int getItemCount() {
    return data.size();
  }

  class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ImageView image;
    private TextView text;
    private TextView description;
    private View listItem;

    public MyViewHolder(View view) {
      super(view);
      image = (ImageView) view.findViewById(R.id.list_item_image);
      text = (TextView) view.findViewById(R.id.list_item_text);
      description = (TextView) view.findViewById(R.id.list_item_description);
      listItem = view;

      view.setOnClickListener(this);
    }

    public ImageView getImage() {
      return image;
    }

    public TextView getDescription() {
      return description;
    }

    public TextView getTextView() {
      return text;
    }

    public View getListItem() {
      return listItem;
    }

    @Override public void onClick(View view) {
      Intent intent = new Intent(context, PokemonScrollingActivity.class);
      context.startActivity(intent);
    }
  }
}
