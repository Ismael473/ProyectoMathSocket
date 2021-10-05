/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectomathsocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author hidal
 */
public class Servidor {
    
    public static void main(String[] args){
        
        
            ServerSocket servidor= null;
            Socket sc = null;
            final int PORT = 6000;
            
        try {    
            servidor= new ServerSocket(PORT);
            System.out.println("Jugador 1 conectado");
            DataInputStream in;
            DataOutputStream out;
            
            while(true){
                sc = servidor.accept();
                
                System.out.println("Jugador 2 conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                String connected = in.readUTF();
                
                System.out.println(connected);
                
                out.writeUTF("Esperando a comenzar partida");
                
                sc.close();
                
                
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

