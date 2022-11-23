package com.mycompany.projetoa3;

import javax.swing.JOptionPane;

public class ControleJogo {
    
//Variáveis de Controle
    private char[] charJogo;
    
    //lógica para mudar o icone de cada usuário
    private String marcadorClient="X"; //Marcador de cada player
    private String marcadorServer;
    private String nickClient;
    private String nickServer;
    
    
    public Boolean AtualizaString(char[] chJogo, char newBtn) {
        
        //verifica se a o campo ja foi preenchido ou não
        if(chJogo[newBtn]=='-'){
            chJogo[newBtn] = 'C';
            chJogo[0]++;
            
            setCharJogo(chJogo);
            verificaVitoria(chJogo);
            return true;
        } else {
            return false;
        }
    }
    
    
    public void verificaVitoria(char[] charJogo){
        if(//VERTICAL X
            (charJogo[1]==('C') && charJogo[2]==('C') && charJogo[3]==('C'))
            || (charJogo[4]==('C') && charJogo[5]==('C') && charJogo[6]==('C'))
            || (charJogo[7]==('C') && charJogo[8]==('C') && charJogo[9]==('C'))
            || //HORIZONTAL
               (charJogo[1]==('C') && charJogo[4]==('C') && charJogo[7]==('C'))
            || (charJogo[2]==('C') && charJogo[5]==('C') && charJogo[8]==('C'))
            || (charJogo[3]==('C') && charJogo[6]==('C') && charJogo[9]==('C'))
            || //DIAGONAL
               (charJogo[1]==('C') && charJogo[5]==('C') && charJogo[9]==('C'))
            || (charJogo[3]==('C') && charJogo[5]==('C') && charJogo[7]==('C'))){
            JOptionPane.showMessageDialog(null,"Vitória do "+marcadorClient);
        }else
        if(//VERTICAL O
            (charJogo[1]==('S') && charJogo[2]==('S') && charJogo[3]==('S'))
            || (charJogo[4]==('S') && charJogo[5]==('S') && charJogo[6]==('S'))
            || (charJogo[7]==('S') && charJogo[8]==('S') && charJogo[9]==('S'))
            || //HORIZONTAL
               (charJogo[1]==('S') && charJogo[4]==('S') && charJogo[7]==('S'))
            || (charJogo[2]==('S') && charJogo[5]==('S') && charJogo[8]==('S'))
            || (charJogo[3]==('S') && charJogo[6]==('S') && charJogo[9]==('S'))
            || //DIAGONAL
                //HORIZONTAL
               (charJogo[1]==('S') && charJogo[5]==('S') && charJogo[9]==('S'))
            || (charJogo[3]==('S') && charJogo[5]==('S') && charJogo[7]==('S'))){
            JOptionPane.showMessageDialog(null,"Vitória do "+ getMarcadorServer());
        }else
        if(charJogo[0]==9){
            JOptionPane.showMessageDialog(null,"Empate");
        }
        
    }

    public void setNickClient(String nickClient) {
        this.nickClient = nickClient;
    }
    public void setNickServer(String nickServer) {
        this.nickServer = nickServer;
    }

    public String getMarcadorClient() {
        return marcadorClient;
    }
    public String getMarcadorServer() {
        return marcadorServer;
    }
    public void setMarcadorServer(String marcadorServer) {
        this.marcadorServer = marcadorServer;
    }

    public char[] getCharJogo() {
        return charJogo;
    }

    public void setCharJogo(char[] charJogo) {
        this.charJogo = charJogo;
    }

}

        
