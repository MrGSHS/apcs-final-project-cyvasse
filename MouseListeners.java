/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CyvasseGame;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author William
 */
public class MouseListeners implements MouseListener{
    int sourcex, sourcey;
    int targetx, targety;
    int testx, testy;
    
    boolean moved = false;
    
    public int getSourceX(){
        return this.sourcex;
    }
    public int getSourceY(){
        return this.sourcey;
    }
    public int getTargetX(){
        return this.targetx;
    }
    public int getTargetY(){
        return this.targety;
    }
    
    @Override
    public void mouseClicked(MouseEvent e)
                {
               
                }
    @Override
    //get the mouse pressed location
                public void mousePressed(MouseEvent e)
                {
                    sourcex = e.getX();
                    sourcey = e.getY();
                }
    @Override
    //gets the mouse released location, and returns whether the piece actually moved from its starting location
                public void mouseReleased(MouseEvent e)
                {
                    targetx = e.getX();
                    targety = e.getY();
                    if(sourcex == targetx && sourcey == targety)
                    {
                    moved = false;
                    }
                    else if(sourcex != targetx || sourcey !=targety)
                    {
                        moved = true;
                    }
                } 
                @Override
                public void mouseEntered(MouseEvent e)
                {
                    
                }
                @Override
                public void mouseExited(MouseEvent e)
                {
                    
                }
                       
}
