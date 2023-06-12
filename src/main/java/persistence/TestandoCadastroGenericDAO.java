package persistence;
import entities.*;

import java.time.LocalDateTime;

import javax.inject.Inject;
public class TestandoCadastroGenericDAO {
    @Inject UsuarioDAO usudao;
    public static void main(String[] args) {
   String nome = "João Saadilva";
String email = "joao@exaddmple.com";
String celular = "999988999";
LocalDateTime dataConsulta = LocalDateTime.of(2022, 6, 11, 14, 30, 0);

Usuario usuario = new Usuario();
usuario.setNome(nome);
usuario.setEmail(email);
usuario.setCelular(celular);
usuario.setDataConsulta(dataConsulta);

UsuarioDAO usu = new UsuarioDAO();
usu.save(usuario);

    }
}

