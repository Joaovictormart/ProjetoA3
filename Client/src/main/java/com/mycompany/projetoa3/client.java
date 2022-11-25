package com.mycompany.projetoa3;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class client {

    ControleJogo controler = new ControleJogo();
    
    static Socket socket;
    private String vaiStrJogo;
    private char[] charJogo;
    static String strJogo= "0---------";
    
    
    public void primeiraConexao(String ip, String porta, String StrEnviada) throws Exception{
        
        socket = new Socket("localhost",9500);
        
//        int port = Integer.parseInt(porta);
//        
//        try {
//            setSocket(new Socket(ip, port));
//        } catch (IOException ex) {
//            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        Envia mensagem
        EnviaMensagem(StrEnviada);
        
//        Recebe mensagem
        new Thread(RecebeMensagem).start();
    }
    
    
    public void EnviaMensagem(String StrEnvia) throws Exception {    
        
//        vaiStrJogo = "1---C-----";
        // Enviar mensagem para o servidor
        Conexao.enviar(socket, StrEnvia);
        System.out.println("JogadaEnviada");
        System.out.println("opa"+getSocket());
    }

    public static void main(String[] args){
        TelaInicio inicio = new TelaInicio();
        inicio.setVisible(true);
    }  
    
   

    private static Runnable RecebeMensagem = new Runnable(){
        
        private boolean auxsinal;
        private String rmsg;
        private String[] arrayString;
        private char [] voltaCharJogo;

        ControleJogo controler = new ControleJogo();
        Interface objInterface = new Interface();
        client cliente = new client();


        public void recebeMensagem(String i) {
            auxsinal = true;
            rmsg = i;
            new Thread(this, rmsg).start();

        }
        public void run(){
            System.out.println("salve");
            while(true){
                try {
                    String StringRecebe;
                    StringRecebe = Conexao.receber(socket);
                    arrayString = StringRecebe.split(";");
                    
                    if(arrayString[0].equals("T")){
                        controler.setMarcadorServer(arrayString[1]);
                        controler.setNickServer(arrayString[2]);

                        //Libera o game para começar
                        cliente.setCharJogo(strJogo);
                        
                        System.out.println("passou por aqui ");  

//                        do{
//
//                        }while(objInterface.aguardaJogada()==false);
//
//                        String vaiStrJogo = String.valueOf(objInterface.getCharJogo());
//        //                    vaiStrJogo = "1---C-----";
//                            // Enviar mensagem para o servidor
//                        Conexao.enviar(cliente.getSocket(), cliente.getVaiStrJogo());
//
//                        System.out.println("JogadaEnviada");

                    }else{
                        String voltaStrJogo;
                        voltaStrJogo = Conexao.receber(socket);
                        voltaCharJogo = voltaStrJogo.toCharArray();
            //            controler.setCharJogo(voltaCharJogo);

                        System.out.println("Servidor enviou: " + voltaStrJogo);
                    }
                    
                } catch (Exception ex) {
                    Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };
    
    public void criaThread(){
        new Thread(esperaJogada).start();
    }

    private static Runnable esperaJogada = new Runnable(){
        public void run(){
            Interface objInterface = new Interface();
            objInterface.setVisible(true);
        }
    };
            
    public void setCharJogo(String strJogo) {
        char[] charJogo = strJogo.toCharArray();
        System.out.println("pika"+getCharJogo());
    }
    public char[] getCharJogo() {
        return charJogo;
    }

    public String getVaiStrJogo() {
        return vaiStrJogo;
    }

    public void setVaiStrJogo(String vaiStrJogo) {
        this.vaiStrJogo = vaiStrJogo;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    
    public Socket getSocket() {
        return socket;
    }

    
}