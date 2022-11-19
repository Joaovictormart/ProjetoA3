package com.mycompany.projetoa3;

import javax.swing.JOptionPane;

public class ControleJogo {
    
//    Variáveis de Controle
    //                       0123456789
    private String strJogo= "----------";

//    Objetos
    Interface objInterface = new Interface();
    
    
    public void AtualizaString(char newBtn) {
        
    //atualiza painel
    char[] charJogo = strJogo.toCharArray();
    if(charJogo[newBtn]=='-'){
        charJogo[newBtn] = 'X';
        //a func para alterar o painel
        objInterface.alteraPainel(newBtn);       
    } else {
        JOptionPane.showMessageDialog(null,"Esse campo já está preenchido");
    }

    strJogo = String.valueOf(charJogo);
    System.out.println(strJogo);


    //Imprime marcadores na tela
    }
        
    
}

        
