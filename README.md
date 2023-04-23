# API REST With Paging

Il s'agit d'une simple API REST d'une société X.
Les informations sont stockées dans une base de données H2. 
L'API implémente une seule des opérations CRUD. Il s'agit de récupération
de tous les employés avec un système de pagination et de tri.

**NB :** si vous désirez une API implémentant toutes les opérations CRUD, consultez ce [projet](https://github.com/abdelnasserben/sampleapirest).


## Installation
L'API n'est pas fournit en un fichier d'installation. Il s'agit simplement  d'un dossier à télécharger et à importer dans votre IDE préféré.

## Contrat
Cette section décrit la manière de communiquer et d'interagir avec l'API.

### Récupération de tous les employés
```
Request
  URI: http://localhost:9001/
  HTTP Verb: GET
  Body: Empty

Response:
  HTTP Status:
    200 OK if all employees are successfully retrieved
    204 NO CONTENT The request has been processed but no employee exists in the database

  Response Body Type: JSON
  
  Example Response Body:
    [
      {
          "id": 1,
          "firstName": "Colleen ",
          "lastName": "Myers",
          "salary": "$1000"
      },
      {
          "id": 2,
          "firstName": "Monica ",
          "lastName": "Webb",
          "salary": "$1100"
      }
  ]
```
### Pagination et tri
Par défaut, l'API renvoie les **5 premièrs employées** de la base de données **triés par l'ID** dans un **ordre croissant**. Vous pouvez influencer ce comportement avec les options de pagination et de tri suivantes :
##### Indiquer le numéro de la page
```
http://localhost:8080?page=2
```
##### Définir le nombre d'éléments
```
http://localhost:8080?size=5
```
##### Changer la colonne de tri
```
http://localhost:8080?sort=lastName
```
##### Changer l'ordre de tri
```
http://localhost:8080?dir=desc
```
##### Combiner tous les paramètres
```
http://localhost:8080?page=2&size=5&sort=lastName&dir=desc
```
##### Remarque
Vous pouvez combiner ces paramètres dans l'ordre que vous souhaitez et selon ceux que vous souhaitez simplement appliquer. Aucun des paramètres n'est requis.
