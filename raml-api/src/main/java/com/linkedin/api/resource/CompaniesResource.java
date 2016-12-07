
package com.linkedin.api.resource;

import java.io.Reader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import com.linkedin.api.model.CompanyShare;
import com.linkedin.api.model.ErrorSchema;

@Path("companies")
public interface CompaniesResource {


    /**
     * Returns a single company if found.
     * 
     * @param fieldSelectors
     *     
     * @param format
     *     Type of data
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @GET
    @Path("{companyId}{fieldSelectors}")
    @Produces({
        "application/xml",
        "application/json",
        "text/xml"
    })
    CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse getCompaniesByCompanyIdByFieldSelectors(
        @PathParam("companyId")
        @NotNull
        String companyId,
        @PathParam("fieldSelectors")
        @NotNull
        String fieldSelectors,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat,
        @QueryParam("format")
        CompaniesResource.Format format)
        throws Exception
    ;

    /**
     * To retrieve the company's updates
     * 
     * @param count
     *     Maximum e.g. count=10
     * @param start
     *     The offset by which to start Network Update pagination e.g. start=0
     * @param eventType
     *     Any valid Company Update Type from the table below. e.g. event-type=status-update
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @GET
    @Path("{companyId}/updates")
    @Produces({
        "application/xml",
        "application/json"
    })
    CompaniesResource.GetCompaniesByCompanyIdUpdatesResponse getCompaniesByCompanyIdUpdates(
        @PathParam("companyId")
        @NotNull
        String companyId,
        @QueryParam("event-type")
        String eventType,
        @QueryParam("count")
        @DefaultValue("10")
        int count,
        @QueryParam("start")
        String start)
        throws Exception
    ;

    /**
     * 
     * @param count
     *     Maximum e.g. count=10
     * @param start
     *     The offset by which to start Network Update pagination e.g. start=0
     * @param companyUpdateKey
     *     
     * @param format
     *     Type of data
     *     
     * @param eventType
     *     Any valid Company Update Type from the table below. e.g. event-type=status-update
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @GET
    @Path("{companyId}/updates/key={CompanyUpdateKey}/update-comments")
    @Produces({
        "application/json",
        "text/xml"
    })
    CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse getCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateComments(
        @PathParam("CompanyUpdateKey")
        @NotNull
        String companyUpdateKey,
        @PathParam("companyId")
        @NotNull
        String companyId,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat,
        @QueryParam("event-type")
        String eventType,
        @QueryParam("count")
        @DefaultValue("10")
        int count,
        @QueryParam("start")
        String start,
        @QueryParam("format")
        CompaniesResource.Format format)
        throws Exception
    ;

    /**
     * 
     * @param count
     *     Maximum e.g. count=10
     * @param start
     *     The offset by which to start Network Update pagination e.g. start=0
     * @param companyUpdateKey
     *     
     * @param format
     *     Type of data
     *     
     * @param eventType
     *     Any valid Company Update Type from the table below. e.g. event-type=status-update
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @GET
    @Path("{companyId}/updates/key={CompanyUpdateKey}/likes")
    @Produces({
        "application/json",
        "text/xml"
    })
    CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse getCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikes(
        @PathParam("CompanyUpdateKey")
        @NotNull
        String companyUpdateKey,
        @PathParam("companyId")
        @NotNull
        String companyId,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat,
        @QueryParam("event-type")
        String eventType,
        @QueryParam("count")
        @DefaultValue("10")
        int count,
        @QueryParam("start")
        String start,
        @QueryParam("format")
        CompaniesResource.Format format)
        throws Exception
    ;

    /**
     * Full company share with content
     * 
     * @param entity
     *      e.g. {
     *       "visibility" : {
     *         "code" : "anyone"
     *       } ,
     *       "comment" : "Testing a full company share!" ,
     *       "content" : {
     *         "submitted-url" : "http://www.example.com/content.html" ,
     *         "title" : "Test Share with Content" ,
     *         "description" : "content description" ,
     *         "submitted‐image-url" : "http://www.example.com/image.jpg"
     *       }
     *     }
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @POST
    @Path("{companyId}/shares")
    @Consumes("application/json")
    @Produces({
        "application/json",
        "text/xml"
    })
    CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse postJsonCompaniesByCompanyIdShares(
        @PathParam("companyId")
        @NotNull
        String companyId,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat, CompanyShare entity)
        throws Exception
    ;

    /**
     * Full company share with content
     * 
     * @param entity
     *      e.g. <share>
     *       <visibility>
     *       <code>anyone</code>
     *       </visibility>
     *       <comment>Testing a targeted share!</comment>
     *       <content>
     *         <submitted-url>http://www.example.com/content.html</submitted-url>
     *         <title>Test Share with Content</title>
     *         <description>content description</description>
     *         <submitted-image-url>http://www.example.com/image.jpg</submitted-image-url>
     *       </content>
     *       <share-target-reach>
     *         <share-targets>
     *           <share-target>
     *             <code>geos</code>
     *             <tvalues>
     *               <tvalue>as</tvalue>
     *             </tvalues>
     *           </share-target>
     *           <share-target>
     *             <code>jobFunc</code>
     *             <tvalues>
     *               <tvalue>acct</tvalue>
     *             </tvalues>
     *           </share-target>
     *         </share-targets>
     *       </share-target-reach>
     *     </share>
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @POST
    @Path("{companyId}/shares")
    @Consumes("application/xml")
    @Produces({
        "application/json",
        "text/xml"
    })
    CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse postXmlCompaniesByCompanyIdShares(
        @PathParam("companyId")
        @NotNull
        String companyId,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat, Reader entity)
        throws Exception
    ;

    /**
     * 
     * @param format
     *     Type of data
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @GET
    @Path("{companyId}/is-company-share-enabled")
    @Produces({
        "application/json",
        "text/xml"
    })
    CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse getCompaniesByCompanyIdIsCompanyShareEnabled(
        @PathParam("companyId")
        @NotNull
        String companyId,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat,
        @QueryParam("format")
        CompaniesResource.Format format)
        throws Exception
    ;

    /**
     * 
     * @param format
     *     Type of data
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @GET
    @Path("{companyId}/relation-to-viewer/is-company-share-enabled")
    @Produces({
        "application/json",
        "text/xml"
    })
    CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse getCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabled(
        @PathParam("companyId")
        @NotNull
        String companyId,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat,
        @QueryParam("format")
        CompaniesResource.Format format)
        throws Exception
    ;

    /**
     * 
     * @param geographies
     *     See geographies for the valid values. e.g. af.eg
     * @param industries
     *     See industry codes for the valid values. e.g. 47
     * @param companySizes
     *     Specify the size range for the company. e.g. self
     * @param companyId
     *     The unique internal numeric company identifier.
     * @param seniorities
     *     Specify the level of seniority to target. e.g. c
     * @param jobFunc
     *     See job functions for the valid values. e.g. jobFunc=it
     */
    @GET
    @Path("{companyId}/num-followers")
    @Produces({
        "application/xml",
        "application/json"
    })
    CompaniesResource.GetCompaniesByCompanyIdNumFollowersResponse getCompaniesByCompanyIdNumFollowers(
        @PathParam("companyId")
        @NotNull
        String companyId,
        @QueryParam("geographies")
        @Size(max = 10)
        String geographies,
        @QueryParam("jobFunc")
        @Size(max = 10)
        String jobFunc,
        @QueryParam("industries")
        @Size(max = 10)
        String industries,
        @QueryParam("seniorities")
        CompaniesResource.Seniorities seniorities,
        @QueryParam("companySizes")
        @Size(max = 10)
        String companySizes)
        throws Exception
    ;

    /**
     * The Company Statistics API provides the ability to retrieve statistics for a particular company page. These stats can give you insights on both company share and follower metrics. Currently, the numbers provided are not real-time. The analytics breakdown for a company page is provided on a daily basis.
     * 
     * @param format
     *     Type of data
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @GET
    @Path("{companyId}/company-statistics")
    @Produces({
        "application/xml",
        "application/json",
        "text/xml"
    })
    CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse getCompaniesByCompanyIdCompanyStatistics(
        @PathParam("companyId")
        @NotNull
        String companyId,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat,
        @QueryParam("format")
        CompaniesResource.Format format)
        throws Exception
    ;

    /**
     * Use the Company Products API to:
     * Return a list of products and services supported by a company
     * Return recommendations for a particular product
     * 
     * 
     * @param fieldSelectors
     *     
     * @param format
     *     Type of data
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyId
     *     The unique internal numeric company identifier.
     */
    @GET
    @Path("{companyId}/products{fieldSelectors}")
    @Produces({
        "application/xml",
        "application/json",
        "text/xml"
    })
    CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse getCompaniesByCompanyIdProductsByFieldSelectors(
        @PathParam("fieldSelectors")
        @NotNull
        String fieldSelectors,
        @PathParam("companyId")
        @NotNull
        String companyId,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat,
        @QueryParam("format")
        CompaniesResource.Format format)
        throws Exception
    ;

    /**
     * Returns a single company if found.
     * 
     * @param format
     *     Type of data
     *     
     * @param xLiFormat
     *     Type of data
     *     
     * @param companyName
     *     The unique string identifier for a company. e.g. universal-name=linkedin
     */
    @GET
    @Path("universal-name={companyName}")
    @Produces({
        "application/xml",
        "application/json",
        "text/xml"
    })
    CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse getCompaniesUniversalNameByCompanyName(
        @PathParam("companyName")
        @NotNull
        String companyName,
        @HeaderParam("x-li-format")
        CompaniesResource.XLiFormat xLiFormat,
        @QueryParam("format")
        CompaniesResource.Format format)
        throws Exception
    ;

    public enum Format {

        xml,
        json,
        jsonp;

    }

    public class GetCompaniesByCompanyIdByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesByCompanyIdByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <company>
         *   <id>1337</id>
         *   <universal-name>linkedin</universal-name>
         *   <name>LinkedIn</name>
         *   <ticker>LNKD</ticker>
         *   <logo-url>http://media.linkedin.com/mpr/mpr/p/2/000/072/3f9/35d2127.png</logo-url>
         *   <description>LinkedIn takes your professional network online, giving you access to people, jobs and opportunities like never before. Built upon trusted connections and relationships, LinkedIn has established the worldÕs largest and most powerful professional network. Currently, more than 200 million professionals are on LinkedIn, including executives from all five hundred of the Fortune 500 companies, as well as a wide range of household names in technology, financial services, media, consumer packaged goods, entertainment, and numerous other industries. LinkedIn is backed by world-class investors including Sequoia Capital, Greylock, the European Founders Fund, Bessemer Venture Partners, Bain Capital, Goldman Sachs, SAP Ventures, and The McGraw-Hill Companies</description>
         *   <company-type>
         *     <code>P</code>
         *     <name>Privately Held</name>
         *   </company-type>
         *   <industries total="1">
         *     <industry>
         *       <code>6</code>
         *       <name>Internet</name>
         *     </industry>
         *   </industries>
         *   <size>501-1000</size>
         *   <specialties total="8">
         *     <specialty>Online Professional Network</specialty>
         *     <specialty>Jobs</specialty>
         *     <specialty>People Search</specialty>
         *     <specialty>Company Search</specialty>
         *     <specialty>Address Book</specialty>
         *     <specialty>Advertising</specialty>
         *     <specialty>Professional Identity</specialty>
         *     <specialty>Group Collaboration</specialty>
         *   </specialties>
         *   <blog-rss-url>http://feeds.feedburner.com/LinkedInBlog</blog-rss-url>
         *   <twitter-id>linkedin</twitter-id>
         *   <square-logo-url>http://media.linkedin.com/mpr/mpr/p/3/000/072/3db/1283f2d.png</square-logo-url>
         *   <locations total="15">
         *     <location>
         *       <address>
         *         <street1>2029 Stierlin Court</street1>
         *         <city>Mountain View</city>
         *         <postal-code>94043</postal-code>
         *       </address>
         *       <contact-info>
         *       </contact-info>
         *     </location>
         *     <location>
         *       <address>
         *         <street1>2126 N 117th Ave</street1>
         *         <city>Omaha</city>
         *         <postal-code>68164</postal-code>
         *       </address>
         *       <contact-info>
         *         <phone1>(402) 452-2320</phone1>
         *       </contact-info>
         *     </location>
         *     <location>
         *       <address>
         *         <street1>15 Shady Brook Lane</street1>
         *         <city>Belmont</city>
         *         <postal-code>02478</postal-code>
         *       </address>
         *       <contact-info>
         *       </contact-info>
         *     </location>
         *     <location>
         *       <address>
         *         <street1>2126 N 117th Ave</street1>
         *         <city>Omaha</city>
         *         <postal-code>68164</postal-code>
         *       </address>
         *       <contact-info>
         *         <phone1>(402) 452-2320</phone1>
         *       </contact-info>
         *     </location>
         *     <location>
         *       <address>
         *         <street1>2029 Stierlin Court</street1>
         *         <city>Mountain View</city>
         *         <postal-code>94043</postal-code>
         *       </address>
         *       <contact-info>
         *       </contact-info>
         *     </location>
         *     <location>
         *       <address>
         *         <street1>2029 Stierlin Court</street1>
         *         <city>Mountain View</city>
         *         <postal-code>94043</postal-code>
         *       </address>
         *       <contact-info>
         *       </contact-info>
         *     </location>
         *     <location>
         *       <address>
         *         <street1>30 S. Wacker Drive</street1>
         *         <city>Chicago</city>
         *         <postal-code>60606</postal-code>
         *       </address>
         *       <contact-info>
         *       </contact-info>
         *     </location>
         *   </locations>
         *   <founded-year>2003</founded-year>
         *   <email-domains total="1">
         *     <email-domain>linkedin.com</email-domain>
         *   </email-domains>
         *   <website-url>http://www.linkedin.com</website-url>
         *   <status>
         *    <code>OPR</code>
         *    <name>Operating</name>
         *   </status>
         *   <employee-count-range>
         *     <code>F</code>
         *     <name>501-1000</name>
         *   </employee-count-range>
         * </company>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <company>
         *       <id>1337</id>
         *       <universal-name>linkedin</universal-name>
         *       <name>LinkedIn</name>
         *       <ticker>LNKD</ticker>
         *       <logo-url>http://media.linkedin.com/mpr/mpr/p/2/000/072/3f9/35d2127.png</logo-url>
         *       <description>LinkedIn takes your professional network online, giving you access to people, jobs and opportunities like never before. Built upon trusted connections and relationships, LinkedIn has established the worldÕs largest and most powerful professional network. Currently, more than 200 million professionals are on LinkedIn, including executives from all five hundred of the Fortune 500 companies, as well as a wide range of household names in technology, financial services, media, consumer packaged goods, entertainment, and numerous other industries. LinkedIn is backed by world-class investors including Sequoia Capital, Greylock, the European Founders Fund, Bessemer Venture Partners, Bain Capital, Goldman Sachs, SAP Ventures, and The McGraw-Hill Companies</description>
         *       <company-type>
         *         <code>P</code>
         *         <name>Privately Held</name>
         *       </company-type>
         *       <industries total="1">
         *         <industry>
         *           <code>6</code>
         *           <name>Internet</name>
         *         </industry>
         *       </industries>
         *       <size>501-1000</size>
         *       <specialties total="8">
         *         <specialty>Online Professional Network</specialty>
         *         <specialty>Jobs</specialty>
         *         <specialty>People Search</specialty>
         *         <specialty>Company Search</specialty>
         *         <specialty>Address Book</specialty>
         *         <specialty>Advertising</specialty>
         *         <specialty>Professional Identity</specialty>
         *         <specialty>Group Collaboration</specialty>
         *       </specialties>
         *       <blog-rss-url>http://feeds.feedburner.com/LinkedInBlog</blog-rss-url>
         *       <twitter-id>linkedin</twitter-id>
         *       <square-logo-url>http://media.linkedin.com/mpr/mpr/p/3/000/072/3db/1283f2d.png</square-logo-url>
         *       <locations total="15">
         *         <location>
         *           <address>
         *             <street1>2029 Stierlin Court</street1>
         *             <city>Mountain View</city>
         *             <postal-code>94043</postal-code>
         *           </address>
         *           <contact-info>
         *           </contact-info>
         *         </location>
         *         <location>
         *           <address>
         *             <street1>2126 N 117th Ave</street1>
         *             <city>Omaha</city>
         *             <postal-code>68164</postal-code>
         *           </address>
         *           <contact-info>
         *             <phone1>(402) 452-2320</phone1>
         *           </contact-info>
         *         </location>
         *         <location>
         *           <address>
         *             <street1>15 Shady Brook Lane</street1>
         *             <city>Belmont</city>
         *             <postal-code>02478</postal-code>
         *           </address>
         *           <contact-info>
         *           </contact-info>
         *         </location>
         *         <location>
         *           <address>
         *             <street1>2126 N 117th Ave</street1>
         *             <city>Omaha</city>
         *             <postal-code>68164</postal-code>
         *           </address>
         *           <contact-info>
         *             <phone1>(402) 452-2320</phone1>
         *           </contact-info>
         *         </location>
         *         <location>
         *           <address>
         *             <street1>2029 Stierlin Court</street1>
         *             <city>Mountain View</city>
         *             <postal-code>94043</postal-code>
         *           </address>
         *           <contact-info>
         *           </contact-info>
         *         </location>
         *         <location>
         *           <address>
         *             <street1>2029 Stierlin Court</street1>
         *             <city>Mountain View</city>
         *             <postal-code>94043</postal-code>
         *           </address>
         *           <contact-info>
         *           </contact-info>
         *         </location>
         *         <location>
         *           <address>
         *             <street1>30 S. Wacker Drive</street1>
         *             <city>Chicago</city>
         *             <postal-code>60606</postal-code>
         *           </address>
         *           <contact-info>
         *           </contact-info>
         *         </location>
         *       </locations>
         *       <founded-year>2003</founded-year>
         *       <email-domains total="1">
         *         <email-domain>linkedin.com</email-domain>
         *       </email-domains>
         *       <website-url>http://www.linkedin.com</website-url>
         *       <status>
         *        <code>OPR</code>
         *        <name>Operating</name>
         *       </status>
         *       <employee-count-range>
         *         <code>F</code>
         *         <name>501-1000</name>
         *       </employee-count-range>
         *     </company>
         */
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetCompaniesByCompanyIdCompanyStatisticsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesByCompanyIdCompanyStatisticsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         *  e.g. <company-statistics>
         *   <status-update-statistics>
         *     <views-by-month total="12">
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>11</month>
         *         </date>
         *         <clicks>1</clicks>
         *         <likes>0</likes>
         *         <comments>0</comments>
         *         <shares>0</shares>
         *         <impressions>150</impressions>
         *         <engagement>0.006666666666666667</engagement>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>10</month>
         *         </date>
         *         <clicks>0</clicks>
         *         <likes>1</likes>
         *         <comments>1</comments>
         *         <shares>0</shares>
         *         <impressions>654</impressions>
         *         <engagement>0.0030581039755351682</engagement>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>9</month>
         *         </date>
         *         <clicks>1</clicks>
         *         <likes>3</likes>
         *         <comments>2</comments>
         *         <shares>0</shares>
         *         <impressions>4463</impressions>
         *         <engagement>0.0013443871835088505</engagement>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>8</month>
         *         </date>
         *         <clicks>15</clicks>
         *         <likes>16</likes>
         *         <comments>71</comments>
         *         <shares>1</shares>
         *         <impressions>7106</impressions>
         *         <engagement>0.01449479313256403</engagement>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>7</month>
         *         </date>
         *         <clicks>0</clicks>
         *         <likes>0</likes>
         *         <comments>0</comments>
         *         <shares>0</shares>
         *         <impressions>0</impressions>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>6</month>
         *         </date>
         *         <clicks>0</clicks>
         *         <likes>0</likes>
         *         <comments>0</comments>
         *         <shares>0</shares>
         *         <impressions>0</impressions>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>5</month>
         *         </date>
         *         <clicks>0</clicks>
         *         <likes>0</likes>
         *         <comments>0</comments>
         *         <shares>0</shares>
         *         <impressions>0</impressions>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>4</month>
         *         </date>
         *         <clicks>0</clicks>
         *         <likes>0</likes>
         *         <comments>0</comments>
         *         <shares>0</shares>
         *         <impressions>0</impressions>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>3</month>
         *         </date>
         *         <clicks>0</clicks>
         *         <likes>0</likes>
         *         <comments>0</comments>
         *         <shares>0</shares>
         *         <impressions>0</impressions>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>2</month>
         *         </date>
         *         <clicks>0</clicks>
         *         <likes>0</likes>
         *         <comments>0</comments>
         *         <shares>0</shares>
         *         <impressions>0</impressions>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2012</year>
         *           <month>1</month>
         *         </date>
         *         <clicks>0</clicks>
         *         <likes>0</likes>
         *         <comments>0</comments>
         *         <shares>0</shares>
         *         <impressions>0</impressions>
         *       </view-by-month>
         *       <view-by-month>
         *         <date>
         *           <year>2011</year>
         *           <month>12</month>
         *         </date>
         *       </view-by-month>
         *     </views-by-month>
         *   </status-update-statistics>
         *   <follow-statistics>
         *     <count>11</count>
         *     <employee-count>0</employee-count>
         *     <non-employee-count>11</non-employee-count>
         *     <seniorities total="11">
         *       <seniority>
         *         <entry-key>4</entry-key>
         *         <entry-value>5</entry-value>
         *       </seniority>
         *       <seniority>
         *         <entry-key>3</entry-key>
         *         <entry-value>4</entry-value>
         *       </seniority>
         *       <seniority>
         *         <entry-key>6</entry-key>
         *         <entry-value>1</entry-value>
         *       </seniority>
         *       <seniority>
         *         <entry-key>0</entry-key>
         *         <entry-value>0</entry-value>
         *       </seniority>
         * 	 </seniorities>
         *     </follow-statistics>
         * </company-statistics>
         * 
         * @param entity
         *     <company-statistics>
         *       <status-update-statistics>
         *         <views-by-month total="12">
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>11</month>
         *             </date>
         *             <clicks>1</clicks>
         *             <likes>0</likes>
         *             <comments>0</comments>
         *             <shares>0</shares>
         *             <impressions>150</impressions>
         *             <engagement>0.006666666666666667</engagement>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>10</month>
         *             </date>
         *             <clicks>0</clicks>
         *             <likes>1</likes>
         *             <comments>1</comments>
         *             <shares>0</shares>
         *             <impressions>654</impressions>
         *             <engagement>0.0030581039755351682</engagement>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>9</month>
         *             </date>
         *             <clicks>1</clicks>
         *             <likes>3</likes>
         *             <comments>2</comments>
         *             <shares>0</shares>
         *             <impressions>4463</impressions>
         *             <engagement>0.0013443871835088505</engagement>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>8</month>
         *             </date>
         *             <clicks>15</clicks>
         *             <likes>16</likes>
         *             <comments>71</comments>
         *             <shares>1</shares>
         *             <impressions>7106</impressions>
         *             <engagement>0.01449479313256403</engagement>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>7</month>
         *             </date>
         *             <clicks>0</clicks>
         *             <likes>0</likes>
         *             <comments>0</comments>
         *             <shares>0</shares>
         *             <impressions>0</impressions>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>6</month>
         *             </date>
         *             <clicks>0</clicks>
         *             <likes>0</likes>
         *             <comments>0</comments>
         *             <shares>0</shares>
         *             <impressions>0</impressions>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>5</month>
         *             </date>
         *             <clicks>0</clicks>
         *             <likes>0</likes>
         *             <comments>0</comments>
         *             <shares>0</shares>
         *             <impressions>0</impressions>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>4</month>
         *             </date>
         *             <clicks>0</clicks>
         *             <likes>0</likes>
         *             <comments>0</comments>
         *             <shares>0</shares>
         *             <impressions>0</impressions>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>3</month>
         *             </date>
         *             <clicks>0</clicks>
         *             <likes>0</likes>
         *             <comments>0</comments>
         *             <shares>0</shares>
         *             <impressions>0</impressions>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>2</month>
         *             </date>
         *             <clicks>0</clicks>
         *             <likes>0</likes>
         *             <comments>0</comments>
         *             <shares>0</shares>
         *             <impressions>0</impressions>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2012</year>
         *               <month>1</month>
         *             </date>
         *             <clicks>0</clicks>
         *             <likes>0</likes>
         *             <comments>0</comments>
         *             <shares>0</shares>
         *             <impressions>0</impressions>
         *           </view-by-month>
         *           <view-by-month>
         *             <date>
         *               <year>2011</year>
         *               <month>12</month>
         *             </date>
         *           </view-by-month>
         *         </views-by-month>
         *       </status-update-statistics>
         *       <follow-statistics>
         *         <count>11</count>
         *         <employee-count>0</employee-count>
         *         <non-employee-count>11</non-employee-count>
         *         <seniorities total="11">
         *           <seniority>
         *             <entry-key>4</entry-key>
         *             <entry-value>5</entry-value>
         *           </seniority>
         *           <seniority>
         *             <entry-key>3</entry-key>
         *             <entry-value>4</entry-value>
         *           </seniority>
         *           <seniority>
         *             <entry-key>6</entry-key>
         *             <entry-value>1</entry-value>
         *           </seniority>
         *           <seniority>
         *             <entry-key>0</entry-key>
         *             <entry-value>0</entry-value>
         *           </seniority>
         *     	 </seniorities>
         *         </follow-statistics>
         *     </company-statistics>
         */
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdCompanyStatisticsResponse(responseBuilder.build());
        }

    }

    public class GetCompaniesByCompanyIdIsCompanyShareEnabledResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdIsCompanyShareEnabledResponse(responseBuilder.build());
        }

    }

    public class GetCompaniesByCompanyIdNumFollowersResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesByCompanyIdNumFollowersResponse(Response delegate) {
            super(delegate);
        }

        /**
         *  e.g. {
         *   "visibility" : {
         *     "code" : "anyone"
         *   } ,
         *   "comment" : "Testing a full company share!" ,
         *   "content" : {
         *     "submitted-url" : "http://www.example.com/content.html" ,
         *     "title" : "Test Share with Content" ,
         *     "description" : "content description" ,
         *     "submitted‐image-url" : "http://www.example.com/image.jpg"
         *   }
         * }
         * 
         * @param entity
         *     {
         *       "visibility" : {
         *         "code" : "anyone"
         *       } ,
         *       "comment" : "Testing a full company share!" ,
         *       "content" : {
         *         "submitted-url" : "http://www.example.com/content.html" ,
         *         "title" : "Test Share with Content" ,
         *         "description" : "content description" ,
         *         "submitted‐image-url" : "http://www.example.com/image.jpg"
         *       }
         *     }
         */
        public static CompaniesResource.GetCompaniesByCompanyIdNumFollowersResponse withJsonOK(CompanyShare entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdNumFollowersResponse(responseBuilder.build());
        }

        /**
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdNumFollowersResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdNumFollowersResponse(responseBuilder.build());
        }

    }

    public class GetCompaniesByCompanyIdProductsByFieldSelectorsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         *  e.g. <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         * <products total="32" count="5" start="0">
         *   <product>
         *     <id>1353</id>
         *     <name>LinkedIn Content Ads</name>
         *     <type>
         *       <code>P</code>
         *       <name>PRODUCT</name>
         *     </type>
         *     <num-recommendations>2</num-recommendations>
         *     <recommendations count="2" start="0">
         *       <recommendation>
         *         <recommender>
         *           <id>G4HI670roP</id>
         *           <first-name>Jane</first-name>
         *           <last-name>Doe</last-name>
         *         </recommender>
         *         <id>22974</id>
         *         <product-id>1353</product-id>
         *         <timestamp>1292234549556</timestamp>
         *       </recommendation>
         *       <recommendation>
         *         <recommender>
         *           <id>Fmfl3zkirV</id>
         *           <first-name>Alex</first-name>
         *           <last-name>Jones</last-name>
         *         </recommender>
         *         <id>3463</id>
         *         <product-id>1353</product-id>
         *         <timestamp>1289225062991</timestamp>
         *       </recommendation>
         *     </recommendations>
         *     <product-category>
         *       <code>INT</code>
         *       <name>Internet</name>
         *     </product-category>
         *     <website-url>http://marketing.linkedinlabs.com/solutions/</website-url>
         *   </product>
         *   <product>
         *     <id>1355</id>
         *     <name>LinkedIn Polls Sponsorship</name>
         *     <type>
         *       <code>P</code>
         *       <name>PRODUCT</name>
         *     </type>
         *     <num-recommendations>2</num-recommendations>
         *     <recommendations count="2" start="0">
         *       <recommendation>
         *         <recommender>
         *           <id>Rh5L39Whxb</id>
         *           <first-name>John</first-name>
         *           <last-name>Smith</last-name>
         *         </recommender>
         *         <id>27619</id>
         *         <product-id>1355</product-id>
         *         <timestamp>1292992221392</timestamp>
         *         <text>Great Tool, with Polls Sponsorship our brands will be more dynamic .</text>
         *       </recommendation>
         *       <recommendation>
         *         <recommender>
         *           <id>bkVEjNay9w</id>
         *           <first-name>Ann</first-name>
         *           <last-name>White</last-name>
         *         </recommender>
         *         <id>8867</id>
         *         <product-id>1355</product-id>
         *         <timestamp>1289981830700</timestamp>
         *         <text>It is a good product. I recommend this product. User can post a poll option should be there.</text>
         *       </recommendation>
         *     </recommendations>
         *     <product-category>
         *       <code>INT</code>
         *       <name>Internet</name>
         *     </product-category>
         *     <website-url>http://www.linkedin.com/opensocialInstallation/preview?_ch_panel_id=1&amp;_applicationId=1900</website-url>
         *   </product>
         *   <product>
         *     <id>1358</id>
         *     <name>LinkedIn Events Sponsorship</name>
         *     <type>
         *       <code>P</code>
         *       <name>PRODUCT</name>
         *     </type>
         *     <num-recommendations>0</num-recommendations>
         *     <product-category>
         *       <code>MARKET</code>
         *       <name>Marketing &amp; Advertising</name>
         *     </product-category>
         *     <website-url>http://marketing.linkedin.com/events/</website-url>
         *   </product>
         *   <product>
         *     <id>1436</id>
         *     <name>LinkedIn</name>
         *     <type>
         *       <code>P</code>
         *       <name>PRODUCT</name>
         *     </type>
         *     <num-recommendations>53</num-recommendations>
         *     <recommendations count="3" start="0">
         *       <recommendation>
         *         <recommender>
         *           <id>ZZfj0hLcmb</id>
         *           <first-name>Mike</first-name>
         *           <last-name>Last</last-name>
         *         </recommender>
         *         <id>56231</id>
         *         <product-id>1436</product-id>
         *         <timestamp>1300369622727</timestamp>
         *       </recommendation>
         *       <recommendation>
         *         <recommender>
         *           <id>OcU4BIwnvx</id>
         *           <first-name>Juan</first-name>
         *           <last-name>Gomez</last-name>
         *         </recommender>
         *         <id>84383</id>
         *         <product-id>1436</product-id>
         *         <timestamp>1306340637027</timestamp>
         *       </recommendation>
         *       <recommendation>
         *         <recommender>
         *           <id>pfEkdotMmy</id>
         *           <first-name>Paul</first-name>
         *           <last-name>Tim</last-name>
         *         </recommender>
         *         <id>74292</id>
         *         <product-id>1436</product-id>
         *         <timestamp>1304503262773</timestamp>
         *         <text>this is good one</text>
         *       </recommendation>
         *     </recommendations>
         *     <product-category>
         *       <code>INT</code>
         *       <name>Internet</name>
         *     </product-category>
         *     <website-url>http://www.linkedin.com</website-url>
         *   </product>
         *   <product>
         *     <id>1437</id>
         *     <name>LinkedIn Mobile</name>
         *     <type>
         *       <code>P</code>
         *       <name>PRODUCT</name>
         *     </type>
         *     <num-recommendations>16</num-recommendations>
         *     <recommendations count="3" start="0">
         *       <recommendation>
         *         <recommender>
         *           <id>Rh5L39Whxb</id>
         *           <first-name>Jim</first-name>
         *           <last-name>Barr</last-name>
         *         </recommender>
         *         <id>6444</id>
         *         <product-id>1437</product-id>
         *         <timestamp>1289511725870</timestamp>
         *         <text></text>
         *       </recommendation>
         *       <recommendation>
         *         <recommender>
         *           <id>IWZk3OIvZR</id>
         *           <first-name>Liz</first-name>
         *           <last-name>Was</last-name>
         *         </recommender>
         *         <id>77788</id>
         *         <product-id>1437</product-id>
         *         <timestamp>1305153209849</timestamp>
         *         <text>Great, easy to use app that allows you to build your network on the go as well as post updates and keep in touch. One of the most used apps on my iPhone!</text>
         *       </recommendation>
         *       <recommendation>
         *         <recommender>
         *           <id>jFYCuJLixi</id>
         *           <first-name>Al</first-name>
         *           <last-name>Saiz</last-name>
         *         </recommender>
         *         <id>74250</id>
         *         <product-id>1437</product-id>
         *         <timestamp>1304497741316</timestamp>
         *       </recommendation>
         *     </recommendations>
         *     <product-category>
         *       <code>INT</code>
         *       <name>Internet</name>
         *     </product-category>
         *     <website-url>http://www.linkedin.com/static?key=mobile</website-url>
         *     <disclaimer></disclaimer>
         *   </product>
         * </products>
         * 
         * @param entity
         *     <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
         *     <products total="32" count="5" start="0">
         *       <product>
         *         <id>1353</id>
         *         <name>LinkedIn Content Ads</name>
         *         <type>
         *           <code>P</code>
         *           <name>PRODUCT</name>
         *         </type>
         *         <num-recommendations>2</num-recommendations>
         *         <recommendations count="2" start="0">
         *           <recommendation>
         *             <recommender>
         *               <id>G4HI670roP</id>
         *               <first-name>Jane</first-name>
         *               <last-name>Doe</last-name>
         *             </recommender>
         *             <id>22974</id>
         *             <product-id>1353</product-id>
         *             <timestamp>1292234549556</timestamp>
         *           </recommendation>
         *           <recommendation>
         *             <recommender>
         *               <id>Fmfl3zkirV</id>
         *               <first-name>Alex</first-name>
         *               <last-name>Jones</last-name>
         *             </recommender>
         *             <id>3463</id>
         *             <product-id>1353</product-id>
         *             <timestamp>1289225062991</timestamp>
         *           </recommendation>
         *         </recommendations>
         *         <product-category>
         *           <code>INT</code>
         *           <name>Internet</name>
         *         </product-category>
         *         <website-url>http://marketing.linkedinlabs.com/solutions/</website-url>
         *       </product>
         *       <product>
         *         <id>1355</id>
         *         <name>LinkedIn Polls Sponsorship</name>
         *         <type>
         *           <code>P</code>
         *           <name>PRODUCT</name>
         *         </type>
         *         <num-recommendations>2</num-recommendations>
         *         <recommendations count="2" start="0">
         *           <recommendation>
         *             <recommender>
         *               <id>Rh5L39Whxb</id>
         *               <first-name>John</first-name>
         *               <last-name>Smith</last-name>
         *             </recommender>
         *             <id>27619</id>
         *             <product-id>1355</product-id>
         *             <timestamp>1292992221392</timestamp>
         *             <text>Great Tool, with Polls Sponsorship our brands will be more dynamic .</text>
         *           </recommendation>
         *           <recommendation>
         *             <recommender>
         *               <id>bkVEjNay9w</id>
         *               <first-name>Ann</first-name>
         *               <last-name>White</last-name>
         *             </recommender>
         *             <id>8867</id>
         *             <product-id>1355</product-id>
         *             <timestamp>1289981830700</timestamp>
         *             <text>It is a good product. I recommend this product. User can post a poll option should be there.</text>
         *           </recommendation>
         *         </recommendations>
         *         <product-category>
         *           <code>INT</code>
         *           <name>Internet</name>
         *         </product-category>
         *         <website-url>http://www.linkedin.com/opensocialInstallation/preview?_ch_panel_id=1&amp;_applicationId=1900</website-url>
         *       </product>
         *       <product>
         *         <id>1358</id>
         *         <name>LinkedIn Events Sponsorship</name>
         *         <type>
         *           <code>P</code>
         *           <name>PRODUCT</name>
         *         </type>
         *         <num-recommendations>0</num-recommendations>
         *         <product-category>
         *           <code>MARKET</code>
         *           <name>Marketing &amp; Advertising</name>
         *         </product-category>
         *         <website-url>http://marketing.linkedin.com/events/</website-url>
         *       </product>
         *       <product>
         *         <id>1436</id>
         *         <name>LinkedIn</name>
         *         <type>
         *           <code>P</code>
         *           <name>PRODUCT</name>
         *         </type>
         *         <num-recommendations>53</num-recommendations>
         *         <recommendations count="3" start="0">
         *           <recommendation>
         *             <recommender>
         *               <id>ZZfj0hLcmb</id>
         *               <first-name>Mike</first-name>
         *               <last-name>Last</last-name>
         *             </recommender>
         *             <id>56231</id>
         *             <product-id>1436</product-id>
         *             <timestamp>1300369622727</timestamp>
         *           </recommendation>
         *           <recommendation>
         *             <recommender>
         *               <id>OcU4BIwnvx</id>
         *               <first-name>Juan</first-name>
         *               <last-name>Gomez</last-name>
         *             </recommender>
         *             <id>84383</id>
         *             <product-id>1436</product-id>
         *             <timestamp>1306340637027</timestamp>
         *           </recommendation>
         *           <recommendation>
         *             <recommender>
         *               <id>pfEkdotMmy</id>
         *               <first-name>Paul</first-name>
         *               <last-name>Tim</last-name>
         *             </recommender>
         *             <id>74292</id>
         *             <product-id>1436</product-id>
         *             <timestamp>1304503262773</timestamp>
         *             <text>this is good one</text>
         *           </recommendation>
         *         </recommendations>
         *         <product-category>
         *           <code>INT</code>
         *           <name>Internet</name>
         *         </product-category>
         *         <website-url>http://www.linkedin.com</website-url>
         *       </product>
         *       <product>
         *         <id>1437</id>
         *         <name>LinkedIn Mobile</name>
         *         <type>
         *           <code>P</code>
         *           <name>PRODUCT</name>
         *         </type>
         *         <num-recommendations>16</num-recommendations>
         *         <recommendations count="3" start="0">
         *           <recommendation>
         *             <recommender>
         *               <id>Rh5L39Whxb</id>
         *               <first-name>Jim</first-name>
         *               <last-name>Barr</last-name>
         *             </recommender>
         *             <id>6444</id>
         *             <product-id>1437</product-id>
         *             <timestamp>1289511725870</timestamp>
         *             <text></text>
         *           </recommendation>
         *           <recommendation>
         *             <recommender>
         *               <id>IWZk3OIvZR</id>
         *               <first-name>Liz</first-name>
         *               <last-name>Was</last-name>
         *             </recommender>
         *             <id>77788</id>
         *             <product-id>1437</product-id>
         *             <timestamp>1305153209849</timestamp>
         *             <text>Great, easy to use app that allows you to build your network on the go as well as post updates and keep in touch. One of the most used apps on my iPhone!</text>
         *           </recommendation>
         *           <recommendation>
         *             <recommender>
         *               <id>jFYCuJLixi</id>
         *               <first-name>Al</first-name>
         *               <last-name>Saiz</last-name>
         *             </recommender>
         *             <id>74250</id>
         *             <product-id>1437</product-id>
         *             <timestamp>1304497741316</timestamp>
         *           </recommendation>
         *         </recommendations>
         *         <product-category>
         *           <code>INT</code>
         *           <name>Internet</name>
         *         </product-category>
         *         <website-url>http://www.linkedin.com/static?key=mobile</website-url>
         *         <disclaimer></disclaimer>
         *       </product>
         *     </products>
         */
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdProductsByFieldSelectorsResponse(responseBuilder.build());
        }

    }

    public class GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdRelationToViewerIsCompanyShareEnabledResponse(responseBuilder.build());
        }

    }

    public class GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyLikesResponse(responseBuilder.build());
        }

    }

    public class GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesKeyByCompanyUpdateKeyUpdateCommentsResponse(responseBuilder.build());
        }

    }

    public class GetCompaniesByCompanyIdUpdatesResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesByCompanyIdUpdatesResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesResponse(responseBuilder.build());
        }

        /**
         *  e.g. <update>
         *    <timestamp>1315338683355</timestamp>
         *    <update-type>CMPY</update-type>
         *    <update-content>
         *       <company>
         *          <id>1337</id>
         *          <name>LinkedIn</name>
         *       </company>
         *       <company-person-update>
         *           <person>
         *               <id>14381178</id>
         *                   <first-name>Patrick</first-name>
         *                   <last-name>Smith</last-name>
         *                   <headline>Enterprise Relationship Manager at LinkedIn</headline>
         *                   <picture-url>http://media.linkedin.com/mpr/mprx/0_gPLYkP6SpokSOnUc0-vDkA9DYulmpzUc0tA3krFxTW5YiluBAvztoKPlKGAlx-sRyKF8wBMg5HkD</picture-url>
         *                   <api-standard-profile-request>
         *                       <url>http://api.linkedin.com/v1/people/14381178</url>
         *                       <headers total="1">
         *                            <http-header>
         *                               <name>x-li-auth-token</name>
         *                               <value>name:4gRT</value>
         *                            </http-header>
         *                       </headers>
         *                   </api-standard-profile-request>
         *                   <site-standard-profile-request>
         *                         <url>http://www.linkedin.com/profile?viewProfile=&amp;key=14381178&amp;authToken=4gRT&amp;authType=name&amp;trk=api*</url>
         *                   </site-standard-profile-request>
         *              </person>
         *              <action>
         *                 <code>joined</code>
         *              </action>
         *              <old-position>
         *                   <title>Actor</title>
         *                   <company>
         *                        <name>IndependentContractor</name>
         *                   </company>
         *              </old-position>
         *              <new-position>
         *                   <title>Enterprise Relationship Manager</title>
         *                   <company>
         *                        <id>1337</id>
         *                        <name>LinkedIn</name>
         *                   </company>
         *              </new-position>
         *          </company-person-update>
         *      </update-content>
         * </update>
         * 
         * @param entity
         *     <update>
         *        <timestamp>1315338683355</timestamp>
         *        <update-type>CMPY</update-type>
         *        <update-content>
         *           <company>
         *              <id>1337</id>
         *              <name>LinkedIn</name>
         *           </company>
         *           <company-person-update>
         *               <person>
         *                   <id>14381178</id>
         *                       <first-name>Patrick</first-name>
         *                       <last-name>Smith</last-name>
         *                       <headline>Enterprise Relationship Manager at LinkedIn</headline>
         *                       <picture-url>http://media.linkedin.com/mpr/mprx/0_gPLYkP6SpokSOnUc0-vDkA9DYulmpzUc0tA3krFxTW5YiluBAvztoKPlKGAlx-sRyKF8wBMg5HkD</picture-url>
         *                       <api-standard-profile-request>
         *                           <url>http://api.linkedin.com/v1/people/14381178</url>
         *                           <headers total="1">
         *                                <http-header>
         *                                   <name>x-li-auth-token</name>
         *                                   <value>name:4gRT</value>
         *                                </http-header>
         *                           </headers>
         *                       </api-standard-profile-request>
         *                       <site-standard-profile-request>
         *                             <url>http://www.linkedin.com/profile?viewProfile=&amp;key=14381178&amp;authToken=4gRT&amp;authType=name&amp;trk=api*</url>
         *                       </site-standard-profile-request>
         *                  </person>
         *                  <action>
         *                     <code>joined</code>
         *                  </action>
         *                  <old-position>
         *                       <title>Actor</title>
         *                       <company>
         *                            <name>IndependentContractor</name>
         *                       </company>
         *                  </old-position>
         *                  <new-position>
         *                       <title>Enterprise Relationship Manager</title>
         *                       <company>
         *                            <id>1337</id>
         *                            <name>LinkedIn</name>
         *                       </company>
         *                  </new-position>
         *              </company-person-update>
         *          </update-content>
         *     </update>
         */
        public static CompaniesResource.GetCompaniesByCompanyIdUpdatesResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesByCompanyIdUpdatesResponse(responseBuilder.build());
        }

    }

    public class GetCompaniesUniversalNameByCompanyNameResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private GetCompaniesUniversalNameByCompanyNameResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded  
         *  e.g. <company>
         *   <id>162479</id>
         *   <name>Apple</name>
         * </company>
         * 
         * @param entity
         *     <company>
         *       <id>162479</id>
         *       <name>Apple</name>
         *     </company>
         */
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withXmlOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
        }

        /**
         * Request succeeded  
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
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
        public static CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.GetCompaniesUniversalNameByCompanyNameResponse(responseBuilder.build());
        }

    }

    public class PostJsonCompaniesByCompanyIdSharesResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostJsonCompaniesByCompanyIdSharesResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
        }

        /**
         * Created on success
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withXmlCreated(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
        }

        /**
         * Created on success
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostJsonCompaniesByCompanyIdSharesResponse(responseBuilder.build());
        }

    }

    public class PostXmlCompaniesByCompanyIdSharesResponse
        extends com.linkedin.api.resource.support.ResponseWrapper
    {


        private PostXmlCompaniesByCompanyIdSharesResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withXmlOK(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
        }

        /**
         * Request succeeded
         * 
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withJsonOK(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
        }

        /**
         * Created on success
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withXmlCreated(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
        }

        /**
         * Created on success
         * 
         * @param entity
         *     
         */
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withJsonCreated(StreamingOutput entity) {
            Response.ResponseBuilder responseBuilder = Response.status(201).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withXmlBadRequest(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withJsonBadRequest(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withXmlUnauthorized(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withJsonUnauthorized(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(401).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withXmlForbidden(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withJsonForbidden(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(403).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withXmlNotFound(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withJsonNotFound(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withXmlMethodNotAllowed(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withJsonMethodNotAllowed(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(405).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withXmlInternalServerError(String entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "text/xml");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
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
        public static CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse withJsonInternalServerError(ErrorSchema entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CompaniesResource.PostXmlCompaniesByCompanyIdSharesResponse(responseBuilder.build());
        }

    }

    public enum Seniorities {

        d,
        c,
        en,
        ic,
        m,
        o,
        p,
        tr,
        up,
        vp;

    }

    public enum XLiFormat {

        xml,
        json,
        jsonp;

    }

}
