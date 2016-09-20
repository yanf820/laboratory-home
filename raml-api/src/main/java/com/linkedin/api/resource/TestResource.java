
package com.linkedin.api.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.linkedin.api.model.Ground;
import com.linkedin.api.model.Tree;
import com.linkedin.api.resource.support.ResponseWrapper;

@Path("test")
public interface TestResource {


    /**
     * 
     * @param entity
     *     
     */
    @GET
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    TestResource.GetTestResponse getTest(Tree entity)
        throws Exception
    ;

    public class GetTestResponse
        extends ResponseWrapper
    {


        private GetTestResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static TestResource.GetTestResponse withJsonOK(Ground entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new TestResource.GetTestResponse(responseBuilder.build());
        }

    }

}
