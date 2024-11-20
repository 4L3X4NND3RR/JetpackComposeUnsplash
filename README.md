# Unsplash App

Esta aplicacion fue hecha con jetpack compose, utilizando kotlin dsl en lugar de groovy.



## Librerias

Room: Para almacenar la data recibida de la api rest unsplash.

Coil: Para mostrar las imagenes desde la red con la url.

Retrofit: Para realizar las llamadas a los endpoints de la api rest unsplash.

Paging 3: Para relizar la paginacion con lazyloading.

Dagger: Para utilizar inyeccion de dependencias.



## Patron de diseño

Este patron consiste en que la capa repository se encarga de obtener la informacion ya sea de la api rest o de la base de datos local.

![](/Users/alexanderdeleon/AndroidStudioProjects/splashapp/imgs_doc/maxresdefault-1693975348.jpg)



# Screenshots

Pagina Inicio

![](/Users/alexanderdeleon/AndroidStudioProjects/splashapp/imgs_doc/Screenshot_20241120-163446.png)



Busqueda de imagen

![](/Users/alexanderdeleon/AndroidStudioProjects/splashapp/imgs_doc/Screenshot_20241120-163508.png)



Resultado de busqueda

![](/Users/alexanderdeleon/AndroidStudioProjects/splashapp/imgs_doc/Screenshot_20241120-163520.png)
