package services;

import com.google.gson.Gson;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Coche;
import repositories.RepositoryCoches;

@Path("/coches")
public class ServiceCoches {

    RepositoryCoches repo;

    public ServiceCoches() {
        this.repo = new RepositoryCoches();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getCoches() throws SQLException {
        List<Coche> coches = this.repo.getCoches();
        Gson converter = new Gson();
        //convertimos  la colleccion a String  ajson
        String json = converter.toJson(coches);
        //devolvemos los datos en formato json
        return json;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String findCoche(@PathParam("id") String id) throws SQLException {
        int idcoche = Integer.parseInt(id);
        Coche car = this.repo.findCoche(idcoche);
        Gson converter = new Gson();
        String json = converter.toJson(car);
        return json;
    }

}
