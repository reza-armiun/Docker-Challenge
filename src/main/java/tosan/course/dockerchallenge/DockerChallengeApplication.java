package tosan.course.dockerchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.Scanner;

@SpringBootApplication
public class DockerChallengeApplication {

      public static void main(String[] args) {
        String portNumber;
        portNumber = System.getenv("PORT_NUM");
        if(portNumber == null) {
            System.out.println("Please enter port number:");
            var scanner = new Scanner(System.in);
            portNumber = scanner.nextLine();
        }
        var app = new SpringApplication(DockerChallengeApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", portNumber != null ? portNumber : "8080"));
        app.run(args);
      }
}
