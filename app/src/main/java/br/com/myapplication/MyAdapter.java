package br.com.myapplication;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<ModeloCidade> lstCidade;

    //criando o construtor da classe com parâmetros


    public MyAdapter(Context mContexto, List<ModeloCidade> lstCidade) {
        this.mContexto = mContexto;
        this.lstCidade = lstCidade;
    }{
}

    public class ViewHolder extends RecyclerView.ViewHolder {
    }
