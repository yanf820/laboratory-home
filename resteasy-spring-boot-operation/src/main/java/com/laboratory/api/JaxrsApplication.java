package com.laboratory.api;

import com.laboratory.filters.BeepFilter;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yf on 2017/1/13.
 */
@Component
@ImportResource("classpath:dubbo-consumer.xml")
@ApplicationPath("/laboratory/")
public class JaxrsApplication extends Application {

}
