package yourspot.com.br.yourspot.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import yourspot.com.br.yourspot.R;
import yourspot.com.br.yourspot.helloar.HelloArActivity;

public class ProductSelectedActivity extends AppCompatActivity {
    private String productSelected;
    private String imageProduct;
    private ImageView image;
    private Button addCart;
    private Button favorite;
    private Button toView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_selected);

        Bundle product = getIntent().getExtras();
        productSelected = product.getString("productSelected");
        imageProduct = product.getString("imageProduct");

        getSupportActionBar().setTitle(productSelected);

        image = findViewById(R.id.product_selected_img);
        Picasso.with(getApplicationContext())
                .load(imageProduct)
                .into(image);

        addCart = findViewById(R.id.product_selected_btn_add_cart);
        favorite = findViewById(R.id.product_selected_btn_favorite);
        toView = findViewById(R.id.product_selected_btn_to_view);

        addCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductSelectedActivity.this, CartActivity.class));
            }
        });

        toView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductSelectedActivity.this, HelloArActivity.class));
            }
        });


    }
}
