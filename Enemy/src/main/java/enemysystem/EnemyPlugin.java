package enemysystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

import java.util.Random;

public class EnemyPlugin implements IGamePluginService {
    private Entity[] enemies;

    @Override
    public void start(GameData gameData, World world) {
        enemies = new Enemy[100];
        Random random = new Random();
        int enemyCount = enemies.length;
        for (int i = 0; i < enemies.length; i++) {
            int xPos = random.nextInt(1000) % gameData.getDisplayWidth();
            int yPos = random.nextInt(1000) % gameData.getDisplayHeight();

            //int xPos = (gameData.getDisplayWidth() / enemyCount) * i + 20;
            //int yPos = (gameData.getDisplayHeight() / enemyCount) * i + 20;

            enemies[i] = creteEnemyShip(gameData, xPos, yPos);
            world.addEntity(enemies[i]);
        }
    }

    private Entity creteEnemyShip(GameData gameData, int xPos, int yPos) {
        Entity enemyship = new Enemy();
        enemyship.setPolygonCoordinates(-5,-5,10,0,-5,5);
        enemyship.setX(xPos);
        enemyship.setY(yPos);
        enemyship.setRadius(8);
        return enemyship;
    }

    @Override
    public void stop(GameData gameData, World world) {
        // Remove entities
        for (Entity enemy : enemies) {
            world.removeEntity(enemy);
        }
    }
}
