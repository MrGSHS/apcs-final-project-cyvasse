/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyvasseGame;

import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.*;

/**
 *
 * @author William
 */
public class CreateBoard extends JPanel {

    static int x;
    static int y;
    static int x1;
    static int y1;
    static int end;
    static int cover = 0;
    static int start = 0;
    static int reveal = 0;
    static CyvassePiece Nothing = new CyvassePiece(PieceType.Nothing);
    static CyvassePiece wking = new CyvassePiece(PieceType.WhiteKing);
    static CyvassePiece wdragon = new CyvassePiece(PieceType.WhiteDragon);
    static CyvassePiece wrabble = new CyvassePiece(PieceType.WhiteRabble);
    static CyvassePiece wspearmen = new CyvassePiece(PieceType.WhiteSpearmen);
    static CyvassePiece wtrebuchet = new CyvassePiece(PieceType.WhiteTrebuchet);
    static CyvassePiece wcrossbow = new CyvassePiece(PieceType.WhiteCrossbow);
    static CyvassePiece wheavyhorse = new CyvassePiece(PieceType.WhiteHeavyHorse);
    static CyvassePiece wlighthorse = new CyvassePiece(PieceType.WhiteLightHorse);
    static CyvassePiece welephant = new CyvassePiece(PieceType.WhiteElephant);
    static CyvassePiece wmountains = new CyvassePiece(PieceType.WhiteMountains);
    static CyvassePiece bking = new CyvassePiece(PieceType.BlackKing);
    static CyvassePiece bdragon = new CyvassePiece(PieceType.BlackDragon);
    static CyvassePiece brabble = new CyvassePiece(PieceType.BlackRabble);
    static CyvassePiece bspearmen = new CyvassePiece(PieceType.BlackSpearmen);
    static CyvassePiece bcrossbow = new CyvassePiece(PieceType.BlackCrossbow);
    static CyvassePiece btrebuchet = new CyvassePiece(PieceType.BlackTrebuchet);
    static CyvassePiece bheavyhorse = new CyvassePiece(PieceType.BlackHeavyHorse);
    static CyvassePiece blighthorse = new CyvassePiece(PieceType.BlackLightHorse);
    static CyvassePiece belephant = new CyvassePiece(PieceType.BlackElephant);
    static CyvassePiece bmountains = new CyvassePiece(PieceType.BlackMountains);
    static CyvassePiece Pieces[][] = new CyvassePiece[10][10];
    static BufferedImage wKing, wDragon, wRabble, wSpearmen, wCrossbow, wTrebuchet, wElephant, wHeavyHorse, wLightHorse, wMountains;
    static BufferedImage bKing, bDragon, bRabble, bSpearmen, bCrossbow, bTrebuchet, bElephant, bHeavyHorse, bLightHorse, bMountains;

    public CreateBoard() {
        //finds all the images
        try {
            wKing = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteKing.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wDragon = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteDragon.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wRabble = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteRabble.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wSpearmen = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteSpearmen.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wCrossbow = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteCrossbow.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wTrebuchet = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteTrebuchet.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wElephant = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteElephant.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wHeavyHorse = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteHeavyHorse.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wLightHorse = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteLightHorse.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wMountains = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\WhiteMountain.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bKing = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackKing.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bDragon = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackDragon.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bRabble = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackRabble.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bSpearmen = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackSpearmen.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bCrossbow = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackCrossbow.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bTrebuchet = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackTrebuchet.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bElephant = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackElephant.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bHeavyHorse = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackHeavyHorse.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bLightHorse = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackLightHorse.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bMountains = ImageIO.read(new File("C:\\Users\\William\\Documents\\NetBeansProjects\\CyvasseGame\\src\\CyvasseGame\\CyvassePieces\\BlackMountains.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(CreateBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //draw the board
    public void paintComponent(Graphics g) {
        this.setBackground(Color.BLACK);
        super.paintComponent(g);

        for (int x = 0; x < 1300; x += 260) {
            for (int y = 0; y < 1300; y += 260) {
                if (x % 10 == 0) {
                    g.setColor(Color.LIGHT_GRAY);
                    g.fillRect(x, y, 130, 130);
                }
            }
        }
        for (int x = 130; x < 1300; x += 260) {
            for (int y = 130; y < 1300; y += 260) {
                if (x % 10 == 0) {
                    g.setColor(Color.LIGHT_GRAY);
                    g.fillRect(x, y, 130, 130);
                }
            }
        }
        g.setColor(Color.DARK_GRAY);
        g.fillRect(1300, 0, 130, 1750);
        g.fillRect(0, 1300, 1430, 130);
        //draw pieces
        if (start == 1) {
            for (int x = 0; x < Pieces.length; x++) {
                for (int y = 0; y < Pieces[0].length; y++) {
                    if (Pieces[y][x].equals(wking)) {
                        g.drawImage(wKing, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(wdragon)) {
                        g.drawImage(wDragon, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(wrabble)) {
                        g.drawImage(wRabble, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(wspearmen)) {
                        g.drawImage(wSpearmen, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(wcrossbow)) {
                        g.drawImage(wCrossbow, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(wtrebuchet)) {
                        g.drawImage(wTrebuchet, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(wlighthorse)) {
                        g.drawImage(wLightHorse, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(wheavyhorse)) {
                        g.drawImage(wHeavyHorse, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(welephant)) {
                        g.drawImage(wElephant, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(wmountains)) {
                        g.drawImage(wMountains, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(bking)) {
                        g.drawImage(bKing, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(bdragon)) {
                        g.drawImage(bDragon, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(brabble)) {
                        g.drawImage(bRabble, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(bspearmen)) {
                        g.drawImage(bSpearmen, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(bcrossbow)) {
                        g.drawImage(bCrossbow, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(btrebuchet)) {
                        g.drawImage(bTrebuchet, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(blighthorse)) {
                        g.drawImage(bLightHorse, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(bheavyhorse)) {
                        g.drawImage(bHeavyHorse, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(belephant)) {
                        g.drawImage(bElephant, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(bmountains)) {
                        g.drawImage(bMountains, x * 130, y * 130, null);

                    } else if (Pieces[y][x].equals(null)) {
                        g.drawRect(0, 0, 0, 0);
                    }
                }
            }
        }

    }
}
