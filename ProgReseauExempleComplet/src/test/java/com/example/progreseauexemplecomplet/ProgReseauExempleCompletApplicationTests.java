package com.example.progreseauexemplecomplet;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProgReseauExempleCompletApplicationTests
{
    @LocalServerPort
    private int port;
    @Test
    public void getPersons()
    {
        baseURI = "http://localhost:8080";
        given().
                port(port).
                get("/persons").
        then().
                statusCode(200).
                log().all();
    }
}