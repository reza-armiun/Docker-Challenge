package tosan.course.dockerchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class DockerChallengeApplication {

      public static void main(String[] args) {
        String portNumber;
        portNumber = System.getenv("PORT_NUM");
        var app = new SpringApplication(DockerChallengeApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", portNumber != null ? portNumber : "8080"));
        app.run(args);
      }

}

