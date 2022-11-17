package es.damgarcia.mymusic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.damgarcia.mymusic.databinding.FragmentDembowBinding;
import es.damgarcia.mymusic.databinding.FragmentDrillBinding;


public class DembowFragment extends Fragment {

    private FragmentDembowBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDembowBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.singapur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DembowFragment.this)
                        .navigate(R.id.action_dembowFragment2_to_singapurFragment);
            }
        });
        binding.aparatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DembowFragment.this)
                        .navigate(R.id.action_dembowFragment2_to_aparatosFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}