package com.laboratory.api;

import com.laboratory.filters.BeepFilter;
import org.springframework.stereotype.Component;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yf on 2017/1/13.
 */
@Component
@ApplicationPath("/laboratory/")
public class JaxrsApplication extends Application {
}
