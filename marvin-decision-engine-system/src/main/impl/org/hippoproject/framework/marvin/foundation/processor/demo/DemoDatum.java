package org.hippoproject.framework.marvin.foundation.processor.demo;

import java.util.Date;

import org.hippoproject.framework.marvin.foundation.uuid.UUIDGenerator;

/**
 */
public class DemoDatum {
    private String uuid;
    private Date time;

    public DemoDatum() {
        this.uuid = UUIDGenerator.randomUUID();
        this.time = new Date();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DemoDatum{");
        sb.append("uuid='").append(uuid).append('\'');
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }
}
