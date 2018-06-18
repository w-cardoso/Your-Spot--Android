package yourspot.com.br.yourspot.ui.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import yourspot.com.br.yourspot.R;
import yourspot.com.br.yourspot.model.Products;
import yourspot.com.br.yourspot.ui.recyclerview.listener.OnItemClickListenerProducts;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> implements Filterable {
    private final List<Products> products;
    private List<Products> productsFiltered;
    private final Context context;
    private OnItemClickListenerProducts onItemClickListener;

    public ProductAdapter(Context context, List<Products> products) {
        this.products = products;
        this.context = context;
        this.productsFiltered = products;
    }

    public void setOnItemClickListener(OnItemClickListenerProducts onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View creteView = LayoutInflater.from(context).inflate(R.layout.item_list_products, parent, false);
        return new ProductViewHolder(creteView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        final Products product = productsFiltered.get(position);
        holder.setBinds(product);
    }

    @Override
    public int getItemCount() {
        return productsFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    productsFiltered = products;
                } else {
                    List<Products> listFiltered = new ArrayList<>();
                    for (Products row : products) {
                        if (row.getDescription().toLowerCase().contains(charString.toLowerCase())) {
                            listFiltered.add(row);
                        }
                    }
                    productsFiltered = listFiltered;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = productsFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                productsFiltered = (ArrayList<Products>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        private Products productsFiltered;
        private final ImageView image;
        private final TextView description;
        private final TextView valueIsntallment;
        private final TextView valueIncash;


        public ProductViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.item_list_products_img_product);
            description = itemView.findViewById(R.id.item_list_products_txt_description);
            valueIsntallment = itemView.findViewById(R.id.item_list_products_txt_installment_value);
            valueIncash = itemView.findViewById(R.id.item_list_products_txt_incash_value);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onItemClick(productsFiltered, getAdapterPosition());
                }
            });

        }

        public void setBinds(Products productsFiltered) {
            this.productsFiltered = productsFiltered;
            fieldFill(productsFiltered);

        }

        private void fieldFill(Products products) {
            Picasso.with(context)
                    .load(products.getImage())
                    .resize(600, 380)
                    .centerCrop()
                    .into(image);
            description.setText(products.getDescription());
            valueIsntallment.setText(products.getValueInstallment());
            valueIncash.setText(products.getValueInCash());
        }
    }
}
