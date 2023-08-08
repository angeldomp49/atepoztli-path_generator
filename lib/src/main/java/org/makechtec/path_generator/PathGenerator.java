package org.makechtec.path_generator;

import java.net.URISyntaxException;
import java.util.logging.Logger;

public class PathGenerator {

    private static final Logger LOG = Logger.getLogger(PathGenerator.class.getName());

    public String jarPath(Class<?> mainClass) throws URISyntaxException {
        return mainClass
                .getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .toURI()
                .getPath();
    }

    public String resourcePath(Class<?> mainClass, String resource) {

        var urlResource =
                mainClass.getClassLoader()
                    .getResource(resource);

        if(urlResource == null) {
            LOG.warning("Could not find resource in PathGenerator.resourcePath(Class<?> mainClass, String resource)");
            return "";
        }

        return urlResource.getPath();
    }

    public String userDir(){
        return System.getProperty("user.dir");
    }

}
