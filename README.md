# :construction: README em construção ! :construction:
# 🏛️ Museum Finder Project
...developed as a [Trybe](https://www.betrybe.com) Project.

## 💻 About this project


## 🛠️ Built with
<a href="https://www.java.com/en/download/help/whatis_java.html" target="_blank" rel="noreferrer"><img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" /></a>
<a href="https://spring.io/quickstart" target="_blank" rel="noreferrer"><img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring" /></a>

## 🎯 Used skills

## 🏁 Getting started
### 🐋 Installing Docker
As the project is containerized, to run the application you will need to install Docker. The Docker version used in this project was 24.0.7. You can see [here](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-20-04) how to install it.


### 🖼️ Creating Docker image
In project root terminal, run:
```
docker build -t museum-finder-image .
```

### 📦 Creating Docker container
In project root terminal, run:
```
docker run -p 8080:8080 --name museum-finder-container museum-finder-image
```
Once the container is created, it will start running automatically, unless the port 8080 is already in use. You can start the container with `docker start museum-finder-container` after stopping the process using the port 8080.

### 🏃‍♀ Running the application
You must execute the `Principal.java` file in `src/main/java/com/trybe/sistemadevotacao/` folder by clicking the run button in your IDE or running the following commands in project's root terminal.
To compile the code, run:
```
javac -d . **/*.java  
```
Next, to run the program, run in terminal:
```
java com.betrybe.sistemadevotacao.Principal
```
Then, the application will start automatically in your terminal.
