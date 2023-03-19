package org.makechtec.path_generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class PathGeneratorTest {

    private PathGenerator pathGenerator;
    @BeforeEach
    void setUp() {
        pathGenerator = new PathGenerator();
    }

    @Test
    void jarPath() throws URISyntaxException {
        assertNotNull(pathGenerator.jarPath(PathGeneratorTest.class));
    }

    @Test
    void resourcePath() {
        assertNotNull(pathGenerator.resourcePath(PathGeneratorTest.class, "test.txt"));
    }
}