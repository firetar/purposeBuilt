package richard.mike.com.purposebuilt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Michael on 23/06/2016.
 */
class CustomerAdapter extends ArrayAdapter<String> {
    public CustomerAdapter(Context context, String[]dates) {
        super(context,R.layout.custom_row, dates);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mikeInflater=LayoutInflater.from(getContext());
        View customView=mikeInflater.inflate(R.layout.custom_row,parent,false);
        String singleDatesItem =getItem(position);
        TextView mikesText=(TextView)customView.findViewById(R.id.mikeText);
        ImageView mikesImage=(ImageView)customView.findViewById(R.id.androidImg);
        mikesText.setText(singleDatesItem);
        mikesImage.setImageResource(R.drawable.android);
        return customView;
    }
}
