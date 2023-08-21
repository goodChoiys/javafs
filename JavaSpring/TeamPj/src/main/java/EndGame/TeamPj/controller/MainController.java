package EndGame.TeamPj.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final CarService carService;
    @GetMapping(value = "/")
    public String main(CarSearchDto carSearchDto, Optional<Integer> page , Model model) {
        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 6);
        Page<MainCarDto> cars = carService.getMainCarPage(carSearchDto, pageable);

        model.addAttribute("cars", cars);
        model.addAttribute("carSearchDto", carSearchDto);
        model.addAttribute("maxPage", 5);

        return "main";
    }


}
