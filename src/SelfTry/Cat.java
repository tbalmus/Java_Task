package SelfTry;

public class Cat extends Feline {

    private boolean purr;

    public Cat ( int numberOfLimbs , boolean isAware , int averageLiveYears , String sounds , int tailLenght , boolean meows , String popularName , boolean wearsClothes ) {
    this(numberOfLimbs, isAware, averageLiveYears, sounds, tailLenght, meows, popularName, wearsClothes, false);
    }

    public Cat ( int numberOfLimbs , boolean isAware , int averageLiveYears , String sounds , int tailLenght , boolean meows , String popularName , boolean wearsClothes, boolean purr ) {
        super ( numberOfLimbs , isAware , averageLiveYears , sounds , tailLenght , meows , popularName , wearsClothes );
        this.purr = purr;
    }

    public void catCanPurr (){
    }
}
