package org.aguzman.webapp.jaxws.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.aguzman.webapp.jaxws.models.Curso;

import java.util.List;

@RequestScoped
@Path("/cursos")
@Produces(MediaType.APPLICATION_JSON)
public class CursoRestController {


    @GET
    public List<Curso> listar() {
        // crea 3 cursos
        Curso curso1 = new Curso(1L, "Java", "Curso de Java");
        Curso curso2 = new Curso(2L, "Python", "Curso de Python");
        Curso curso3 = new Curso(3L, "JavaScript", "Curso de JavaScript");

        // crea una lista de cursos
        List<Curso> cursos = List.of(curso1, curso2, curso3);

        return cursos;
    }

    /*
    @GET
    @Path("/{id}")
    public Response porId(@PathParam("id") Long id) {
        Optional<Curso> cursoOptional = service.porId(id);
        if (cursoOptional.isPresent()) {
            return Response.ok(cursoOptional.get()).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crear(Curso curso) {
        try {
            Curso nuevoCurso = service.guardar(curso);
            return Response.ok(nuevoCurso).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editar(@PathParam("id") Long id, Curso curso) {
        Optional<Curso> cursoOptional = service.porId(id);
        if (cursoOptional.isPresent()) {

            Curso nuevoCurso = cursoOptional.get();
            nuevoCurso.setNombre(curso.getNombre());
            nuevoCurso.setDescripcion(curso.getDescripcion());
            nuevoCurso.setDuracion(curso.getDuracion());
            nuevoCurso.setInstructor(curso.getInstructor());

            try {
                service.guardar(nuevoCurso);
                return Response.ok(nuevoCurso).build();
            } catch (Exception e) {
                e.printStackTrace();
                return Response.serverError().build();
            }
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

    @DELETE
    @Path("/{id}")
    public Response eliminar(@PathParam("id") Long id) {
        Optional<Curso> cursoOptional = service.porId(id);
        if(cursoOptional.isPresent()){
            try {
                service.eliminar(cursoOptional.get().getId());
                return Response.noContent().build();
            } catch (Exception e) {
                e.printStackTrace();
                return Response.serverError().build();
            }
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

     */
}
