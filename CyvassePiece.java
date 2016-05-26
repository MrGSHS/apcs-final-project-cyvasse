/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyvasseGame;

/**
 *
 * @author William
 */
public class CyvassePiece extends CyvasseGame {

    PieceType type;
    int wstrength;
    int bstrength;
    String color;
    WayItMoves movetype;
//enums to make CyvassePiece objects
    public CyvassePiece(PieceType Piece) {
        type = Piece;
        switch (type) {
            case Nothing:
                wstrength = 0;
                bstrength = 0;
                color = "red";
                movetype = WayItMoves.nothing;
                break;
            case WhiteKing:
                wstrength = 1;
                bstrength = 0;
                color = "white";
                movetype = WayItMoves.square;
                break;
            case WhiteDragon:
                wstrength = 8;
                bstrength = 0;
                color = "white";

                movetype = WayItMoves.queen;
                break;
            case WhiteRabble:
                wstrength = 1;
                bstrength = 0;
                color = "white";

                movetype = WayItMoves.pawn;
                break;
            case WhiteSpearmen:
                wstrength = 1;
                color = "white";

                bstrength = 0;
                movetype = WayItMoves.spearpawn;
                break;
            case WhiteCrossbow:
                wstrength = 1;
                color = "white";

                bstrength = 0;
                movetype = WayItMoves.rangedpawn;
                break;
            case WhiteTrebuchet:
                wstrength = 1;
                bstrength = 0;
                color = "white";

                movetype = WayItMoves.flyingcastle;
                break;
            case WhiteHeavyHorse:
                wstrength = 3;
                bstrength = 0;
                color = "white";

                movetype = WayItMoves.square2x2;
                break;
            case WhiteLightHorse:
                wstrength = 2;
                bstrength = 0;
                color = "white";

                movetype = WayItMoves.square3x3;
                break;
            case WhiteElephant:
                wstrength = 5;
                bstrength = 0;
                color = "white";

                movetype = WayItMoves.rook;
                break;
            case WhiteMountains:
                wstrength = 0;
                bstrength = 0;
                color = "white";

                movetype = WayItMoves.stationary;
                break;
            case BlackKing:
                wstrength = 0;
                bstrength = 1;
                color = "black";
                movetype = WayItMoves.square;
                break;
            case BlackDragon:
                wstrength = 0;
                bstrength = 8;
                color = "black";

                movetype = WayItMoves.queen;
                break;
            case BlackRabble:
                wstrength = 0;
                bstrength = 1;
                color = "black";

                movetype = WayItMoves.pawn;
                break;
            case BlackSpearmen:
                wstrength = 0;
                bstrength = 1;
                color = "black";

                movetype = WayItMoves.spearpawn;
                break;
            case BlackCrossbow:
                wstrength = 0;
                bstrength = 1;
                color = "black";

                movetype = WayItMoves.rangedpawn;
                break;
            case BlackTrebuchet:
                wstrength = 0;
                bstrength = 1;
                color = "black";

                movetype = WayItMoves.flyingcastle;
                break;
            case BlackHeavyHorse:
                wstrength = 0;
                bstrength = 3;
                color = "black";

                movetype = WayItMoves.square2x2;
                break;
            case BlackLightHorse:
                wstrength = 0;
                bstrength = 2;
                color = "black";

                movetype = WayItMoves.square3x3;
                break;
            case BlackElephant:
                wstrength = 0;
                bstrength = 5;
                color = "black";

                movetype = WayItMoves.rook;
                break;
            case BlackMountains:
                wstrength = 0;
                bstrength = 0;
                color = "black";

                movetype = WayItMoves.stationary;
                break;
        }
    }
}
