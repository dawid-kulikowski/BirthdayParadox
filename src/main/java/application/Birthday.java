package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Birthday {
    private Random random = new Random();
    private final int NUMBER_OF_DAYS = 365;

    public void checkBirthdayTrials(int numberOfPeople, int numberOfTrials) {
        int sameBirthdayCases = 0;

        for (int i = 0; i < numberOfTrials; i++) {
            ArrayList<Integer> listOfBirthdays = getRandomBirthdays(numberOfPeople);
            if (foundDuplicateBirthday(listOfBirthdays)) {
                sameBirthdayCases++;
            }
        }
       printBirthdayStatistics(sameBirthdayCases,numberOfTrials);
    }

 ArrayList<Integer> getRandomBirthdays(int numberOfPeople) {
     ArrayList<Integer> birthdays = new ArrayList<>();
     for (int i = 0; i < numberOfPeople; i++) {
         birthdays.add(random.nextInt(NUMBER_OF_DAYS) + 1);
     }
     return birthdays;
 }

   boolean foundDuplicateBirthday(ArrayList<Integer> listOfBirthdays) {
       return !listOfBirthdays.stream().allMatch(new HashSet<>()::add);
        }

        private void printBirthdayStatistics(int sameBirthdayCases, int numberOfTrials) {
            System.out.println("% of times matching birthdays " + numberOfTrials + " trials: "+ (sameBirthdayCases * 100.0f) / numberOfTrials + "%" );
        }
    }
