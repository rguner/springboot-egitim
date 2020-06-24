package com.example.zemberek;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import zemberek.morphology.TurkishMorphology;
import zemberek.normalization.TurkishSpellChecker;
import zemberek.core.logging.Log;

import java.io.IOException;
import java.util.Arrays;

@SpringBootApplication
public class ZemberekApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZemberekApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Uygulama basladı.....:");
		};
	}

	@Bean
	public void basicWordSpellingCheckAndSuggestion() throws IOException {
		TurkishMorphology morphology = TurkishMorphology.createWithDefaults();
		TurkishSpellChecker spellChecker = new TurkishSpellChecker(morphology);

		Log.info("Check if written correctly.");
		String[] words = {"Ankara'ya", "Ankar'aya", "yapbileceksen", "yapabileceğinizden", "yazamıyorum"};
		for (String word : words) {
			Log.info(word + " -> " + spellChecker.check(word));
		}
		Log.info();
		Log.info("Give suggestions.");
		String[] toSuggest = {"Kraamanda", "okumuştk", "yapbileceksen", "oukyamıyorum", "yazamıyorum"};
		for (String s : toSuggest) {
			Log.info(s + " -> " + spellChecker.suggestForWord(s));
		}
	}

}
