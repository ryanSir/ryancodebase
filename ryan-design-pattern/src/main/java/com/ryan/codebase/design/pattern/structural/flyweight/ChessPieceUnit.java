package com.ryan.codebase.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @version Id: ChessPieceUnit, v 0.1 2021/6/16 下午4:28 ryan Exp $
 */

// 享元类
public class ChessPieceUnit {
    private int    id;
    private String text;
    private Color  color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
                              RED, BLACK
    }

    // ...省略其他属性和getter方法...
}

class ChessPieceUnitFactory {
    private static final Map<Integer, ChessPieceUnit> pieces = new HashMap<Integer, ChessPieceUnit>();

    static {
        pieces.put(1, new ChessPieceUnit(1, "車", ChessPieceUnit.Color.BLACK));
        pieces.put(2, new ChessPieceUnit(2, "馬", ChessPieceUnit.Color.BLACK));
        //...省略摆放其他棋子的代码...
    }

    public static ChessPieceUnit getChessPiece(int chessPieceId) {
        return pieces.get(chessPieceId);
    }
}

class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int            positionX;
    private int            positionY;

    public ChessPiece(ChessPieceUnit unit, int positionX, int positionY) {
        this.chessPieceUnit = unit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    // 省略getter、setter方法
}

class ChessBoard {
    private Map<Integer, ChessPiece> chessPieces = new HashMap<Integer, ChessPiece>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPiece(1), 0, 0));
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPiece(2), 1, 0));
        //...省略摆放其他棋子的代码...
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        //...省略...
    }
}