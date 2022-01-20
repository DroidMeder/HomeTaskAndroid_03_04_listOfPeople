package com.example.hometaskandroid_03_04_listofpeople;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.media.Image;
import android.os.Bundle;
import android.os.Environment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adaptor adaptor;
    private List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        loadData();
        adaptor= new Adaptor(names);
        recyclerView.setAdapter(adaptor);
    }

    private void loadData() {
        names = Arrays.asList("Евгений Захаров",
                "Михаил Кулаков",
                "Дарья Наумова",
                "Ева Орлова",
                "Софья Ермолова",
                "Никита Артамонов",
                "Артём Архипов",
                "Варвара Фирсова",
                "Егор Козлов",
                "Дарья Лазарева",
                "Михаил Титов",
                "Павел Гаврилов",
                "Вероника Некрасова",
                "Оливия Носкова",
                "Мария Прокофьева",
                "Мирослава Павлова",
                "Константин Абрамов",
                "Николай Макаров",
                "Милана Архипова",
                "Вера Николаева");
    }
}