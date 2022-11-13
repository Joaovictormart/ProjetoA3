package com.mycompany.projetoa3;

import javax.swing.JOptionPane;

public class ControleJogo {
    
//    Variáveis de Controle
    //                       0123456789
    private String strJogo= "----------";
    private String marcador="s"; //s - servidor >> c - cliente
    
//    Objetos
    Interface objInterface = new Interface();
    
    
    public void AtualizaString(char newBtn) {
        
    char[] charJogo = strJogo.toCharArray();
    char[] charMarcador = marcador.toCharArray();
    
    //verifica se a o campo ja foi preenchido ou não
    if(charJogo[newBtn]=='-'){
        charJogo[newBtn] = 'X';
        //a func para alterar o painel
        objInterface.alteraPainel(charJogo, marcador);       
    } else {
        JOptionPane.showMessageDialog(null,"Esse campo já está preenchido");
    }

    strJogo = String.valueOf(charJogo);
    System.out.println(strJogo);


    //Imprime marcadores na tela
    }
        
    
}

        
