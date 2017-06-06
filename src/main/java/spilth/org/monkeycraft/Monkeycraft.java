package spilth.org.monkeycraft;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.math.ColorRGBA;

public class Monkeycraft extends SimpleApplication {
    @Override
    public void simpleInitApp() {
        Box box = new Box(1, 1, 1);
        Geometry geometry = new Geometry("Box", box);
        Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        material.setColor("Color", ColorRGBA.Green);
        geometry.setMaterial(material);
        rootNode.attachChild(geometry);
    }

    public static void main(String[] args){
        Monkeycraft monkeycraft = new Monkeycraft();

        monkeycraft.start();
    }
}