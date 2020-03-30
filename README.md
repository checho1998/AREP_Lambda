# AREP_Lambda

Este laboratorio consiste en en realizar una conexion a un servicio en AWS que dado un numero cualquiera devuelva su cuadrado.

## Desarrollo

El resultado se calculará con el uso de Amazon Gateway y se consumirá desde una máquina EC2 de Amazon como se evidencia en las siguientes imagenes.

se puede ver que fue satisfactorio

![Imagenes](https://github.com/checho1998/AREP-Patrones/blob/master/Imag/testGateway.PNG)

Se evidencia el trabajo del Gateway
  
![Imagenes](https://github.com/checho1998/AREP-Patrones/blob/master/Imag/test.PNG)

Se puede ver el programa funcionando y donde le pide al usuario el numero

![Imagenes](https://github.com/checho1998/AREP-Patrones/blob/master/Imag/demostracion.PNG)

Se puede ver la respuesta de nuestro programa

![Imagenes](https://github.com/checho1998/AREP-Patrones/blob/master/Imag/respuesta.PNG)

## Prerrequisitos

Es necesario tener instalado Java 1.8 y Apache Maven 3.6.0

## Como Instalar y Correr el Codigo

- Debe estar en el directorio donde quiere traer el repositorio
- Para traer el repositorio a el directorio que usted desee, debe abrir la consola del PC e ingresar este codigo:
```
$ git clone https://github.com/checho1998/Libreria-Numeros-Complejos.git
```
- luego debe ingresar el siguiente codigo para limpiar y compilar el programa desde el directorio donde este el programa
```
$ mvn clean install 
```
- Podria tambien usar el siguiente codigo para provar las pruebas y ver su completa funcionalidad
```
$ mvn test
```
- Para correr el programa desde windows puede correr desde su cmd este codigo
```
mvn exec:java -Dexec.mainClass="com.example.Main" [-Dexec.args="argument1"]
```



## Construido en lenguaje
  
  - Java (V8)
  
## Ejecutar Pruebas

Las pruebas estan desarrolladas con la dependencia de JUnit 5, por lo tanto es necesario tenerla
en el pc donde se corran.

## Autor

- Sergio Alejandro Nuñez Mendivelso
