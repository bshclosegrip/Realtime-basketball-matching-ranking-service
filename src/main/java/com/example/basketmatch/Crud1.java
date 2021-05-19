package com.example.basketmatch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Crud1 extends Fragment {

    private View view;
    private TextView tv_frag1;
    private Button btn_move;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.crud_1,container, false);

        tv_frag1 = view.findViewById(R.id.tv_flag2);
        btn_move = view.findViewById(R.id.btn_move);

        btn_move.setOnClickListener(new View.OnClickListener() { //수정으로 이동
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("from Crud1", "홍드로이드 프레그먼트");
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                Crud2 curd2 = new Crud2();
                Crud2.setArguments(bundle);
                transaction.replace(R.id.frameLayout, Crud2);
                transaction.commit();
            }
        });
        return view;
    }
}
