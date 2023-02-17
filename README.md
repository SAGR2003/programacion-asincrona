# Programación asíncrona

<h1>Problema 1: que debe resolverse con un hilo independiente en el cual no espera respuesta: (hiloindependiente)</h1>
Suponga que se quiere simular un examen parcial en la plataforma virtual Sabana, en el cual los estudiantes deben responder diferentes preguntas de manera aleatoria. Para llevar a cabo esta simulación, se ha decidido crear un hilo independiente que actualice la pregunta que se encuentra resolviendo cada estudiante en un intervalo de tiempo de 5 segundos. Dado que el hilo no espera ninguna respuesta, la aplicación seguirá ejecutándose mientras los estudiantes continúan respondiendo a las preguntas en un "segundo plano".

<h1>Problema 2: que debe trabajarse como una promesa en la cual ejecuta algo asincronamente pero al final vuelve con una respuesta</h1>
Este programa ha sido diseñado para facilitar al profesor la asignación de tareas a sus estudiantes y establecer una fecha límite para la entrega. Como funcionara el programa es primeramente mediante la asignacion de dicha tarea, y asi luego retornar una promesa que contenga si el estudiante realizo la entrega a tiempo o despues de la fecha acordada. Dicha promesa se resuelve de manera asíncrona en un hilo independiente, lo que permite que el profesor continue con sus actividades (dictar otras clases, almorzar, etc) sin necesidad de esperar una respuesta del estudiante, y finalmente cuando la promesa se resuelva recibir una notificación sobre si la tarea fue entregada a tiempo o no.

