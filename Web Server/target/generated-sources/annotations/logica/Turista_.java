package logica;

import java.util.ArrayList;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Inscripcion;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-11T22:21:47")
=======
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-12T13:00:24")
>>>>>>> 95e542fcaa7b9563546acf0a6c51f8901032b29c
@StaticMetamodel(Turista.class)
public class Turista_ extends Usuario_ {

    public static volatile SingularAttribute<Turista, ArrayList> listaCompras;
    public static volatile ListAttribute<Turista, Inscripcion> listaInscripcion;
    public static volatile SingularAttribute<Turista, String> nacionalidad;

}