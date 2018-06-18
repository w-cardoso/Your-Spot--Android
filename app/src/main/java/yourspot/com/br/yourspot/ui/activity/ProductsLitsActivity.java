package yourspot.com.br.yourspot.ui.activity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

import yourspot.com.br.yourspot.R;
import yourspot.com.br.yourspot.model.Products;
import yourspot.com.br.yourspot.ui.recyclerview.adapter.ProductAdapter;
import yourspot.com.br.yourspot.ui.recyclerview.listener.OnItemClickListenerProducts;

public class ProductsLitsActivity extends AppCompatActivity {
    private ProductAdapter adapter;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_lits);
        getSupportActionBar().setTitle("Produtos");
        setUpsRecyclerView(getAllcategorys());


    }

    public void setUpsRecyclerView(List<Products> allProducts) {
        RecyclerView listProducts = findViewById(R.id.product_list_rcv);
        adapter = new ProductAdapter(this, allProducts);
        listProducts.setHasFixedSize(true);
        listProducts.setAdapter(adapter);
        adapter.setOnItemClickListener(new OnItemClickListenerProducts() {
            @Override
            public void onItemClick(Products products, int position) {
                Intent intent = new Intent(ProductsLitsActivity.this, ProductSelectedActivity.class);
                intent.putExtra("productSelected", products.getDescription());
                intent.putExtra("imageProduct", products.getImage());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_product_list, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    public List<Products> getAllcategorys() {
        List<Products> products = new ArrayList<>();
        products.add(new Products(1, "https://ae01.alicdn.com/kf/HTB1y.EANVXXXXcNXFXXq6xXFXXXE/Designer-moderno-genu-no-real-cama-de-couro-cama-macia-cama-de-casal-king-size-queen.jpg_640x640.jpg", "Cama de Casal", "10 x R$ 129,00", "R$ 1100,00 avista"));
        products.add(new Products(1, "https://www.lojasobino.com.br/fotos/zoom/3296fz1/cama-de-solteiro-kappesberg-s821-branco-fosco.jpg", "Cama de Solteiro", "", ""));
        products.add(new Products(1, "http://img.abracadabra.com.br/fotos/2271210BFxg-comoda-tai-branco-fosco.jpg", "Comoda", "", ""));
        products.add(new Products(1, "http://static.wmobjects.com.br/imgres/arquivos/ids/11411781-220-220/abajur-luminaria-charlotte-tecido-branco.jpg", "Abajur", "", ""));
        products.add(new Products(1, "https://a-static.mlcdn.com.br/1500x1500/guarda-roupa-3-portas-correr-com-espelho-branco-malta-toque-a-campainha/toqueacampainha/19977/a4328c652d79a8e73aa3aa9c7f08ef2a.jpg", "Guarda-Roupa", "", ""));
        products.add(new Products(1, "https://i1.zst.com.br/images/smart-tv-tv-led-50-samsung-serie-6-4k-hdr-netflix-un50ku6000-3-hdmi-photo193748072-12-25-3b.jpg", "Televisor", "", ""));
        products.add(new Products(1, "https://thumbs.buscape.com.br/micro-system-mini-system/lg-cj98-2700-w-rms_600x600-PU9bbda_1.jpg", "Micro System", "", ""));
        products.add(new Products(1, "https://www.pontofrio-imagens.com.br/tvseacessorios/HomeTheater/aparelhosHomeTheater/1972311/10808915/Home-Theater-Samsung-HT-F553K-ZD-5-1-Canais-com-DVD-Player-Karaoke-Entrada-USB-e-Cabo-HDMI-%E2%80%93-1-000-W-1972311.jpg", "Home Theater", "", ""));
        products.add(new Products(1, "https://images.etna.com.br/produtos/71/409771/409771_ampliada.jpg", "Sofa 3 lugares", "", ""));
        products.add(new Products(1, "https://s3-sa-east-1.amazonaws.com/public.panorama/imagens/estante-para-tv-180-cm-02-portas-de-correr-es230-freijo-acacia-decibal-moveis-12898-01-l.98b.jpg", "Estante", "", ""));
       /* products.add(new Products(1, "", "Painel", "", ""));
        products.add(new Products(1, "", "Puff", "", ""));
        products.add(new Products(1, "", "Geladeira", "", ""));
        products.add(new Products(1, "", "Microondas", "", ""));
        products.add(new Products(1, "", "Fogão", "", ""));
        products.add(new Products(1, "", "Fritadeira", "", ""));
        products.add(new Products(1, "", "Mesa", "", ""));
        products.add(new Products(1, "", "Cadeira", "", ""));
        products.add(new Products(1, "", "Liquidificador", "", ""));
        products.add(new Products(1, "", "PlayStation", "", ""));
        products.add(new Products(1, "", "X-Box One", "", ""));
        products.add(new Products(1, "", "Ar condicionado", "", ""));
        products.add(new Products(1, "", "Forno Eletrico", "", ""));*/


        return products;
    }


}
