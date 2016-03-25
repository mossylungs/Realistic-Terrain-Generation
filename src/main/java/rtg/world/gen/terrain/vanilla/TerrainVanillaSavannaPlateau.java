package rtg.world.gen.terrain.vanilla;

import rtg.util.noise.CellNoise;
import rtg.util.noise.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class TerrainVanillaSavannaPlateau extends TerrainBase {
    private boolean booRiver;
    private float[] height;
    private int heightLength;
    private float strength;
    private float smooth;
    private float cWidth;
    private float cHeigth;
    private float cStrength;
    private float base;

    /*
     * Example parameters:
     *
     * allowed to generate rivers?
     * riverGen = true
     *
     * canyon jump heights
     * heightArray = new float[]{2.0f, 0.5f, 6.5f, 0.5f, 14.0f, 0.5f, 19.0f, 0.5f}
     *
     * strength of canyon jump heights
     * heightStrength = 35f
     *
     * canyon width (cliff to cliff)
     * canyonWidth = 160f
     *
     * canyon heigth (total heigth)
     * canyonHeight = 60f
     *
     * canyon strength
     * canyonStrength = 40f
     *
     */
    public TerrainVanillaSavannaPlateau(boolean riverGen, float heightStrength, float canyonWidth, float canyonHeight, float canyonStrength, float baseHeight) {
        booRiver = true;
        /**    Values come in pairs per layer. First is how high to step up.
         * 	Second is a value between 0 and 1, signifying when to step up.
         */
        height = new float[]{12.0f, 0.5f, 8f, 0.7f};
        strength = 10f;
        heightLength = height.length;
    }

    @Override
    public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {
        return terrainPlateau(x, y, simplex, river, height, border, strength, heightLength, 50f, true);
    }
}