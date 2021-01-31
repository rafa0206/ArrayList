/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ccp1an_pla_sistema_musicas_com_arraylist;

/**
 *
 * @author JFernandes
 */
public class Musica implements Comparable <Musica>{
    
    private String titulo;
    private int avaliacao;
    
    public Musica (String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo (){
        return this.titulo;
    }
    
    public void setAvaliacao (int avaliacao){
        this.avaliacao = avaliacao;
    }

    @Override
    public int compareTo(Musica t) {
        if (this.avaliacao < t.avaliacao)
            return -1;
        if (this.avaliacao > t.avaliacao)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Título: %s, Avaliação: %d", titulo, avaliacao);
    } 
}