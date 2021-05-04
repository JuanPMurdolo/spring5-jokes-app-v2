package guru.springframework.norris.chucknorris.services;

import org.springframework.stereotype.Service;

@Service
public interface ChuckNorrisQuote {

    String getJoke();
}

