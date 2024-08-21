package in.ashokit.rest;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.UserAccount;

@Controller
public class UserAccountController {

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new UserAccount()); // Ensure the model contains the 'user' object
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute User user, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        // Process the form (e.g., save user)
        return "success";
    }
}

/*
 * import org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping;
 * 
 * import in.ashokit.entity.UserAccount;
 * 
 * public class UserAccountController {
 * 
 * @GetMapping("/") public String index(Model model) {
 * 
 * model.addAttribute("user",new UserAccount());
 * 
 * return "index";
 * 
 * }
 * 
 * }
 */
