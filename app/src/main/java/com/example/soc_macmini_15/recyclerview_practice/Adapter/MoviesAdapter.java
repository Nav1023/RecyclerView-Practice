package com.example.soc_macmini_15.recyclerview_practice.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.soc_macmini_15.recyclerview_practice.Model.Movie;
import com.example.soc_macmini_15.recyclerview_practice.R;

import org.w3c.dom.Text;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Movie> movieList;

    public MoviesAdapter(List<Movie> movieList){
        this.movieList=movieList;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View itemView= LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.movie_list_row,viewGroup,false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Movie movie=movieList.get(i);
        myViewHolder.title.setText(movie.getTitle());
        myViewHolder.genre.setText(movie.getGenre());
        myViewHolder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title,year,genre;

        public MyViewHolder(View view){
            super(view);
            title=(TextView)view.findViewById(R.id.title);
            genre=(TextView)view.findViewById(R.id.genre);
            year=(TextView)view.findViewById(R.id.year);

        }
    }
}
