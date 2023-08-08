## Requirements ##

- Java 17

## Dependency ##

Maven

    <dependency>
        <groupId>org.makechtec</groupId>
        <artifactId>path_generator</artifactId>
        <version>2.0.3</version>
    </dependency>

Gradle

    implementation 'org.makechtec:path_generator:2.0.3'

## Usage ##

    PathGenerator pathGenerator = new PathGenerator();

    String resourceDir = pathGenerator.resourcePath(PathGeneratorTest.class, "test.txt");

    String userDir = pathGenerator.userDir();