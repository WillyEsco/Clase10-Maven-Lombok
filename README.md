# ***Simple proyecto maven para probar las características básicas de Lombok***

Este es un proyecto único de Java donde practiqué lombok. 

## Anotaciones cubiertas::


````
1. @Getter
2. @Setter
3. @EqualsAndHashCode(of = {"sentence", "val"})
4. @ToString(exclude = "val")
5. @Builder
6. @RequiredArgsConstructor, generates a constructor for all final fields, with parameter order same as field order
7. @NoArgsConstructor creates an empty constructor.
8. @AllArgsConstructor creates a constructor for all fields
````
## **Notas:**
Ver el archivo pom.xml para saber qué está haciendo cada línea de código.

## **Comandos simples para ejecutar con maven**


### Crear archivo jar para maven:
```
mvn install
```

### Ejecutar proyecto maven:
```
mvn exec:java -Dexec.mainClass=argpromod1.App
```

### Estructura del proyecto:
```
.
├── README.md
├── pom.xml
└── src
    └── main
        └── java
            ├── app
            └── App.java
   
```

------

# Consigna: **Clase 10**

## **Configuración de Software**  

La práctica tendrá la finalidad de conocer los comandos básicos de Maven y, además, investigar y comprender la funcionalidad brindada por la biblioteca de Lombok. Es importante destacar que Lombok tiene una integración directa con el IDE IntelliJ, no así con Eclipse u otros. En caso de estar utilizando Eclipse puede leer este link, o en el caso de NetBeans este  este  link: [https://projectlombok.org/setup/netbeans]()

1. Crear un proyecto nuevo mediante Maven.
2. Agregar la dependencia necesaria para utilizar  Lombok (https://projectlombok.org/setup/maven)
3. Crear un programa Java que pida por consola el nombre, apellido y fecha de nacimiento de una persona. Estos datos deben ser guardados en una instancia de una clase Persona utilizando los setters generados por Lombok. https://projectlombok.org/setup/maven
>**IMPORTANTE**: el programa debe permitir cargar varias personas y también debe ofrecer la posibilidad de listar a todas las personas por pantalla (utilizar los getters generados por Lombok).
4. Generar un archivo “jar” del proyecto implementado. Ejecutarlo desde la terminal del Sistema Operativo.

------