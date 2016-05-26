/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyvasseGame;
import java.util.Scanner;
import java.awt.*;  
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JFrame;
    
/**
 *
 * @author William
 */
public class CyvasseBoard extends CreateBoard
{
    public CyvasseBoard()
    {         
    }
    public boolean rightplayer(CyvassePiece a, int player)
    {
        if(a.color.equals("white") && player == 1)
        {
            return true;        
        }
        else if(a.color.equals("black") && player ==2)
        {
            return true;
        }
        return false;
    }
    public boolean canmove(int x1,int x2, int y1, int y2, CyvassePiece a)
    {
        if(a.movetype == WayItMoves.square)
        {
            if(Math.abs(x2-x1) <2 && Math.abs(y2-y1)<2)
                {
                    return true;
                }
        }
        else if(a.movetype == WayItMoves.flyingcastle)
        {
            if(y2-y1 ==0)
            {
                for(int f = x1; f<x2; f++)
                {
                    if(Pieces[f][y1]!=Nothing || Pieces[f][y1]!=wmountains || Pieces[f][y1]!=bmountains)
                    {
                        return false;
                    }
                }
            }
            if(x2-x1==0)
            {
                for(int g = y1; g<y2;g++)
                {
                    if(Pieces[x1][g]!=Nothing || Pieces[g][y1]!=wmountains || Pieces[g][y1]!=bmountains)
                    {
                        return false;
                    }
                }
            }
            
            return true;
        }
        else if(a.movetype == WayItMoves.pawn)
        {
            if(Math.abs(x2-x1) <2 && Math.abs(y2-y1)<2)
                {
                    return true;
                }
        }
        else if(a.movetype == WayItMoves.queen)
        {
            if((Math.abs(x2-x1) == Math.abs(y2-y1)) || ((Math.abs(x2-x1) == 0 || Math.abs(y2-y1) ==0)))
            {
                for(int g = x1; g<x2; g++)
                {
                    for(int h = y1; h<y2; h++)
                    {
                        if(Pieces[g][h] != Nothing || Pieces[g][h] !=wmountains || Pieces[g][h] !=bmountains)
                        {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        else if(a.movetype == WayItMoves.rangedpawn)
        {
            if(((Math.abs(x2-x1) == 1 || Math.abs(x2-x1) == 2) && y2-y1 ==0) || ((Math.abs(y2-y1) == 1 || Math.abs(y2-y1) == 2) && x2-x1 ==0))
            {
                for(int g = x1; g<x2;g++)
                {
                    if(Pieces[g][y1] != Nothing)
                    {
                        return false;
                    }
                }
                for(int g = y1; g<y2; g++)
                {
                    if(Pieces[x1][g] != Nothing)
                    {
                        return false;
                    }
                }
                return true;
            }
        }
        else if(a.movetype == WayItMoves.rook)
        {
            if(y2-y1 ==0)
            {
                for(int f = x1; f<x2; f++)
                {
                    if(Pieces[f][y1]!=Nothing)
                    {
                        return false;
                    }
                }
            }
            if(x2-x1==0)
            {
                for(int g = y1; g<y2;g++)
                {
                    if(Pieces[x1][g]!=Nothing)
                    {
                        return false;
                    }
                }
            }
            return true;
        }
        else if(a.movetype == WayItMoves.spearpawn)
        {
            if(Math.abs(x2-x1) <2 && Math.abs(y2-y1)<2)
                {
                    return true;
                }
        }
        else if(a.movetype == WayItMoves.square2x2)
        {
            if((Math.abs(x2-x1)<3 && Math.abs(y2-y1)<3))
                {
                    for(int g = x1; g<x2; g++)
                    {
                        for(int h = y1; h<y2; h++)
                        {
                            if(Pieces[g][h] != Nothing)
                            {
                                return false;
                            }
                        }
                    }
                    return true;
                }
        }
        else if(a.movetype == WayItMoves.square3x3)
        {
            if((Math.abs(x2-x1)<4 && Math.abs(y2-y1)<4))
            {
                for(int g = x1; g<x2; g++)
                    {
                        for(int h = y1; h<y2; h++)
                        {
                            if(Pieces[g][h] != Nothing)
                            {
                                return false;
                            }
                        }
                    }
                    return true;
            }
        }
        return false;
    }
    public boolean move(int x1, int x2, int y1, int y2, CyvassePiece a, CyvassePiece b, int player)
    {
        if(this.trumps(x1,x2, y1, y2,a,b,player) == false)
        {
            return false;
        }
        return true;
    }
    public boolean trumps(int x1, int x2, int y1, int y2, CyvassePiece a, CyvassePiece b, int player)
    {
        if(a!=null && b!=null)
        {    
            if(a.equals(wspearmen) && (b.equals(blighthorse) || b.equals(bheavyhorse) || b.equals(belephant)))
            {
                return true;
            }
            else if(a.equals(bspearmen) && (b.equals(wlighthorse) || b.equals(wheavyhorse) || b.equals(welephant)))
            {
                return true;
            }
            else if(a.equals(wtrebuchet) && b.equals(bdragon))
            {
                return true;
            }
            else if(a.equals(btrebuchet) && b.equals(wdragon))
            {
                return true;
            }
            else if(this.strongerthan(x1,y1,x2,y2,player))
            {
                return true;
            }
            else if(b.equals(Nothing))
            {
                return true;
            }
        }
        return false;
    }
    public boolean strongerthan(int x1, int y1, int x2, int y2, int player)
    {
        int totalws = 0;
        int totalbs = 0;
        if((x1>0 && x1<9) && (x2>0 && x2<9) && (y1>0 && y1<9) && ( y2>0 && y2<9))
        {
            totalws = Pieces[x1][y1].wstrength  + Pieces[x2][y2].wstrength+ Pieces[x2-1][y2].wstrength + Pieces[x2+1][y2].wstrength + Pieces[x2][y2+1].wstrength + Pieces[x2][y2-1].wstrength;
            totalws += Pieces[x2+1][y2+1].wstrength + Pieces[x2+1][y2-1].wstrength + Pieces[x2-1][y2-1].wstrength + Pieces[x2-1][y2+1].wstrength;
            totalbs = Pieces[x2][y2].bstrength + Pieces[x1][y1].bstrength +Pieces[x2-1][y2].bstrength + Pieces[x2+1][y2].bstrength + Pieces[x2][y2+1].bstrength + Pieces[x2][y2-1].bstrength;
            totalbs += Pieces[x2+1][x2+1].bstrength + Pieces[x2+1][y2-1].bstrength + Pieces[x2-1][y2-1].bstrength + Pieces[x2-1][y2+1].bstrength;  
        }
        else if((y1==0 && y2==1) && (x1>0 && x1<9) && (x2>0 && x2<9))
        {
            totalws = Pieces[x1][y1].wstrength + Pieces[x2][y2].wstrength + Pieces[x2][y2+1].wstrength + Pieces[x2][y2-1].wstrength + Pieces[x2+1][y2].wstrength + Pieces[x2+1][y2-1].wstrength + Pieces[x2+1][y2+1].wstrength;
            totalbs = Pieces[x2][y2].bstrength + Pieces[x1][y1].bstrength + Pieces[x2][y2+1].bstrength + Pieces[x2][y2-1].bstrength + Pieces[x2+1][y2].bstrength + Pieces[x2+1][y2-1].bstrength + Pieces[x2+1][y2+1].bstrength;
        }
        else if((y1==9 && y2==8) && (x1>0 && x1<9) && (x2>0 && x2<9))
        {
            totalws = Pieces[x1][y1].wstrength + Pieces[x2][y2].wstrength + Pieces[x2][y2+1].wstrength + Pieces[x2][y2-1].wstrength + Pieces[x2-1][y2+1].wstrength + Pieces[x2-1][y2].wstrength + Pieces[x2-1][y2-1].wstrength;
            totalbs = Pieces[x2][y2].bstrength + Pieces[x1][y1].bstrength + Pieces[x2][y2+1].bstrength + Pieces[x2][y2-1].bstrength + Pieces[x2-1][y2+1].bstrength + Pieces[x2-1][y2].bstrength + Pieces[x2-1][y2-1].bstrength;
        }
        else if((x1==0 && x2==1) && (y1>0 && y1<9) && (y2>0 && y2<9))
        {
            totalws = Pieces[x1][y1].wstrength + Pieces[x2][y2].wstrength + Pieces[x2][y2-1].wstrength + Pieces[x2-1][y2+1].wstrength + Pieces[x2-1][y2].wstrength + Pieces[x2-1][y2-1].wstrength + Pieces[x2+1][y2+1].wstrength + Pieces[x2+1][y2].wstrength + Pieces[x2+1][y2-1].wstrength; 
            totalbs = Pieces[x2][y2].bstrength + Pieces[x1][y1].bstrength + Pieces[x2][y2-1].bstrength + Pieces[x2-1][y2+1].bstrength + Pieces[x2-1][y2].bstrength + Pieces[x2-1][y2-1].bstrength + Pieces[x2+1][y2+1].bstrength + Pieces[x2+1][y2].bstrength + Pieces[x2+1][y2-1].bstrength;
        }
        else if((y1==0 && y2==1) && (y1>0 && y1<9) && (y2>0 && y2<9))
        {
            totalws = Pieces[x1][y1].wstrength + Pieces[x2][y2].wstrength + Pieces[x2][y2+1].wstrength + Pieces[x2-1][y2+1].wstrength + Pieces[x2-1][y2].wstrength + Pieces[x2-1][y2-1].wstrength + Pieces[x2+1][y2+1].wstrength + Pieces[x2+1][y2].wstrength + Pieces[x2+1][y2-1].wstrength;
            totalbs = Pieces[x2][y2].bstrength + Pieces[x1][y1].bstrength + Pieces[x2][y2+1].bstrength + Pieces[x2-1][y2+1].bstrength + Pieces[x2-1][y2].bstrength + Pieces[x2-1][y2-1].bstrength + Pieces[x2+1][y2+1].bstrength + Pieces[x2+1][y2].bstrength + Pieces[x2+1][y2-1].bstrength;
        }
            
        if((totalws>=totalbs) && player == 1)
        {
            return true;
        }
        else if((totalbs>=totalws) && player ==2)
        {
            return true;
        }
        return false;
    }
    public static boolean gameEnded(CyvassePiece x, CyvassePiece y)
    {
        int a =0;
        int b =0;
       if(x.equals(wking) && y.equals(bking))
       {
           for (int ctr = 0; ctr < Pieces.length; ctr++) {
                for (int ctr2 = 0; ctr2 < Pieces[0].length; ctr2++) {
                    if(Pieces[ctr2][ctr].equals(wking)){
                        a=1;
                    }
                    else if(Pieces[ctr2][ctr].equals(bking))
                    {
                        b=1;
                    }
                }
           }
       }  
       if(a==1 & b==1)
       {
           return false;
       }
       return true;
    
    }
}
    
    
    
    
