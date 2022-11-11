package com.mycompany.projetoa3;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class client {
    Socket socket;

    public void comunicarComServidor(String ip, int porta) throws Exception {
        String textoRequisicao = "Conexao estabelecida";
        String textoRecebido = "";
        
        socket = new Socket(ip, porta);

        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite a sua mensagem: ");
        textoRequisicao = input.nextLine();
        
        // Enviar mensagem para o servidor
        Conexao.enviar(socket, textoRequisicao);

        // Receber mensagem do servidor
        textoRecebido = Conexao.receber(socket);

        System.out.println("Servidor enviou: " + textoRecebido);
    }


    public static void main(String[] args) {
        
        Interface objInterface = new Interface();
        objInterface.setVisible(true);
        
    } 
}