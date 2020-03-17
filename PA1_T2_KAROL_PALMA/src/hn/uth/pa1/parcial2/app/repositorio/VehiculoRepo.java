/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial2.app.repositorio;

import hn.uth.pa1.parcial2.app.objetos.Vehiculo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author karol
 */
public class VehiculoRepo implements Repositorio {

        public Connection getConnection() throws Exception {
        try {
            String lib = "jdbc";
            String base = "derby";
            String servidor = "localhost";
            String puerto = "1527";
            String nombreBase = "vehiculos";

            //String cadenaConexion="jdbc:derby://localhost:1527/uth";
            String cadenaConexion = String.format("%s:%s://%s:%s/%s", lib, base, servidor, puerto, nombreBase
            );
            String usuario = "uth";
            String contrasenia = "uth";

            return DriverManager.getConnection(cadenaConexion, usuario, contrasenia);
        } catch (Exception e) {
            throw new Exception("No se pudo establecer la conexión: " + e.toString());
        }
    }

    public Vehiculo seleccionar(Object t) throws Exception {
        Vehiculo valorRetorno = new Vehiculo();
        try {
            //Traer la conexion o la session
            Connection cnx = getConnection();
            String sql = "select * from TBL_VEHICULOS where  placa = '"+t+"' ";
            Statement st = cnx.createStatement();
            //ejecuta la sentencia
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                String placa = resultado.getString("PLACA");
                String modelo= resultado.getString("MODELO");
                String marca= resultado.getString("MARCA");
                int anio= resultado.getInt("ANIO");
                String motor=resultado.getString("MOTOR");
                double precio = resultado.getDouble("PRECIO");
                String nombre=resultado.getString("NOMBRE");
                String descripcion=resultado.getString("DESCRIPCION");
                String imagen=resultado.getString("IMAGEN");            
                valorRetorno.setPlaca(placa);
                valorRetorno.setModelo(modelo);
                valorRetorno.setMarca(marca);
                valorRetorno.setAnio(anio);  
                valorRetorno.setMotor(motor);
                valorRetorno.setPrecio(precio);
                valorRetorno.setNombre(nombre);
                valorRetorno.setDescripcion(descripcion);
                valorRetorno.setImagen(imagen);
            }
            //IMPORTANTE:  cerrar sesiones
            st.close();
            cnx.close();
                        
        } catch (Exception e) {
            throw new Exception("Error al buscar todos: " + e.toString());
        }
        return valorRetorno;
    }

    public Object buscar(Object anioV) throws Exception {
        Vehiculo valorRetorno = new Vehiculo();
        try {
            //Traer la conexion o la session
            Connection cnx = getConnection();

            String sql = "select * from TBL_VEHICULOS where  anio = '"+anioV+"' ";

            Statement st = cnx.createStatement();

            //ejecuta la sentencia
            ResultSet resultado = st.executeQuery(sql);

            while (resultado.next()) {
                String placa = resultado.getString("PLACA");
                String modelo= resultado.getString("MODELO");
                String marca= resultado.getString("MARCA");
                int anio= resultado.getInt("ANIO");
                String motor=resultado.getString("MOTOR");
                double precio = resultado.getDouble("PRECIO");
                String nombre=resultado.getString("NOMBRE");
                String descripcion=resultado.getString("DESCRIPCION");
                String imagen=resultado.getString("IMAGEN");  
                                
                valorRetorno.setPlaca(placa);
                valorRetorno.setModelo(modelo);
                valorRetorno.setMarca(marca);
                valorRetorno.setAnio(anio);  
                valorRetorno.setMotor(motor);
                valorRetorno.setPrecio(precio);
                valorRetorno.setNombre(nombre);
                valorRetorno.setDescripcion(descripcion);
                valorRetorno.setImagen(imagen);               
            }

            //IMPORTANTE:  cerrar sesiones
            st.close();
            cnx.close();
                        
        } catch (Exception e) {
            throw new Exception("Error al buscar todos: " + e.toString());
        }
        return valorRetorno;
    }

    public List buscarTodo() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
