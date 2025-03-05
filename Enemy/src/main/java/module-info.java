import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.commonBullet.BulletSPI;
import dk.sdu.mmmi.cbse.enemy.EnemyGamePlugin;
import dk.sdu.mmmi.cbse.enemy.EnemyProcessor;

module Enemy {
    requires Common;
    requires CommonEnemy;
    requires CommonBullet;
    uses BulletSPI;
    provides IGamePluginService with EnemyGamePlugin;
    provides IEntityProcessingService with EnemyProcessor;
}