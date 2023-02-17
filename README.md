# programacion-asincrona

<h1>Problema 1: que debe resolverse con un hilo independiente en el cual no espera respuesta: (hiloindependiente)</h1>
Suponga que queremos simular un parcial en virtual sabana, en dicho parcial los estudiantes responden las distintas preguntas, (aclarar que la forma en la que estos avanzan/responden es aleatoria). Para simular dicho problema, decidimos crear un hilo independiente que actualice la pregunta que se encuentra resolviendo cada estudiante en un intervalo de tiempo (5 segundos). Como el hilo no espera ninguna respuesta, la aplicación seguirá ejecutándose mientras los estudiantes siguen respondiendo a cada pregunta en un "segundo plano".
