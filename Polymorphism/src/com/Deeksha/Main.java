package com.Deeksha;
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}
class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial froces try to take over the universe";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgettable");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i =1;i<=10;i++){
            Movie movie = randomMovie();
            System.out.println("Movie#"+i+" : "+movie.getName()+"\n"
                                    +"plot : "+movie.plot()+"\n");
        }

    }
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5+1);
        System.out.println("Random number = "+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();
        }
        return null;
    }
}
