/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.ChatBLL;

/**
 *
 * @author luisf
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        Conectar c = new Conectar("chats", "root","");
        
        System.out.println("Conexión: "+c.obtenerConexion("chat", "root", ""));
        
    }
    
}
