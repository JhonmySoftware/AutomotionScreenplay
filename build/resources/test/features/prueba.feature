#Autor: Jhon Quiñones Arboleda
#language: es

@HistoriaDeusuario
Característica: Verificar el ingreso correcto al app XTTT
  yo como usuario quiero ingresar a la XTTT para verificar que tengo acceso a ella

  @CasoLogueo
  Escenario: verificar ingreso correcto
    Dado que Jhon Quiñones ingresa a la app XTTT
    Cuando digita sus credenciales e ingresa a la app
      | usuario   | contrasena |
      | <usuario> | contrasena |
    Entonces verifica que pudo ingresar correctamente