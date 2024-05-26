package dev.tomco.a24b_11345a_l02_03.Logic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dev.tomco.a24b_11345a_l02_03.Model.Country;
import dev.tomco.a24b_11345a_l02_03.R;

public class DataManager {

    private static String[] names = new String[]{
            "Italy",
            "Iraq",
            "Bhutan",
            "Kenya",
            "Djibouti",
            "Slovakia",
            "San marino",
            "Romania",
            "Laos",
            "Saudi arabia",
            "Iran",
            "Czech republic",
            "United arab emirates",
            "Israel",
            "Costa rica",
            "Philippines",
            "France",
            "Argentina",
            "Thailand",
            "Canada"
    };
    private static int[] flagImages = new int[]{
            R.drawable._013_italy,
            R.drawable._020_iraq,
            R.drawable._040_bhutan,
            R.drawable._067_kenya,
            R.drawable._068_djibouti,
            R.drawable._091_slovakia,
            R.drawable._097_san_marino,
            R.drawable._109_romania,
            R.drawable._112_laos,
            R.drawable._133_saudi_arabia,
            R.drawable._136_iran,
            R.drawable._149_czech_republic,
            R.drawable._151_united_arab_emirates,
            R.drawable._155_israel,
            R.drawable._156_costa_rica,
            R.drawable._192_philippines,
            R.drawable._195_france,
            R.drawable._198_argentina,
            R.drawable._238_thailand,
            R.drawable._243_canada,
    };
    private static boolean[] canEnter = new boolean[]{
            true,
            false,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            false,
            false,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
    };

    public static List<Country> getCountries(){
        ArrayList<Country> allCountries = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            allCountries.add(
                    new Country()
                            .setName(names[i])
                            .setFlagImage(flagImages[i])
                            .setCanEnter(canEnter[i])
            );
        }
        Collections.shuffle(allCountries);
        return allCountries;
    }
}
