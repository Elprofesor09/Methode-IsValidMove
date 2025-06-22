public class Reine extends Piece {

    @Override
    public boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        int deltaRow = Math.abs(newPosition.row - this.position.row);
        int deltaCol = Math.abs(newPosition.column - this.position.column);

        return (deltaRow == deltaCol) ||
                (newPosition.row == this.position.row) ||
                (newPosition.column == this.position.column);
    }
}
