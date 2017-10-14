package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeModel {
    private List<String> jokes = new ArrayList<>();
    private Random random;

    public JokeModel() {
        jokes.add("One day teacher asked Sam that did his father help him with his homework. Sam simply said that “No, he did it all by himself”! ");
        jokes.add("Q: How many prolog programmers does it take to change a lightbulb? A: Yes.");
        jokes.add("Why do Java developers wear glasses? Because they can't C#");
        random = new Random();
    }

    public List<String> getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes.get(random.nextInt(jokes.size()));
    }
}
