package es.damgarcia.mymusic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.damgarcia.mymusic.databinding.FragmentDrillBinding;
import es.damgarcia.mymusic.databinding.FragmentFirstBinding;


public class DrillFragment extends Fragment {

    private FragmentDrillBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDrillBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.rolando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DrillFragment.this)
                        .navigate(R.id.action_drillFragment_to_rolandoFragment);
            }
        });
        binding.loadingCentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DrillFragment.this)
                        .navigate(R.id.action_drillFragment_to_loadingFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}