import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.commonBullet.BulletSPI;
import dk.sdu.mmmi.cbse.player.PlayerGamePlugin;
import dk.sdu.mmmi.cbse.player.PlayerProcessor;

module Player {
    requires Common;
    requires CommonPlayer;
    requires CommonBullet;
    uses BulletSPI;
    provides IGamePluginService with PlayerGamePlugin;
    provides IEntityProcessingService with PlayerProcessor;
}