package yourspot.com.br.yourspot.ui.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import yourspot.com.br.yourspot.R;
import yourspot.com.br.yourspot.model.Categorys;
import yourspot.com.br.yourspot.ui.recyclerview.listener.OnItemClickListenerCategory;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategotyViewHolder> {
    private final List<Categorys> categorys;
    private final Context context;
    private OnItemClickListenerCategory onItemClickListenerCategory;

    public CategoryAdapter(Context context, List<Categorys> categorys) {
        this.categorys = categorys;
        this.context = context;
    }

    public void setOnItemClickListenerCategory(OnItemClickListenerCategory onItemClickListenerCategory) {
        this.onItemClickListenerCategory = onItemClickListenerCategory;
    }

    @Override
    public CategotyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View createView = LayoutInflater.from(context).inflate(R.layout.item_categorys, parent, false);
        return new CategotyViewHolder(createView);
    }

    @Override
    public void onBindViewHolder(CategoryAdapter.CategotyViewHolder holder, int position) {
        Categorys category = categorys.get(position);
        holder.setBinds(category);
    }

    @Override
    public int getItemCount() {
        return categorys.size();
    }

    class CategotyViewHolder extends RecyclerView.ViewHolder {
        private final TextView name;
        private final ImageView image;
        private Categorys categorys;

        public CategotyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.item_category_txt_name);
            image = itemView.findViewById(R.id.item_category_img_category);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListenerCategory.onItemClick(categorys, getAdapterPosition());
                }
            });

        }

        public void setBinds(Categorys categorys) {
            this.categorys = categorys;
            fieldFill(categorys);
        }

        private void fieldFill(Categorys categorys) {
            name.setText(categorys.getName());

            Picasso.with(context).load(categorys.getImg()).into(image);
        }
    }
}
