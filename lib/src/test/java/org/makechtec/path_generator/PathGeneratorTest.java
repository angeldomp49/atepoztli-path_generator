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
    void testJarPath() throws URISyntaxException {
        assertNotNull(pathGenerator.jarPath(PathGeneratorTest.class));
    }

    @Test
    void testResourcePath() {
        assertNotNull(pathGenerator.resourcePath(PathGeneratorTest.class, "test.txt"));
    }

    @Test
    void testUserDir() {
        assertNotNull(pathGenerator.userDir());
    }
}