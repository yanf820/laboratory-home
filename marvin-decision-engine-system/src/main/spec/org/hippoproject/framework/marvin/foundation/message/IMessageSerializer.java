package org.hippoproject.framework.marvin.foundation.message;

import java.io.IOException;

/**
 */
public interface IMessageSerializer {

    public byte[] serialize(Object message) throws IOException;

    public <T> T deserialize(byte[] messageBytes, Class<T> messageType) throws IOException;

}
