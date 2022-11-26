package com.mesnu.app.controller;

import com.mesnu.app.builder.Contact;
import com.mesnu.app.builder.ContactBuilder;
import com.mesnu.app.factory.Pet;
import com.mesnu.app.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
    @RequestMapping("/")
    public class AppController {

        @Autowired
        private PetFactory petFactory;

        @GetMapping
        public String getDefault() {
            return "{\"message\": \"Hello World\"}";
        }

        // Factory Pattern
        @PostMapping("adoptPet/{type}/{name}")
        public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
            Pet pet = this.petFactory.createPet(type);
            pet.setName(name);
            pet.feed();
            return pet;
        }

        // Builder Pattern
        @GetMapping("presidents")
        public List<Contact> getPresidents(){

            List<Contact> contacts = new ArrayList<>();

            // 1. withoud all args constructor

            Contact contact = new Contact();
            contact.setFirstName("George");
            contact.setLastName("Washington");

            contacts.add(contact);

            // 2. with all args constructor - if more fields more complicated.

            contacts.add(new Contact("John", "Adams", null));

            //3. using builder

            contacts.add(new ContactBuilder()
                    .setFirstName("Thomas")
                    .setLastName("Jefferson")
                    .buildContact());

            return contacts;
        }

}