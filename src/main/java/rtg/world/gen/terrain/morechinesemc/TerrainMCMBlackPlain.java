package rtg.world.gen.terrain.morechinesemc;

import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.gen.terrain.GroundEffect;
import rtg.world.gen.terrain.TerrainBase;

public class TerrainMCMBlackPlain extends TerrainBase {

    private GroundEffect groundEffect = new GroundEffect(4f);

    public TerrainMCMBlackPlain() {

    }

    @Override
    public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {
        //return terrainPlains(x, y, simplex, river, 160f, 10f, 60f, 200f, 66f);
        return riverized(65f + groundEffect.added(simplex, cell, x, y), river);
    }
}
