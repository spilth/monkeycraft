package spilth.org.monkeycraft;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;

public class Monkeycraft extends SimpleApplication {
    @Override
    public void simpleInitApp() {
        flyCam.setMoveSpeed(4f);

        Box box = new Box(1, 1, 1);
        Geometry geometry = new Geometry("Box", box);
        Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Texture texture =  assetManager.loadTexture("textures/grass.png");
        material.setTexture("ColorMap", texture);
        geometry.setMaterial(material);

        rootNode.attachChild(geometry);
    }

    public static void main(String[] args){
        Monkeycraft monkeycraft = new Monkeycraft();

        monkeycraft.start();
    }
}