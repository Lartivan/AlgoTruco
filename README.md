# AlgoTruco
Juego de Truco escrito en Java para el TP final de Algoritmos y Programación 3 FIUBA

Reportes del servidor de integracion continua en:
https://nicopaez.ci.cloudbees.com/view/Algo3/job/nicopaez-grupo3-2015-2/
[![Build Status](https://nicopaez.ci.cloudbees.com/view/Algo3/job/nicopaez-grupo3-2015-2/badge/icon)](https://nicopaez.ci.cloudbees.com/view/Algo3/job/nicopaez-grupo3-2015-2/)

## Algunos detalles de implementacion
Para mantener en memoria los valores relativos de las cartas se usó una estructura
abstracta que se describe en src.fiuba.algo3.ranking.Ranking y representa una jerarquía
entre clases de equivalencia (ie: una serie de conjuntos ordenados entre sí, pero que no
implican orden en sus elementos)

Es notable el mecanismo usado para determinar el valor de envido de una mano, que se
especifica en src.fiuba.algo3.modelo.CalculadoraEnvido y consiste en lo siguiente.
El valor para el envido de una mano de tres cartas es el mayor valor de envido que
puede lograrse tomando dos de ellas. El crédito por esta elegante solucion pertenece a
los miembros del grupo gaby-3 (repo en github.com/Payas17/TPFinalAlgo3) y especialmente
a Payas17
