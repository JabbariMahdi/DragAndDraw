package com.maktab.mahdi.draganddraw;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;


public class DragAndDrawFragment extends Fragment {


    public DragAndDrawFragment() {
        // Required empty public constructor
    }

    public static DragAndDrawFragment newInstance() {

        Bundle args = new Bundle();

        DragAndDrawFragment fragment = new DragAndDrawFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FrameLayout frameLayout=new FrameLayout(getActivity());
        BoxDrawingView boxDrawingView=new BoxDrawingView(getActivity());
        frameLayout.addView(boxDrawingView);
        FrameLayout.LayoutParams boxLayoutParams= (FrameLayout.LayoutParams) boxDrawingView
                .getLayoutParams();

        boxLayoutParams.height=-1;
        boxLayoutParams.width=-1;
        boxDrawingView.setLayoutParams(boxLayoutParams);

        Button button=new Button(getActivity());
        frameLayout.addView(button,-2,-2);
        FrameLayout.LayoutParams buttonParams=
                (FrameLayout.LayoutParams) button.getLayoutParams();
        buttonParams.gravity= Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL;
        buttonParams.setMargins(0,0,0,200);
        button.setLayoutParams(buttonParams);
        button.setText("test");

        return frameLayout;
    }

}
