# AlgoTruco

Juego de Truco escrito en Java para el TP final de Algoritmos y Programación 3 FIUBA

## Algunos detalles de implementacion
Para mantener en memoria los valores relativos de las cartas se usó una estructura
abstracta que se describe en src.fiuba.algo3.ranking.Ranking y representa una jerarquía
entre clases de equivalencia (ie: una serie de conjuntos ordenados entre sí, pero que no
implican orden en sus elementos)

El credito por el mecanismo usado para determinar el valor de envido de una mano,
(src.fiuba.algo3.modelo.CalculadoraEnvido) pertenece alos miembros del grupo gaby-3
(repo en github.com/Payas17/TPFinalAlgo3) y especialmente a Payas17.
