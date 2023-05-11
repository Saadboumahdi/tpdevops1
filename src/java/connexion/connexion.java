/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class connexion {
    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    Statement st;
    Connection cn;
    public connexion(){
        try{
        Class.forName("oracle.jdbc.OracleDriver");
          cn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "pfe", "ntic");
          st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }
    public Statement getst()
    {
        return st;
    }
}
