# TP 10 – Généricité en Java (Generics)

##  Description
Ce TP permet de découvrir et de pratiquer la généricité en Java à travers deux exercices : le triplet homogène et le triplet hétérogène.

L'objectif est de créer des classes génériques réutilisables permettant de manipuler différents types de données tout en garantissant la sécurité des types (*Type Safety*).

##  Objectifs pédagogiques
- Comprendre le principe des génériques en Java.
- Déclarer et utiliser des paramètres de type générique.
- Créer des classes génériques avec un ou plusieurs paramètres.
- Manipuler des objets de types identiques et différents.
- Utiliser les constructeurs et les getters dans les classes génériques.

##  Exercices réalisés

### Exercice 1 : Triplet homogène (`Triplet<T>`)
Création d'une classe générique permettant de stocker trois éléments du même type.

**Fonctionnalités :**
- Trois attributs génériques de type `T`.
- Constructeur pour initialiser les trois éléments.
- Méthodes getters pour accéder aux éléments.
- Méthode `affiche()` pour afficher le triplet.

<img width="1366" height="768" alt="ex1" src="https://github.com/user-attachments/assets/c7852fad-b518-412b-83bf-ed7869a81e5b" />


### Exercice 2 : Triplet hétérogène (`TripletH<A, B, C>`)
Création d'une classe générique permettant de stocker trois éléments de types différents.

**Fonctionnalités :**
- Trois paramètres génériques : `A`, `B` et `C`.
- Constructeur avec trois types potentiellement différents.
- Getters retournant le type correspondant.
- Méthode `affiche()` pour afficher les éléments.

<img width="1366" height="768" alt="ex2" src="https://github.com/user-attachments/assets/3ba466a6-4006-472e-bcfa-bd219be2f795" />


##  Technologies utilisées
- Langage : Java
- IDE : Eclipse
- Concepts : POO, Généricité, Type Safety.



##  Compétences acquises
- Création et utilisation de classes génériques.
- Différenciation entre génériques homogènes et hétérogènes.
- Réutilisation et organisation du code Java.
- Sécurité des types sans conversions explicites.

---
**Formation :** Fondamentaux et Concepts Avancés de la Programmation Java  
**Plateforme :** MLIAEdu  
**Auteur :** Hamza Id El Baz
