package SelfTry;

public class Feline implements Mammal {

    int numberOfLimbs;
    final int numberOfEars = 2;
    boolean isAware;
    int averageLiveYears;
    String sounds;
    String popularName;
    boolean wearsClothes;

    protected int tailLenght;
    protected boolean meows;

    public Feline ( int numberOfLimbs, boolean isAware , int averageLiveYears , String sounds , int tailLenght , boolean meows , String popularName, boolean wearsClothes) {
        this.numberOfLimbs = numberOfLimbs;
        this.isAware = isAware;
        this.averageLiveYears = averageLiveYears;
        this.sounds = sounds;
        this.tailLenght = tailLenght;
        this.meows = meows;
        this.popularName = popularName;
        this.wearsClothes = wearsClothes;
    }


    @Override
    public int getNumberOfLimbs () {
        return this.numberOfLimbs;
    }

    @Override
    public int getNumberOfEars () {
        return this.numberOfEars;
    }

    @Override
    public boolean isAware () {
        return false;
    }

    @Override
    public int getAverageLiveYears () {
        return this.averageLiveYears;
    }

    @Override
    public String getSound () {
        return this.sounds;
    }

    @Override
    public boolean wearsClothes () {
        return this.wearsClothes;
    }

    @Override
    public String getPopularName () {
        return this.popularName;
    }

    public void setNumberOfLimbs ( int numberOfLimbs ) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public void setAware ( boolean aware ) {
        isAware = aware;
    }

    public void setAverageLiveYears ( int averageLiveYears ) {
        this.averageLiveYears = averageLiveYears;
    }

    public void setSounds ( String sounds ) {
        this.sounds = sounds;
    }

    public void setPopularName ( String popularName ) {
        this.popularName = popularName;
    }

    public void setWearsClothes ( boolean wearsClothes ) {
        this.wearsClothes = wearsClothes;
    }

    public void setTailLenght ( int tailLenght ) {
        this.tailLenght = tailLenght;
    }

    public void setMeows ( boolean meows ) {
        this.meows = meows;
    }
}
