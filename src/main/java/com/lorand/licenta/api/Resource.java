package com.lorand.licenta.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
    
    @POST
public TempModel updateTemperature(@QueryParam("temperature") int temperature){
    System.out.println("Update temperature rest API called with the value: " + temperature);
	return tempService.updateTemperature(temperature);
    }
}
