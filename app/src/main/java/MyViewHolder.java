import android.view.View;
import android.widget.ImageView;

import com.example.edu.recyclerview.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public ImageView itemImage;
    public MyViewHolder(View itemView){
        super(View itemView);
        itemImage=(ImageView)itemView.findViewById(R.id.item_image);

    }
}
