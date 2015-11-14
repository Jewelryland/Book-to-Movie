# Book-to-Movie

Designed by Mary Moser and Isaac Vawter

Initial install instructions:  
    -Install Java JDK 1.8 using the following link:  
        http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html  
    -Install Maven by following the instructions at:   
        https://maven.apache.org/install.html  
        
Build instructions for the web interface:  
    Run the following CLI instructions in the WebInterface directory:  
        mvn clean  
        mvn install  
        mvn compile  
        mvn package  

Running instructions:  
    Run the following CLI instructions in the WebInterface\target directory:  
        java -jar book-to-movie-0.1.0.jar  
        
    Run the NeuralNet java class in an IDE of your choice!
