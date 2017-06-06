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
    
    public static void conectar(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:battlemonsters.db");
            conn.setAutoCommit(false);
        } catch (Exception e) {
            System.err.println("Fallo al conectar la base de datos");
        }
    }
    public static void crear(){
        conectar();
        crearBMonsterpedia();
        crearBMonstruos();
        crearBMovimientos();
        crearJugador();
        insertarBMonsterpedia();
        insertarBMonstruos();
        insertarBMovimientos();
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
                System.err.println("Error al borrar la tabla bmonsterpedia");
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

    public static void insertarBMonstruos() {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(1,'Amepach','steel','MonsterJ1/AmepachJ1.png','RivalMonster/Amepach.png',150,30,30,'grass','earth','water','fire')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(2,'Ankylore','earth','MonsterJ1/AnkyloreJ1.png','RivalMonster/Ankylore.png',190,25,45,'fire','water','steel','grass')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(3,'Haisand','earth','MonsterJ1/HaisandJ1.png','RivalMonster/Haisand.png',150,40,25,'fire','water','steel','grass')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(4,'Hakonmyo','steel','MonsterJ1/HakonmyoJ1.png','RivalMonster/Hakonmyo.png',160,45,25,'grass','earth','water','fire')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(5,'Hiprunio','fire','MonsterJ1/HirprunioJ1.png','RivalMonster/Hiprunio.png',170,30,25,'grass','steel','earth','water')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(6,'Hitsune','fire','MonsterJ1/HitsuneJ1.png','RivalMonster/Hitsune.png',130,50,20,'grass','steel','earth','water')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(7,'Kazanne','fire','MonsterJ1/KazanneJ1.png','RivalMonster/Kazanne.png',165,30,35,'grass','steel','earth','water')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(8,'Lifeuer','fire','MonsterJ1/LifeuerJ1.png','RivalMonster/Lifeuer.png',125,30,25,'grass','steel','earth','water')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(9,'Nerite','water','MonsterJ1/NeriteJ1.png','RivalMonster/Nerite.png',190,48,28,'steel','fire','grass','earth')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(10,'Phanseed','grass','MonsterJ1/Phanseed.png','RivalMonster/Phanseed.png',117,27,38,'water','earth','fire','steel')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(11,'Pinp','water','MonsterJ1/PinpJ1.png','RivalMonster/Pinp.png',127,35,20,'steel','fire','grass','earth')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(12,'Poolfie','water','MonsterJ1/PoolfieJ1.png','RivalMonster/Poolfie.png',165,33,36,'steel','fire','grass','earth')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(13,'Sandbone','earth','MonsterJ1/SandboneJ1.png','RivalMonster/Sandbone.png',188,30,31,'fire','water','steel','grass')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(14,'Sandeon','earth','MonsterJ1/Sandeon.png','RivalMonster/Sandeon.png',140,40,25,'fire','water','steel','grass')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(15,'Searaw','water','MonsterJ1/SearawJ1.png','RivalMonster/Searaw.png',188,40,26,'steel','fire','grass','earth')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(16,'Sheruha','grass','MonsterJ1/SheruhaJ1.png','RivalMonster/Sheruha.png',115,28,45,'water','earth','fire','steel')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(17,'Spirunne','steel','MonsterJ1/SpirunneJ1.png','RivalMonster/Spirunne.png',185,41,29,'grass','earth','water','fire')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(18,'Stail','steel','MonsterJ1/StailJ1.png','RivalMonster/Stail.png',200,20,50,'grass','earth','water','fire')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(19,'Steeleon','steel','MonsterJ1/SteeleonJ1.png','RivalMonster/Steeleon.png',179,26,40,'grass','earth','water','fire')");
            stmt.executeUpdate("insert into bmonstruos(nummon,nmon,tipo,fotomon,fotomonr,hpmon,atkmon,defmon,fort1,fort2,deb1,deb2) values(20,'Tanuki','earth','MonsterJ1/TanukiJ1.png','RivalMonster/Tanuki.png',155,30,35,'fire','water','steel','grass')");
            conn.commit();
        } catch (SQLException ex) {
            System.err.println("No se pudieron insertar en bmonstruos");
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
                
                
                System.err.println("--------------------------------------------------------------------");
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
    public static void insertarBMovimientos(){
        try {
            stmt=conn.createStatement();
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(1,'Absorber','planta',20,10)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(2,'Latigo cepa','planta',25,8)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(3,'Ciclon hojas','planta',30,7)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(4,'Hoja afilida','planta',35,5)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(5,'Gigadrenado','planta',40,4)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(6,'Rayo solar','planta',45,2)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(7,'Planta feroz','planta',50,1)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(8,'Burbujas','agua',20,10)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(9,'Pistola agua','agua',25,8)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(10,'Buceo','agua',30,7)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(11,'Escladar','agua',35,5)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(12,'Hidropulso','agua',40,4)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(13,'Hidrobomba','agua',45,2)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(14,'Hidrocañon','agua',50,1)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(15,'Ascuas','fuego',20,10)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(16,'Pirotecnia','fuego',25,8)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(17,'Rueda fuego','fuego',30,7)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(18,'Lanzallamas','fuego',35,5)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(19,'Llamarada','fuego',40,4)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(20,'Infierno','fuego',45,2)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(21,'Anillo igneo','fuego',50,1)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(22,'Cuerpo pesado','acero',20,10)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(23,'Foco resplandor','acero',25,8)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(24,'Cola ferrea','acero',30,7)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(25,'Garra metal','acero',35,5)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(26,'Cabeza hierro','acero',40,4)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(27,'Represion metal','acero',45,2)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(28,'Bomba iman','acero',50,1)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(29,'Bucle arena','tierra',20,10)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(30,'Bofeton lodo','tierra',25,8)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(35,'Excavar','tierra',30,7)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(36,'Bomba fango','tierra',35,5)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(37,'Tierra viva','tierra',40,4)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(38,'Terremoto','tierra',45,2)");
            stmt.executeUpdate("insert into bmovimientos(nummov,nmov,tipo,daño,usos)values(39,'Fisura','tierra',50,1)");
            conn.commit();
        } catch (SQLException ex) {
            System.err.println("Error al insertar en bmovimientos");
        }
        
    }
    public static void insertarBMonsterpedia(){
        try {
            stmt=conn.createStatement();
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Amepach','Habita los alrededores de las fabricas',' de las que roban pequeños trozos de metal',' para alimentar a sus crias.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Ankylore','Esta formado por rocas de mas de 10',' mil años de antiguedad.',' Siempre se mueven en manada.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Haisand','Los Haisand evolucionaron de los tiburones',' comunes adaptandose a nadar en los desirtos',' donde cazan buceando en la arena.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Hakonmyo','Vive en las montañas y a pesar de ser amistoso,',' no se acerca a los humanos. Antiguamente era considerado',' un ser mistico que controla el bien y el mal.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Hiprunio','Estos pequeños habitan las zonas mas rocosas',' de las montañas.Cuando se acercan a las zonas',' de bosques provocan grandes incendios.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Hitsune','Cuando aun son crias realizan combates contra',' los mayores del grupo para fortalecerse.',' En ocasiones nacen con tres colas.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Kazanne','Debido a su necesidad de mantener su calor',' viven en cuevas en las que usan su fuego',' para calentar las piedras y aumentar la temperatura.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Lifeuer','Los Lifeuer son criados hasta su adolescencia',' donde se idependizan y se van para formar',' su propia manada sin su padres.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Nerite','Habita las profundidades de los oceanos, al',' rededor de los 1300 metros. Rara vez sube a la superficie',', ver uno es señal de buena suerte.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Phanseed','Ayudan a los campesinos regando los campos,',' cuando un Phanseed se encariña con alguien utiliza',' la semilla de su cabeza para que crezcan mejor los cultivos.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Pinp','Viven en las zonas mas frias del planeta,bailan',' a menudo para poder calentarse.Sus ojos estan cubiertos',' de una membrana que les permite ver bajo el agua.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Poolfie','Habitan las zonas mas altas de los rios para',' asi limpiar el agua de toda contaminacion dejandolas cristalinas,','algunos viven tambien en grandes lagos.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Sandbone','Son totalmente fieles a su entrenador aunque',' una vez al año se escapan para reunirse con su',' antigua manada volviendo dias despues.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Sandeon','El pelaje de los Sandeon es mas abundante',' y brillante dependiendo de la calidad',' de la tierra en la que vive.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Searaw','Son los causantes de hundimientos de barcos',' debido a que tienen la necesidad de utilizar su',' sierra para mantenerla fuerte y afilada.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Sheruha','Utilizan la gran hoja que tiene a su espalda',' para protegerse del sol y hacer la fotosintesis,',' cuando enferma su hojas se vuelve marron.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Spirunne','La dura telaraña de los Spirunne es utilizada',' para crear cadenas,esta tela trenzada',' pude servir para sujetar barcos.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Stail','Recoje trozos de barcos hundidos para poder',' formar su duro caparazon,cohabitan con',' los Searaw para su propio beneficio.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Steeleon','Su piel esta compuesta de acero, esta es',' tan brillante que lo hizo muy popular en los concursos.',' Cuanto menos rugosa sea, mas sano estara.')");
            stmt.executeUpdate("insert into bmonsterpedia(nmon,datos1,datos2,datos3)values('Tanuki','Son muy queridos en oriente como mascota',' ya que son signo de salud para los niños',' y de prosperidaz en los negocios.')");
                    } catch (SQLException ex) {
            System.err.println("Error al insertar en bmonsterpedia");
        }
    }
   public static void mostrarBMonsterpedia(){
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bmonsterpedia;");
            while (rs.next()) {
                String nmonT = rs.getString("nmon");
                String datos1T = rs.getString("datos1");
                String datos2T = rs.getString("datos2");
                String datos3T= rs.getString("datos3");
                
                System.out.println("Nombre: "+nmonT);
                System.out.println("datos1: "+datos1T);
                System.out.println("datos2: "+datos2T);
                System.out.println("datos3: "+datos2T);
            }    } catch (SQLException ex) {
            System.err.println("Error al mostrar"+ ex);
        }
}
}
