package codeworld.tutorial.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import codeworld.tutorial.dto.Film;

@Path("filmService")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface FilmService {

    @GET
    @Path("/findAll")
    public List<Film> findAll();

}
