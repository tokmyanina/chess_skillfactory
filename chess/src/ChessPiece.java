public abstract class ChessPiece{
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();

    public boolean isOnBoard(int line, int column) {
        if (line < 0) return false;
        if (column < 0) return false;
        if (line > 7) return false;
        return column < 8;
    }
}