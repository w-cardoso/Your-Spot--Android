package yourspot.com.br.yourspot.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import yourspot.com.br.yourspot.R;
import yourspot.com.br.yourspot.model.Categorys;
import yourspot.com.br.yourspot.ui.recyclerview.adapter.CategoryAdapter;
import yourspot.com.br.yourspot.ui.recyclerview.listener.OnItemClickListenerCategory;

public class CategorysActivity extends AppCompatActivity {
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorys);
        setUpsRecyclerView(getAllcategorys());

        getSupportActionBar().setTitle("Categorias");
    }

    public void setUpsRecyclerView(List<Categorys> allCategorys) {
        RecyclerView listCategorys = findViewById(R.id.categorys_rcv);
        adapter = new CategoryAdapter(this, allCategorys);
        listCategorys.setHasFixedSize(true);
        listCategorys.setAdapter(adapter);
        adapter.setOnItemClickListenerCategory(new OnItemClickListenerCategory() {
            @Override
            public void onItemClick(Categorys categorys, int position) {
                startActivity(new Intent(CategorysActivity.this, ProductsLitsActivity.class));
            }
        });

    }

    public List<Categorys> getAllcategorys() {
        List<Categorys> categorys = new ArrayList<>();
        categorys.add(new Categorys(1, "http://www.aliancamoveis.com.br/wp-content/uploads/2016/05/combo-casa-toda-alianca-moveis-1.jpg", "Todos"));
        categorys.add(new Categorys(1, "https://www.limaonagua.com.br/wp-content/uploads/2016/08/15-quartos-de-casal-industrial-moderno-super-bacanas.jpg", "Quarto"));
        categorys.add(new Categorys(1, "https://paulocortinas.com/wp-content/uploads/2017/08/papel-de-parede-para-sala-bh.jpg", "Sala"));
        categorys.add(new Categorys(1, "https://cdnm.westwing.com/glossary/uploads/br/2014/05/06124427/cozinhas-topic1.jpg", "Cozinha"));
        categorys.add(new Categorys(1, "http://construindodecor.com.br/wp-content/uploads/2017/12/banheiro-preto-e-branco1.jpg", "Banheiro"));


        return categorys;
    }


}
