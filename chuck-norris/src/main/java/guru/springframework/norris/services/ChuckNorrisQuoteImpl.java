package guru.springframework.norris.services;

public class ChuckNorrisQuoteImpl implements ChuckNorrisQuote {
    @Override
    public String getRandomQuote() {
        return guru.springframework.norris.chuck.ChuckNorrisQuotes.getRandomQuote();
    }
}
