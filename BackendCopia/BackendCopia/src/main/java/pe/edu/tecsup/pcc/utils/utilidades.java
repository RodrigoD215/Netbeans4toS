package pe.edu.tecsup.pcc.utils;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by jpizarro on 3/06/2017.
 */
public class utilidades {

    public static boolean copyFile(String origen, String destino) {

        try {
            Path FROM = Paths.get(origen);
            Path TO = Paths.get(destino);
            //sobreescribir el fichero de destino, si existe, y copiar
            // los atributos, incluyendo los permisos rwx
            CopyOption[] options = new CopyOption[]{
                    StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.COPY_ATTRIBUTES
            };
            Files.copy(FROM, TO, options);
            return true;
        } catch (IOException ex) {
            System.out.println("Error al crear la copia del archivo");
            return false;
        }

    }
}
