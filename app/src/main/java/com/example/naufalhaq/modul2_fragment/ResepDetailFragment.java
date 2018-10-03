package com.example.naufalhaq.modul2_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import static com.example.naufalhaq.modul2_fragment.Resep.resepmakanan;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResepDetailFragment extends Fragment {

    private long resepId;

    public ResepDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resep_detail, container, false);
    }

    public void setResep(long id){
        this.resepId = id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView tittle = (TextView) view.findViewById(R.id.textJudul);
            Resep resep = Resep.resepmakanan[(int) resepId];
            tittle.setText(resep.getNama_makanan());
            TextView detail = (TextView) view.findViewById(R.id.textDetail);
            detail.setText(resep.getDetail_makanan());
            ImageView gambar = (ImageView) view.findViewById(R.id.gambar_resep);
            gambar.setImageResource(resep.getGambar_());
        }
    }

}