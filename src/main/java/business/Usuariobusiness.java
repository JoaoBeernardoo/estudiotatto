package business;

import email.enviaremail;
import javax.inject.Inject;
import persistence.UsuarioDAO;
import entities.Usuario;

public class Usuariobusiness {
 
  @Inject
   private enviaremail Email;

   @Inject
    private UsuarioDAO usuDAO;


   public void enviarEmail(Usuario usuario){
   Email.enviar(usuario.getEmail(), "Consulta", usuario.getNome()+ " sua sessao esta marcada para o dia" +usuario.getDataConsulta().getDayOfMonth() +"/"+ usuario.getDataConsulta().getMonthValue() +" as "+ usuario.getDataConsulta().getHour()+"hrs.");

   }

     public void salvar(Usuario usuario){
       
        try {
            usuDAO.save(usuario);
            // Código que pode lançar a exceção
            // ...
        } catch (Exception e) {
            // Captura a exceção e imprime o stack trace completo
            e.printStackTrace();
        }

    }
}
