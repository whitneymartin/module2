import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class wordoccurrence {

		
		public void testCountWords() {
			wordOccurrence test = new wordOccurrence();
			HashMap<String, Integer> word_count = test.countWords("/Users/whitneymartin/Desktop/School/Play.txt");

			assertEquals(5, word_count.get("harm").intValue());
			assertEquals(731, word_count.get("the").intValue());

			System.out.println("Reading file... \n");

			  
			BufferedReader br = new BufferedReader(new FileReader(file));

			String line;

			Map<String, Long> counts = new HashMap<>();

			while ((line = br.readLine()) != null) {

			String[] words = line.split("[\\s.;,?':!-()\"]+");

			for (String word : words) {

			word = word.trim();

			if (word.length() > 0) {

			if (counts.containsKey(word)) {

			counts.put(word, counts.get(word) + 1);

			} else {

			counts.put(word, 1L);

			}

			}

			}

			}

			for (Map.Entry<String, Long> entry : counts.entrySet()) {

			System.out.println(entry.getKey() + ": " + entry.getValue());

			  

			}

			br.close();

			}

			
	}




