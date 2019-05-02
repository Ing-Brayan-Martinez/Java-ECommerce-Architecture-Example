
package com.example.aplication.person;

import com.example.aplication.CommandHandleInterface;
import com.example.domain.person.Person;
import com.example.infraestructure.database.person.PersonFactory;
import com.example.infraestructure.database.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UpdatePersonCommandHandle implements CommandHandleInterface<PersonCommand> {

    @Autowired
    private PersonFactory factory;

    @Autowired
    private PersonRepository repository;


    @Override
    public void handle(PersonCommand command) {

        final Person temp = this.factory.toPerson(command);

        this.repository.update(temp);
    }
}