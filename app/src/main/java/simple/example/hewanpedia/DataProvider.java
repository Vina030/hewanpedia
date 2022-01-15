package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Sapi;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.Angora_nama), ctx.getString(R.string.Angora_asal),
                ctx.getString(R.string.Angora_deskripsi), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.Bengal_nama), ctx.getString(R.string.Bengal_asal),
                ctx.getString(R.string.Bengal_deskripsi), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.Birmani_nama), ctx.getString(R.string.Birmani_asal),
                ctx.getString(R.string.Birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.Persia_nama), ctx.getString(R.string.Persia_asal),
                ctx.getString(R.string.Persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.Siam_nama), ctx.getString(R.string.Siam_asal),
                ctx.getString(R.string.Siam_deskripsi), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.Siberia_nama), ctx.getString(R.string.Siberia_asal),
                ctx.getString(R.string.Siberia_deskripsi), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.Bulldog_nama), ctx.getString(R.string.Bulldog_asal),
                ctx.getString(R.string.Bulldog_deskripsi), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.Husky_nama), ctx.getString(R.string.Husky_asal),
                ctx.getString(R.string.Husky_deskripsi), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.Kintamani_nama), ctx.getString(R.string.Kintamani_asal),
                ctx.getString(R.string.Kintamani_deskripsi), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.Samoyed_nama), ctx.getString(R.string.Samoyed_asal),
                ctx.getString(R.string.Samoyed_deskripsi), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.Shepherd_nama), ctx.getString(R.string.Shepherd_asal),
                ctx.getString(R.string.Shepherd_deskripsi), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.Shiba_nama), ctx.getString(R.string.Shiba_asal),
                ctx.getString(R.string.Shiba_deskripsi), R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Sapi> initDataSapi(Context ctx) {
        List<Sapi> sapis = new ArrayList<>();
        sapis.add(new Sapi(ctx.getString(R.string.Bali_nama), ctx.getString(R.string.Bali_asal),
                ctx.getString(R.string.Bali_deskripsi), R.drawable.sapi_bali));
        sapis.add(new Sapi(ctx.getString(R.string.Brahman_nama), ctx.getString(R.string.Brahman_asal),
                ctx.getString(R.string.Brahman_deskripsi), R.drawable.sapi_brahman));
        sapis.add(new Sapi(ctx.getString(R.string.Limousin_nama), ctx.getString(R.string.Limousin_Asal),
                ctx.getString(R.string.Limousin_deskripsi), R.drawable.sapi_limousin));
        sapis.add(new Sapi(ctx.getString(R.string.Ongole_nama), ctx.getString(R.string.Ongole_asal),
                ctx.getString(R.string.Ongole_deskripsi), R.drawable.sapi_ongole));
        sapis.add(new Sapi(ctx.getString(R.string.Simmental_nama), ctx.getString(R.string.Simmental_asal),
                ctx.getString(R.string.Simmental_deskripsi), R.drawable.sapi_simmental));
        return sapis;
    }
    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataSapi(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}