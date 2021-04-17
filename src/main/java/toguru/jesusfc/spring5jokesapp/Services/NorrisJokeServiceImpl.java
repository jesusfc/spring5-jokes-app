package toguru.jesusfc.spring5jokesapp.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created By Jesús Fdez. Caraballo on 14/04/2021.
 */
@Service
public class NorrisJokeServiceImpl implements NorrisJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public NorrisJokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getNorrisJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
