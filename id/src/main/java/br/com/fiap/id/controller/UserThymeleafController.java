package br.com.fiap.id.controller;

import br.com.fiap.id.dto.UserDTO;
import br.com.fiap.id.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserThymeleafController {

    @Autowired
    private UserService userService;

    @GetMapping("/new")
    public String showUserForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "user-form"; // Nome do template Thymeleaf
    }

    @PostMapping
    public String saveUser(UserDTO userDTO) {
        userService.createUser(userDTO);
        return "redirect:/users"; // Redireciona após salvar
    }
}
