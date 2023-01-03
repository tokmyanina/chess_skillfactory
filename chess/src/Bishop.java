public class Bishop extends ChessPiece{
    public Bishop(String color) {
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
        if (line + column == toLine + toColumn) return true;
        return (line - column == toLine - toColumn);
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
