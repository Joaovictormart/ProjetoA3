package com.mycompany.a3server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A3Server {
    
//  Variáveis de controle
    static Socket socket;
    private String concatStr;
    private String[] arrayString;
    private char[] charJogo;

    
    ControleJogo controler = new ControleJogo();
        



    public static void main(String[] args) {
        
        TelaInicio inicio = new TelaInicio();
        inicio.setVisible(true);
       
//        try {
//            A3Server servidor = new A3Server();
//            servidor.rodarServidor();
//        } catch(Exception e){
//            e.printStackTrace();
//        }

    } 

    public void rodarServidor() throws Exception {

//        if(serversocket == null){
//            serversocket = new ServerSocket(9500);
//        }
//        
//        boolean conectado = connect();
//
////          Recebe mensagem
//        while(conectado) {
//            strRecebida = Conexao.receber(socket);
//            arrayString = strRecebida.split(";");
//
////          lógica para primeira mensagem recebida
//            if(arrayString[0].equals("T")){
//                controler.setNickClient(arrayString[2]);
//                controler.setMarcadorClient(arrayString[1]);
//                System.out.println("Primeira mensagem");
//                primeiraResposta();
//            }else{
//                setCharJogo(strRecebida);
//                System.out.println(" jogada:" + strRecebida);
//            }
//
//
//            System.out.println("Servidor enviou:" + strRecebida);
//        }
//        socket.close();
    }
    
    private static Runnable rodarServidor = new Runnable(){
        
        private String rmsg;
        private String[] arrayString;
        private String strRecebida;

        ServerSocket serversocket;


        ControleJogo controler = new ControleJogo();
        Interface objInterface = new Interface();
        A3Server server = new A3Server();

        
        public boolean connect() {
            try {
                socket = serversocket.accept();  // fase de conexao
                return true;
            } catch (IOException e) {
                System.err.println("Nao fez conexao" + e.getMessage());
                return false;
            }
        }
        
        public void run(){
            
            if(serversocket == null){
                try {
                    serversocket = new ServerSocket(9500);
                } catch (IOException ex) {
                    Logger.getLogger(A3Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           
            
            while(connect()){
                try {
                    strRecebida = Conexao.receber(socket);
                    arrayString = strRecebida.split(";");

        //          lógica para primeira mensagem recebida
                    if(arrayString[0].equals("T")){
                        controler.setNickClient(arrayString[2]);
                        controler.setMarcadorClient(arrayString[1]);
                        System.out.println("Primeira mensagem");
                        server.primeiraResposta();
                    }else{
                        server.setCharJogo(strRecebida);
                        System.out.println(" jogada:" + strRecebida);
                    }

                        System.out.println("Servidor enviou:" + strRecebida);
                    } 
                catch (IOException ex) {
                    Logger.getLogger(A3Server.class.getName()).log(Level.SEVERE, null, ex);
                }        
            }
        }
    };
    
    public void iniciaThread(){
        new Thread(esperaJogada).start();
        new Thread(rodarServidor).start();
    }
    
    private static Runnable esperaJogada = new Runnable(){
        public void run(){
            Interface objInterface = new Interface();
            objInterface.setVisible(true);
        }
    };
    
    private void primeiraResposta() throws IOException{
        Interface objInterface = new Interface();
        String nick = objInterface.getNick();
        String marcadorServer = objInterface.getMarcadorServer();
        
        concatStr = "T;" + marcadorServer + ";" + nick ;
        System.out.println(concatStr);
        Conexao.enviar(socket, concatStr);
   
    }
    
    public void jogada(char[] charJogo) throws Exception {    
        
        String vaiStrJogo = String.valueOf(charJogo);
        
        // Enviar mensagem para o servidor
        Conexao.enviar(socket, vaiStrJogo);
        
        try {
            A3Server servidor = new A3Server();
            servidor.rodarServidor();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    
    public void setCharJogo(String strJogo) {
        charJogo = strJogo.toCharArray();
    }
    public char[] getCharJogo() {
        System.out.println(charJogo);
        return charJogo;
        
    }
    
}
