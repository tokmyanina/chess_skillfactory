public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!isOnBoard(toLine, toColumn)) return false;

        if (line == toLine && column == toColumn) return false;
        int dX = Math.abs(line - toLine);
        int dY = Math.abs(column - toColumn);
        if (dX == 2 && dY == 1) return true;
        return (dX == 1 && dY == 2);
    }
}