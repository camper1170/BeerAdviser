package com.hfad.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;


public class FindBeerActivity extends Activity {
    private com.hfad.beeradviser.BeerExpert expert = new com.hfad.beeradviser.BeerExpert();  //加入 BeerExpert 實例，讓它成為私用變數

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //在oncreate的時候他會在activity初次建立時執行找到使用的layout
    }

    public void onClickFindBeer(View view){
        //取得 TextView 的參考
        TextView brands = (TextView) findViewById(R.id.brands);
        //取得 Spinner 的參考
        Spinner color = (Spinner) findViewById(R.id.color);
        //取得被選擇的 Spinner 項目
        String beerType = String.valueOf(color.getSelectedItem());
        //從 BeerExpert 類別取得建議
        List<String> brandsList = expert.getBrands(beerType);  //使用 BeerExpert 類別來取得品牌 List
        StringBuilder brandsFormatted = new StringBuilder();  //建立字串，每一行顯示一個品牌
        for (String brand : brandsList){
            brandsFormatted.append(brand).append('\n');
        }
        //顯示啤酒
        brands.setText(brandsFormatted);  //在 TextView 顯示字串


    }
}
