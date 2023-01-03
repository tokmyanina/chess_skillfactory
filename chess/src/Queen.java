public class Queen extends ChessPiece {
    public Queen(String color) {
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
        if (column == toColumn) return true;
        if (line + column == toLine + toColumn) return true;
        return (line - column == toLine - toColumn);
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
