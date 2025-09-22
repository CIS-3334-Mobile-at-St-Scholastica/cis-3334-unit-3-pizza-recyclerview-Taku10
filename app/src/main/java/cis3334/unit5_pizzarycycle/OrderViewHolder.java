package cis3334.unit5_pizzarycycle;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OrderViewHolder extends RecyclerView.ViewHolder{

    TextView textViewPizza;
    TextView textViewPizzaDescription;
    ImageView imageViewPizza;
    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewPizza = itemView.findViewById(R.id.textViewPizza);
        textViewPizzaDescription = itemView.findViewById(R.id.textViewPizzaDescription);
        imageViewPizza = itemView.findViewById(R.id.imageViewPizza);
    }
}
