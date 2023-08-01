package EndGame.teamPJ.controller;

import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MainController {

    @GetMapping("/main")
    public String mainpage(Model model) {
        model.addAttribute("ProductName", "s");
        return "Section1";

    }


}
