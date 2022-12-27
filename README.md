# AutomotionScreenplay
Se realizara un reto con el patrón de diseño ScreenPlay

SERENITY BDD con CUCUMBER

Reto 1.01
Automatización Web
(Tiempo ejecución 2 horas)

Este es nuestro requisito:
Historia de Usuario: Verificar el diligenciamiento de la pantalla “Block Validation”.
Criterios de Aceptación: 
•	Verificar diligenciamiento exitoso. 
•	Verificar mensaje de validación para cada campo
url de prueba: https://colorlib.com/polygon/metis/login.html

Pasos para la ejecución de la prueba.
1.	Autenticacion en colorlib
a.	Abrir navegador con la url de prueba
b.	Ingresar usuario demo
c.	Ingresar password demo
d.	Click en botón Sign in
e.	Verificar la Autenticación (label en home)
2.	Ingresar a Funcionalidad Block Validation
a.	Clic en Menu “Forms”
b.	Clic en submenú “Form Validation”
c.	Verificación : se presenta pantalla de la funcionalidad con título Block Validation
3.	Diligenciar Formulario Block Validation
a.	Diligenciar todos los campos del formulario
b.	Clic en botón Validate
4.	Verificar Respuesta Exitosa/Fallida
Objetivo:
Continuar con el proceso de automatización de la aplicación colorlib, en este caso se trata de un nuevo formulario
Aspectos a evaluar:
	Creación de la historia de usuario.
	Creación de escenarios exitosos y alternos
	Reúso de componentes
	Aplicación del modelo POM (page object model)

