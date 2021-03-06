package edu.cnm.deepdive.dicewareservice;

import edu.cnm.deepdive.cryptopgraphy.BundleSource;
import edu.cnm.deepdive.cryptopgraphy.WordSource;
import java.security.SecureRandom;
import java.util.Random;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DicewareConfiguration {

  @Bean
  public Random rng() {
    return new SecureRandom();
  }

  @Bean
  public WordSource source() {
    return new BundleSource("wordlist");
  }
}
