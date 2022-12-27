#Autor: Jhon Quiñones Arboleda
#language: es

@HistoriaDeusuario
Característica: Verificar el ingreso correcto al app XTTT y realizar el doligenciamiento correcto del formulario Block Validation
  yo como usuario quiero ingresar a la XTTT para verificar que tengo acceso a ella

  @CasoLogueo
  Escenario: Verificar diligenciamiento correcto del formulario Block Validation
    Dado que Jhon Quiñones ingresa a la app XTTT
    Cuando digita sus credenciales e ingresa a la app
    Y verifica que pudo ingresar correctamente
    Y Ingresa a la Funcionalidad Block Validation y Diligencia el formulario de Block Validation
      | Fields           | Values                                                  |
      | Required         | Test                                                    |
      | E-mail           | jhonmydanc@gmail.com                                    |
      | Password         | 654321                                                  |
      | Confirm Password | 654321                                                  |
      | Date             | 06/12/2022                                              |
      | Url              | https://colorlib.com/polygon/metis/form-validation.html |
      | Digits Only      | 321654987                                               |
      | Range [6,16]     | 123456                                                  |
      | policy           | check                                                   |
    Entonces verifica respuesta exitosa o fallida