
package br.com.pdv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try{
        
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bdvendas?user=userteste&password=123");

        } catch(Exception erro){
            throw new RuntimeException(erro);
        }
        
    }
    
}
