public class King extends ChessPiece{
    public King(String color) {
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
        if (Math.abs(line - toLine) > 1) return false;
        if (Math.abs(column - toColumn) > 1) return false;
        if (!isUnderAttack(chessBoard, toLine, toColumn)) return false;
        if (chessBoard.board[toLine][toColumn] != null) {
            return !chessBoard.board[toLine][toColumn].getColor().equals(color);
        }
        return true;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        if (!isOnBoard(line, column)) return false;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (board.board[i][j] != null) {
                    ChessPiece piece = board.board[i][j];
                    if (!piece.color.equals(this.color) && piece.canMoveToPosition(board, i, j, line, column)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
