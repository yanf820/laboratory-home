
package com.linkedin.api.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import com.linkedin.api.model.Person;
import com.linkedin.api.resource.support.ResponseWrapper;

@Path("people")
public interface PeopleResource {


    /**
     * Returns profile of the current user
     * 
     * 
     * @param fieldSelectors
     *     Many of our resources allow you to specify what fields you want returned. We call this syntax field selectors.
     *     By indicating exactly the information you need, we can optimize the amount of time needed to return your results.
     *     It also reduces the amount of data passing across the wire. The two combine to make our APIs speedy and efficient,
     *     a critical factor in any web application, and more so for anyone relying on external APIs.
     *     
     *     Field selectors are specified after the resource identifiers and path components of a resource, prefixed by a colon,
     *     contained within parenthesis, and separated by commas. Fields will be returned in the order specified. When URL-encoding
     *     your resource URLs, ensure that the parenthesis used in selectors remain unescaped.
     *     
     *     Examples
     *     --------
     *     To get a member's ID, first name, last name, and industry:
     *       `http://api.linkedin.com/v1/people/~:(id,first-name,last-name,industry)`
     *     
     *     Or the same set of information for their connections:
     *       `http://api.linkedin.com/v1/people/~/connections:(id,first-name,last-name,industry)`
     *     
     *     Fields selectors can also be nested to access individual fields from a larger collection. For example, to get just the
     *     job titles and not the rest of the information about positions:
     *       `http://api.linkedin.com/v1/people/~/connections:(id,first-name,last-name,positions:(title))`
     *     
     *     Field selectors with resource identifiers allow you to request information about multiple entities at once. Specify them
     *     similarly, but append a double colon - here's an example getting profile information about thee members: the first is the
     *     current member, indicated by a tilde; the next has an id of 12345; and the last has a public profile URL
     *     
     *       `http://api.linkedin.com/v1/people::(~, id=12345,url=http%3A%2F%2Fwww.linkedin.com%2Fin%2Fadamnash)`
     *      e.g. :(id,first-name,last-name,industry)
     * @param secureUrls
     *     secure-urls query parameter indicates that you want the URLs in your response to be HTTPS
     *     
     */
    @GET
    @Path("~{fieldSelectors}")
    @Produces({
        "application/xml",
        "application/json"
    })
    PeopleResource.GetPeopleByFieldSelectorsResponse getPeopleByFieldSelectors(
        @PathParam("fieldSelectors")
        String fieldSelectors,
        @QueryParam("secure-urls")
        Boolean secureUrls)
        throws Exception
    ;

    public class GetPeopleByFieldSelectorsResponse
        extends ResponseWrapper
    {


        private GetPeopleByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static PeopleResource.GetPeopleByFieldSelectorsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new PeopleResource.GetPeopleByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 
         * @param entity
         *     
         */
        public static PeopleResource.GetPeopleByFieldSelectorsResponse withXmlOK(Person entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new PeopleResource.GetPeopleByFieldSelectorsResponse(responseBuilder.build());
        }

    }

}
