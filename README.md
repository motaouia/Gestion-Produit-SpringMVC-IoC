 On souhaite créer une application qui permet de gérer des produits. Chaque produit est défini par sa référence (de type String), sa désignation, son prix et sa quantité. 


L’application doit permettre les opérations suivantes :
◦ Ajouter un nouveau produit
◦ Consulter tous les produits
◦ Consulter les produits dont le nom contient un mot clé.
◦ Consulter un produit
◦ Supprimer un produit
◦ Mettre à jour un produit.


 Cette application se compose de trois couches DAO, Métier et Présentation.
 Elle doit être fermée à la modification et ouverte à l’extension.
 L’injection des dépendances sera effectuée en utilisant Spring IOC.
 Nous allons définir deux implémentations de la couche DAO.
◦ Une implémentation qui gère les produits qui sont stockés dans une liste de type HashMap.

#SpringMVC #SpringIoc #Java8 #Tomcat