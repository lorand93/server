package com.lorand.licenta.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lorand.licenta.model.TempModel;
import com.lorand.licenta.service.TempService;

@Produces(value = {MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//@Produces(MediaType.TEXT_XML)
//@Consumes(MediaType.TEXT_XML)
@Path("temperature")
public class Resource {

    TempService tempService = new TempService();
    
    @GET
    public TempModel getTemperature() {
        return tempService.getTemp();
    }
    
    @PUT
    @Path("/{temperature}")
    public TempModel updateTemperature(@PathParam("temperature") int temperature) {
	return tempService.updateTemperature(temperature);
    }
}
