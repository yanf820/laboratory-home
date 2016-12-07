
package com.linkedin.api.resource;

import java.io.Reader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import com.linkedin.api.model.ErrorSchema;


/**
 * This is base resource type described common request and response headers and error response codes
 * 
 * 
 */
@Path("jobs")
public interface JobLookupAPIResource {


    /**
     * Post a job
     * 
     * @param entity
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param contentType
     *     
     */
    @POST
    @Consumes("application/json")
    @Produces({
        "application/json",
        "text/xml"
    })
    JobLookupAPIResource.PostJsonJobsResponse postJsonJobs(
        @HeaderParam("Content-Type")
        String contentType,
        @HeaderParam("x-li-format")
        JobLookupAPIResource.XLiFormat xLiFormat, Reader entity)
        throws Exception
    ;

    /**
     * Post a job
     * 
     * @param entity
     *      e.g. <job>
     *       <partner-job-id>LIJ-13239292</partner-job-id>
     *       <contract-id>1234</contract-id>
     *       <customer-job-code>DE247X</customer-job-code>
     *       <company>
     *         <id>1234</id>
     *         <name>Company ABC</name>
     *         <description>A great company</description>
     *       </company>
     *       <position>
     *         <title>Chief Architect</title>
     *         <description>This is a great job.</description>
     *         <skills-and-experience>Programming, financial analysis, and  thought leadership.</skills-and-experience>
     *         <location>
     *          <country>
     *            <code>us</code>
     *           </country>
     *           <postal-code>10012</postal-code>
     *           <name>Midtown Manhattan</name>
     *         </location>
     *         <job-functions>
     *           <job-function>
     *             <code>acct</code>
     *           </job-function>
     *                 <job-function>
     *                   <code>dsgn</code>
     *                 </job-function>
     *             </job-functions>
     *         <industries>
     *           <industry>
     *             <code>38</code>
     *           </industry>
     *           <industry>
     *             <code>44</code>
     *           </industry>
     *         </industries>
     *         <job-type>
     *           <code>C</code>
     *         </job-type>
     *         <experience-level>
     *           <code>4</code>
     *         </experience-level>
     *       </position>
     *       <salary>$100,000-120,000 per year</salary>
     *       <referral-bonus>$5,000 for employees</referral-bonus>
     *       <poster>
     *         <display>true</display>
     *         <role>
     *           <code>R</code>
     *         </role>
     *             <email-address>user@contract.com</email-address>
     *       </poster>
     *       <how-to-apply>
     *         <application-url>http://www.linkedin.com</application-url>
     *       </how-to-apply>
     *       <tracking-pixel-url>http://www.linkedin.com/track.gif</tracking-pixel-url>
     *     </job>
     * @param xLiFormat
     *     Type of data
     *     
     * @param contentType
     *     
     */
    @POST
    @Consumes("application/xml")
    @Produces({
        "application/json",
        "text/xml"
    })
    JobLookupAPIResource.PostXmlJobsResponse postXmlJobs(
        @HeaderParam("Content-Type")
        String contentType,
        @HeaderParam("x-li-format")
        JobLookupAPIResource.XLiFormat xLiFormat, Reader entity)
        throws Exception
    ;

    /**
     * Returns Job info
     * 
     * 
     * @param jobId
     *     The unique identifier for a job.
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
    @Path("{jobId}{fieldSelectors}")
    @Produces({
        "application/xml",
        "application/json"
    })
    JobLookupAPIResource.GetJobsByJobIdByFieldSelectorsResponse getJobsByJobIdByFieldSelectors(
        @PathParam("jobId")
        @NotNull
        String jobId,
        @PathParam("fieldSelectors")
        String fieldSelectors)
        throws Exception
    ;

    /**
     * Close calls should not include XML; only the URL is required.
     * An HTTP DELETE must be used to close a job.
     * 
     * 
     * @param partnerJobId
     *     Unique ID for the job created by the partner (must be unique for each job posted).
     */
    @DELETE
    @Path("partner-job-id={partnerJobId}")
    JobLookupAPIResource.DeleteJobsPartnerJobIdByPartnerJobIdResponse deleteJobsPartnerJobIdByPartnerJobId(
        @PathParam("partnerJobId")
        @Size(max = 50)
        @NotNull
        String partnerJobId)
        throws Exception
    ;

    /**
     * Edit or renew a job
     * 
     * @param entity
     *     
     * @param partnerJobId
     *     Unique ID for the job created by the partner (must be unique for each job posted).
     */
    @PUT
    @Path("partner-job-id={partnerJobId}")
    @Consumes("application/json")
    JobLookupAPIResource.PutJsonJobsPartnerJobIdByPartnerJobIdResponse putJsonJobsPartnerJobIdByPartnerJobId(
        @PathParam("partnerJobId")
        @Size(max = 50)
        @NotNull
        String partnerJobId, Reader entity)
        throws Exception
    ;

    /**
     * Edit or renew a job
     * 
     * @param entity
     *      e.g. <job>
     *       <position> 
     *         <description>This is a great job.</description>
     *       </position>
     *       <compensation>
     *         <salary>
     *           <description>$100k per year + benefits</description>
     *         </salary>
     *       </compensation>
     *     </job>
     * @param partnerJobId
     *     Unique ID for the job created by the partner (must be unique for each job posted).
     */
    @PUT
    @Path("partner-job-id={partnerJobId}")
    @Consumes("application/xml")
    JobLookupAPIResource.PutXmlJobsPartnerJobIdByPartnerJobIdResponse putXmlJobsPartnerJobIdByPartnerJobId(
        @PathParam("partnerJobId")
        @Size(max = 50)
        @NotNull
        String partnerJobId, Reader entity)
        throws Exception
    ;

    /**
     * 
     * @param partnerJobId
     *     Unique ID for the job created by the partner (must be unique for each job posted).
     */
    @GET
    @Path("partner-job-id={partnerJobId}")
    @Produces({
        "application/xml",
        "application/json"
    })
    JobLookupAPIResource.GetJobsPartnerJobIdByPartnerJobIdResponse getJobsPartnerJobIdByPartnerJobId(
        @PathParam("partnerJobId")
        @Size(max = 50)
        @NotNull
        String partnerJobId)
        throws Exception
    ;

    public class DeleteJobsPartnerJobIdByPartnerJobIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private DeleteJobsPartnerJobIdByPartnerJobIdResponse(Response delegate) {
            super(delegate);
        }

    }

    public class GetJobsByJobIdByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetJobsByJobIdByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.GetJobsByJobIdByFieldSelectorsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.GetJobsByJobIdByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.GetJobsByJobIdByFieldSelectorsResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.GetJobsByJobIdByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetJobsPartnerJobIdByPartnerJobIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetJobsPartnerJobIdByPartnerJobIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.GetJobsPartnerJobIdByPartnerJobIdResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.GetJobsPartnerJobIdByPartnerJobIdResponse(responseBuilder.build());
        }

        /**
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.GetJobsPartnerJobIdByPartnerJobIdResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.GetJobsPartnerJobIdByPartnerJobIdResponse(responseBuilder.build());
        }

    }

    public class PostJsonJobsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostJsonJobsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * No job inventory available
         * 
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withPaymentRequired() {
            Response.ResponseBuilder responseBuilder = Response.status(402);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Duplicate job.Happens when you try to Post a New Job, but another job with the same Partner Job Id already exists. Partner Job Id has to be unique. So either repost with a new Partner Job Id, or edit the existing job.
         * Job is closed. Happens when you try to update or renew a job that has already been closed. Renew is not ReOpen. To reopen a closed job, post it again.
         * Job is expired. Happens when you try to update a job that has been expired. 
         * Make a renew call. You can edit and renew a job in the same call.
         * 
         * 
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withConflict() {
            Response.ResponseBuilder responseBuilder = Response.status(409);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Your request to POST or PUT a record was successful. A Location HTTP header is often returned when we respond with a 201.
         * 
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withXmlCreated(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Your request to POST or PUT a record was successful. A Location HTTP header is often returned when we respond with a 201.
         * 
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostJsonJobsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostJsonJobsResponse(responseBuilder.build());
        }

    }

    public class PostXmlJobsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostXmlJobsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * No job inventory available
         * 
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withPaymentRequired() {
            Response.ResponseBuilder responseBuilder = Response.status(402);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Duplicate job.Happens when you try to Post a New Job, but another job with the same Partner Job Id already exists. Partner Job Id has to be unique. So either repost with a new Partner Job Id, or edit the existing job.
         * Job is closed. Happens when you try to update or renew a job that has already been closed. Renew is not ReOpen. To reopen a closed job, post it again.
         * Job is expired. Happens when you try to update a job that has been expired. 
         * Make a renew call. You can edit and renew a job in the same call.
         * 
         * 
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withConflict() {
            Response.ResponseBuilder responseBuilder = Response.status(409);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Your request to POST or PUT a record was successful. A Location HTTP header is often returned when we respond with a 201.
         * 
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withXmlCreated(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Your request to POST or PUT a record was successful. A Location HTTP header is often returned when we respond with a 201.
         * 
         * 
         * @param entity
         *     
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Your request was not formatted correctly
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * The OAuth signature was bad
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Access to the resource was denied. Usually this means you have reached a throttle limit. Can also mean you do not have permission to access this resource.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * The resource was not found (i.e. you asked for a non-existent user or URL)
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * Usually this means you used the wrong HTTP method (GET when you should POST, etc) 
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <error>
         *   <status>401</status>
         *   <timestamp>1378122242574</timestamp>
         *   <request-id>8PQJRYO7JK</request-id>
         *   <error-code>0</error-code>
         *   <message>Invalid access token.</message>
         * </error>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <error>
         *       <status>401</status>
         *       <timestamp>1378122242574</timestamp>
         *       <request-id>8PQJRYO7JK</request-id>
         *       <error-code>0</error-code>
         *       <message>Invalid access token.</message>
         *     </error>
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

        /**
         * There was an application error on the LinkedIn server.
         *  e.g. {
         *   "errorCode": 0,
         *   "message": "Invalid access token.",
         *   "requestId": "Y703T8HXBF",
         *   "status": 401,
         *   "timestamp": 1378122137646
         * }
         * 
         * @param entity
         *     {
         *       "errorCode": 0,
         *       "message": "Invalid access token.",
         *       "requestId": "Y703T8HXBF",
         *       "status": 401,
         *       "timestamp": 1378122137646
         *     }
         */
        public static JobLookupAPIResource.PostXmlJobsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new JobLookupAPIResource.PostXmlJobsResponse(responseBuilder.build());
        }

    }

    public class PutJsonJobsPartnerJobIdByPartnerJobIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PutJsonJobsPartnerJobIdByPartnerJobIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         */
        public static JobLookupAPIResource.PutJsonJobsPartnerJobIdByPartnerJobIdResponse withOK() {
            Response.ResponseBuilder responseBuilder = Response.status(200);
            return new JobLookupAPIResource.PutJsonJobsPartnerJobIdByPartnerJobIdResponse(responseBuilder.build());
        }

    }

    public class PutXmlJobsPartnerJobIdByPartnerJobIdResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PutXmlJobsPartnerJobIdByPartnerJobIdResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         */
        public static JobLookupAPIResource.PutXmlJobsPartnerJobIdByPartnerJobIdResponse withOK() {
            Response.ResponseBuilder responseBuilder = Response.status(200);
            return new JobLookupAPIResource.PutXmlJobsPartnerJobIdByPartnerJobIdResponse(responseBuilder.build());
        }

    }

    public enum XLiFormat {

        xml,
        json,
        jsonp;

    }

}
