/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adry
 */
public class MetodosCrearBD {
    static Connection conn = null;
    static Statement stmt = null;   
    
    public static void Conectar(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:battlemonsters.db");
            conn.setAutoCommit(false);
        } catch (Exception e) {
            System.err.println("Fallo al conectar la base de datos");
        }
    }
    public static void crearBMonstruos(){
        try {
            stmt = conn.createStatement();
            String sql = "Create table bmonstruos "
                    + "(nummon integer primary key not null,"
                    + "nmon text not null,"
                    + "tipo text not null,"
                    + "fotomon text not null,"
                    + "fotomonr text not null,"
                    + "hpmon integer not null,"
                    + "atkmon integer not null,"
                    + "defmon integer not null,"
                    + "fort1 text,"
                    + "fort2 text,"
                    + "deb1 text,"
                    + "deb2 text)";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            try {
                stmt.executeUpdate("drop table bmonstruos");
                crearBMonstruos();
            } catch (SQLException ex1) {
                System.err.print("Error al borrar la tabla bmonstruos");
            }

        }
    }

    public static void crearBMovimientos(){
        try {
            stmt = conn.createStatement();
            String sql = "Create table bmovimientos "
                    + "(nummov integer primary key not null,"
                    + "nmov text not null,"
                    + "tipo text not null,"
                    + "daño integer not null,"
                    + "usos integer not null)";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            try {
                stmt.executeUpdate("drop table bmovimientos");
                crearBMovimientos();
            } catch (SQLException ex1) {
                System.err.println("Error al borrar la tabla bmovimientos");
            }
        }
    }

    public static void crearBMonsterpedia(){
        try {
            stmt = conn.createStatement();
            String sql = "Create table bmonsterpedia "
                    + "(nmon text primary key not null,"
                    + "datos1 text,"
                    + "datos2 text,"
                    + "datos3 text)";
            stmt.executeUpdate(sql);
            conn.commit();
        } catch (SQLException ex) {
            try {
                stmt.executeUpdate("drop table bmonsterpedia");
                crearBMonsterpedia();
            } catch (SQLException ex1) {
                System.err.println("Erro al borrar la tabla bmonsterpedia");
            }
        }
    }

    public static void crearJugador(){
        try {
            stmt = conn.createStatement();
            String sql = "Create table jugador"
                    + "(numxogador integer primary key not null,"
                    + "njugador text,"
                    + "sjugador text,"
                    + "pwin integer,"
                    + "plose integer)";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            try {
                stmt.executeUpdate("drop table jugador");
                crearJugador();
            } catch (SQLException ex1) {
                System.err.println("Error al borrar la tabla jugador");
            }
        }
    }

    public static void desconectar(){
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            System.err.println("Error al desconectar");
        }
    }

    public static void insertarMonstruos(){
        try {
            stmt=conn.createStatement();
            String sql1 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(1,'Amepach','steel','MonsterJ1/AmepachJ1.png','RivalMonster/Amepach.png',150,30,30,'grass','earth','water','fire')";
            String sql2 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(2,'Ankylore','earth','MonsterJ1/AnkyloreJ1.png','RivalMonster/Ankylore.png',190,25,45,'fire','water','steel','grass')";
            String sql3 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(3,'Haisand','earth','MonsterJ1/HaisandJ1.png','RivalMonster/Haisand.png',150,40,25,'fire','water','steel','grass')";
            String sql4 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(4,'Hakonmyo','steel','MonsterJ1/HakonmyoJ1.png','RivalMonster/Hakonmyo.png',160,45,25,'grass','earth','water','fire')";
            String sql5 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(5,'Hiprunio','fire','MonsterJ1/HirprunioJ1.png','RivalMonster/Hiprunio.png',170,30,25,'grass','steel','earth','water')";
            String sql6 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(6,'Hitsune','fire','MonsterJ1/HitsuneJ1.png','RivalMonster/Hitsune.png',130,50,20,'grass','steel','earth','water')";
            String sql7 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(7,'Kazanne','fire','MonsterJ1/KazanneJ1.png','RivalMonster/Kazanne.png',165,30,35,'grass','steel','earth','water')";
            String sql8 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(8,'Lifeuer','fire','MonsterJ1/LifeuerJ1.png','RivalMonster/Lifeuer.png',125,30,25,'grass','steel','earth','water')";
            String sql9 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(9,'Nerite','water','MonsterJ1/NeriteJ1.png','RivalMonster/Nerite.png',190,48,28,'steel','fire','grass','earth')";
            String sql10 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(10,'Phanseed','grass','MonsterJ1/Phanseed.png','RivalMonster/Phanseed.png',117,27,38,'water','earth','fire','steel')";
            String sql11 = "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(11,'Pinp','water','MonsterJ1/PinpJ1.png','RivalMonster/Pinp.png',127,35,20,'steel','fire','grass','earth')";
            String sql12= "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(12,'Poolfie','water','MonsterJ1/PoolfieJ1.png','RivalMonster/Poolfie.png',165,33,36,'steel','fire','grass','earth')";
            String sql13= "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(13,'Sandbone','earth','MonsterJ1/SandboneJ1.png','RivalMonster/Sandbone.png',188,30,31,'fire','water','steel','grass')";
            String sql14= "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(14,'Sandeon','earth','MonsterJ1/Sandeon.png','RivalMonster/Sandeon.png',140,40,25,'fire','water','steel','grass')";
            String sql15= "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(15,'Searaw','water','MonsterJ1/SearawJ1.png','RivalMonster/Searaw.png',188,40,26,'steel','fire','grass','earth')";
            String sql16= "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(16,'Sheruha','grass','MonsterJ1/SheruhaJ1.png','RivalMonster/Sheruha.png',115,28,45,'water','earth','fire','steel')";
            String sql17= "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(17,'Spirunne','steel','MonsterJ1/SpirunneJ1.png','RivalMonster/Spirunne.png',185,41,29,'grass','earth','water','fire')";
            String sql18= "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(18,'Stail','steel','MonsterJ1/StailJ1.png','RivalMonster/Stail.png',200,20,50,'grass','earth','water','fire')";
            String sql19= "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(19,'Steeleon','steel','MonsterJ1/SteeleonJ1.png','RivalMonster/Steeleon.png',179,26,40,'grass','earth','water','fire')";
            String sql20= "insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(20,'Tanuki','earth','MonsterJ1/TanukiJ1.png','RivalMonster/Tanuki.png',155,30,35,'fire','water','steel','grass')";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);
            stmt.executeUpdate(sql4);
            stmt.executeUpdate(sql5);
            stmt.executeUpdate(sql6);
            stmt.executeUpdate(sql7);
            stmt.executeUpdate(sql8);
            stmt.executeUpdate(sql9);
            stmt.executeUpdate(sql10);
            stmt.executeUpdate(sql11);
            stmt.executeUpdate(sql12);
            stmt.executeUpdate(sql13);
            stmt.executeUpdate(sql14);
            stmt.executeUpdate(sql15);
            stmt.executeUpdate(sql16);
            stmt.executeUpdate(sql17);
            stmt.executeUpdate(sql18);
            stmt.executeUpdate(sql19);
            stmt.executeUpdate(sql20);
            conn.commit();
        } catch (SQLException ex) {
            System.err.println("No se pudieron insertar");
        }
    }
    public static void mostrarTablas(){
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bmonstruos;");
            while (rs.next()) {
                int nummonT = rs.getInt("nummon");
                String nmonT = rs.getString("nmon");
                String tipoT = rs.getString("tipo");
                String fotomonT = rs.getString("fotomon");
                String fotomonrT= rs.getString("fotomonr");
                int hpmonT=rs.getInt("hpmon");
                int atkmonT=rs.getInt("atkmon");
                int defmonT=rs.getInt("defmon");
                String fort1T=rs.getString("fort1");
                String fort2T=rs.getString("fort2");
                String deb1T=rs.getString("deb1");
                String deb2T=rs.getString("deb2");
                
                
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Numero: " + nummonT);
                System.out.println("Nombre: " + nmonT);
                System.out.println("Tipo: " + tipoT);
                System.out.println("Nombre de la foto: " + fotomonT);
                System.out.println("Nombrede la foto rival: " + fotomonrT);
                System.out.println("Hp: "+hpmonT);
                System.out.println("Ataque: "+atkmonT);
                System.out.println("Defensa: "+defmonT);
                System.out.println("Fortaleza 1: "+fort1T);
                System.out.println("Fortaleza 2: "+fort2T);
                System.out.println("Debilidad 1: "+deb1T);
                System.out.println("Debilidad 2: "+deb2T);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error al mostrar la tabla bmonstruos");
        }
    }
}
