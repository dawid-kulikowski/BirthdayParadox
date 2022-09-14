package application;

public class app {
    public static void main(String[] args) {
        System.out.println("Birthday Paradox");
        Birthday birthday = new Birthday();
        for(int i=0; i<10; i++){
            birthday.checkBirthdayTrials(99,10000);
            birthday.checkDaysOfYear(900,100000);

        }
    }
}
