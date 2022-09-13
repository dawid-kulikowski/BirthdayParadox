package application;

public class app {
    public static void main(String[] args) {
        System.out.println("Birthday Paradox");
        Birthday birthday = new Birthday();
        for(int i=0; i<100; i++){
            birthday.checkBirthdayTrials(98,10000);
        }
    }
}
