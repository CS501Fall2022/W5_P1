package com.example.part2;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class topfragment extends Fragment {
    //MainActivity.OnDataPass dataPasser;
    private Button btnClick;
    private EditText editText;
    private Topfraglistener listener;
    private ListView listview;


    //    public void passData(String data) {
//        dataPasser.onDataPass(data);
//    }
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public topfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment topfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static topfragment newInstance(String param1, String param2) {
        topfragment fragment = new topfragment();
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

    public interface Topfraglistener{
        void inputTopSent(CharSequence input, String img);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Topfraglistener){
            this.listener = (Topfraglistener) context;
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_topfragment, container, false);
        listview = v.findViewById(R.id.list_items);

        List<String> list = new ArrayList<>();
        list.add("Cow");
        list.add("Dog");
        list.add("Cat");
        list.add("Fish");
        list.add("Bird");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener( new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if( i == 0){
                    String img = "drawable/cow";
                    CharSequence input = "Moo";
                    listener.inputTopSent(input, img);

                }
                else if(i == 1){
                    String img = "drawable/dog";
                    CharSequence input = "Bark";
                    listener.inputTopSent(input,img);
                }
                else if(i == 2) {
                    CharSequence input = "Meow";
                    String img = "drawable/cat";
                    listener.inputTopSent(input,img);
                }
                else if(i == 3){
                    CharSequence input = "Blub";
                    String img = "drawable/fish";
                    listener.inputTopSent(input,img);
                }
                else{
                    CharSequence input = "Whistle";
                    String img = "drawable/fish";
                    listener.inputTopSent(input,img);
                }
            }
        });
        return v;

    }

    public void updateEditText(CharSequence newText){
        editText.setText(newText);
    }


    @Override
    public void onDetach(){
        super.onDetach();
        listener = null;
    }

}