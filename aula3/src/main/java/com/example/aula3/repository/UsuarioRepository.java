package com.example.aula3.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.aula3.entity.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {
    private static String INSERT = "insert into usuario(nome,email,senha) values (?,?,?)";
    private static String SELECT_ALL = "select * from usuario";
    private static String DELETE_ID = "delete from usuario where id = (?)";
    private static String EDIT = "UPDATE usuario SET nome = ?, email = ?, senha = ? where id = ?";
    private static String SELECT_EMAIL = "Select email from usuario where email = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Usuario inserir(Usuario usuario){
        jdbcTemplate.update(INSERT, new Object[] {usuario.getNome(), usuario.getEmail(), usuario.getSenha()});
            return usuario;
    }

    public List<Usuario> obterTodos(){
        return jdbcTemplate.query(SELECT_ALL, new RowMapper<Usuario>(){
            @Override
            public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
                // TODO Auto-generated method stub
                return new Usuario(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("email"),
                rs.getString("senha")
                );
            }

        });
    }

    public void remover(int idUsuario){
        jdbcTemplate.update(DELETE_ID, idUsuario);
    }

    //Conferir
    public void remover(Usuario usuario){
        jdbcTemplate.update(DELETE_ID, usuario.getId());
    }

    //Conferir
    public Usuario editar(Usuario usuario){
        jdbcTemplate.update(EDIT, new Object[] {usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getId()});
        return usuario;
    }

    

    public boolean autenticar(String email, String senha){

        return true;
    }

}
