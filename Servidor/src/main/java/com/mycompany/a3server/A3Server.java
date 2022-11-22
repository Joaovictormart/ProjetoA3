package com.mycompany.a3server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A3Server {
    
//  Variáveis de controle
    Socket socket;
    ServerSocket serversocket;
    private String concatStr;
    private String strRecebida;
    private String[] arrayString;
    private char [] voltaCharJogo;

    
    Interface objInterface = new Interface();
    ControleJogo controler = new ControleJogo();
        

    public boolean connect() {
        try {
            socket = serversocket.accept();  // fase de conexao
            return true;
        } catch (IOException e) {
            System.err.println("Nao fez conexao" + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        
        Interface objInterface = new Interface();
        objInterface.setVisible(true);
       
        try {
            A3Server servidor = new A3Server();
            servidor.rodarServidor();
        } catch(Exception e){
            e.printStackTrace();
        }

    } 

    public void rodarServidor() throws Exception {
        String textoEnviado = "Olá, Cliente";

        serversocket = new ServerSocket(9500);
        System.out.println("Servidor iniciado!");

        while(true) {
            if (connect()) {

//              Recebe mensagem
                strRecebida = Conexao.receber(socket);
                arrayString = strRecebida.split(";");
//                lógica para primeira mensagem recebida
                if(arrayString[0].equals("T")){
                    controler.setNickClient(arrayString[2]);
                    objInterface.setMarcadorClient(arrayString[1]);
                    System.out.println("Primeira mensagem");

                    primeiraResposta();
                }else{
                    String voltaStrJogo;
                    voltaStrJogo = Conexao.receber(socket);
                    voltaCharJogo = voltaStrJogo.toCharArray();
                    controler.setCharJogo(voltaCharJogo);
                    
                    System.out.println("Servidor enviou: " + voltaStrJogo);
                }
              
//                System.out.println(strRecebida);
//                
////              Envia mensagem
//                Conexao.enviar(socket, textoEnviado);
//                socket.close();
            }
        }
    }
    
    private void primeiraResposta() throws IOException{
        String nick = objInterface.getNick();
        String marcadorServer = objInterface.getMarcadorServer();
        
        concatStr = "T;" + marcadorServer + ";" + nick ;
        System.out.println(concatStr);
        Conexao.enviar(socket, concatStr);
    }
    
    public void jogada(char[] charJogo) throws Exception {    
//        socket = new Socket(ip, porta);
        
        String vaiStrJogo = String.valueOf(charJogo);
        
        
        // Enviar mensagem para o servidor
        Conexao.enviar(socket, vaiStrJogo);
    }

}
