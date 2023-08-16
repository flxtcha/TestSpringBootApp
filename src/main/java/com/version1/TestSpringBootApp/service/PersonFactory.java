package com.version1.TestSpringBootApp.service;

import org.springframework.stereotype.Service;

@Service
public class PersonFactory {

    private final PrintDetailsPersonService printDetailsPersonService;
    private final SaveToDBPersonService saveToDBPersonService;
    private final DeletePersonService deletePersonService;

    public PersonFactory(PrintDetailsPersonService printDetailsPersonService, SaveToDBPersonService saveToDBPersonService, DeletePersonService deletePersonService) {
        this.printDetailsPersonService = printDetailsPersonService;
        this.saveToDBPersonService = saveToDBPersonService;
        this.deletePersonService = deletePersonService;
    }

    public PersonService returnService(String handleCode) {

        switch(handleCode){
            case "db":
                return saveToDBPersonService;
            case "delete":
                return deletePersonService;
            default:
                return printDetailsPersonService;
        }
    }
}
