package com.example.part2;


import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link bottomFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class bottomFragment2 extends Fragment {
    private TextView text;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public bottomFragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment bottomFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static bottomFragment2 newInstance(String param1, String param2) {
        bottomFragment2 fragment = new bottomFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_bottom2, container, false);
        text = v.findViewById(R.id.text_input);

        return v;
    }

    public void updateEditText(CharSequence newText, String img){
        text.setText(newText);
        if(img.equals("dog"))
        {
            text.setBackgroundResource(R.drawable.dog);
        }
        else if(img.equals("cow"))
        {
            text.setBackgroundResource(R.drawable.cow);
        }
        else if(img.equals("cat"))
        {
            text.setBackgroundResource(R.drawable.cat);
        }
        else if(img.equals("bird"))
        {
            text.setBackgroundResource(R.drawable.bird);
        }
        else
        {
            text.setBackgroundResource(R.drawable.fish);
        }
    }

}