package org.hippoproject.framework.marvin.foundation.message;

/**
 */
public interface IMessageProducer {

    public void setSerializer(IMessageSerializer serializer);

    public void send(MessageTopic topic, Object ... messages) throws Exception;

}
