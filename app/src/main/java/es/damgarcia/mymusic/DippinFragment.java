package es.damgarcia.mymusic;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class DippinFragment extends Fragment {

    private ImageButton boton;
    private MediaPlayer mp;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        boton = view.findViewById(R.id.playDippin);
        mp = MediaPlayer.create(getContext(),R.raw.justdippin);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()){
                    mp.pause();
                    boton.setImageAlpha(R.drawable.ic_baseline_pause_circle_24);
                } else {
                    mp.start();
                }
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dippin, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}