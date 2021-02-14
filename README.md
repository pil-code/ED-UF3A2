# ED-UF3A2
#### Pasos para subir al repositorio el proyecto inicial:
1. Creo el repositorio en Github.
2. Clono el repositorio remoto: git clone https://github.com/pil-code/ED-UF3A2.git
3. Deposito en la carpeta los archivos del proyecto de la actividad anterior excepto el readme, puesto que hemos decidido crear un nuevo readme para esta actividad.
4. En la consola del sistema, me posiciono en la carpeta donde he clonado el repositorio con el comando cd ED-UF3A2
5. Añado todos los archivos al stage area: git add .
6. git commit -m "Primer commit con los archivos de la act1"
7. Finalmente envío los cambios al repositorio remoto mediante el comando git push
Estos pasos sólo se han realizado una vez.  

#### Actualización del README.md
1. He creado una rama en mi repositorio local llamada Pilar y me posiciono en ella: git checkout -b Pil
2. Modifico el archivo README con los pasos para subir al repositorio el proyecto inicial.
3. Consulto cuáles son los archivos que he modificado mediante el comando git status
5. He añadido todos los archivos que se han modificado al stage: git add README.md
6. He realizado un commit para el cambio realizado con git commit -m "Añadidos en el README los primeros pasos para crear el repositorio".
7. He cambiado a la rama main: git checkout main
8. He hecho merge con mi rama local: git merge Pil.
9. He guardado los cambios en el repositorio remoto: git push origin Pil:Pilar. La rama Pilar es la que será visible en Github.

#### Actualización de la clase Producto
1. He descargado los cambios del repositorio remoto: git pull
2. Me posiciono en la rama de mi repositorio local llamada Pil: git checkout Pil
3. He realizado los ajustes en el README.md.
4. Consulto cuáles son los archivos que he modificado mediante el comando git status
5. He añadido todos los archivos que se han modificado al stage: git add .
6. He realizado un commit para el cambio realizado con git commit -m "Actualización en el README con los pasos de la clase Producto".
7. He cambiado a la rama main: git checkout main
8. He hecho merge con mi rama local: git merge Pil
9. He guardado los cambios en el repositorio remoto: git push origin Pil:Pilar. (La rama Pilar es la que será visible en GitHub).
10. En GitHub, he hecho un pull request desde mi rama a la rama main con título: "Actualización en el README con los pasos de la clase Producto".
11. En GitHub, he hecho el merge automático a main desde Pilar.

#### Actualización de la clase Resta
1.He añadido el repositorio remoto a mi repositorio local: git clone URL.
2.He creado una rama en mi repositorio local llamada Paula, en la que trabajaré sobre la clase RESTA y PRINCIPAL.
3.He realizado los cambios oportunos en Eclipse, tanto implementación del código como modificación del archivo README.
4.He añadido los archivos modificados (aquellos que se indican por consola).
5.He hecho un commit: git commit -m "Actualización de la clase RESTA y README"
6.He cambiado a la rama main: git checkout main, y he hecho merge con mi rama local: git merge resta.
7.Para guardar los cambios en el repositorio remoto, primero he hecho un git push origin resta:Resta-Paula, siendo Resta-Paula la rama que se va a crear en Github con este comando.
8.Una vez en Github, he hecho un pull request desde mi rama a main para, posteriormente, realizar un merge.