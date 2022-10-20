package animal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;

public class Dog {

    private String name;
    private String sound;
    private int age;
    private String friendliness;
    private final Random random = new Random();
    private static final Logger logger = LogManager.getLogger(Dog.class.getName());

    public Dog() {
        name = setName();
        logger.trace("Name has been assigned to a dog");
        sound = setSound();
        logger.trace("A dog made some sound");
        age = setAge();
        logger.trace("Age has been assigned to a dog");
        friendliness = setFriendliness();
        logger.trace("Friendliness assigned to a dog");
    }

    private String setName() {
        logger.trace("Setting a name for a dog");
        String[] names = {"Buck", "Spike", "Rex", "Snoopie"};
        return name = names[random.nextInt(names.length)];
    }

    private String setSound() {
        logger.trace("Setting a sound for a dog");
        String[] sounds = {"Rah", "Woof", "Bark", "Whine"};
        return sound = sounds[random.nextInt(sounds.length)];
    }

    private int setAge() {
        logger.trace("Setting age for a dog");
        return age = random.nextInt(30);
    }

    private String setFriendliness() {
        logger.trace("Setting friendliness for a dog");
        String[] states = {"Friendly", "Neutral", "Unfriendly"};
        return friendliness = states[random.nextInt(states.length)];
    }

    public void showAllInfo() {
        logger.trace("Showing all info about a dog");
        System.out.println(name);
        System.out.println(age);
        System.out.println(sound);
        System.out.println(friendliness);
    }
}
