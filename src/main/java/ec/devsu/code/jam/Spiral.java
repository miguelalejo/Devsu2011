package ec.devsu.code.jam;

import java.util.ArrayList;
import java.util.List;

import ec.devsu.code.api.Point;

/**
 * Spiral
 */
public class Spiral {

    public String createSpirals(String[][] matrix) {
        validateSquareMatrix(matrix);
        String cad = "";
        List<Point> puntosMarcados = new ArrayList<>();
        Point punto = new Point(0, 0);
        Point puntoAnterior = new Point(0, 0);
        TipoMovimiento tipoMovimiento = TipoMovimiento.DERECHA;
        int numeroItems = matrix.length * matrix.length;
        while (puntosMarcados.size() < numeroItems) {
            while (esValidoProximoMovimiento(puntosMarcados, punto, matrix.length, matrix.length)) {
                puntosMarcados.add(punto);
                puntoAnterior = new Point(punto.getX(), punto.getY());
                punto = proximoIndice(punto, tipoMovimiento);
            }
            tipoMovimiento = proximoMovimiento(tipoMovimiento);
            punto = proximoIndice(puntoAnterior, tipoMovimiento);
        }
        cad = createSpiralCad(matrix, cad, puntosMarcados);
        return cad;
    }

    private String createSpiralCad(String[][] matrix, String cad, List<Point> puntosMarcados) {
        for (Point point : puntosMarcados) {
            cad += matrix[point.getX()][point.getY()];
        }
        return cad;
    }

    private void validateSquareMatrix(String[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i].length!=matrix.length){
                throw new RuntimeException("Is no a square Matriz");
            }
        }
    }

    public enum TipoMovimiento {
        IZQUIERDA, ABAJO, DERECHA, ARRIBA;

    }

    public TipoMovimiento proximoMovimiento(TipoMovimiento tipoMovimiento) {
        if (TipoMovimiento.DERECHA.equals(tipoMovimiento)) {
            return TipoMovimiento.ABAJO;
        }
        if (TipoMovimiento.ABAJO.equals(tipoMovimiento)) {
            return TipoMovimiento.IZQUIERDA;
        }
        if (TipoMovimiento.IZQUIERDA.equals(tipoMovimiento)) {
            return TipoMovimiento.ARRIBA;
        }
        if (TipoMovimiento.ARRIBA.equals(tipoMovimiento)) {
            return TipoMovimiento.DERECHA;
        }
        throw new RuntimeException("No existen movientos validos");
    }

    public Point proximoIndice(Point posicionAnterior, TipoMovimiento tipoMovimiento) {
        if (TipoMovimiento.DERECHA.equals(tipoMovimiento)) {
            return new Point(posicionAnterior.getX(), posicionAnterior.getY() + 1);
        } else if (TipoMovimiento.ABAJO.equals(tipoMovimiento)) {
            return new Point(posicionAnterior.getX() + 1, posicionAnterior.getY());
        } else if (TipoMovimiento.IZQUIERDA.equals(tipoMovimiento)) {
            return new Point(posicionAnterior.getX(), posicionAnterior.getY() - 1);
        } else if (TipoMovimiento.ARRIBA.equals(tipoMovimiento)) {
            return new Point(posicionAnterior.getX() - 1, posicionAnterior.getY());
        }
        throw new RuntimeException("No existen movientos validos");
    }

    public boolean esValidoProximoMovimiento(List<Point> puntosMarcados, Point puntoNuevo, int dimensionX,
            int dimensionY) {
        if (puntosMarcados.contains(puntoNuevo)) {
            return false;
        }
        if (puntoNuevo.getY() >= dimensionY || puntoNuevo.getX() >= dimensionX) {
            return false;
        }
        if (puntoNuevo.getY() < 0 || puntoNuevo.getX() < 0) {
            return false;
        }
        return true;
    }

}