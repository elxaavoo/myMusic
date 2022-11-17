package es.damgarcia.mymusic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import es.damgarcia.mymusic.databinding.FragmentFirstBinding;
import es.damgarcia.mymusic.databinding.FragmentLoginBinding;


public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle resultado = new Bundle();
                resultado.putString("bundlekey", binding.userLogin.getText().toString());
                getParentFragmentManager().setFragmentResult("key",resultado);
                if (binding.userLogin.getText().toString().equals("xavi") && binding.passLogin.getText().toString().equals("1234")){
                    NavHostFragment.findNavController(LoginFragment.this)
                            .navigate(R.id.action_loginFragment_to_FirstFragment);
                } else {
                    Toast.makeText(getContext(), "Login Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}