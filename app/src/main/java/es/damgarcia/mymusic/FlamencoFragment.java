package es.damgarcia.mymusic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.damgarcia.mymusic.databinding.FragmentFlamencoBinding;
import es.damgarcia.mymusic.databinding.FragmentStuydyBinding;


public class FlamencoFragment extends Fragment {

    private FragmentFlamencoBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFlamencoBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.miReligion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FlamencoFragment.this)
                        .navigate(R.id.action_flamencoFragment_to_religionFragment);
            }
        });

        binding.estrellaBlanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FlamencoFragment.this)
                        .navigate(R.id.action_flamencoFragment_to_estrellaFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}