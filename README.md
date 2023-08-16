## Requirements ##

- Java 17

## Dependency ##

Maven

    <dependency>
        <groupId>org.makechtec</groupId>
        <artifactId>path_generator</artifactId>
        <version>2.0.4</version>
    </dependency>

Gradle

    implementation 'org.makechtec:path_generator:2.0.4'

## Usage ##

    PathGenerator pathGenerator = new PathGenerator();

    String resourceDir = pathGenerator.resourcePath(PathGeneratorTest.class, "test.txt");

    String userDir = pathGenerator.userDir();


## History changes ##

2.0.0 same as 1.2.0 but upgrade to gradle 8.2.1

1.2.0 latest previous version stable release