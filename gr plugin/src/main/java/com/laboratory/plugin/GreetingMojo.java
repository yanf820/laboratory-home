package com.laboratory.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Created by yf on 2016/10/11.
 */
@Mojo(name="sayhi")
public class GreetingMojo extends AbstractMojo{

    @Parameter(defaultValue = "8080")
    private Integer port;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().error("Hello, world!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+"----"+port);
    }
}
