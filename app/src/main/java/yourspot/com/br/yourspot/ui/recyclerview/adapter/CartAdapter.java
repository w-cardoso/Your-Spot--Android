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
import yourspot.com.br.yourspot.model.Cart;
import yourspot.com.br.yourspot.ui.recyclerview.listener.OnItemClickListenerCart;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    private final List<Cart> listProducts;
    private final Context context;
    private OnItemClickListenerCart onItemClickListenerCart;

    public CartAdapter(Context context, List<Cart> listProducts) {
        this.listProducts = listProducts;
        this.context = context;
    }

    public void setOnItemClickListenerCart(OnItemClickListenerCart onItemClickListenerCart) {
        this.onItemClickListenerCart = onItemClickListenerCart;
    }

    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View createView = LayoutInflater.from(context).inflate(R.layout.item_cart, parent, false);
        return new CartViewHolder(createView);
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
        Cart productsCart = listProducts.get(position);
        holder.setBinds(productsCart);
    }

    @Override
    public int getItemCount() {
        return listProducts.size();
    }

    class CartViewHolder extends RecyclerView.ViewHolder {
        private Cart listProducts;
        private final ImageView imgProduct;
        private final TextView product;
        private final TextView color;
        private final TextView value;
        private final TextView amount;


        public CartViewHolder(View itemView) {
            super(itemView);
            imgProduct = itemView.findViewById(R.id.item_cart_img_product);
            product = itemView.findViewById(R.id.item_cart_txt_product);
            color = itemView.findViewById(R.id.item_cart_txt_color);
            value = itemView.findViewById(R.id.item_cart_txt_value);
            amount = itemView.findViewById(R.id.item_cart_txt_qtd);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListenerCart.onItemClick(listProducts, getAdapterPosition());
                }
            });
        }

        public void setBinds(Cart listProducts) {
            this.listProducts = listProducts;
            fieldFill(listProducts);
        }

        private void fieldFill(Cart listProducts) {
            Picasso.with(context)
                    .load(listProducts.getImgProduct())
                    .resize(600, 380)
                    .centerCrop()
                    .into(imgProduct);

            product.setText(listProducts.getProduct());
            color.setText(listProducts.getColor());
            value.setText(listProducts.getValue());
            amount.setText(listProducts.getAmount());
        }
    }
}
