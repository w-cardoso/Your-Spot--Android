package yourspot.com.br.yourspot.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import yourspot.com.br.yourspot.R;

public class ProductSelectedActivity extends AppCompatActivity {
    private String productSelected;
    private String imageProduct;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_selected);

        Bundle product = getIntent().getExtras();
        productSelected = product.getString("productSelected");
        imageProduct = product.getString("imageProduct");

        image = findViewById(R.id.product_selected_img);

        Picasso.with(getApplicationContext()).load(imageProduct).into(image);


        getSupportActionBar().setTitle(productSelected);
    }
}
