import android.support.v7.app.AlertController;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.edu.recyclerview.R;

import java.util.ArrayList;
import java.util.HashMap;

import static android.support.v7.app.AlertController.*;

public class RecyclerAdapter extends RecycleListView.Adapter<RecyclerAdapter.MyViewHoder> {
    ArrayList<HashMap<String,Object>> arrayList=null;
    public RecyclerAdapter(ArrayList<HashMap<String,Object>>arrayList){
        this.arrayList=new ArrayList<HashMap<String, Object>>();
        this.arrayList=arrayList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        View view = inflate.inflate(R.layout.item_cardlayout, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
}
@Override
public void setArrayList
