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
    
    
    public void primeiraConexao(String nick, String marcadorClient, String ip, String porta) throws Exception{
        Port = Integer.parseInt(porta);
        socket = new Socket(ip, Port);
        
        controler.setNickClient(nick);
        
        concatStr = marcadorClient + ";";
        concatStr.equals(nick);
        
        // Enviar mensagem para o servidor
        Conexao.enviar(socket, concatStr);
        
        // Receber mensagem do servidor
        StringInicial = Conexao.receber(socket);
        arrayString = StringInicial.split(";");
        controler.setMarcadorServer(arrayString[0]);
        controler.setNickServer(arrayString[1]);
        
        //=D;gui
        System.out.println(arrayString[1]);
    }
    
    public void jogada(char[] charJogo) throws Exception {    
//        socket = new Socket(ip, porta);
        
        String vaiStrJogo = String.valueOf(charJogo);
        String voltaStrJogo;
        
        // Enviar mensagem para o servidor
        Conexao.enviar(socket, vaiStrJogo);

        // Receber mensagem do servidor
        voltaStrJogo = Conexao.receber(socket);

        System.out.println("Servidor enviou: " + voltaStrJogo);
    }

    public static void main(String[] args) {
        
        Interface objInterface = new Interface();
        objInterface.setVisible(true);
    } 
}