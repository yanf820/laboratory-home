package com.resteasy.operations.example.linkingresources.entity;

import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;
import org.jboss.resteasy.links.RESTServiceDiscovery;

import javax.xml.bind.annotation.*;

/**
 * Created by yf on 2016/9/20.
 */
@Mapped(namespaceMap = @XmlNsMap(jsonName = "atom",namespace = "http://www.w3.org/2005/Atom"))
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Book {
    @XmlAttribute
    private String author;

    @XmlID
    @XmlAttribute
    private String title;

    @XmlElementRef
    private RESTServiceDiscovery rest;

}
