# Coversor de Monedas
> [!NOTE]
> Este programa es una herramienta para poder convertir las divisas mas utilizadas en America Latina con su valor en tiempo real atraves de una API [ExchangeRate-API](https://www.exchangerate-api.com/)

> [!TIP]
> Para poder ejecutar el programa es necesario descargar la libreria java [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson).
>> Si tienes dudas de como adicionar librerias, te dejo esta [documentación](https://www.jetbrains.com/help/idea/library.html#define-library).

> [!IMPORTANT]
> La informacion brindada por la API ExchangeRate solo funcionará por 15 dias ya que fue realizada con una cuenta gratuita por ello apartir del 19/05/2024 se pueden presentar errores de informacion.

![](header.png)

## Como ejecutar la aplicación

* 1
    * Abrir el proyecto en tu IDE favorito (para esta aplicación se utilizo InteliJ).
* 2
    * Desplegar la carpeta `src`
* 3
    * Seleccionar la clase `Principal` y dar doble click 
* 4
    * Se abrira una ventana que nos muestra el codigo de la clase. Debes dar click derecho. 
    * Se abrira un panel de opciones, seleccionar la opcion `Run Principal.main()` 
* 5
    * Se Ejecutara el programa 

![](header.png)

## Como utilizar el programa

* Primero recibimos un mensaje de Bienvenida con un menu de 3 opciones, debemos escoger una de ellas.
  ![imagen](https://github.com/EdgarVaron/ConversorDeMonedas/assets/105255496/5f055028-7f33-41fa-be84-dbae49f451aa)

## Opción 1
* Si seleccionamos la opcion 1, se nos pedira ingresar la siglas de la divisas que queremos convertir, inicial y final.
  
  ![imagen](https://github.com/EdgarVaron/ConversorDeMonedas/assets/105255496/844f8753-7f3f-4ee1-9ffa-06ebf76562bf)

* Se nos pregunta la cantidad, en este ejemplo queremos convertir $USD 100 a COP y se nos muestra el resultado. Automaticamente se despliega el menu inicial
  ![imagen](https://github.com/EdgarVaron/ConversorDeMonedas/assets/105255496/891bba88-030a-47d4-a854-9a6748aa73aa)

## Opción 2
* Nos muestra el historial de consultas informando valores consultados, cantidad, resultado y hora de consulta. Automaticamente se despliega el menu inicial

 ![imagen](https://github.com/EdgarVaron/ConversorDeMonedas/assets/105255496/d57b9e8d-6cea-424f-9280-9f285a61c200)

## Opción 3
* Se finaliza el programa mostrando un mensaje de agradecimiento. No se despliega ningun menu.

  ![imagen](https://github.com/EdgarVaron/ConversorDeMonedas/assets/105255496/53b879c6-cb09-4606-95c3-c641e2013c32)
  
![](header.png)
# Gracias por ver mi programa 😄
