package com.mesnu.app.controller;

import com.mesnu.app.factory.Pet;
import com.mesnu.app.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



    @RestController
    @RequestMapping("/")
    public class AppController {

        @Autowired
        private PetFactory petFactory;

        @GetMapping
        public String getDefault() {
            return "{\"message\": \"Hello World\"}";
        }

        @PostMapping("adoptPet/{type}/{name}")
        public Pet adoptPet(@PathVariable String type, @PathVariable String name) {
            Pet pet = this.petFactory.createPet(type);
            pet.setName(name);
            pet.feed();
            return pet;
        }

}