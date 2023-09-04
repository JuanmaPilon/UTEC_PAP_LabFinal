package persistencia;

import logica.Turista;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class PTurista extends PUsuario {
    private int nacionalidad;
    private List<PCompra> compras = new ArrayList<>();

    public PTurista (String nickname, String nombre, String apellido, String correo, Date fNacimiento) {
        super(nickname, nombre, apellido, correo, fNacimiento);
       this.nacionalidad = nacionalidad;
    }

    public void setNacionalidad(int nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public Turista parse(){
        return new Turista(getNickname(), getNombre(), getApellido(), getCorreo(), getfNacimiento());
    }









}
