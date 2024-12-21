package Main.java.Factories;

import Main.java.Models.DifficultyLevel;
import Main.java.Strategy.BotPlayingStrategy;
import Main.java.Strategy.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(DifficultyLevel difficultyLevel){
        return new EasyBotPlayingStrategy();
    }
}
