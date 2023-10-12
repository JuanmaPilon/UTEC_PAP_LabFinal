<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link href="styles.css" rel="stylesheet">
        <title>Turismo.uy - Alta de Salida Turística</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>
    <body>

        <header>
            <div id="logo">
                <h1>Turismo.uy</h1>
            </div>
            <div id="search">
                <form action="svlet" method="get">
                    <input type="text" name="query" placeholder="Buscar turistas o paquetes">
                    <button type="submit">Buscar</button>
                </form>
            </div>
            <div id="login">
                <a href="logedUser.jsp">Volver a Inicio</a>
            </div>
        </header>

        <main>
            <h2>Alta de Salida Turística</h2>
            <form action="SvAltaSalidaTuristica" method="post" accept-charset="UTF-8">
                <label for="departamento">Seleccionar Departamento:</label>
                <select id="departamento" name="departamento">
                </select>

                <label for="actividadTuristica">Seleccionar Actividad Turística:</label>
                <select id="actividadTuristica" name="actividadTuristica">
                </select>

                <label for="nombreSalida">Nombre de la Salida:</label>
                <input type="text" id="nombreSalida" name="nombreSalida" required>

                <label for="fechaHoraSalida">Fecha y Hora de Salida:</label>
                <input type="datetime-local" id="fechaHoraSalida" name="fechaHoraSalida" required>

                <label for="lugarSalida">Lugar de Salida:</label>
                <input type="text" id="lugarSalida" name="lugarSalida" required>

                <label for="cantidadMaxTuristas">Cantidad Máxima de Turistas:</label>
                <input type="number" id="cantidadMaxTuristas" name="cantidadMaxTuristas" required>

                <label for="imagenSalida">Imagen (opcional):</label>
                <input type="file" id="imagenSalida" name="imagenSalida">

                <button type="submit">Dar de Alta</button>
            </form>
        </main>
        <script>
            var startIndex = 0;
            var startIndex1 = 0;

            function cargarDeptos() {
                var xhr = new XMLHttpRequest();
                xhr.open("GET", "SvCargarDepartamentos?startIndex=" + startIndex, true);
                xhr.onreadystatechange = function () {
                    if (xhr.readyState === 4 && xhr.status === 200) {
                        var departamentos = xhr.responseText.split(",");
                        var select = document.getElementById("departamento");
                        for (var i = 0; i < departamentos.length; i++) {
                            var option = document.createElement("option");
                            option.value = departamentos[i];
                            option.text = departamentos[i];
                            select.appendChild(option);
                        }
                        startIndex += departamentos.length;
                    }
                };
                xhr.send();
            }

            function cargarActividades() {
                var xhr = new XMLHttpRequest();
                xhr.open("GET", "SvCargarActividades?startIndex1=" + startIndex1, true);
                xhr.onreadystatechange = function () {
                    if (xhr.readyState === 4 && xhr.status === 200) {
                        var actividades = xhr.responseText.split(",");
                        var select = document.getElementById("actividadTuristica");
                        for (var i = 0; i < actividades.length; i++) {
                            var option = document.createElement("option");
                            option.value = actividades[i];
                            option.text = actividades[i];
                            select.appendChild(option);
                        }
                        startIndex1 += actividades.length;
                    }
                };
                xhr.send();
            }

            function cargarContenido() {
                cargarDeptos();
                cargarActividades();
            }

            window.onload = cargarContenido;
        </script>
        <footer>
            <p>Creado por Juan Martin Pilon - Carlos Santana - Natalia Lopez - Santiago Badiola</p>
            <p>&copy; 2023 Turismo.uy</p>
        </footer>

    </body>
</html>
