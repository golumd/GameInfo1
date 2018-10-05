package com.example.ss.a100facts;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Otvet extends AppCompatActivity {

    public static final String APP_PREFERENCES = "musettings";
    public static final String True = "1";
    public static final String False = "0";
    public static final String Key = "key";
    SharedPreferences mSettings;

    int position=0;
    int current=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otvet);
        ConstraintLayout layout =findViewById(R.id.background);
        String str = openText();
        char[] chArray = str.toCharArray();
        int buf = Character.getNumericValue(chArray[0]);
        ImageView imageView = findViewById(R.id.ImageMain);
        TextView textView = findViewById(R.id.TextMain);
        int pos = 0;
        if (chArray[3] == ' ') {
            pos = Character.getNumericValue(chArray[2]);
        } else {
            pos = Character.getNumericValue(chArray[2]) * 10 + Character.getNumericValue(chArray[3]);
        }
        if (buf == 1) {
            imageView.setImageResource(mThumbIdsCs[pos]);
            textView.setText(Cs[pos]);
            layout.setBackgroundResource(R.drawable.cs);
        } else if (buf == 2) {
            imageView.setImageResource(mThumbIdsPubg[pos]);
            textView.setText(Pubg[pos]);

        } else {
            imageView.setImageResource(mThumbIdsDota[pos]);
            textView.setText(Dota[pos]);
            layout.setBackgroundResource(R.drawable.dotka);
        }
        //textView.setText(str);
        current=buf;
        position=pos;

    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Otvet.this,Navogator.class);
        startActivity(intent);

    }

    public String[] Dota = {
            "Razor и Visage – коллеги по работе в чистилище. Visage охраняет вход, а Razor патрулирует внутренние помещения",
            "Earth Spirit – это дух, которому стало скучно, и он вселился в статую генерала армии",
            "Phantom Lancer был рыбаком, пока война не пришла в его деревню и ему не пришлось убить злого волшебника. С последним вздохом мага Phantom Lancer получил свои невероятные силы.",
            "Многие охотились за бесценными рогами Magnus. Он пронзил и растоптал бесчисленное количество таких охотников.",
            "Dota 2 5",
            "Dota 2 6",
            "Dota 2 7",
            "Dota 2 8",
            "Dota 2 9",
            "Dota 2 10",
            "Dota 2 11",
            "Dota 2 12",
            "Dota 2 13",
            "Dota 2 14",
            "Dota 2 15",
            "Dota 2 16",
            "Dota 2 17",
            "Dota 2 18",

    };
    public String[] Cs = {
            "Как и P250, пистолетам Five SeveN и Tec9 для убийства достаточно одного попадания в голову оппонента экипированного в броню, но эти пистолеты имеют большую убойную дальность, чем P250",
            "MP9 настолько же скорострельный, как и Р90. Игроки жалуются на Р90, но МР9 такой же беспощадный против противников без брони",
            "Дробь Sawedoff дробовика не летит дальше 750 единиц (длина парапета на dust2)",
            "Cs 4",
            "Cs 5",
            "Cs 6",
            "Cs 7",
            "Cs 8",
            "Cs 9",
            "Cs 10",
            "Cs 11",
            "Cs 12",
            "Cs 13",
            "Cs 14",
            "Cs 15",
            "Cs 16",
            "Cs 17",
            "Cs 18",

    };
    public String[] Pubg = {
            "Оригинальная карта в PUBG названа в честь дочери Брендана Грина",
            "Сковородка в игре появилась из-за невнимательности разработчика",
            "Сеттинг Восточной Европы был выбран из-за брутальной архитектуры",
            "PUBG 4",
            "PUBG 5",
            "PUBG 6",
            "PUBG 7",
            "PUBG 8",
            "PUBG 9",
            "PUBG 10",
            "PUBG 11",
            "PUBG 12",
            "PUBG 13",
            "PUBG 14",
            "PUBG 15",
            "PUBG 16",
            "PUBG 17",
            "PUBG 18",

    };

    public Integer[] mThumbIdsCs = {R.drawable.csgo,
            R.drawable.p90,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo,
            R.drawable.csgo
    };

    public Integer[] mThumbIdsDota = {R.drawable.dota,
            R.drawable.dota,
            R.drawable.lancer,
            R.drawable.ea,
            R.drawable.magnus,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota,
            R.drawable.dota
    };
    public Integer[] mThumbIdsPubg = {R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg,
            R.drawable.pubg
    };


    private final static String FILE_NAME = "content.txt";

    public String openText() {

        FileInputStream fin = null;
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String(bytes);
            return text;
        } catch (IOException ex) {

            String kostil = "Slomalos";
            return kostil;
        } finally {

            try {
                if (fin != null)
                    fin.close();
            } catch (IOException ex) {
                String kostil = "Slomalos";
                return kostil;
            }
        }
    }


    public void AddFavorite(View view) {
        String str=openText();
        //str+=" ";
        str+=current;
        if(position<=9){
            str+="0";
        }
        str+=position;
        saveText(str);


    }


    private final static String FILE_NAME2 = "contentadd.txt";


    public String openTextAdd() {

        FileInputStream fin = null;
        try {
            fin = openFileInput(FILE_NAME2);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String(bytes);
            return text;
        } catch (IOException ex) {

            String kostil = "Slomalos";
            return kostil;
        } finally {

            try {
                if (fin != null)
                    fin.close();
            } catch (IOException ex) {
                String kostil = "Slomalos";
                return kostil;
            }
        }
    }

    public void saveText(String obmen) {
        FileOutputStream fos = null;
        try {
            String text = obmen;
            fos = openFileOutput(FILE_NAME2, MODE_PRIVATE);
            fos.write(text.getBytes());
        } catch (IOException ex) {
            boolean kostil = true;
        } finally {
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException ex) {
                boolean kostil = true;
            }
        }
    }
}