package SelfTry;

public class Human implements Mammal {
    int numberOfLimbs;
    int numberOfEars;
    boolean isAware;
    int averageLiveYears;
    String sounds = "Aaaaaaaa";
    String popularName;
    boolean wearsClothes;

    private double height;
    private boolean talk;

    private Human ( double height , boolean talk ) {
        this(4, 2, true, 80, "Ana", true, height, talk);
    }

    public Human ( int numberOfLimbs , int numberOfEars , boolean isAware , int averageLiveYears, String popularName , boolean wearsClothes , double height , boolean talk ) {
        this.numberOfLimbs = numberOfLimbs;
        this.numberOfEars = numberOfEars;
        this.isAware = isAware;
        this.averageLiveYears = averageLiveYears;
        this.popularName = popularName;
        this.wearsClothes = wearsClothes;
        this.height = height;
        this.talk = talk;
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
        return this.isAware;
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
}