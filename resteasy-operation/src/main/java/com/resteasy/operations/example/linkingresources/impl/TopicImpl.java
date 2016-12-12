package com.resteasy.operations.example.linkingresources.impl;

import com.linkedin.api.model.Funs;
import com.linkedin.api.model.Topic;
import com.linkedin.api.resource.TopicsResource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;

/**
 * Created by yf on 2016/12/12.
 */
public class TopicImpl implements TopicsResource {
    public PostTopicsByFieldSelectorsByGroupIdResponse postTopicsByFieldSelectorsByGroupId(@NotNull String groupId, @NotNull String fieldSelectors, Topic entity) throws Exception {
        return null;
    }

    public GetTopicsByFieldSelectorsByGroupIdResponse getTopicsByFieldSelectorsByGroupId(@NotNull String groupId, @NotNull String fieldSelectors, @DefaultValue("10") int count, Integer start, String membershipState, Funs entity) throws Exception {
        int i=0;
        return null;
    }

    public GetTopicsByFieldSelectorsByGroupIdByTopicIdResponse getTopicsByFieldSelectorsByGroupIdByTopicId(@NotNull int topicId, @NotNull String groupId, @NotNull String fieldSelectors, @HeaderParam("x-la-format") XLaFormat xLaFormat) throws Exception {
        return null;
    }
}
