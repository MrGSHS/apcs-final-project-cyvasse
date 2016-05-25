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
public class CyvasseGame extends CyvasseBoard {

    static int nwking = 1;
    static int nwdragon = 1;
    static int nbking = 1;
    static int nbdragon = 1;
    static int nwrabble = 6;
    static int nwcrossbow = 3;
    static int nwspearmen = 3;
    static int nwheavyhorse = 1;
    static int nwlighthorse = 1;
    static int nwtrebuchet = 1;
    static int nwmountains = 4;
    static int nwelephant = 1;
    static int nbrabble = 6;
    static int nbcrossbow = 3;
    static int nbspearmen = 3;
    static int nbheavyhorse = 1;
    static int nblighthorse = 1;
    static int nbtrebuchet = 1;
    static int nbmountains = 4;
    static int nbelephant = 1;
    static int state = 0;

    public CyvasseGame() {
    }

    public static void main(String[] args) throws IOException {
        for (int x = 0; x < Pieces.length; x++) {
            for (int y = 0; y < Pieces[0].length; y++) {
                if (Pieces[y][x] == null) {
                    Pieces[y][x] = Nothing;
                }
            }
        }
        start = 1;
        MouseListeners wListener = new MouseListeners();
        CyvasseGame game = new CyvasseGame();
        JFrame Frame = new JFrame();
        Frame.getContentPane().setLayout(null);
        Frame.setTitle("Cyvasse");
        JScrollPane Pane1 = new JScrollPane();
        Pane1.setSize(new Dimension(600, 1000));
        Pane1.setLocation(1800, 0);
        JPanel Panel = new JPanel();
        JPanel Panel2 = new JPanel();
        JPanel Panel3 = new JPanel();
        JPanel Panel4 = new JPanel();
        JPanel Panel5 = new JPanel();
        JPanel Panel6 = new JPanel();
        JButton Clear = new JButton("Clear All Text, And Cover White Side");
        Clear.setSize(250, 100);
        Clear.setLocation(0, 0);
        Panel6.setSize(200, 100);
        Panel6.setLocation(2000, 1200);
        Frame.add(Panel6);
        Frame.setVisible(true);
        Panel5.setSize(new Dimension(600, 1000));
        Panel5.setLocation(1800, 0);
        Panel4.setSize(new Dimension(500, 1300));
        Panel4.setLocation(1800, 0);
        Panel3.setOpaque(false);
        Panel3.setSize(new Dimension(1300, 1300));
        Panel3.setLocation(0, 0);
        Frame.add(Panel3);
        Panel2.setSize(new Dimension(600, 100));
        Panel2.setLocation(1800, 1300);
        Color color = UIManager.getColor("Frame.background");
        Panel2.setBackground(color);
        Panel.setSize(new Dimension(300, 1400));
        Panel.setLocation(1430, 0);
        Panel.setBackground(Color.BLACK);
        Frame.setSize(new Dimension(2500, 1450));
        Frame.add(new CreateBoard());
        Frame.repaint();
        ImageIcon whiteKing = new ImageIcon(wKing);
        JButton WKing = new JButton(whiteKing);
        WKing.setBounds(1430, 0, 100, 100);
        WKing.setMargin(new Insets(0, 0, 0, 0));
        WKing.setBorder(null);
        Panel.add(WKing);
        ImageIcon whiteDragon = new ImageIcon(wDragon);
        JButton WDragon = new JButton(whiteDragon);
        WDragon.setBounds(1430, 100, 100, 100);
        WDragon.setMargin(new Insets(0, 0, 0, 0));
        WDragon.setBorder(null);
        Panel.add(WDragon);
        ImageIcon whiteRabble = new ImageIcon(wRabble);
        JButton WRabble = new JButton(whiteRabble);
        WRabble.setBounds(1430, 200, 100, 100);
        WRabble.setMargin(new Insets(0, 0, 0, 0));
        WRabble.setBorder(null);
        Panel.add(WRabble);
        ImageIcon whiteSpearmen = new ImageIcon(wSpearmen);
        JButton WSpearmen = new JButton(whiteSpearmen);
        WSpearmen.setBounds(1430, 300, 100, 100);
        WSpearmen.setMargin(new Insets(0, 0, 0, 0));
        WSpearmen.setBorder(null);
        Panel.add(WSpearmen);
        ImageIcon whiteCrossbow = new ImageIcon(wCrossbow);
        JButton WCrossbow = new JButton(whiteCrossbow);
        WCrossbow.setBounds(1430, 500, 100, 100);
        WCrossbow.setMargin(new Insets(0, 0, 0, 0));
        WCrossbow.setBorder(null);
        Panel.add(WCrossbow);
        ImageIcon whiteTrebuchet = new ImageIcon(wTrebuchet);
        JButton WTrebuchet = new JButton(whiteTrebuchet);
        WTrebuchet.setBounds(1430, 600, 100, 100);
        WTrebuchet.setMargin(new Insets(0, 0, 0, 0));
        WTrebuchet.setBorder(null);
        Panel.add(WTrebuchet);
        ImageIcon whiteElephant = new ImageIcon(wElephant);
        JButton WElephant = new JButton(whiteElephant);
        WElephant.setBounds(1430, 700, 100, 100);
        WElephant.setMargin(new Insets(0, 0, 0, 0));
        WElephant.setBorder(null);
        Panel.add(WElephant);
        ImageIcon whiteHeavyHorse = new ImageIcon(wHeavyHorse);
        JButton WHeavyHorse = new JButton(whiteHeavyHorse);
        WHeavyHorse.setBounds(1430, 800, 100, 100);
        WHeavyHorse.setMargin(new Insets(0, 0, 0, 0));
        WHeavyHorse.setBorder(null);
        Panel.add(WHeavyHorse);
        ImageIcon whiteLightHorse = new ImageIcon(wLightHorse);
        JButton WLightHorse = new JButton(whiteLightHorse);
        WLightHorse.setMargin(new Insets(0, 0, 0, 0));
        WLightHorse.setBorder(null);
        WLightHorse.setBounds(1430, 900, 100, 100);
        Panel.add(WLightHorse);
        ImageIcon whiteMountains = new ImageIcon(wMountains);
        JButton WMountains = new JButton(whiteMountains);
        WMountains.setBounds(1430, 1000, 100, 100);
        WMountains.setMargin(new Insets(0, 0, 0, 0));
        WMountains.setBorder(null);
        Panel.add(WMountains);
        ImageIcon blackKing = new ImageIcon(bKing);
        JButton BKing = new JButton(blackKing);
        BKing.setBounds(1560, 0, 100, 100);
        BKing.setMargin(new Insets(0, 0, 0, 0));
        BKing.setBorder(null);
        Panel.add(BKing);
        ImageIcon blackDragon = new ImageIcon(bDragon);
        JButton BDragon = new JButton(blackDragon);
        BDragon.setBounds(1560, 200, 100, 100);
        BDragon.setMargin(new Insets(0, 0, 0, 0));
        BDragon.setBorder(null);
        Panel.add(BDragon);
        ImageIcon blackRabble = new ImageIcon(bRabble);
        JButton BRabble = new JButton(blackRabble);
        BRabble.setBounds(1560, 300, 100, 100);
        BRabble.setMargin(new Insets(0, 0, 0, 0));
        BRabble.setBorder(null);
        Panel.add(BRabble);
        ImageIcon blackSpearmen = new ImageIcon(bSpearmen);
        JButton BSpearmen = new JButton(blackSpearmen);
        BSpearmen.setBounds(1560, 400, 100, 100);
        BSpearmen.setMargin(new Insets(0, 0, 0, 0));
        BSpearmen.setBorder(null);
        Panel.add(BSpearmen);
        ImageIcon blackCrossbow = new ImageIcon(bCrossbow);
        JButton BCrossbow = new JButton(blackCrossbow);
        BCrossbow.setBounds(1560, 500, 100, 100);
        BCrossbow.setMargin(new Insets(0, 0, 0, 0));
        BCrossbow.setBorder(null);
        Panel.add(BCrossbow);
        ImageIcon blackTrebuchet = new ImageIcon(bTrebuchet);
        JButton BTrebuchet = new JButton(blackTrebuchet);
        BTrebuchet.setBounds(1560, 600, 100, 100);
        BTrebuchet.setMargin(new Insets(0, 0, 0, 0));
        BTrebuchet.setBorder(null);
        Panel.add(BTrebuchet);
        ImageIcon blackElephant = new ImageIcon(bElephant);
        JButton BElephant = new JButton(blackElephant);
        BElephant.setBounds(1560, 700, 100, 100);
        BElephant.setMargin(new Insets(0, 0, 0, 0));
        BElephant.setBorder(null);
        Panel.add(BElephant);
        ImageIcon blackHeavyHorse = new ImageIcon(bHeavyHorse);
        JButton BHeavyHorse = new JButton(blackHeavyHorse);
        BHeavyHorse.setBounds(1560, 800, 100, 100);
        BHeavyHorse.setMargin(new Insets(0, 0, 0, 0));
        BHeavyHorse.setBorder(null);
        Panel.add(BHeavyHorse);
        ImageIcon blackLightHorse = new ImageIcon(bLightHorse);
        JButton BLightHorse = new JButton(blackLightHorse);
        BLightHorse.setBounds(1560, 900, 100, 100);
        BLightHorse.setMargin(new Insets(0, 0, 0, 0));
        BLightHorse.setBorder(null);
        Panel.add(BLightHorse);
        ImageIcon blackMountains = new ImageIcon(bMountains);
        JButton BMountains = new JButton(blackMountains);
        BMountains.setMargin(new Insets(0, 0, 0, 0));
        BMountains.setBorder(null);
        BMountains.setBounds(1560, 1000, 100, 100);
        game.setSize(1300, 1300);
        Panel.add(BMountains);
        Frame.add(Panel);
        Frame.add(game);
        Frame.repaint();
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cover =1;
                Panel2.removeAll();
                Panel4.removeAll();
                Panel5.removeAll();
                Frame.repaint();
                Panel2.repaint();
                Panel4.repaint();
                Panel5.repaint();
                Frame.add(Panel5);
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        WKing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel4.removeAll();
                Panel2.repaint();
                JLabel wk = new JLabel("White King selected");
                wk.setFont(wk.getFont().deriveFont(32f));
                wk.setForeground(Color.black);
                wk.setSize(new Dimension(100, 50));
                wk.setLocation(1430, 1200);
                Panel2.add(wk);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();

                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwking != 0) {
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White King.");
                            JLabel b = new JLabel("White Kings Left: 0 : " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            nwking -= 1;
                            Pieces[y / 130][x / 130] = wking;
                        }
                    }
                });

                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);

            }
        });
        WDragon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel wd = new JLabel("White Dragon selected");
                wd.setFont(wd.getFont().deriveFont(32f));
                wd.setForeground(Color.black);
                wd.setSize(new Dimension(100, 50));
                wd.setLocation(1430, 1200);
                Panel2.add(wd);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwdragon != 0) {
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White Dragon.");
                            JLabel b = new JLabel("White Dragons Left: 0 : " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            nwdragon -= 1;
                            Pieces[y / 130][x / 130] = wdragon;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        WRabble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel wr = new JLabel("White Rabble selected");
                wr.setFont(wr.getFont().deriveFont(32f));
                wr.setForeground(Color.black);
                wr.setSize(new Dimension(100, 50));
                wr.setLocation(1430, 1200);
                Panel2.add(wr);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwrabble != 0) {
                            nwrabble -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White Rabble.");
                            JLabel b = new JLabel("White Rabble Left: " + nwrabble + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = wrabble;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
                Frame.setVisible(true);
            }
        });
        WSpearmen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel ws = new JLabel("White Spearmen selected");
                ws.setFont(ws.getFont().deriveFont(32f));
                ws.setForeground(Color.black);
                ws.setSize(new Dimension(100, 50));
                ws.setLocation(1430, 1200);
                Panel2.add(ws);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwspearmen != 0) {
                            nwspearmen -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White Spearmen.");
                            JLabel b = new JLabel("White Spearmen Left: " + nwspearmen + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = wspearmen;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        WCrossbow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel wc = new JLabel("White Crossbow selected");
                wc.setFont(wc.getFont().deriveFont(32f));
                wc.setForeground(Color.black);
                wc.setSize(new Dimension(100, 50));
                wc.setLocation(1430, 1200);
                Panel2.add(wc);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwcrossbow != 0) {
                            nwcrossbow -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White Crossbow.");
                            JLabel b = new JLabel("White Crossbow Left: " + nwcrossbow + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = wcrossbow;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        WLightHorse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel wlh = new JLabel("White Light Horse selected");
                wlh.setFont(wlh.getFont().deriveFont(32f));
                wlh.setForeground(Color.black);
                wlh.setSize(new Dimension(100, 50));
                wlh.setLocation(1430, 1200);
                Panel2.add(wlh);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwlighthorse != 0) {
                            nwlighthorse -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White Light Horse.");
                            JLabel b = new JLabel("White Light Horse Left: " + nwlighthorse + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = wlighthorse;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        WTrebuchet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel wt = new JLabel("White Trebuchet selected");
                wt.setFont(wt.getFont().deriveFont(32f));
                wt.setForeground(Color.black);
                wt.setSize(new Dimension(100, 50));
                wt.setLocation(1430, 1200);
                Panel2.add(wt);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwtrebuchet != 0) {
                            nwtrebuchet -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White Trebuchet.");
                            JLabel b = new JLabel("White Trebuchet Left: " + nwtrebuchet + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = wtrebuchet;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        WHeavyHorse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel whh = new JLabel("White Heavy Horse selected");
                whh.setFont(whh.getFont().deriveFont(32f));
                whh.setForeground(Color.black);
                whh.setSize(new Dimension(100, 50));
                whh.setLocation(1430, 1200);
                Panel2.add(whh);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwheavyhorse != 0) {
                            nwheavyhorse -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White Heavy Horse.");
                            JLabel b = new JLabel("White Heavy Horse Left: " + nwheavyhorse + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = wheavyhorse;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        WElephant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel we = new JLabel("White Elephant selected");
                we.setFont(we.getFont().deriveFont(32f));
                we.setForeground(Color.black);
                we.setSize(new Dimension(100, 50));
                we.setLocation(1430, 1200);
                Panel2.add(we);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwelephant != 0) {
                            nwelephant -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White Elephant.");
                            JLabel b = new JLabel("White Elephant Left: " + nwelephant + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = welephant;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        WMountains.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel wm = new JLabel("White Mountains selected");
                wm.setFont(wm.getFont().deriveFont(32f));
                wm.setForeground(Color.black);
                wm.setSize(new Dimension(100, 50));
                wm.setLocation(1430, 1200);
                Panel2.add(wm);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 780 && y < 1300) && Pieces[y / 130][x / 130] == Nothing && nwmountains != 0) {
                            nwmountains -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with White Mountains.");
                            JLabel b = new JLabel("White Mountains Left: " + nwmountains + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = wmountains;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BKing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel5.removeAll();
                Panel2.removeAll();
                Panel2.repaint();
                JLabel bk = new JLabel("Black King selected");
                bk.setFont(bk.getFont().deriveFont(32f));
                bk.setForeground(Color.black);
                bk.setSize(new Dimension(100, 50));
                bk.setLocation(1430, 1200);
                Panel2.add(bk);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nbking != 0) {
                            nbking -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Black King.");
                            JLabel b = new JLabel("Black King Left: " + nbking + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = bking;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BDragon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel bd = new JLabel("Black Dragon selected");
                bd.setFont(bd.getFont().deriveFont(32f));
                bd.setForeground(Color.black);
                bd.setSize(new Dimension(100, 50));
                bd.setLocation(1430, 1200);
                Panel2.add(bd);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nbdragon != 0) {
                            nbdragon -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Black Dragon.");
                            JLabel b = new JLabel("Black Dragon Left: " + nbking + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = bdragon;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BRabble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel br = new JLabel("Black Rabble selected");
                br.setFont(br.getFont().deriveFont(32f));
                br.setForeground(Color.black);
                br.setSize(new Dimension(100, 50));
                br.setLocation(1430, 1200);
                Panel2.add(br);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nbrabble != 0) {
                            nbrabble -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Black Rabble.");
                            JLabel b = new JLabel("Black Rabble Left: " + nbrabble + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = brabble;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BSpearmen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel bs = new JLabel("Black Spearmen selected");
                bs.setFont(bs.getFont().deriveFont(32f));
                bs.setForeground(Color.black);
                bs.setSize(new Dimension(100, 50));
                bs.setLocation(1430, 1200);
                Panel2.add(bs);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nbspearmen != 0) {
                            nbspearmen -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Black Spearmen.");
                            JLabel b = new JLabel("Black Spearmen Left: " + nbspearmen + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = bspearmen;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BCrossbow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel bc = new JLabel("Black Crossbow selected");
                bc.setFont(bc.getFont().deriveFont(32f));
                bc.setForeground(Color.black);
                bc.setSize(new Dimension(100, 50));
                bc.setLocation(1430, 1200);
                Panel2.add(bc);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nbcrossbow != 0) {
                            nbcrossbow -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Crossbow King.");
                            JLabel b = new JLabel("Black Crossbow Left: " + nbcrossbow + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = bcrossbow;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BLightHorse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel blh = new JLabel("Black Light Horse selected");
                blh.setFont(blh.getFont().deriveFont(32f));
                blh.setForeground(Color.black);
                blh.setSize(new Dimension(100, 50));
                blh.setLocation(1430, 1200);
                Panel2.add(blh);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nblighthorse != 0) {
                            nblighthorse -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Black Light Horse.");
                            JLabel b = new JLabel("Black Light Horse Left: " + nblighthorse + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = blighthorse;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BTrebuchet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel bt = new JLabel("Black Trebuchet selected");
                bt.setFont(bt.getFont().deriveFont(32f));
                bt.setForeground(Color.black);
                bt.setSize(new Dimension(100, 50));
                bt.setLocation(1430, 1200);
                Panel2.add(bt);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nbtrebuchet != 0) {
                            nbtrebuchet -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Black Trebuchet.");
                            JLabel b = new JLabel("Black Trebuchet Left: " + nbtrebuchet + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = btrebuchet;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BHeavyHorse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel bhh = new JLabel("Black Heavy Horse selected");
                bhh.setFont(bhh.getFont().deriveFont(32f));
                bhh.setForeground(Color.black);
                bhh.setSize(new Dimension(100, 50));
                bhh.setLocation(1430, 1200);
                Panel2.add(bhh);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nbheavyhorse != 0) {
                            nbheavyhorse -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Black Heavy Horse.");
                            JLabel b = new JLabel("Black Heavy Horse Left: " + nbheavyhorse + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = bheavyhorse;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BElephant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel be = new JLabel("Black Elephant selected");
                be.setFont(be.getFont().deriveFont(32f));
                be.setForeground(Color.black);
                be.setSize(new Dimension(100, 50));
                be.setLocation(1430, 1200);
                Panel2.add(be);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nbelephant != 0) {
                            nbelephant -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Black Elephant.");
                            JLabel b = new JLabel("Black Elephant Left: " + nbelephant + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = belephant;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        BMountains.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Panel2.removeAll();
                Panel2.repaint();
                JLabel bm = new JLabel("Black Mountains selected");
                bm.setFont(bm.getFont().deriveFont(32f));
                bm.setForeground(Color.black);
                bm.setSize(new Dimension(100, 50));
                bm.setLocation(1430, 1200);
                Panel2.add(bm);
                Frame.add(Panel2);
                Panel3.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getXOnScreen();
                        int y = e.getYOnScreen();
                        if ((x > 0 && x < 1300) && (y > 0 && y < 520) && Pieces[y / 130][x / 130] == Nothing && nbmountains != 0) {
                            nbmountains -= 1;
                            Panel4.removeAll();
                            Panel2.removeAll();
                            Panel2.repaint();
                            JLabel a = new JLabel((y / 130 + 1) + "," + (x / 130 + 1) + " filled with Black Mountains.");
                            JLabel b = new JLabel("Black Mountains Left: " + nbmountains + ": " + (y / 130 + 1) + "," + (x / 130 + 1) + " filled.");
                            b.setForeground(Color.black);
                            b.setFont(b.getFont().deriveFont(16f));
                            b.setSize(new Dimension(100, 50));
                            b.setLocation(0, 0);
                            Panel5.add(b);
                            a.setForeground(Color.black);
                            a.setFont(a.getFont().deriveFont(32f));
                            a.setSize(new Dimension(100, 50));
                            a.setLocation(1430, 1200);
                            Panel2.add(a);
                            Frame.repaint();
                            Frame.setVisible(true);
                            Pieces[y / 130][x / 130] = bmountains;
                        }
                    }
                });
                Frame.add(Panel5);
                Frame.getContentPane().add(Panel2);
                Frame.add(Panel4);
                Panel3.removeAll();
                Frame.repaint();
                Frame.setVisible(true);
            }
        });
        JButton startthegame = new JButton("Start the Game");
        startthegame.setSize(100, 50);
        startthegame.setLocation(1800, 1500);
        Panel6.add(startthegame);
        Frame.add(Panel6);
        Frame.setVisible(true);

        startthegame.addActionListener(new ActionListener() {
            int party = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                reveal =1;
                Panel2.removeAll();
                Panel4.removeAll();
                Panel5.removeAll();
                Frame.repaint();
                Thread th = new Thread() {
                    public void run() {
                        JLabel player1 = new JLabel();
                        player1.setSize(200,100);
                        player1.setLocation(0,0);
                        player1.setFont(player1.getFont().deriveFont(32f));
                        player1.setText("White's turn");
                        Panel2.add(player1);
                        Frame.repaint();
                        Panel3.addMouseListener(wListener);
                        while (true) {
                            if (!wListener.moved) {
                                try {
                                    Thread.sleep(100);
                                    continue;
                                } catch (Exception e) {
                                }
                            }
                            wListener.moved = false;
                            if (CyvasseGame.gameEnded(wking, bking) == false) {
                                if (game.move(wListener.sourcex / 130, wListener.getTargetX() / 130, wListener.getSourceY() / 130, wListener.getTargetY() / 130, Pieces[wListener.getSourceY() / 130][wListener.getSourceX() / 130], Pieces[wListener.getTargetY() / 130][wListener.getTargetX() / 130], party) && game.canmove(wListener.sourcex / 130, wListener.targetx / 130, wListener.sourcey / 130, wListener.targety / 130, Pieces[wListener.sourcey / 130][wListener.sourcex / 130]) && game.rightplayer(Pieces[wListener.sourcey/130][wListener.sourcex/130], party)) {
                                    String whoseturn = party == 1 ? "Black's turn" : "White's turn";
                                    player1.setText(whoseturn);
                                    player1.setSize(200, 100);
                                    player1.setLocation(0, 0);
                                    player1.setFont(player1.getFont().deriveFont(32f));
                                    Pieces[wListener.targety / 130][wListener.targetx / 130] = Pieces[wListener.sourcey / 130][wListener.sourcex / 130];
                                    Pieces[wListener.sourcey / 130][wListener.sourcex / 130] = Nothing;
                                    Frame.repaint();
                                    party = party % 2 + 1;
                                    if (CyvasseGame.gameEnded(wking, bking)) {
                                        int a = 0;
                                        int b = 0;
                                        for (int x = 0; x < Pieces.length; x++) {
                                            for (int y = 0; y < Pieces[0].length; y++) {
                                                if (Pieces[x][y].equals(wking)) {
                                                    a = 1;
                                                } else if (Pieces[x][y].equals(bking)) {
                                                    b = 1;
                                                }
                                            }
                                        }
                                        if (a == 0) {
                                            JLabel BlackWin = new JLabel("Black Victory");
                                            Panel2.removeAll();
                                            BlackWin.setFont(BlackWin.getFont().deriveFont(32f));
                                            Panel2.add(BlackWin);
                                            Frame.add(Panel2);
                                            Frame.setVisible(true);
                                        } else if (b == 0) {
                                            JLabel WhiteWin = new JLabel("White Victory");
                                            Panel2.removeAll();
                                            WhiteWin.setFont(WhiteWin.getFont().deriveFont(32f));

                                            Panel2.add(WhiteWin);
                                            Frame.add(Panel2);
                                            Frame.setVisible(true);
                                        }
                                    }
                                }
                            } 
                        }
                    }

                };
                th.start();
            }
        });
    }
}
