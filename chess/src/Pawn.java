public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!isOnBoard(toLine, toColumn)) return false;

        if (line == toLine) return false;
        if (column != toColumn) return false;
        if (this.color.equals("White") && line == 1 && toLine == 3) return true;
        if (this.color.equals("Black") && line == 6 && toLine == 4) return true;
        if (this.color.equals("White") && toLine - line == 1) return true;
        return this.color.equals("Black") && toLine - line == -1;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
