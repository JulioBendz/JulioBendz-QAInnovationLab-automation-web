Feature: Product - Store

  @valid_login
  Scenario: Validación del precio de un producto
    Given estoy en la página de la tienda
    And me logueo con mi usuario "juliobendz13@gmail.com" y clave "Julio13jabg6*"
    When navego a la categoria "Clothes" y subcategoria "Men"
    And agrego 2 unidades del primer producto al carrito
    Then valido en el popup la confirmación del producto agregado
    And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito
    And vuelvo a validar el calculo de precios en el carrito

  @invalid_login
  Scenario: Inicio de sesión fallido
    Given estoy en la página de la tienda
    And me logueo con mi usuario "usuario_invalido@gmail.com" y clave "clave_incorrecta"
    Then valido que el sistema muestre un mensaje de error de autenticación

  @invalid_category
  Scenario: Buscar una categoría inexistente
    Given estoy en la página de la tienda
    When navego a la categoria "Autos"
    Then valido que el sistema no encuentra resultados
