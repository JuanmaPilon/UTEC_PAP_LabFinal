package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Compra;
import logica.Inscripcion;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-17T14:51:12")
=======
@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-16T23:25:02")
>>>>>>> 6f7d3a37885ab2614cf2bcf0a7ec85ba3e78bf9b
@StaticMetamodel(Turista.class)
public class Turista_ extends Usuario_ {

    public static volatile ListAttribute<Turista, Compra> listaCompras;
    public static volatile ListAttribute<Turista, Inscripcion> listaInscripcion;
    public static volatile SingularAttribute<Turista, String> nacionalidad;

}