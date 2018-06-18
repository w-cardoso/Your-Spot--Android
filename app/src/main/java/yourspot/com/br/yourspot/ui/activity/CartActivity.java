package yourspot.com.br.yourspot.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import yourspot.com.br.yourspot.R;
import yourspot.com.br.yourspot.model.Cart;
import yourspot.com.br.yourspot.ui.recyclerview.adapter.CartAdapter;

public class CartActivity extends AppCompatActivity {

    private CartAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        getSupportActionBar().setTitle("Carrinho");
        setUpsRecyclerView(getAllproductsOfCart());
    }


    public void setUpsRecyclerView(List<Cart> allProducts) {
        RecyclerView rcv = findViewById(R.id.cart_rcv);
        adapter = new CartAdapter(this, allProducts);
        rcv.setHasFixedSize(true);
        rcv.setAdapter(adapter);
    }

    public List<Cart> getAllproductsOfCart() {
        List<Cart> listProducts = new ArrayList<>();
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));
        listProducts.add(new Cart("https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "TV", "Preta", "R$ 300,00", "1"));

        return listProducts;
    }
}
