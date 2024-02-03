package db.repositorys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.conexion.ConexionDB;
import interfaces.RepositoryInterface;
import models.Genero;

public class GenerosRepository implements RepositoryInterface<Genero>{

    @Override
    public Genero recuperaId(Long id) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q  = "SELECT * FROM generos WHERE id = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q)) {
                preparedStatement.setLong(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                //
                Long id1=0L;
                String nombre=null;
                while (resultSet.next()) {
                    id1 = resultSet.getLong("id");
                    nombre = resultSet.getString("nombre");
                }
                return new Genero(id1, nombre);
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o ResultSet");
            }
        } catch (Exception e) {
            System.out.println("error en la consulta");
        }
        
        return null;
    }

    @Override
    public List<Genero> recuperarTodos() {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM generos";
            try(
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery(q)
                ) {
                    List<Genero> generos = new ArrayList<Genero>();
                    while(resultSet.next()){
                        Long id = resultSet.getLong("id");
                        String nombre = resultSet.getString("nombre");
                        generos.add(new Genero(id, nombre));
                    }
                    return generos;
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o ResultSet");
            }
        } catch (Exception e) {
    
        }
        return null;
    }

    @Override
    public void agregar(Genero entidad) {
        try (Connection conexion =ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO generos VALUES(null,?);";
            //consulta
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q)) {
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
        try (Connection conexion=ConexionDB.obtenerConexion()) {
            String q = "UPDATE generos SET nombre = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);
            ) {
                preparedStatement.setString(1,entidad.getNombre());
                preparedStatement.setString(2,""+entidad.getId());
                preparedStatement.executeUpdate();
                System.out.println("Se modifico "+entidad.getNombre()+" correctamente.");
            } catch (Exception e) {
                System.out.println("No se modifico "+entidad.getNombre()+" correctamente.");
                // TODO: handle exception
            }
        }catch (Exception e){}
    }

    @Override
    public void eliminar(Genero entidad) {
        try (Connection conexion =ConexionDB.obtenerConexion()) {
            String q = "DELETE FROM generos WHERE id = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);
            ) {
                preparedStatement.setLong(1,entidad.getId());
                preparedStatement.executeUpdate();
                System.out.println("Se elimino "+entidad.getId()+" correctamente.");
            } catch (Exception e) {
                System.out.println("No se elimino "+entidad.getId()+" correctamente.");
                // TODO: handle exception
            }
        }catch (Exception e){}
    }
}