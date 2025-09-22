package cis3334.unit5_pizzarycycle;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderViewHolder>{
    private List<Pizza> pizzaList = new ArrayList<>();
    private Context context;
    Application application;
    MainViewModel mainViewModel;

    public OrderAdapter(Application application, MainViewModel mainViewModel) {
        this.application = application;
        this.mainViewModel = mainViewModel;
    }


    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_row, parent, false);
        OrderViewHolder orderViewHolder = new OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
    Pizza pizza = mainViewModel.getAllOrder().getValue().get(position);
    holder.textViewPizzaDescription.setText(pizza.description);
    }

    @Override
    public int getItemCount() {
        return mainViewModel.getAllOrder().getValue().size();
    }
}
