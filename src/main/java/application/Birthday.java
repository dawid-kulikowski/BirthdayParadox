package application;

import java.util.*;

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

    public void checkDaysOfYear(int numberOfPeople, int numberOfTrials){
       final Set<Integer> ALL_DAYS =  new HashSet<>();
       for (int i=1;i<NUMBER_OF_DAYS;i++){
           ALL_DAYS.add(i);
           i++;
       }

        for(int i=0; i<numberOfTrials; i++){
            ArrayList<Integer> listOfBirthdays = getRandomBirthdays(numberOfPeople);
            if(listOfBirthdays.containsAll(ALL_DAYS)){
                System.out.println("All of the birthdays are taken. People needed to fill all birthday: " + listOfBirthdays.size());
            }
        }

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
