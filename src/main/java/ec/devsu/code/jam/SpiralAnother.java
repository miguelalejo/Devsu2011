package ec.devsu.code.jam;

import java.util.ArrayList;
import java.util.List;

import ec.devsu.code.api.Point;

/**
 * Spiral
 */
public class SpiralAnother {

    public int createSpirals(int[][] matrix) {
        validateRectangularMatrix(matrix);

        String cad = "";
        List<Point> puntosMarcados = new ArrayList<>();
        Point punto = new Point(0, 0);
        Point puntoAnterior = new Point(0, 0);
        TipoMovimiento tipoMovimiento = TipoMovimiento.DERECHA;        
        int numeroItems = matrix.length * matrix[0].length;
        while (puntosMarcados.size() < numeroItems) {
            while (esValidoProximoMovimiento(puntosMarcados, punto, matrix.length, matrix[0].length)) {
                puntosMarcados.add(punto);
                puntoAnterior = new Point(punto.getX(), punto.getY());
                punto = proximoIndice(punto, tipoMovimiento);
            }
            tipoMovimiento = proximoMovimiento(tipoMovimiento);
            punto = proximoIndice(puntoAnterior, tipoMovimiento);
        }
        int total = createSpiralCad(matrix, cad, puntosMarcados);
        return total;
    }

    private void validateRectangularMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i].length != matrix[j].length) {
                    throw new RuntimeException("Is not a rectangular matrix");
                }
            }

        }
    }

    private int createSpiralCad(int[][] matrix, String cad, List<Point> puntosMarcados) {
        int total = matrix[puntosMarcados.get(0).getX()][puntosMarcados.get(0).getY()];
        TipoOperacion tipoOperacion = TipoOperacion.SUMA;        
        for (int i = 1; i < puntosMarcados.size(); i++) {
            
            int b = matrix[puntosMarcados.get(i).getX()][puntosMarcados.get(i).getY()];
            if (TipoOperacion.SUMA.equals(tipoOperacion)) {
                total = total + b;
            } else if (TipoOperacion.RESTA.equals(tipoOperacion)) {
                total = total - b;
            } else if (TipoOperacion.MULTIPLICACION.equals(tipoOperacion)) {
                total = total * b;
            }
            tipoOperacion = proximaOpracion(tipoOperacion);
        }
        return total;
    }

    public enum TipoMovimiento {
        IZQUIERDA, ABAJO, DERECHA, ARRIBA;
    }

    public enum TipoOperacion {
        SUMA, RESTA, MULTIPLICACION;
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

    public TipoOperacion proximaOpracion(TipoOperacion tipoOperacion) {
        if (TipoOperacion.SUMA.equals(tipoOperacion)) {
            return TipoOperacion.RESTA;
        }
        if (TipoOperacion.RESTA.equals(tipoOperacion)) {
            return TipoOperacion.MULTIPLICACION;
        }
        if (TipoOperacion.MULTIPLICACION.equals(tipoOperacion)) {
            return TipoOperacion.SUMA;
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