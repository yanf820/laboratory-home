
package com.linkedin.api.resource;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import com.linkedin.api.resource.support.ResponseWrapper;


/**
 * Describes field selectors uri path parameter
 * 
 * 
 */
@Path("company-search{fieldSelectors}")
public interface CompanySearchFieldSelectorsResource {


    /**
     * Use the Company Search API to find companies using keywords, industry, location, or some other criteria. It returns a collection of matching companies. Each entry can contain much of the information available on the company page.
     * The API can also return facets. Facets provide you with data about the collection of companies, such as which companies are located in a certain area, size of the companies, and the industry a company is in. You can then use this data to make a new API call that further refines your original request. This is similar to clicking the buttons on the left-hand side of the LinkedIn Search results page.
     * 
     * 
     * @param facet
     *     Facet values to search over.
     *     
     * @param sort
     *     "Controls the search result order. There are four options:
     *     connections: Number of connections per person, from largest to smallest.
     *     recommenders: Number of recommendations per person, from largest to smallest.
     *     distance: Degree of separation within the member's network, from first degree, then second degree, and then all others mixed together, including third degree and out-of-network.
     *     relevance: Relevance of results based on the query, from most to least relevant.          
     *     By default, results are ordered by the number of connections."
     *     
     * @param keywords
     *     Members who have all the keywords anywhere in their profile. Use this field when you don't know how to
     *     more accurately map the input to a more specific parameter. (Don't forget to URL encode this data.)
     *     
     * @param count
     *     Maximum e.g. count=10
     * @param hqOnly
     *     Matching companies by the headquarters location. When this is set to "true" and a location facet is used, this restricts returned companies to only those whose headquarters resides in the specified location.
     * @param start
     *     The offset by which to start Network Update pagination e.g. start=0
     * @param facets
     *     |Parameter| Definition| Values|
     *     |---|---|---|
     *     |location|A geographical region. This is not necessarily a country. It could be a city or regional area, such as San Francisco Bay Area.|A geographical code, such as us:84 for San Francisco Bay Area or fr:0 for France.| 
     *     |industry|An industry field.|Industry codes are listed on a separate page.|
     *     |network|Collection of companies based on relationship.||
     *     |company-size|The company collection based on size range specified.|Valid values are: B: 1-10 C: 11-50 D: 51-200 E: 201-500 F: 501-1000 G: 1001-5000 H: 5001-10,000 I: 10,000+|
     *     |num-followers-range|The company collection based on the number of followers.||
     *     |fortune|The company collection based on the Fortune ranking.||
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
     */
    @GET
    @Produces({
        "application/xml",
        "application/json"
    })
    CompanySearchFieldSelectorsResource.GetCompanySearchByFieldSelectorsResponse getCompanySearchByFieldSelectors(
        @PathParam("fieldSelectors")
        String fieldSelectors,
        @QueryParam("hq-only")
        String hqOnly,
        @QueryParam("count")
        @DefaultValue("10")
        int count,
        @QueryParam("start")
        String start,
        @QueryParam("keywords")
        String keywords,
        @QueryParam("facet")
        String facet,
        @QueryParam("facets")
        String facets,
        @QueryParam("sort")
        @DefaultValue("connections")
        CompanySearchFieldSelectorsResource.Sort sort)
        throws Exception
    ;

    public class GetCompanySearchByFieldSelectorsResponse
        extends ResponseWrapper
    {


        private GetCompanySearchByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static CompanySearchFieldSelectorsResource.GetCompanySearchByFieldSelectorsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompanySearchFieldSelectorsResource.GetCompanySearchByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 
         * @param entity
         *     
         */
        public static CompanySearchFieldSelectorsResource.GetCompanySearchByFieldSelectorsResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new CompanySearchFieldSelectorsResource.GetCompanySearchByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public enum Sort {

        connections,
        recommenders,
        distance,
        relevance;

    }

}
