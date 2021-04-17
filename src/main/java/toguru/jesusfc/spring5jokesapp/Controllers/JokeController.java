package toguru.jesusfc.spring5jokesapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import toguru.jesusfc.spring5jokesapp.Services.NorrisJokeServiceImpl;

/**
 * Created By Jesús Fdez. Caraballo on 14/04/2021.
 */
@Controller
public class JokeController {

    private final NorrisJokeServiceImpl norrisJokeService;

    public JokeController(NorrisJokeServiceImpl norrisJokeService) {
        this.norrisJokeService = norrisJokeService;
    }

    @RequestMapping(value = {"/","", "index.html"}, method = RequestMethod.GET)
    public String getJokeView(Model model) {
        model.addAttribute("randomQuote", norrisJokeService.getNorrisJoke());
        return "norrisJokes/index";
    }


}
