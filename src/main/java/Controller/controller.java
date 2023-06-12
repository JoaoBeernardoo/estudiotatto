package Controller;

import business.Usuariobusiness;
import entities.Usuario;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import entities.MessageResponse;
import javax.ws.rs.QueryParam;
import javax.inject.Inject;


@Path("/message")
public class controller {
    
    @Inject Usuariobusiness business;



    
    @POST
    @Path("/cadastro")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MessageResponse cadastrarUsuario(Usuario usuario) {
      
        business.salvar(usuario);
        business.enviarEmail(usuario);
        String message = " Usuário cadastrado com sucesso ";
        return new MessageResponse(message);
    }


}
