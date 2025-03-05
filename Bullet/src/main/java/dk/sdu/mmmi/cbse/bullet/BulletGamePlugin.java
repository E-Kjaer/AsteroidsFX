package dk.sdu.mmmi.cbse.bullet;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.commonBullet.Bullet;
import dk.sdu.mmmi.cbse.commonBullet.BulletSPI;

public class BulletGamePlugin implements IGamePluginService, BulletSPI {
    @Override
    public void start(GameData gameData, World world) {

    }

    @Override
    public void stop(GameData gameData, World world) {

    }

    @Override
    public Entity createBullet(Entity e, GameData gameData) {
        Entity bullet = new Bullet();
        bullet.setX(e.getX() + (Math.cos(Math.toRadians(e.getRotation()))) * 10);
        bullet.setY(e.getY() + (Math.sin(Math.toRadians(e.getRotation()))) * 10);
        bullet.setRotation(e.getRotation());
        bullet.setPolygonCoordinates(1, 1, -3, 1, -3, -1, 1, -1);
        bullet.setColor(new int[]{255, 255, 255});
        bullet.setRadius(1);
        return bullet;
    }
}
