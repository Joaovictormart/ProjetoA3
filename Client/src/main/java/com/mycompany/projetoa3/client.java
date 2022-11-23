package com.mycompany.projetoa3;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class client {

    ControleJogo controler = new ControleJogo();
    
    Socket socket;
    private int Port;
    private String concatStr;
    private String StringInicial;
    private String[] arrayString;
    private char [] voltaCharJogo;
    private char[] charJogo;
    
    
    public void primeiraConexao(String nickClient, String marcadorClient, String ip, String porta) throws Exception{
        Port = Integer.parseInt(porta);
        socket = new Socket(ip, Port);
        
        
        controler.setNickClient(nickClient);
    
        concatStr = "T;" + marcadorClient + ";" + nickClient;
        // Enviar mensagem para o servidor
        Conexao.enviar(socket, concatStr);
        
        
        // Receber mensagem do servidor
        StringInicial = Conexao.receber(socket);
        arrayString = StringInicial.split(";");
        if(arrayString[0].equals("T")){
            controler.setMarcadorServer(arrayString[1]);
            controler.setNickServer(arrayString[2]);

            //Libera o game para começar
            String strJogo= "0---------";
            setCharJogo(strJogo);
            
            System.out.println(getCharJogo());
            System.out.println("passou por aqui ");  
        }else{
            String voltaStrJogo;
            voltaStrJogo = Conexao.receber(socket);
            voltaCharJogo = voltaStrJogo.toCharArray();
//            controler.setCharJogo(voltaCharJogo);

            System.out.println("Servidor enviou: " + voltaStrJogo);
        }
        
    }
    
    
    public void jogada(char[] charJogo) throws Exception {    
        
        String vaiStrJogo = String.valueOf(charJogo);
        
        // Enviar mensagem para o servidor
        Conexao.enviar(socket, vaiStrJogo);
    }

    public static void main(String[] args) {
        Interface objInterface = new Interface();
        objInterface.setVisible(true);
    }  

   
    public void setCharJogo(String strJogo) {
        charJogo = strJogo.toCharArray();
    }
    public char[] getCharJogo() {
        return charJogo;
    }
    
}