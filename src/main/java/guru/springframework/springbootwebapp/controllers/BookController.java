package guru.springframework.springbootwebapp.controllers;

import guru.springframework.springbootwebapp.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books",bookRepository.findAll());

        return "books";
    }

}
