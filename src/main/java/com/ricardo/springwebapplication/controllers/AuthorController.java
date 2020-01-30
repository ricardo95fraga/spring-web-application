package com.ricardo.springwebapplication.controllers;

import com.ricardo.springwebapplication.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    Datys 5 >>> Ricardo Alberto Fraga   30/01/2020
*/
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/author")
    public String getAuthor(Model model){
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
