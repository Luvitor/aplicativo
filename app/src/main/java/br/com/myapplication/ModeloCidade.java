package br.com.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ModeloCidade {
    private String nome;
    private int imagem;
    private int rating;
}
public ModeloCidade(String nome, int imagem, int rating) {
    this.nome = nome;
    this.imagem = imagem;
    this.rating = rating;
}

public String getnome() {
    return nome;
}

public void setnome(String nome) {
    this.nome() = nome;
}

public int getImagem() {
    return imagem;
}

public void setImagem(int imagem) {
    this.imagem = imagem;
}

public int getRating() {
    return rating;
}

public void setRating(int rating) {
    this.rating = rating;
}