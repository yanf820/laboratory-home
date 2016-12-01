package org.hippoproject.framework.marvin.foundation.message;

import java.util.List;

/**
 */
public interface IMessageConsumer {

    public void setSerializer(IMessageSerializer serializer);

    public <T> List<T> receive(MessageTopic topic, Class<T> messageType, int size) throws Exception;

}
