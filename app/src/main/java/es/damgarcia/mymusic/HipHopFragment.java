package es.damgarcia.mymusic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.damgarcia.mymusic.databinding.FragmentFlamencoBinding;
import es.damgarcia.mymusic.databinding.FragmentHipHopBinding;


public class HipHopFragment extends Fragment {

    private FragmentHipHopBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentHipHopBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.justDippin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(HipHopFragment.this)
                        .navigate(R.id.action_hipHopFragment2_to_dippinFragment);
            }
        });

        binding.stillDree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(HipHopFragment.this)
                        .navigate(R.id.action_hipHopFragment2_to_stillFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}