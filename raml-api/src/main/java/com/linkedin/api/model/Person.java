
package com.linkedin.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="first-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="relation-to-viewer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="num-recommenders" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="current-status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="current-status-timestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="connections">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="positions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="position" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="start-date">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                       &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="is-current" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="company">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="educations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="education" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="school-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="start-date">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="end-date">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="member-url-resources">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="member-url" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="api-standard-profile-request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="headers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="http-header" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="site-standard-profile-request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="picture-url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "firstName",
    "lastName",
    "headline",
    "location",
    "industry",
    "distance",
    "relationToViewer",
    "numRecommenders",
    "currentStatus",
    "currentStatusTimestamp",
    "connections",
    "summary",
    "positions",
    "educations",
    "memberUrlResources",
    "apiStandardProfileRequest",
    "siteStandardProfileRequest",
    "pictureUrl"
})
@XmlRootElement(name = "person")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
public class Person {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected int id;
    @XmlElement(name = "first-name", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected String firstName;
    @XmlElement(name = "last-name", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected String lastName;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected String headline;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected Person.Location location;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected String industry;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected byte distance;
    @XmlElement(name = "relation-to-viewer", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected Person.RelationToViewer relationToViewer;
    @XmlElement(name = "num-recommenders")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected byte numRecommenders;
    @XmlElement(name = "current-status", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected String currentStatus;
    @XmlElement(name = "current-status-timestamp")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected long currentStatusTimestamp;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected Person.Connections connections;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected String summary;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected Person.Positions positions;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected Person.Educations educations;
    @XmlElement(name = "member-url-resources", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected Person.MemberUrlResources memberUrlResources;
    @XmlElement(name = "api-standard-profile-request", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected Person.ApiStandardProfileRequest apiStandardProfileRequest;
    @XmlElement(name = "site-standard-profile-request", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected Person.SiteStandardProfileRequest siteStandardProfileRequest;
    @XmlElement(name = "picture-url", required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    protected String pictureUrl;

    /**
     * Gets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Person.Location }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public Person.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.Location }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setLocation(Person.Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public byte getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setDistance(byte value) {
        this.distance = value;
    }

    /**
     * Gets the value of the relationToViewer property.
     * 
     * @return
     *     possible object is
     *     {@link Person.RelationToViewer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public Person.RelationToViewer getRelationToViewer() {
        return relationToViewer;
    }

    /**
     * Sets the value of the relationToViewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.RelationToViewer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setRelationToViewer(Person.RelationToViewer value) {
        this.relationToViewer = value;
    }

    /**
     * Gets the value of the numRecommenders property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public byte getNumRecommenders() {
        return numRecommenders;
    }

    /**
     * Sets the value of the numRecommenders property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setNumRecommenders(byte value) {
        this.numRecommenders = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the currentStatusTimestamp property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public long getCurrentStatusTimestamp() {
        return currentStatusTimestamp;
    }

    /**
     * Sets the value of the currentStatusTimestamp property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setCurrentStatusTimestamp(long value) {
        this.currentStatusTimestamp = value;
    }

    /**
     * Gets the value of the connections property.
     * 
     * @return
     *     possible object is
     *     {@link Person.Connections }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public Person.Connections getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.Connections }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setConnections(Person.Connections value) {
        this.connections = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link Person.Positions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public Person.Positions getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.Positions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setPositions(Person.Positions value) {
        this.positions = value;
    }

    /**
     * Gets the value of the educations property.
     * 
     * @return
     *     possible object is
     *     {@link Person.Educations }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public Person.Educations getEducations() {
        return educations;
    }

    /**
     * Sets the value of the educations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.Educations }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setEducations(Person.Educations value) {
        this.educations = value;
    }

    /**
     * Gets the value of the memberUrlResources property.
     * 
     * @return
     *     possible object is
     *     {@link Person.MemberUrlResources }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public Person.MemberUrlResources getMemberUrlResources() {
        return memberUrlResources;
    }

    /**
     * Sets the value of the memberUrlResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.MemberUrlResources }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setMemberUrlResources(Person.MemberUrlResources value) {
        this.memberUrlResources = value;
    }

    /**
     * Gets the value of the apiStandardProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Person.ApiStandardProfileRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public Person.ApiStandardProfileRequest getApiStandardProfileRequest() {
        return apiStandardProfileRequest;
    }

    /**
     * Sets the value of the apiStandardProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.ApiStandardProfileRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setApiStandardProfileRequest(Person.ApiStandardProfileRequest value) {
        this.apiStandardProfileRequest = value;
    }

    /**
     * Gets the value of the siteStandardProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Person.SiteStandardProfileRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public Person.SiteStandardProfileRequest getSiteStandardProfileRequest() {
        return siteStandardProfileRequest;
    }

    /**
     * Sets the value of the siteStandardProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.SiteStandardProfileRequest }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setSiteStandardProfileRequest(Person.SiteStandardProfileRequest value) {
        this.siteStandardProfileRequest = value;
    }

    /**
     * Gets the value of the pictureUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * Sets the value of the pictureUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public void setPictureUrl(String value) {
        this.pictureUrl = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="headers">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="http-header" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "url",
        "headers"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public static class ApiStandardProfileRequest {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected String url;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected Person.ApiStandardProfileRequest.Headers headers;

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the headers property.
         * 
         * @return
         *     possible object is
         *     {@link Person.ApiStandardProfileRequest.Headers }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public Person.ApiStandardProfileRequest.Headers getHeaders() {
            return headers;
        }

        /**
         * Sets the value of the headers property.
         * 
         * @param value
         *     allowed object is
         *     {@link Person.ApiStandardProfileRequest.Headers }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setHeaders(Person.ApiStandardProfileRequest.Headers value) {
            this.headers = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="http-header" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "httpHeader"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public static class Headers {

            @XmlElement(name = "http-header")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected List<Person.ApiStandardProfileRequest.Headers.HttpHeader> httpHeader;

            /**
             * Gets the value of the httpHeader property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the httpHeader property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHttpHeader().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Person.ApiStandardProfileRequest.Headers.HttpHeader }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public List<Person.ApiStandardProfileRequest.Headers.HttpHeader> getHttpHeader() {
                if (httpHeader == null) {
                    httpHeader = new ArrayList<Person.ApiStandardProfileRequest.Headers.HttpHeader>();
                }
                return this.httpHeader;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "value"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public static class HttpHeader {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                protected String name;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                protected String value;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public void setValue(String value) {
                    this.value = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public static class Connections {

        @XmlValue
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected String value;
        @XmlAttribute
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected Byte total;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public Byte getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setTotal(Byte value) {
            this.total = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="education" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="school-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="start-date">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="end-date">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "education"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public static class Educations {

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected List<Person.Educations.Education> education;
        @XmlAttribute
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected Byte total;

        /**
         * Gets the value of the education property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the education property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEducation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Person.Educations.Education }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public List<Person.Educations.Education> getEducation() {
            if (education == null) {
                education = new ArrayList<Person.Educations.Education>();
            }
            return this.education;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public Byte getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setTotal(Byte value) {
            this.total = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="school-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="start-date">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="end-date">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "schoolName",
            "degree",
            "startDate",
            "endDate"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public static class Education {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected String id;
            @XmlElement(name = "school-name", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected String schoolName;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected String degree;
            @XmlElement(name = "start-date", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected Person.Educations.Education.StartDate startDate;
            @XmlElement(name = "end-date", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected Person.Educations.Education.EndDate endDate;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the schoolName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public String getSchoolName() {
                return schoolName;
            }

            /**
             * Sets the value of the schoolName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setSchoolName(String value) {
                this.schoolName = value;
            }

            /**
             * Gets the value of the degree property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public String getDegree() {
                return degree;
            }

            /**
             * Sets the value of the degree property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setDegree(String value) {
                this.degree = value;
            }

            /**
             * Gets the value of the startDate property.
             * 
             * @return
             *     possible object is
             *     {@link Person.Educations.Education.StartDate }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public Person.Educations.Education.StartDate getStartDate() {
                return startDate;
            }

            /**
             * Sets the value of the startDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link Person.Educations.Education.StartDate }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setStartDate(Person.Educations.Education.StartDate value) {
                this.startDate = value;
            }

            /**
             * Gets the value of the endDate property.
             * 
             * @return
             *     possible object is
             *     {@link Person.Educations.Education.EndDate }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public Person.Educations.Education.EndDate getEndDate() {
                return endDate;
            }

            /**
             * Sets the value of the endDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link Person.Educations.Education.EndDate }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setEndDate(Person.Educations.Education.EndDate value) {
                this.endDate = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "year"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public static class EndDate {

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                protected short year;

                /**
                 * Gets the value of the year property.
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public short getYear() {
                    return year;
                }

                /**
                 * Sets the value of the year property.
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public void setYear(short value) {
                    this.year = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "year"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public static class StartDate {

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                protected short year;

                /**
                 * Gets the value of the year property.
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public short getYear() {
                    return year;
                }

                /**
                 * Sets the value of the year property.
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public void setYear(short value) {
                    this.year = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="country">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "country"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public static class Location {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected String name;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected Person.Location.Country country;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link Person.Location.Country }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public Person.Location.Country getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link Person.Location.Country }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setCountry(Person.Location.Country value) {
            this.country = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public static class Country {

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected short code;

            /**
             * Gets the value of the code property.
             * 
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public short getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setCode(short value) {
                this.code = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="member-url" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "memberUrl"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public static class MemberUrlResources {

        @XmlElement(name = "member-url")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected List<Person.MemberUrlResources.MemberUrl> memberUrl;

        /**
         * Gets the value of the memberUrl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberUrl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberUrl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Person.MemberUrlResources.MemberUrl }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public List<Person.MemberUrlResources.MemberUrl> getMemberUrl() {
            if (memberUrl == null) {
                memberUrl = new ArrayList<Person.MemberUrlResources.MemberUrl>();
            }
            return this.memberUrl;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "url",
            "name"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public static class MemberUrl {

            @XmlElement(required = true)
            @XmlSchemaType(name = "anyURI")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected String url;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected String name;

            /**
             * Gets the value of the url property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public String getUrl() {
                return url;
            }

            /**
             * Sets the value of the url property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setUrl(String value) {
                this.url = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setName(String value) {
                this.name = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="position" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="start-date">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                             &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="is-current" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="company">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "position"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public static class Positions {

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected List<Person.Positions.Position> position;
        @XmlAttribute
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected Byte total;

        /**
         * Gets the value of the position property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the position property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Person.Positions.Position }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public List<Person.Positions.Position> getPosition() {
            if (position == null) {
                position = new ArrayList<Person.Positions.Position>();
            }
            return this.position;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public Byte getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setTotal(Byte value) {
            this.total = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="start-date">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *                   &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="is-current" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="company">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "title",
            "summary",
            "startDate",
            "isCurrent",
            "company"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public static class Position {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected String id;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected String title;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected String summary;
            @XmlElement(name = "start-date", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected Person.Positions.Position.StartDate startDate;
            @XmlElement(name = "is-current", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected String isCurrent;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            protected Person.Positions.Position.Company company;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the summary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public String getSummary() {
                return summary;
            }

            /**
             * Sets the value of the summary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setSummary(String value) {
                this.summary = value;
            }

            /**
             * Gets the value of the startDate property.
             * 
             * @return
             *     possible object is
             *     {@link Person.Positions.Position.StartDate }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public Person.Positions.Position.StartDate getStartDate() {
                return startDate;
            }

            /**
             * Sets the value of the startDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link Person.Positions.Position.StartDate }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setStartDate(Person.Positions.Position.StartDate value) {
                this.startDate = value;
            }

            /**
             * Gets the value of the isCurrent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public String getIsCurrent() {
                return isCurrent;
            }

            /**
             * Sets the value of the isCurrent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setIsCurrent(String value) {
                this.isCurrent = value;
            }

            /**
             * Gets the value of the company property.
             * 
             * @return
             *     possible object is
             *     {@link Person.Positions.Position.Company }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public Person.Positions.Position.Company getCompany() {
                return company;
            }

            /**
             * Sets the value of the company property.
             * 
             * @param value
             *     allowed object is
             *     {@link Person.Positions.Position.Company }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public void setCompany(Person.Positions.Position.Company value) {
                this.company = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public static class Company {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                protected String name;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/>
             *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "year",
                "month"
            })
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
            public static class StartDate {

                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                protected short year;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                protected String month;

                /**
                 * Gets the value of the year property.
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public short getYear() {
                    return year;
                }

                /**
                 * Sets the value of the year property.
                 * 
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public void setYear(short value) {
                    this.year = value;
                }

                /**
                 * Gets the value of the month property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public String getMonth() {
                    return month;
                }

                /**
                 * Sets the value of the month property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
                public void setMonth(String value) {
                    this.month = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "distance"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public static class RelationToViewer {

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected byte distance;

        /**
         * Gets the value of the distance property.
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public byte getDistance() {
            return distance;
        }

        /**
         * Sets the value of the distance property.
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setDistance(byte value) {
            this.distance = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "url"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
    public static class SiteStandardProfileRequest {

        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        protected String url;

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-20T03:32:06+08:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-520")
        public void setUrl(String value) {
            this.url = value;
        }

    }

}
