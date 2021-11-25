Feature:
  Verificar diferentes metodos GET usando REST-Assured

  @CP00001
  Scenario Outline: Verificar nombre Abraham
    Given realizo una operación GET para "<post>"
    When ingreso el id "<id>"
    Then se verifica que el nombre es "<nombre>"
    Examples:
    |caso_pruba|
    |1         |