package com.sodews.core.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by pawas.kumar on 28/11/15.
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {
  private static final Logger LOGGER = LoggerFactory.getLogger(TestResource.class);

  /**
   * Creates a fetch job and adds it to the fetcher queue.
   */
  @GET
  @Path("test")
  @Consumes(MediaType.APPLICATION_JSON)
  public Response test() {
    LOGGER.info("Received test request ...");
    return Response.status(Response.Status.CREATED)
        .entity(new String("cute pic"))
        .build();
  }
}
