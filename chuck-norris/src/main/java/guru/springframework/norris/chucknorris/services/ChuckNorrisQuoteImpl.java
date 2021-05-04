package guru.springframework.norris.chucknorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteImpl implements ChuckNorrisQuote {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuoteImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
