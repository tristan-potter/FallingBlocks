/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fallingblocks;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author trpot5670
 */
public class HealthBlock extends Block{
    int health = 100;
    HealthBlock(Point p, int h, int w, int s){
        super(p, h, w, Color.GREEN, s);
    }
    
    @Override
    void colliding(Block b){
        
    }
}
