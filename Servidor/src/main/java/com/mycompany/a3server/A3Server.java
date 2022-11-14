package com.mycompany.a3server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A3Server {
    Socket socketClient;
    ServerSocket serversocket;
    Interface objInterface = new Interface();
        

    public boolean connect() {
        try {
            socketClient = serversocket.accept();  // fase de conexao
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
        String textoRecebido = "";
        String textoEnviado = "Olá, Cliente";
        Scanner input = new Scanner(System.in);

        serversocket = new ServerSocket(9500);
        System.out.println("Servidor iniciado!");

        while(true) {
            if (connect()) {
                textoRecebido = Conexao.receber(socketClient);
                

                objInterface.xuxu2();

                System.out.println("Cliente enviou: " + textoRecebido);
                System.out.print("\nDigite a sua mensagem: ");// fase de dados
                textoEnviado = input.nextLine();
                Conexao.enviar(socketClient, textoEnviado);
                socketClient.close();
            }
        }
    }

}
