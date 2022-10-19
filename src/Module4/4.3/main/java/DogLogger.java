import animal.Dog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DogLogger {
    private static final Logger logger = LogManager.getLogger(DogLogger.class.getName());

    public static void main(String[] args) {
        logger.info("Starting process of creating a dog instance...");
        Dog myDog = new Dog();
        logger.info("Dog instance created!");
        logger.info("Showing all info about the dog");
        myDog.showAllInfo();
        logger.info("Info about a dog is displayed");
    }
}
