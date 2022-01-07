@test
Feature: Seleccion de articulo de tecnologia

  Quiero como usuario seleccionar artículos de tecnologia en linea,
  para adicionar al canasto y luego realizar el pago

  Scenario: como usuario debo poder seleccionar categoria de cualquier producto de tecnologia
    Given el usuario ingresa su usuario y contrasenia
      | usuario   | contrasenia   |
      | Seth1234  | Micontrase1.  |
    And el usuario selecciona categoria de cualquier producto de tecnologia
    When el usuario debe seleccionar el color y la  cantidad que desea comprar
    When el usuario debe visualizar las especificaciones del producto
    Then el usuario pasa a pagar producto