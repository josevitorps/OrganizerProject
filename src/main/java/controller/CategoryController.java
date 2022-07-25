package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import util.ConnectionFactory;

public class CategoryController {
    public void save(Category category) {
        String sql = "INSERT INTO categories(name, "
                + "description, "
                + "createdAt, "
                + "updatedAt)"
                + "VALUES (?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            //Estabelecendo uma conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query
            statement = connection.prepareStatement(sql);
            
            //Setando os valores do statement
            statement.setString(1, category.getName());
            statement.setString(2, category.getDescription());
            statement.setDate(3, new Date(category.getCreatedAt().getTime()));
            statement.setDate(4, new Date(category.getUpdatedAt().getTime()));
            
            //Executa a sql para a inserção dos dados
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Error saving a new category.", ex);
        } finally {
            ConnectionFactory.closeConnection(connection,statement);  
        }
    }
    public void update(Category category) {
        String sql = "UPDATE categories SET "
                + "name = ?, "
                + "description = ?, "
                + "createdAt = ?, "
                + "updatedAt = ?, "
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            //Estabelecendo uma conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query
            statement = connection.prepareStatement(sql);
            
            //Setando os valores do statement
            statement.setString(1, category.getName());
            statement.setString(2, category.getDescription());
            statement.setDate(3, new Date(category.getCreatedAt().getTime()));
            statement.setDate(4, new Date(category.getUpdatedAt().getTime()));
            statement.setInt(5, category.getId());
            
            //Executa a SQL para inserção dos dados
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("There was an error updating the project.", ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public List<Category> getAll() {
        String sql = "SELECT * FROM categories";
        
        List<Category> categories = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        //Classe responsável por recuperar os dados do banco de dados
        ResultSet resultSet = null;
        
        try {
            //Estabelecendo uma conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query
            statement = connection.prepareStatement(sql);
            
            resultSet = statement.executeQuery();
            
            //Enquanto existirem dados no banco de dados, faça
            while (resultSet.next()) {
                
                Category category = new Category();
                
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setCreatedAt(resultSet.getDate("createdAt"));
                category.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                //Adiciono o contato recuperado, a lista de contatos
                categories.add(category);
            }
        } catch (Exception e) {
            throw new RuntimeException("There was an error fetching your project.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        return categories;
    }
    public void removeById(int idCategory) {
        String sql = "DELETE FROM categories WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //Estabelecendo uma conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query
            statement = connection.prepareStatement(sql);
            
            //Setando o valor do statement
            statement.setInt(1, idCategory);
            
            //Executando a query
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("There was an error deleting your project.", ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
}
