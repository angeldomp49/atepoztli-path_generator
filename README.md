## Requirements ##

- Java 8+

## Dependency ##

Maven

    <dependency>
        <groupId>org.makechtec</groupId>
        <artifactId>path_generator</artifactId>
        <version>1.2.0</version>
    </dependency>

Gradle

    implementation 'org.makechtec:path_generator:1.2.0'

## Usage ##

    PathGenerator pathGenerator = new PathGenerator();

    String resourceDir = pathGenerator.resourcePath(PathGeneratorTest.class, "test.txt");

    String userDir = pathGenerator.userDir();