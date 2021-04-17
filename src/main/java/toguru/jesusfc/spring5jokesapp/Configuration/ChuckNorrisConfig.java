package toguru.jesusfc.spring5jokesapp.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
@Configuration
public class ChuckNorrisConfig {

    @Bean
    public ChuckNorrisInfoContributor chuckNorrisInfoContributor(){
        return new ChuckNorrisInfoContributor();
    }
}
