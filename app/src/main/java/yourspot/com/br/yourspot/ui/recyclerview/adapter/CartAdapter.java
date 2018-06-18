package yourspot.com.br.yourspot.ui.recyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    


    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class CartViewHolder extends RecyclerView.ViewHolder {
        public CartViewHolder(View itemView) {
            super(itemView);
        }
    }
}
