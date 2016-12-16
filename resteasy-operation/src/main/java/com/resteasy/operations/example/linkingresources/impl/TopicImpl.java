package com.resteasy.operations.example.linkingresources.impl;

import com.linkedin.api.model.Follow;
import com.linkedin.api.model.Topic;
import com.linkedin.api.model.Topics;
import com.linkedin.api.resource.TopicsResource;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;

/**
 * Created by yf on 2016/12/12.
 */
public class TopicImpl implements TopicsResource {

    public GetTopicsByFieldSelectorsResponse getTopicsByFieldSelectors(String fieldSelectors, String sign) throws Exception {
        System.out.println();
        System.out.println("get");
        return null;
    }

    public PostTopicsByFieldSelectorsResponse postTopicsByFieldSelectors(String fieldSelectors, Topic entity) throws Exception {

        System.out.println("post");
        return null;
    }

    public GetTopicsByTopicIdResponse getTopicsByTopicId(@NotNull String topicId, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign) throws Exception {
        return null;
    }

    public PutTopicsByTopicIdResponse putTopicsByTopicId(@NotNull String topicId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-modified-since") @Min(0L) Integer xLaModifiedSince, @HeaderParam("x-la-modified") XLaModified xLaModified, @HeaderParam("x-la-format") XLaFormat xLaFormat, Topic entity) throws Exception {
        return null;
    }

    public PatchTopicsByTopicIdResponse patchTopicsByTopicId(@NotNull String topicId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-modified-since") @Min(0L) Integer xLaModifiedSince, @HeaderParam("x-la-modified") XLaModified xLaModified, @HeaderParam("x-la-format") XLaFormat xLaFormat, Topic entity) throws Exception {
        return null;
    }

    public GetTopicsByTopicIdPostsByFieldSelectorsResponse getTopicsByTopicIdPostsByFieldSelectors(String fieldSelectors, @NotNull String topicId, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, @DefaultValue("10") int count, @DefaultValue("0") int start, String sign) throws Exception {
        return null;
    }

    public PostTopicsByTopicIdFollowResponse postTopicsByTopicIdFollow(@NotNull String topicId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, Follow entity) throws Exception {
        return null;
    }
}
