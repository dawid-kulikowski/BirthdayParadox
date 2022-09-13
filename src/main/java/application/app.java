package application;

public class app {
    public static void main(String[] args) {
        System.out.println("Birthday Paradox");
        Birthday birthday = new Birthday();
        for(int i=0; i<10; i++){
            birthday.checkBirthdayTrials(100,10);
            birthday.checkDaysOfYear(1000,100000);

        }
    }
}
