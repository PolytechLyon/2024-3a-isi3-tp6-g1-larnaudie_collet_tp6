# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : LARNAUDIE / COLLET

## Exercices 1
Ce patron de conception reflète un peu le pattern Composite où le Composant est MobileObject, le composite est la classe Vehicle et la Feuille est la classe Wheel qui sont les roues des véhicules. Le vélo agit comme un composant pour simpleBike, et simpleBike agit comme un composant pour TagAlongBike. Nous n'avons pas besoin de refaire getVelocity() et getMass() car ils calculent déjà bien via les composants dans le bike
## Exercices 2
La méthode getVelocity() utilise le patron de conception Iterator. Ce patron permet de parcourir les éléments d'une liste. Dans ce cas, la méthode getVelocity() parcourt les composants d'un véhicule (dans components) sans avoir besoin de connaître la manière dont ils sont stockés ou organisés, la modification de Set à List n'affecte pas la méthode getVelocity()
## Exercices 3
Pour s'assurer qu'il n'y a qu'une seule clock, on va appliquer le patron Singleton en passant le constructeur de la classe Clock en private
et en créant l'instance de cette manière : `private static final Clock instance = new Clock();`
on s'assure qu'il n'y a qu'une seule instance. De plus, dans la classe Wheel, pour avoir notre variable Clock on ne peut plus faire `new clock()` donc on fait simplement `getInstance()`
## Exercices 4

## Exercices 5

## Exercices 6

## Exercices 7

## Exercices 8


