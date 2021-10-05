/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectomathsocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author hidal
 */
public class Cliente {
    
     public static void main(String[] args){
        
        
         
             final String HOST="127.0.0.1";
             final int PORT = 6000;
             DataInputStream in;
             DataOutputStream out;
         try {    
             Socket sc = new Socket(HOST, PORT);
             
             in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                out.writeUTF("Jugadores esperando a iniciar partida");
                
                String waiting = in.readUTF();
                System.out.println(waiting);
                
                sc.close();
             
         } catch (IOException ex) {
             ex.printStackTrace();
         }
     }
}
