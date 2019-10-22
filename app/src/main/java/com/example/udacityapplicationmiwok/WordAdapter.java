package com.example.udacityapplicationmiwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WordAdapter<W> extends ArrayAdapter {

    private int color ;
    WordAdapter(Context context, ArrayList<W> words, int color) {
        super(context, 0 ,words);
        this.color = color ;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list

        Word wordObj = (Word) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView textView_eng = convertView.findViewById(R.id.default_text_view);
        // set this text on the name TextView
        textView_eng.setText(wordObj.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView textView_miwok = convertView.findViewById(R.id.miwok_view);
        // set this text on the number TextView
        textView_miwok.setText(wordObj.getMiwokTranslation());

        RelativeLayout layout = convertView.findViewById(R.id.text_background);
        layout.setBackgroundResource(color);

        ImageView imageView = convertView.findViewById(R.id.image_icon);
        if (wordObj.getmImageResourceId()!=0) {
            imageView.setImageResource(wordObj.getmImageResourceId());
        }
        else {
            imageView.setVisibility(View.GONE);
            layout.setBackgroundResource(R.color.category_phrases);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return convertView;
    }
}
