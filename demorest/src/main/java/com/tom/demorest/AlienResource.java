package com.tom.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("aliens")
public class AlienResource {
	
	AlienRepository repo = new AlienRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alien> getAliens() {
		System.out.println("getAliens() called");
		
		return repo.getAliens();
	}
	
	@GET
	@Path("alien/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Alien getAlien(@PathParam("id") int id) {
		System.out.println("getAlien() called");
		
		return repo.getAlien(id);
	}
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien a1) {
		System.out.println(a1);
		repo.create(a1);
		return a1;
	}
}
