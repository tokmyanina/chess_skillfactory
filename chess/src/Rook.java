public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!isOnBoard(toLine, toColumn)) return false;
        if (line == toLine && column == toColumn) return false;
        if (line == toLine) return true;
        return column == toColumn;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
