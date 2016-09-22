# java_playground
java playground project
(The commmit seems to have been one step to high, may cause funny effects when checking out...)

A basic java Project for ecplise (maven build) with a very simple startup setup, containing:

src/main/java/cl/canelodigital/playground/dto/SampleDTO.java                < Overwrites for toString, haschcode, equals
src/main/java/cl/canelodigital/playground/patterns/singleton/Singleton.java < Simple Singleton Class
src/main/java/cl/canelodigital/playground/resources                         < 
src/main/java/cl/canelodigital/playground/SampleClassMain                   < A Sample Class with main method

src/main/resources/log4j2.xml                                               < log4j 2 Config File with Console & RollingFile Appender

src/test/java/cl/canelodigital/playground/TestAll.java                      < A TestSuite
src/test/java/cl/canelodigital/playground/TestRunner.java                   < TestRunner (main method) for TestSuite
src/test/java/cl/canelodigital/playground/TestSampleClassMain.java          < Test Class For SampleClassMain
src/test/java/cl/canelodigital/playground/TestSingleton.java                < Tests For Singleton Class

pom.xml             < MAVEN POM
