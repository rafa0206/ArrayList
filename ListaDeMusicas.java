/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ccp1an_pla_sistema_musicas_com_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author JFernandes
 */
public class ListaDeMusicas {
    
    public static void main(String[] args) {
        String menu = "1-Inserir Música\n2-Avaliar Música\n3-Ver lista de músicas ordenada\n0-Sair";
        List <Musica> musicas = new ArrayList <> ();
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (opcao){//fall-through
                case 1: 
                    String tituloMusica = JOptionPane.showInputDialog("Qual o nome da música?");
                    Musica musica = new Musica (tituloMusica);
                    musicas.add(musica);
                    JOptionPane.showMessageDialog(null, "Música inserida com sucesso!");
                    break;
                case 2:
                    String musicaAvaliar = JOptionPane.showInputDialog("Qual música deseja avaliar?");
                    int avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua avaliação, de 0 a 5?"));
                    int i;
                    for (i = 0; i < musicas.size(); i++){
                        if (musicas.get(i).getTitulo().equals(musicaAvaliar)){
                            musicas.get(i).setAvaliacao(avaliacao);
                            break;
                        }
                    }
                    JOptionPane.showMessageDialog(null, i < musicas.size() ? "Música avaliada!" : "Música não existe na sua base");
                                                           
                    break;
                case 3:
                    //in place
                    Collections.sort(musicas, Collections.reverseOrder());
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Até mais ver");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
            
        }while (opcao != 0);
    }
    
}
