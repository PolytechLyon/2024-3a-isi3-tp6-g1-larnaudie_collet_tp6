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
Les classes `Bike` et `Wheel` sont dans le même package.
Il y a une dépendance cyclique entre les 2 ce qui est un problème car c'est un anti-patron. Wheel utilise la méthode `getPush()` de `Bike` or, cette fonctionnalité est présente dans Vehicle qui est la classe abstraite, donc pour être encore plus générique, on pourrait utiliser directement Vehicle à la place de Bike dans la classe Wheel.
## Exercices 5
Nous avons utilisé le patron de méthode pour centraliser la méthode log dans la classe abstraite NamedLogger. Les sous-classes FileLogger et ConsoleLogger implémentent une méthode abstraite `logFinalMessage` pour spécifier comment le message final doit être traité ce qui évite ainsi les doublons
## Exercices 6
On a créé une classe `LoggerFactory` qui va forcer à utiliser le console log car dans le logger factory, on crée une méthode getLog qui instancie un nouveau `ConsoleLogger`, de plus on a retiré le "public" dans le constructeur de `ConsoleLogger` pour créer une sorte de "package private" et que ca ne puisse être que la fabrique qui créer des nouvelles instances de logger.
La différence avec singleton pour ce patron est qu'on veut plusieurs instances de log car sinon on en créer qu'une on ne pourrait pas savoir où est l'erreur dans le code.
## Exercices 8
La classe `Context` suit le pattern Façade car il va "brider" toutes les fonctionnalités possibles en utilisiant seulement load.
Pour créer un nouveau Bike dans BikeSimulator, on va simplement écrire : `Context.inject(Bike.class)`. Inject est codé pour ne lire qu'une seule ligne dans `fr.polytech.sim.cycling.Bike` donc si on écrit plusieurs lignes, il ne lira que la première. Chaque ligne correspond à quelle classe on veut injecter.
## Exercices 9
Comme la méthode injectAll() renvoie un Iterator, on va simplement return `ServiceLoader.load(klass).iterator()` et dans BikeSimulator tant que injectAll() a un élement suivant, on va continuer de print en utilisant l'itérateur retourné par injectAll puis en faisant .next() 
