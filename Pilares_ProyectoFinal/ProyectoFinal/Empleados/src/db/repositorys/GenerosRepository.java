package db.repositorys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import db.conexion.ConexionDB;
import interfaces.RepositoryInterface;
import models.Genero;

public class GenerosRepository implements RepositoryInterface<Genero>{

    @Override
    public Genero recuperaId(Long id) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q  = "SELECT * FROM generos  WHERE idGenero = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q)) {
                preparedStatement.setLong(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                //
                Long idGenero=null;
                String nombre=null;
                while (resultSet.next()) {
                    idGenero = resultSet.getLong("idGenero");
                    nombre = resultSet.getString("nombre");
                }
                return new Genero(idGenero, nombre)
            } catch (Exception e) {
                // TODO: handle exception
            }
        } catch (Exception e) {
            return null;
            // TODO: handle exception
        }
        
        
    }

    @Override
    public List<Genero> recuperarTodos() {
        ;
    }

    @Override
    public void agregar(Genero entidad) {
        try (Connection conexion =ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO generos VALUES(null,?);";
            //consulta
            try (PreparedStatement preparedStatement = conexion.prepareStatement((q))) {
                preparedStatement.setString(1,entidad.getNombre());
                preparedStatement.executeUpdate();
                System.out.println("Se inserto"+entidad.getNombre()+"correctamente.");
            } catch (Exception e) {
                System.out.println("No se inserto"+entidad.getNombre()+"correctamente.");
                // TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @Override
    public void modificar(Genero entidad) {
        try () {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void eliminar(Genero entidad) {

    }

    
}