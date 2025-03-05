import dk.sdu.mmmi.cbse.collision.CollisionHandler;
import dk.sdu.mmmi.cbse.collision.CollisionProcessor;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.commonCollision.ICollisionHandler;

module Collision {
    uses dk.sdu.mmmi.cbse.commonAsteroid.IAsteroidSplitter;
    requires Common;
    requires CommonBullet;
    requires CommonEnemy;
    requires CommonPlayer;
    requires CommonAsteroid;
    requires CommonCollision;
    provides IEntityProcessingService with CollisionProcessor;
}