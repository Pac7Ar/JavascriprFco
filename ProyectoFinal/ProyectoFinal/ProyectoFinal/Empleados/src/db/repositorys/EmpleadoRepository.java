package db.repositorys;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.conexion.ConexionDB;
import interfaces.RepositoryInterface;
import models.Empleado;
import models.Genero;


public class EmpleadoRepository implements RepositoryInterface<Empleado>{
    GenerosRepository generosRepository = new GenerosRepository();

    @Override
    public Empleado recuperaId(Long id) {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q  = "SELECT * FROM empleados WHERE id = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q)) {
                preparedStatement.setLong(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                Long id1 = null;
                String nombre = null;
                String domicilio = null;
                String telefono = null;
                String email = null;
                Date fechaNacimineto = null;
                Long g = null;
                Genero genero = null;
                while (resultSet.next()) {
                    id1 = resultSet.getLong("id");
                    nombre = resultSet.getString("nombre");
                    domicilio=resultSet.getString("domicilio");
                    telefono=resultSet.getString("telefono");
                    email=resultSet.getString("email");
                    fechaNacimineto=resultSet.getDate("fecha_nacimiento");
                    g = resultSet.getLong("id_genero");
                    genero=generosRepository.recuperaId(g);
                }
                return new Empleado(id1, nombre, domicilio, telefono, email, fechaNacimineto, genero);
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o ResultSet");
            }
        } catch (Exception e) {
            System.out.println("error en la consulta");
        }
        
        return null;
    }

    @Override
    public List<Empleado> recuperarTodos() {
        try (Connection conexion = ConexionDB.obtenerConexion()) {
            String q = "SELECT * FROM empleados";
            try(
                Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery(q)
                ) {
                    List<Empleado> empleados = new ArrayList<Empleado>();
                    Long id1 = null;
                    String nombre = null;
                    String domicilio = null;
                    String telefono = null;
                    String email = null;
                    Date fechaNacimineto = null;
                    Long g = null;
                    Genero genero = null;
                    while(resultSet.next()){
                        id1 = resultSet.getLong("id");
                        nombre = resultSet.getString("nombre");
                        domicilio=resultSet.getString("domicilio");
                        telefono=resultSet.getString("telefono");
                        email=resultSet.getString("email");
                        fechaNacimineto=resultSet.getDate("fecha_nacimiento");
                        g = resultSet.getLong("id_genero");
                        genero=generosRepository.recuperaId(g);
                        empleados.add(new Empleado(id1, nombre, domicilio, telefono, email, fechaNacimineto, genero));
                    } 
                    return empleados;
            } catch (Exception e) {
                System.out.println("Error al crear el Statement o ResultSet");
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public void agregar(Empleado entidad) {
        try (Connection conexion =ConexionDB.obtenerConexion()) {
            String q = "INSERT INTO empleados VALUES(null,?, ? , ?, ?, ?, ?);";
            //consulta
            try (PreparedStatement preparedStatement = conexion.prepareStatement(q);
            ) {
                preparedStatement.setString(1,entidad.getNombre());
                preparedStatement.setString(2,entidad.getDomicilio());
                preparedStatement.setString(3,entidad.getTelefono());
                preparedStatement.setString(4,entidad.getEmail());
                preparedStatement.setDate(5,entidad.getFechaNacimineto());
                preparedStatement.setLong(6,entidad.getGenero().getId());

                preparedStatement.executeUpdate();
                System.out.println("Se inserto "+entidad.getNombre()+" correctamente.");
            } catch (Exception e) {
                System.out.println("No se inserto "+entidad.getNombre()+" correctamente.");
                // TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void modificar(Empleado entidad) {
        try (Connection conexion=ConexionDB.obtenerConexion()) {
            String q = "UPDATE empleados SET nombre = ?, domicilio = ?, telefono = ?, email = ?, fecha_nacimiento = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = conexion.prepareStatement((q))) {
                preparedStatement.setString(1,entidad.getNombre());
                preparedStatement.setString(2,entidad.getDomicilio());
                preparedStatement.setString(3,entidad.getTelefono());
                preparedStatement.setString(4,entidad.getEmail());
                preparedStatement.setDate(5,entidad.getFechaNacimineto());
                preparedStatement.setLong(6,entidad.getId());
                preparedStatement.executeUpdate();
                System.out.println("Se modifico"+entidad.getNombre()+"correctamente.");
            } catch (Exception e) {
                System.out.println("No se modifico"+entidad.getNombre()+"correctamente.");
                // TODO: handle exception
            }
        }catch (Exception e){}
    }

    @Override
    public void eliminar(Empleado entidad) {
        try (Connection conexion =ConexionDB.obtenerConexion()) {
            String q = "DELETE FROM empleados WHERE id = ?";
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
