package com.example.progreseauexemplecomplet;

//Principe de base
//PersonPersistAdapter implémente interface du noyau getAllPerson() normalement
//JDBC ? Sprint Data JPA (mieux ?)
//ORM = OBject R(table ??) Mapping  ====> Couche d'abstraction
// ==> Devoir créer une entité JPA Persistence (ne pas transformer entité noyau !!! ATTENTION)

//PersonEntityJPA : @Table avec colonne aux noms des attributs
//Interface PersonRepository hérite (extends) d'une autre interface JPA Repository (déjà existante) -> récupère méthode de base SELECT et autre
//méthode JPARepository<PersonEntityJPA, long>

//PersonPersistAdapter instancie un JPARepository pour avoir un objet avec ses méthodes

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//BDD connexion : à écrire dans test/ressources/application.properties (H2 BDD en mémoire avant, mais on va utiliser Docker comme conteneur Postgres) lib TestContener
//Créer table et insérer données ? Dans la classe Test, @SQL(nom script sql)
// exemple : (test/ressources/creationTable.sql ou insertDatas)
@RequiredArgsConstructor
public class PersonPersistAdapter implements AllPersonUseCase
{
    private final PersonRepository personRepository;

    @Override
    public Map<String, Object> getPersons()
    {
        List<PersonJpaEntity> personJpaList = personRepository.findAll();
        //mapping
        List<Person> personList = new ArrayList<>();
        Map<String, Object> mapPers = new HashMap<>();

        for(PersonJpaEntity pers: personJpaList)
        {
            personList.add(new Person(pers.getIdPerson(), pers.getFirstName(), pers.getLastName(), pers.getAge()));
        }

        //manque un truc return
    }
}
