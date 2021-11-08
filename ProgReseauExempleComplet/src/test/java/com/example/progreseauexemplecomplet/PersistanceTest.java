package com.example.progreseauexemplecomplet;


//Framework JUnit 5
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Testcontainers


public class PersistanceTest
{

    @ClassRule
    @Container
    public static PostgreSQLContainer conteneur = (PostgreSQLContainer);

    @Test
    @Sql({"createTable.sql", "PersonPersistenceAdapterTest.sql"})
    public void getPersons()
    {
        conteneur.start();

        map = personParsistenceAdapter
        //Retourner Ash Map pour vérifier qu'on obtient bien les bonnes valeurs
        assertEquals("tobi", "xx");
        assertEquals("toba", "ss");
    }
}
