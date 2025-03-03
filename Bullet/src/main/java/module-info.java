import dk.sdu.mmmi.cbse.bullet.BulletGamePlugin;
import dk.sdu.mmmi.cbse.bullet.BulletProcessor;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.commonBullet.BulletSPI;

module Bullet {
    requires Common;
    requires CommonBullet;
    provides IGamePluginService with BulletGamePlugin;
    provides IEntityProcessingService with BulletProcessor;
    provides BulletSPI with BulletGamePlugin;
}