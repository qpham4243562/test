package Lab03.Quanlysach.controller;

import Lab03.Quanlysach.model.Book;
import org.springframework.beans.factory.annotation. Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation. RequestMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private List<Book> listBook;

    @GetMapping("/")
    public String showAllBooks(Model model) {
        model.addAttribute("ListBook", listBook);
        model.addAttribute("title", "Danh sách cuốn sách");
        return "book/list";
    }
}