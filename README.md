# Web App
This repo holds a "RESTful" spring server with multiple get routes.

## Architecture

#### Main Files
  * [HelloWorldController.java](.src/main/java/com/hackley/mydomain/firstWebApp/HelloWorldController.java)
  * [AlbumController.java](.src/main/java/com/hackley/mydomain/firstWebApp/Controller/AlbumController.java)
  
#### Test Files
  * [HelloWorldControllerTest.java](./src/test/java/com/hackley/mydomain/firstWebApp/HelloWorldControllerTest.java)

## Usage
-`git clone repo`
- Open terminal, and run this command: `./gradlew bootRun`
  
  #### Routes
  * `/`: will return `Hi!`
  * `/hello`: will return `Hi!`
  * `/capitalize/{input words here}`: will return  the words that you inputed capitalized. 
      * Ex. `/capitalize/{hello world}`       output: `HELLO WORLD`
  * `/reverse?sentence=Your sentence here`: will return the sentence you you inputted in reverse
      * Ex. `/reverse?sentence=Hello world` output: `world Hello`


   ### AlbumController Routes
        * `/albums` : will render a list of all albums
        * `/form`(GET) : will render a form for a user to create a new album.
        * `/form` (POST) : will handle form submission and redirect user to all albums page